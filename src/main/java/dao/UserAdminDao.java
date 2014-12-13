package dao;

import model.UserAdmin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAdminDao extends JpaRepository<UserAdmin, Integer> {
	
	@Query("SELECT max(id) FROM UserAdmin p")
	Integer lastId();
	
	@Query("SELECT u FROM UserAdmin u where u.userName = :userId")
	UserAdmin findByUsername(@Param("userId") String userId);
}
