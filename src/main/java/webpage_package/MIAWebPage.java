package webpage_package;

import template_datetime.GMT4DateTime;

public class MIAWebPage extends WebPage{
	public String getCityName() {
		return "Miami, Florida, United States";
	}
	
	public String getCityImage() {
		return "https://www.miamigov.com/files/sharedassets/public/news/2020/miami-shutterstock-01.jpg?dimension=pageimage&w=480";
	}
	
	public String getCityDateTime() {
		GMT4DateTime gmt4 = new GMT4DateTime();
		return gmt4.createDateTime();
	}
}