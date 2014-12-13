package model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "person")
public class Person extends AbstractArtist implements Commentable {

	private static final long serialVersionUID = 1L;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@OneToMany
	List<Music> musics;

	@Id
	@Column(name = "id")
	private Integer id;

	@Column
	@NotBlank
	private String firstname;

	@Column
	@NotBlank
	private String name;

	public String getFirstname() {
		return firstname;
	}

	public String getName() {
		return name;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
