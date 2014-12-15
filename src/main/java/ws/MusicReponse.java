package ws;

import java.util.ArrayList;
import java.util.List;

import model.Music;

public class MusicReponse {

	private List<MusicCommentResponse> musicComments;
	
	private Integer id;
	private String title;
	private Integer duration;
	private String filePath;
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public static MusicReponse fromMusic(Music m) {
		MusicReponse musicReponse = new MusicReponse();
		musicReponse.setId(m.getId());
		musicReponse.setDuration(m.getDuration());
		musicReponse.setFilePath(m.getFilePath());
		musicReponse.setTitle(m.getTitle());
		musicReponse.setMusicComments(MusicCommentResponse.fromComments(m.getComments()));
		return musicReponse;
	}

	public static List<MusicReponse> fromMusics(List<Music> musics) {
		List<MusicReponse> results = new ArrayList<MusicReponse>();
		for (Music music : musics) {
			results.add(MusicReponse.fromMusic(music));
		}
		return results;
	}

	public List<MusicCommentResponse> getMusicComments() {
		return musicComments;
	}

	public void setMusicComments(List<MusicCommentResponse> musicComments) {
		this.musicComments = musicComments;
	}
}
