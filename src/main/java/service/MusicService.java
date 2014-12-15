package service;

import java.util.List;

import model.Music;
import model.MusicComment;
import wrapper.SearchMusicWrapper;

public interface MusicService {

	public void addComment(MusicComment musicComment);

	public void createMusic(Music Music);

	public void deleteMusicByKey(int MusicKey);

	public List<Music> findAllMusics();

	public List<Music> findAllMusicsForWS();

	public List<Music> findAllMusicsWithComments();

	public List<Music> findLastMusic(int nbLast);

	public Music findMusicByKey(int MusicKey);

	public List<Music> search(SearchMusicWrapper wrapper);

	public void updateMusic(Music Music);

}
