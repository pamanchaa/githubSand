import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchChromeDynamic {
    public static void main(String[] args) {
        // Automatically resolve the correct ChromeDriver version
        WebDriverManager.chromedriver().setup();

        // Launch Chrome browser
        WebDriver driver = new ChromeDriver();

        try {
            // Open a website
            driver.get("https://www.google.com");

            // Print the title of the current webpage
            System.out.println("Page title is: " + driver.getTitle());

            // Close the browser after 5 seconds (optional)
            Thread.sleep(5000);
            driver.quit();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
