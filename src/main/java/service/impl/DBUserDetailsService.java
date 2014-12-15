package service.impl;

import java.util.Arrays;
import java.util.Collection;

import model.UserAdmin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import service.UserService;

@Service
@Transactional(readOnly = true)
public class DBUserDetailsService implements UserDetailsService {

	private static Collection<? extends GrantedAuthority> ROLE_USER_AUTHORITY = Arrays
			.asList(new GrantedAuthority[] { new SimpleGrantedAuthority(
					"ROLE_ADMIN") });

	@Autowired
	private UserService userService;

	@Override
	public UserDetails loadUserByUsername(String userId)
			throws UsernameNotFoundException {
		final UserAdmin user = userService.findByUsername(userId);
		if (user == null) {
			throw new UsernameNotFoundException("user not found");
		}
		return new UserDetails() {
			private static final long serialVersionUID = 1L;

			@Override
			public Collection<? extends GrantedAuthority> getAuthorities() {
				return ROLE_USER_AUTHORITY;
			}

			@Override
			public String getPassword() {
				return user.getPassword();
			}

			@Override
			public String getUsername() {
				return user.getUserName();
			}

			@Override
			public boolean isAccountNonExpired() {
				return true;
			}

			@Override
			public boolean isAccountNonLocked() {
				return true;
			}

			@Override
			public boolean isCredentialsNonExpired() {
				return true;
			}

			@Override
			public boolean isEnabled() {
				return true;
			}
		};
	}

}
