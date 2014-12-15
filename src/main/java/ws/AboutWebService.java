package ws;

import java.util.Arrays;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
import javax.xml.bind.annotation.XmlSeeAlso;

import org.springframework.beans.factory.annotation.Autowired;

import service.MusicService;

@WebService(serviceName = "AboutWebService")
@SOAPBinding(style = Style.RPC, use = Use.LITERAL)
@XmlSeeAlso(AboutResponse.class)
public class AboutWebService {
	
	private static String NAME = "BIAOU";
	private static String FIRSTNAME = "RAMANOU";
	public static String[] TECHNOLOGIES = {"JAVA 1.7", "MAVEN 3.2.1", "JAXWS-SPRING 1.9", "SPRING WEBMVC 4.1.3", "SPRING SECURITY 3.2.5", "HIBERNATE 4.2.8", "SQLITE 3.7.2", "HTML 5", "CSS 3"};

	private AboutResponse aboutResponse;
	
	@Autowired
	private MusicService musicService;

	@WebMethod(exclude = true)
	public void setAboutResponse(AboutResponse bObject) {
		this.aboutResponse = bObject;
	}

	@WebMethod(operationName = "about")
	public AboutResponse about() {
		System.out.println(musicService);
		aboutResponse.setFirstname(FIRSTNAME);
		aboutResponse.setName(NAME);
		aboutResponse.setTechnologies(Arrays.asList(TECHNOLOGIES));
		aboutResponse.setMusics(MusicReponse.fromMusics(musicService.findAllMusicsForWS()));
		return aboutResponse;
	}
}