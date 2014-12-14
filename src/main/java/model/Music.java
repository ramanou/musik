package model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "music")
public class Music {

	private static final long serialVersionUID = 1L;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@OneToMany(mappedBy="music", cascade=CascadeType.ALL)
	List<MusicComment> comments;

	@ManyToOne(targetEntity=Person.class)
	@JoinColumn(name="person_id", referencedColumnName="id")
	private Person person;
	
	public List<MusicComment> getComments() {
		return comments;
	}

	public void setComments(List<MusicComment> comments) {
		this.comments = comments;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Column
	private Integer duration;

	@Column
	@NotBlank
	private String filePath;

	@Id
	@Column(name = "id")
	private Integer id;

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
