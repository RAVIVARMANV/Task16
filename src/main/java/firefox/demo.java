package firefox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

        String url = "https://www.demoblaze.com/";
        driver.get(url);

        String expectedTitle = "STORE";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Page landed on correct website");
        } else {
            System.out.println("Page did not land on correct website");
        }

       
				
	}

}
