import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shop.polymer-project.org/");
		//driver.findElement(By.linkText("Shop Now")).click();
		
		//This Element is inside 2 nested shadow DOM.
		String cssSelectorForHost1 = "shop-app[page='home']";
		String cssSelectorForHost2 = ".iron-selected";
		Thread.sleep(1000);
		SearchContext shadow0 = driver.findElement(By.cssSelector("shop-app[page='home']")).getShadowRoot();
		Thread.sleep(1000);
		SearchContext shadow1 = shadow0.findElement(By.cssSelector(".iron-selected")).getShadowRoot();
		Thread.sleep(1000);
		shadow1.findElement(By.cssSelector("a[aria-label=\"Men's Outerwear Shop Now\"]")).click();

	}

}
