package webpage_package;

import template_datetime.GMT6DateTime;

public class DENWebPage extends WebPage{
	public String getCityName() {
		return "Denver, Colorado, United States";
	}
	
	public String getCityImage() {
		return "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e8/Denver_skyline.jpg/532px-Denver_skyline.jpg";
	}
	
	public String getCityDateTime() {
		GMT6DateTime gmt6 = new GMT6DateTime();
		return gmt6.createDateTime();
	}
}