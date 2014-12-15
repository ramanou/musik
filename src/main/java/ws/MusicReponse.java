package ws;

import java.util.ArrayList;
import java.util.List;

import model.Music;

public class MusicReponse {

	public static MusicReponse fromMusic(Music m) {
		MusicReponse musicReponse = new MusicReponse();
		musicReponse.setId(m.getId());
		musicReponse.setDuration(m.getDuration());
		musicReponse.setFilePath(m.getFilePath());
		musicReponse.setTitle(m.getTitle());
		musicReponse.setMusicComments(MusicCommentResponse.fromComments(m
				.getComments()));
		return musicReponse;
	}

	public static List<MusicReponse> fromMusics(List<Music> musics) {
		List<MusicReponse> results = new ArrayList<MusicReponse>();
		for (Music music : musics) {
			results.add(MusicReponse.fromMusic(music));
		}
		return results;
	}
	private Integer duration;
	private String filePath;
	private Integer id;

	private List<MusicCommentResponse> musicComments;

	private String title;

	public Integer getDuration() {
		return duration;
	}

	public String getFilePath() {
		return filePath;
	}

	public Integer getId() {
		return id;
	}

	public List<MusicCommentResponse> getMusicComments() {
		return musicComments;
	}

	public String getTitle() {
		return title;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setMusicComments(List<MusicCommentResponse> musicComments) {
		this.musicComments = musicComments;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
