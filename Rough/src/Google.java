import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	

static WebDriver driver;

	public static void main(String arg[]) {
		
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\santo\\Desktop\\latestJars\\chrome.chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http:www.google.com");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		
	}
	
}
