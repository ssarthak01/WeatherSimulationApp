package webpage_package;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class ATLWebPage extends WebPage{
	public String getCityName() {
		return "Atlanta, Georgia, United States";
	}
	
	public String getCityImage() {
		return "https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F28%2F2021%2F02%2F19%2Fnew-york-city-evening-NYCTG0221.jpg&w=1100&h=737&c=sc&poi=face&q=60";
	}
	
	public String getCityDateTime() {
		Date date = new Date();
		SimpleDateFormat df = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");
		df.setTimeZone(TimeZone.getTimeZone("GMT-4"));
		String dateTime = df.format(date);
		return dateTime;
	}
}