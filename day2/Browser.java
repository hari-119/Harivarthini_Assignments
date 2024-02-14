package week1.day2;

public class Browser {

	public void browserName(String browserName ){
		System.out.println("Browser Launched Successfully");
		
	}
	public void loadUrl()
	{
System.out.println("Application URL Loaded succuessfully");
	}
public static void main(String[] args) {
	Browser cl=new Browser();
	cl.browserName("Edge");
	cl.loadUrl();
}
}

