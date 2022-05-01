package webpage_package;

import template_datetime.GMT7DateTime;

public class LAWebPage extends WebPage{
	public String getCityName() {
		return "Los Angeles, California, United States";
	}
	
	public String getCityImage() {
		return "https://www.telegraph.co.uk/content/dam/Travel/2019/June/la-observatory.jpg?imwidth=960";
	}
	
	public String getCityDateTime() {
		GMT7DateTime gmt7 = new GMT7DateTime();
		return gmt7.createDateTime();
	}
}