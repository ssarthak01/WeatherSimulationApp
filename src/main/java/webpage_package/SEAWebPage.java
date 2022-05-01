package webpage_package;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class SEAWebPage extends WebPage{
	public String getCityName() {
		return "Seattle, Washington, United States";
	}
	
	public String getCityImage() {
		return "https://static.independent.co.uk/s3fs-public/thumbnails/image/2017/12/06/09/seattle-cityscape.jpg?quality=75&width=990&auto=webp&crop=982:726,smart";
	}
	
	public String getCityDateTime() {
		Date date = new Date();
		SimpleDateFormat df = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");
		df.setTimeZone(TimeZone.getTimeZone("GMT-7"));
		String dateTime = df.format(date);
		return dateTime;
	}
}