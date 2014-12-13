package service;

import java.util.List;

import model.UserAdmin;

public interface UserService {

	public void createUser(UserAdmin user);

	public void deleteUserByKey(int userKey);

	public List<UserAdmin> findAllUsers();

	public UserAdmin findByUsername(String userId);

	public UserAdmin findUserByKey(int userKey);

	public UserAdmin loadAuthenticatedUser();

	public void updateUser(UserAdmin user);

}
