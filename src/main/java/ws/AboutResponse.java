package ws;

import java.util.List;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "AboutResponse")
public class AboutResponse {

	private String firstname;

	private List<MusicReponse> musics;

	private String name;

	private List<String> technologies;

	public String getFirstname() {
		return firstname;
	}

	public List<MusicReponse> getMusics() {
		return musics;
	}

	public String getName() {
		return name;
	}

	public List<String> getTechnologies() {
		return technologies;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setMusics(List<MusicReponse> musics) {
		this.musics = musics;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTechnologies(List<String> technologies) {
		this.technologies = technologies;
	}

}
