package wrapper;

public class SearchMusicWrapper {

	private String musicTitle;

	public String getMusicTitle() {
		return musicTitle;
	}

	public String getMusicTitleSQL() {
		return musicTitle + "%";
	}

	public void setMusicTitle(String musicTitle) {
		this.musicTitle = musicTitle;
	}
}
