package service;

import java.util.List;

import model.Music;

public interface MusicService {

	public void createMusic(Music Music);

	public void deleteMusicByKey(int MusicKey);

	public List<Music> findAllMusics();

	public Music findMusicByKey(int MusicKey);

	public void updateMusic(Music Music);

}
