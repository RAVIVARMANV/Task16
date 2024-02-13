package firefox;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class wikipidea {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.wikipedia.org/");

        

        WebElement searchInput = driver.findElement(By.id("searchInput"));
        searchInput.sendKeys("Artificial Intelligence");
        searchInput.submit();

        WebElement historySectionLink = driver.findElement(By.linkText("History"));
        historySectionLink.click();

        String sectionTitle = driver.findElement(By.id("firstHeading")).getText();
        System.out.println("Title of the History section: " + sectionTitle);

       
	}

}
