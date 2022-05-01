package webpage_package;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class LAWebPage extends WebPage{
	public String getCityName() {
		return "Los Angeles, California, United States";
	}
	
	public String getCityImage() {
		return "https://www.telegraph.co.uk/content/dam/Travel/2019/June/la-observatory.jpg?imwidth=960";
	}
	
	public String getCityDateTime() {
		Date date = new Date();
		SimpleDateFormat df = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");
		df.setTimeZone(TimeZone.getTimeZone("GMT-7"));
		String dateTime = df.format(date);
		return dateTime;
	}
}