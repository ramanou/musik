package wrapper;

public class SearchMusicWrapper {

	private String musicTitle;

	public String getMusicTitle() {
		return musicTitle;
	}

	public void setMusicTitle(String musicTitle) {
		this.musicTitle = musicTitle;
	}
	
	public String getMusicTitleSQL() {
		return musicTitle+"%";
	}
}
