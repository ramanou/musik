package dao;

import java.util.Date;
import java.util.List;

import model.Music;
import model.MusicComment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicCommentDao extends JpaRepository<MusicComment, Integer> {
	
	@Query("SELECT max(id) FROM MusicComment mc")
	Integer lastId();

	@Query("SELECT mc FROM MusicComment mc WHERE mc.inetAdress = :inetAdress AND mc.music = :music AND mc.date > :today")
	List<MusicComment> commentsForToday(@Param("inetAdress") String inetAdress, @Param("music") Music music, @Param("today") Date today);

}
