package webpage_package;

import template_datetime.GMT4DateTime;

public class NYWebPage extends WebPage{
	public String getCityName() {
		return "New York City, New York, United States";
	}
	
	public String getCityImage() {
		return "https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F28%2F2021%2F02%2F19%2Fnew-york-city-evening-NYCTG0221.jpg&w=1100&h=737&c=sc&poi=face&q=60";
	}
	
	public String getCityDateTime() {
		GMT4DateTime gmt4 = new GMT4DateTime();
		return gmt4.createDateTime();
	}
}