package service.impl;

import java.util.List;

import model.UserAdmin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import service.UserService;
import dao.UserAdminDao;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserAdminDao userAdminDao;

	@Override
	@Transactional
	public void createUser(UserAdmin user) {
		Integer id = userAdminDao.lastId();

		if (id == null) {
			user.setId(0);
		} else {
			user.setId(id + 1);
		}
		userAdminDao.saveAndFlush(user);
	}

	@Override
	public void deleteUserByKey(int userKey) {
		userAdminDao.delete(userKey);
	}

	@Override
	public List<UserAdmin> findAllUsers() {
		return userAdminDao.findAll();
	}

	@Override
	public UserAdmin findByUsername(String userId) {
		return userAdminDao.findByUsername(userId);
	}

	@Override
	public UserAdmin findUserByKey(int userKey) {
		return userAdminDao.findOne(userKey);
	}

	@Override
	public UserAdmin loadAuthenticatedUser() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if (authentication == null || !authentication.isAuthenticated()) {
			return null;
		}
		Object principal = authentication.getPrincipal();
		if (principal instanceof UserDetails) {
			String userId = ((UserDetails) principal).getUsername();
			return findByUsername(userId);
		}
		return null;
	}

	@Override
	public void updateUser(UserAdmin user) {
		userAdminDao.save(user);
	}

}
