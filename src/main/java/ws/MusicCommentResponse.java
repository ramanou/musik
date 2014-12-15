package ws;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.MusicComment;

public class MusicCommentResponse {

	public static MusicCommentResponse fromComment(MusicComment comment) {
		MusicCommentResponse musicCommentResponse = new MusicCommentResponse();
		musicCommentResponse.setId(comment.getId());
		musicCommentResponse.setContent(comment.getContent());
		musicCommentResponse.setDate(comment.getDate());
		musicCommentResponse.setInetAdress(comment.getInetAdress());
		musicCommentResponse.setMark(comment.getMark());
		return musicCommentResponse;
	}
	public static List<MusicCommentResponse> fromComments(
			List<MusicComment> comments) {
		List<MusicCommentResponse> results = new ArrayList<MusicCommentResponse>();
		for (MusicComment musicComment : comments) {
			results.add(MusicCommentResponse.fromComment(musicComment));
		}
		return results;
	}
	private String content;
	private Date date;

	private Integer id;

	private String inetAdress;

	private Integer mark;

	public String getContent() {
		return content;
	}

	public Date getDate() {
		return date;
	}

	public Integer getId() {
		return id;
	}

	public String getInetAdress() {
		return inetAdress;
	}

	public Integer getMark() {
		return mark;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setInetAdress(String inetAdress) {
		this.inetAdress = inetAdress;
	}

	public void setMark(Integer mark) {
		this.mark = mark;
	}
}
