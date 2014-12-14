package dao;

import java.util.List;

import model.Music;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import wrapper.SearchMusicWrapper;

@Repository
public interface MusicDao extends JpaRepository<Music, Integer> {
	
	@Query("SELECT max(id) FROM Music p")
	Integer lastId();

	@Query("SELECT m FROM Music m ORDER BY id DESC")
	List<Music> findLastMusic(Pageable pageable);

	@Query("SELECT m FROM Music m WHERE LOWER(m.title) LIKE LOWER(:#{#wrapper.musicTitle})")
	List<Music> search(@Param("wrapper") SearchMusicWrapper wrapper);

}
