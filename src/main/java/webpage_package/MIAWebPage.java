package webpage_package;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class MIAWebPage extends WebPage{
	public String getCityName() {
		return "Miami, Florida, United States";
	}
	
	public String getCityImage() {
		return "https://www.miamigov.com/files/sharedassets/public/news/2020/miami-shutterstock-01.jpg?dimension=pageimage&w=480";
	}
	
	public String getCityDateTime() {
		Date date = new Date();
		SimpleDateFormat df = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");
		df.setTimeZone(TimeZone.getTimeZone("GMT-4"));
		String dateTime = df.format(date);
		return dateTime;
	}
}