package steps;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class productbook extends baseclass
{
public static Properties prop = new Properties();
	
	
	@Given("^Go to (.+)$")
    public void go_to(String url) throws InterruptedException, IOException 
	{
		
		WebDriverManager.chromedriver().setup();
        setDriver();
        //driver = new ChromeDriver();	
        getDriver().get(url);
        getDriver().manage().window().maximize();
        Thread.sleep(3000);
        FileInputStream fis = new FileInputStream("/Users/syedbasha/git/BDDReprtGeneration/snap_deal/src/main/java/Properties/locator.properties");
        prop.load(fis);
        //WebElement allow_button = getDriver().findElement(By.id(prop.getProperty("allow_button")));
        //allow_button.click();
        
		
        
           
    }

    @When("^Mouse over on toys as (.*)$")
    public void mouse_over_on_toys(String toys) throws InterruptedException, IOException 
   
    {
    	System.out.println("Run this step");
    	System.out.println("********************");
    	//WebElement category = getDriver().findElement(By.xpath(prop.getProperty("toy_category").replace("<toys>", toys)));
    	WebElement category = getDriver().findElement(By.xpath(prop.getProperty("toy_category")));
    	System.out.println(category);
    	Actions act = new Actions(getDriver());
    	act.moveToElement(category).build().perform();
    	Thread.sleep(3000);
    
    	
       
    }
    
    @Then("^click on toys$")
    public void click_on_toys() throws InterruptedException, IOException 
    {
    	Thread.sleep(3000);
    	WebElement toys = getDriver().findElement(By.xpath(prop.getProperty("toy_option")));
    	toys.click();
    	
    	
    	
       
    }
    @When("^Click (.*)$")
    public void click_educational_toys(String toy_game) throws InterruptedException, IOException 
    {
    	Thread.sleep(3000);
    	//WebElement toys_click = getDriver().findElement(By.xpath(prop.getProperty("education_toys").replace("<toy_game>", toy_game)));
    	WebElement toys_click = getDriver().findElement(By.xpath(prop.getProperty("education_toys")));
    	System.out.println(toys_click);
    	toys_click.click();
    }
    
    @When("^Click the Customer Rating as (.+)$")
    public void click_the_customer_rating_as(String rating) throws InterruptedException 
    {
        Thread.sleep(3000);
        WebElement ratings = getDriver().findElement(By.xpath(prop.getProperty("select_rating")));
        ratings.click();
    }

    @When("^Click the offer as (.+)$")
    public void click_the_offer_as(String offerid) 
    {
        
    }

    @When("^Check the availability for the pincode as (.+)$")
    public void check_the_availability_for_the_pincode_as(String pincode) 
    {
       
    }

    @When("^Click the Quick View of the first product$")
    public void click_the_quick_view_of_the_first_product() 
    {
       
    }

    @When("^Click on View Details$")
    public void click_on_view_details() 
    {
        
    }

    @When("^Capture the Price of the Product and Delivery charge$")
    public void capture_the_price_of_the_product_and_delivery_charge() 
    {
        
    }

    @When("^Validate the You Pay amount matches the sum of price and deliver charge$")
    public void validate_the_you_pay_amount_matches_the_sum_of_price_and_deliver_charge() 
    {
       
    }

    @When("^Search for (.+)$")
    public void search_for(String product) 
    {
       
    }

    @When("^Click on Product (.+)$")
    public void click_on_product(String productname) 
    {
        
    }

    @When("^Capture the Price and Delivery Charge$")
    public void capture_the_price_and_delivery_charge() 
    {
        
    }

    @When("^Click on Add to Cart$")
    public void click_on_add_to_cart() 
    {
       
    }

    @When("^Click on Cart$")
    public void click_on_cart() 
    {
      
    }

    @When("^Validate the Proceed to Pay matches the total amount of both the products$")
    public void validate_the_proceed_to_pay_matches_the_total_amount_of_both_the_products() 
    {
      
    }

    @Then("^Add To Cart$")
    public void add_to_cart() 
    {
       
    }

    @Then("^Close all the windows$")
    public void close_all_the_windows() 
    {
      
    }


   



}

