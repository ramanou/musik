package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import service.MusicService;
import dao.MusicDao;
import model.Music;


@Service
public class MusicServiceImpl implements MusicService {

	@Autowired
	private MusicDao musicDao;

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
	public Music findMusicByKey(int MusicKey) {
		return musicDao.findOne(MusicKey);
	}

	@Override
	public void updateMusic(Music Music) {
		musicDao.save(Music);
	}

}
