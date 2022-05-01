package webpage_package;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DENWebPage extends WebPage{
	public String getCityName() {
		return "Denver, Colorado, United States";
	}
	
	public String getCityImage() {
		return "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e8/Denver_skyline.jpg/532px-Denver_skyline.jpg";
	}
	
	public String getCityDateTime() {
		Date date = new Date();
		SimpleDateFormat df = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");
		df.setTimeZone(TimeZone.getTimeZone("GMT-6"));
		String dateTime = df.format(date);
		return dateTime;
	}
}