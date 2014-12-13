package model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "music")
public class Music implements Serializable {

	private static final long serialVersionUID = 1L;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	// private AbstractArtist artist;
	
	@OneToMany
	List<Music> musics;
	
	@ManyToOne
	private Person person;
																																																																																	
	@Column
	private Integer duration;

	@Column
	@NotBlank
	private String filePath;

	@Id
	@Column(name = "id")
	private Integer id;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@NotEmpty
	@Column
	private String title;

	// public AbstractArtist getArtist() {
	// return artist;
	// }

	public Integer getDuration() {
		return duration;
	}

	public String getFilePath() {
		return filePath;
	}

	public Integer getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	// public void setArtist(AbstractArtist artist) {
	// this.artist = artist;
	// }

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
