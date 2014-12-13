package dao;

import model.Music;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicDao extends JpaRepository<Music, Integer> {
	
	@Query("SELECT max(id) FROM Music p")
	Integer lastId();

}
