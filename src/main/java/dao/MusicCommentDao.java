package dao;

import model.Music;
import model.MusicComment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicCommentDao extends JpaRepository<MusicComment, Integer> {
	
	@Query("SELECT max(id) FROM MusicComment mc")
	Integer lastId();

}
