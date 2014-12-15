package service;

import java.util.List;

import model.Music;
import model.MusicComment;
import wrapper.SearchMusicWrapper;

public interface MusicService {

	public void createMusic(Music Music);

	public void deleteMusicByKey(int MusicKey);

	public List<Music> findAllMusics();

	public Music findMusicByKey(int MusicKey);

	public void updateMusic(Music Music);

	public List<Music> findLastMusic(int nbLast);

	public List<Music> search(SearchMusicWrapper wrapper);

	public void addComment(MusicComment musicComment);

	public List<Music> findAllMusicsWithComments();

	public List<Music> findAllMusicsForWS();

}
