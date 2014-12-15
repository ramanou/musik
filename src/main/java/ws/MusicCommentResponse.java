package ws;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.MusicComment;

public class MusicCommentResponse {

	private Integer id;
	private Date date;
	private String content;
	private Integer mark;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getMark() {
		return mark;
	}

	public void setMark(Integer mark) {
		this.mark = mark;
	}

	public String getInetAdress() {
		return inetAdress;
	}

	public void setInetAdress(String inetAdress) {
		this.inetAdress = inetAdress;
	}

	private String inetAdress;

	public static List<MusicCommentResponse> fromComments(
			List<MusicComment> comments) {
		List<MusicCommentResponse> results = new ArrayList<MusicCommentResponse>();
		for (MusicComment musicComment: comments) {
			results.add(MusicCommentResponse.fromComment(musicComment));
		}
		return results;
	}

	public static MusicCommentResponse fromComment(
			MusicComment comment) {
		MusicCommentResponse musicCommentResponse= new MusicCommentResponse();
		musicCommentResponse.setId(comment.getId());
		musicCommentResponse.setContent(comment.getContent());
		musicCommentResponse.setDate(comment.getDate());
		musicCommentResponse.setInetAdress(comment.getInetAdress());
		musicCommentResponse.setMark(comment.getMark());
		return musicCommentResponse;
	}
}
