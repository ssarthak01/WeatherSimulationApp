package webpage_package;

import template_datetime.GMT7DateTime;

public class SEAWebPage extends WebPage{
	public String getCityName() {
		return "Seattle, Washington, United States";
	}
	
	public String getCityImage() {
		return "https://static.independent.co.uk/s3fs-public/thumbnails/image/2017/12/06/09/seattle-cityscape.jpg?quality=75&width=990&auto=webp&crop=982:726,smart";
	}
	
	public String getCityDateTime() {
		GMT7DateTime gmt7 = new GMT7DateTime();
		return gmt7.createDateTime();
	}
}