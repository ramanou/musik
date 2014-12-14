package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "group_band")
public class GroupBand extends AbstractArtist {

	private static final long serialVersionUID = 1L;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Id
	@Column(name = "id")
	private Integer id;

	@Column
	@NotBlank
	private String name;

	// private Set<Person> persons;

	public String getName() {
		return name;
	}

	// public Set<Person> getPersons() {
	// return persons;
	// }

	public void setName(String name) {
		this.name = name;
	}

	// public void setPersons(Set<Person> persons) {
	// this.persons = persons;
	// }

}
