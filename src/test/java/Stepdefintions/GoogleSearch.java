package Stepdefintions;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearch {
	
	WebDriver driver=null;
	
	
	
	@Given("Browser is open")
	public void browser_is_open() {
		System.setProperty("webdriver.chrome.driver","C:/Users/pravi/eclipse-workspace/Cucumber01/src/test/resources/drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() throws InterruptedException {
		driver.navigate().to("https://www.google.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		driver.findElement(By.xpath("//button/div[text()='Reject all']")).click();
		Thread.sleep(4000);
		
	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() {
		driver.findElement(By.name("q")).sendKeys("https://www.dunnesstores.com/?srsltid=AfmBOoq1XlMYisxI8JJMhG3bSJd_qlTy__i0wNDaVFZtHEfgZBzPatuH");
		
	}

	@And("hits enter")
	public void hits_enter() throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.switchTo().frame(0); 
		WebElement check =driver.findElement(By.xpath("//span/div[@role='presentation']"));
		check.click();
		Thread.sleep(6000);
		
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() throws InterruptedException {
		driver.getPageSource().concat("Dunnes Stores");
		Thread.sleep(4000);
		
	}
	
	@And("Click on the dunnes link")
	public void click_on_the_dunnes_link() throws InterruptedException {
		WebElement dunlink =driver.findElement(By.xpath("//span/a[@class='zReHs']/h3[text()= 'Dunnes Stores']"));
		dunlink.click();
		Thread.sleep(4000);
		
	}
	
	@Then("Accept the Cookies")
	public void accept_the_cookies() {
		WebElement cookie = driver.findElement(By.xpath("//button[contains(text(),'Accept All Cookies')]"));
		cookie.click();
		
	}
	
	@And("Search Bag in the search bar")
	public void search_bag_in_the_search_bar() throws InterruptedException {
		WebElement searchbar =driver.findElement(By.xpath("//input[@placeholder=\"Search a product or brand\"]"));
		searchbar.sendKeys("Bag");
		searchbar.sendKeys(Keys.ENTER);
		Thread.sleep(4000);

	}
	
	@Then("Click on the bag link")
	public void click_on_the_bag_link() throws InterruptedException {
		WebElement baglink = driver.findElement(By.xpath("//div/img[@alt='Foldable Tote Bag']"));
		baglink.click();
		Thread.sleep(4000);
	}
	
	@And("Select the size of the bag")
	public void select_the_size_of_the_bag() throws InterruptedException {
		WebElement sizebag = driver.findElement(By.name("product-summary-sku-selector"));
		Select drop = new Select(sizebag);
		drop.selectByVisibleText("ONE SIZE");
		Thread.sleep(3000);
		
		
	}
	
	@Then("click on Add to Cart")
	public void click_on_add_to_cart() throws InterruptedException {
		WebElement Addtocart = driver.findElement(By.xpath("//div/span[contains(text(),'Add to bag')]"));
		Addtocart.click();
		Thread.sleep(4000);
		
	}
	
	@And("Click on Go to Bag")
	public void click_on_go_to_bag() throws InterruptedException {
		WebElement gotobag = driver.findElement(By.xpath("//button/div[contains(text(),'Go to bag')]"));
		gotobag.click();
		
		Thread.sleep(3000);
		
		
	}
	
	@Then("Go to checkout Page")
	public void go_to_checkout_page() throws InterruptedException {
		WebElement checkout = driver.findElement(By.xpath("//span/a[contains(text(),'Checkout')]"));
		checkout.click();
		Thread.sleep(4000);
		
	}
	
	
	


}
