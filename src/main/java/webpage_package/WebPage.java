package webpage_package;

public abstract class WebPage {
	
	public String[] generation() {
		String cityInfo = getCityName();
		String cityImage = getCityImage();
		String cityDateTime = getCityDateTime();
		String data[] = new String[] {cityInfo, cityImage, cityDateTime};
		return data;
	}
	
	abstract String getCityName();
	
	abstract String getCityImage();
	
	abstract String getCityDateTime();
}