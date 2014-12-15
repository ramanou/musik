package service.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import model.Music;
import model.MusicComment;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import service.MusicService;
import wrapper.SearchMusicWrapper;
import dao.MusicCommentDao;
import dao.MusicDao;

@Service
public class MusicServiceImpl implements MusicService {

	@Autowired
	private MusicCommentDao musicCommentDao;

	@Autowired
	private MusicDao musicDao;

	@Override
	public void addComment(MusicComment musicComment) {
		Date date = new Date();
		Calendar today = Calendar.getInstance();
		today.setTime(date);
		today.set(Calendar.HOUR_OF_DAY, 0);
		today.set(Calendar.MINUTE, 0);
		today.set(Calendar.SECOND, 0);
		today.set(Calendar.MILLISECOND, 0);

		List<MusicComment> comments = musicCommentDao.commentsForToday(
				musicComment.getInetAdress(), musicComment.getMusic(),
				today.getTime());
		if (comments.size() >= 3) {
			return;
		}

		Integer id = musicCommentDao.lastId();
		if (id == null) {
			musicComment.setId(0);
		} else {
			musicComment.setId(id + 1);
		}
		musicComment.setDate(new Date());
		musicCommentDao.saveAndFlush(musicComment);
	}

	@Override
	@Transactional
	public void createMusic(Music Music) {
		Integer id = musicDao.lastId();

		if (id == null) {
			Music.setId(0);
		} else {
			Music.setId(id + 1);
		}
		musicDao.save(Music);
	}

	@Override
	public void deleteMusicByKey(int MusicKey) {
		musicDao.delete(MusicKey);
	}

	@Override
	public List<Music> findAllMusics() {
		return musicDao.findAll();
	}

	@Override
	@Transactional
	public List<Music> findAllMusicsForWS() {
		List<Music> musics = musicDao.findAll();
		for (Music music : musics) {
			Hibernate.initialize(music.getComments());
		}
		return musics;
	}

	@Override
	@Transactional
	public List<Music> findAllMusicsWithComments() {
		List<Music> musics = musicDao.findAll();
		for (Music music : musics) {
			Hibernate.initialize(music.getComments());
		}
		return musics;
	}

	@Override
	public List<Music> findLastMusic(int nbLast) {
		Pageable top = new PageRequest(0, nbLast);
		return musicDao.findLastMusic(top);
	}

	@Override
	public Music findMusicByKey(int MusicKey) {
		return musicDao.findOne(MusicKey);
	}

	@Override
	@Transactional
	public List<Music> search(SearchMusicWrapper wrapper) {
		List<Music> musics = musicDao.search(wrapper);
		for (Music music : musics) {
			Hibernate.initialize(music.getComments());
		}
		return musics;
	}

	@Override
	public void updateMusic(Music Music) {
		musicDao.save(Music);
	}

}
