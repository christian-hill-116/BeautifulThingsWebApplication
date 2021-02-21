package beans;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.xml.bind.annotation.XmlRootElement;

@ManagedBean
@ViewScoped
@XmlRootElement(name="thing")
public class BeautifulThing {
	
	int id; 
	String thingTitle;
	String thingDescription;
	int rating;
	
	public BeautifulThing(int id, String thingTitle, String thingDescription, int rating) {
		super();
		this.id = id;
		this.thingTitle = thingTitle;
		this.thingDescription = thingDescription;
		this.rating = rating;
	}
	
	public BeautifulThing() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getThingTitle() {
		return thingTitle;
	}
	public void setThingTitle(String thingTitle) {
		this.thingTitle = thingTitle;
	}
	public String getThingDescription() {
		return thingDescription;
	}
	public void setThingDescription(String thingDescription) {
		this.thingDescription = thingDescription;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}

}

