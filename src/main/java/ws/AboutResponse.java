package ws;

import java.util.List;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "AboutResponse")
public class AboutResponse {
	
	private String name;
	
	private String firstname;
	
	private List<String> technologies;
	
	private List<MusicReponse> musics;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public List<String> getTechnologies() {
		return technologies;
	}

	public void setTechnologies(List<String> technologies) {
		this.technologies = technologies;
	}

	public List<MusicReponse> getMusics() {
		return musics;
	}

	public void setMusics(List<MusicReponse> musics) {
		this.musics = musics;
	}

}
