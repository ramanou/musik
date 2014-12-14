package model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.beans.factory.annotation.Required;

@Entity
@Table(name = "comment")
public class MusicComment implements Serializable {

	private static final long serialVersionUID = 1L;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Column
	@NotBlank
	private String content;

	@Column
	private Date date;

	@Id
	@Column(name = "id")
	private Integer id;

	@Column
	@NotBlank
	private String inetAdress;

	@Column
	private Integer mark = -1; //Abort due to constraint violation (comment.mark may not be NULL)

	@ManyToOne(targetEntity=Music.class)
	@JoinColumn(name="music_id", referencedColumnName="id")
	private Music music;

	public Music getMusic() {
		return music;
	}

	public void setMusic(Music music) {
		this.music = music;
	}

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