import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class MavenExampleTest {

    @Test
    void shouldRun() {
    	System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dilan\\OneDrive\\Desktop\\SDET Classwork\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://bespoke-scone-ba3a56.netlify.app/");
		JavascriptExecutor jScript = (JavascriptExecutor) driver;
		long temp = (long) ( jScript.executeScript("return document.getElementsByClassName('card').length"));
		Assertions.assertEquals(5l, temp);
    }
}
