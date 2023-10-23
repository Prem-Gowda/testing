
Feature: Create account on wiki page

Scenario: User creates account on wiki page using input from cucumber data table
Given User is on Create Account Page
Then User enters following details
| admin | admin@123 | admin@123 | admin@gmail.com |
| prem | admin@123 | admin@123 | prem@gmail.com |
| kumar | admin@123 | admin@123 | kumar@gmail.com |
| ravi | admin@123 | admin@123 | ravi@gmail.com |
| kumar | admin@123 | admin@123 | kumar@gmail.com |
Then Account creation is successfull


Scenario: User creates account on wiki page using input from cucumber data table
Given User is on Create Account Page
Then User enters following details using column name
| Username | Password | retype | Email ID|
| admin | admin@123 | admin@123 | admin@gmail.com |
| prem | admin@123 | admin@123 | prem@gmail.com |
| kumar | admin@123 | admin@123 | kumar@gmail.com |
| ravi | admin@123 | admin@123 | ravi@gmail.com |
| kumar | admin@123 | admin@123 | kumar@gmail.com |
Then Account creation is successfull

===================================================================================================================================


package steps;

import java.util.List;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DataTableDemo {
	
	WebDriver driver;
	
	@Given("User is on Create Account Page")
	public void user_is_on_create_account_page() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Wikipedia%3ASign+up&returntoquery=centralAuthAutologinTried%3D1%26centralAuthError%3DNot%2Bcentrally%2Blogged%2Bin");
	}
	
	@Then("User enters following details")
	public void user_enters_following_details(DataTable dataTable) {
		
	List<List<String>> userList = dataTable.asLists(String.class);
		
		for(List<String> e : userList)
		{
			// System.out.println(e);
			driver.findElement(By.xpath("(//div[@class='cdx-text-input']/descendant::input[1])[1]")).clear();
			driver.findElement(By.xpath("(//div[@class='cdx-text-input']/descendant::input[1])[1]"))
			.sendKeys(e.get(0));
			driver.findElement(By.xpath("(//div[@class='cdx-text-input']/descendant::input[1])[2]")).clear();
			driver.findElement(By.xpath("(//div[@class='cdx-text-input']/descendant::input[1])[2]"))
			.sendKeys(e.get(1));
			driver.findElement(By.xpath("(//div[@class='cdx-text-input']/descendant::input[1])[2]")).clear();
			driver.findElement(By.xpath("(//div[@class='cdx-text-input']/descendant::input[1])[3]"))
			.sendKeys(e.get(2));
			driver.findElement(By.xpath("(//div[@class='cdx-text-input']/descendant::input[1])[2]")).clear();
			driver.findElement(By.xpath("(//div[@class='cdx-text-input']/descendant::input[1])[4]"))
			.sendKeys(e.get(3));
			 
		}
		
	}
	
	@Then("User enters following details using column name")
	public void datatabledemoMaps(DataTable datatable)
	{
	
		List<Map<String, String>> userList	= datatable.asMaps(String.class, String.class);
	
		
	
		for(Map<String, String> e : userList) {
			
						driver.findElement(By.xpath("(//div[@class='cdx-text-input']/descendant::input[1])[1]")).clear();
						driver.findElement(By.xpath("(//div[@class='cdx-text-input']/descendant::input[1])[1]"))
						.sendKeys(e.get("Username"));
						driver.findElement(By.xpath("(//div[@class='cdx-text-input']/descendant::input[1])[2]")).clear();
						driver.findElement(By.xpath("(//div[@class='cdx-text-input']/descendant::input[1])[2]"))
						.sendKeys(e.get("Password"));
						driver.findElement(By.xpath("(//div[@class='cdx-text-input']/descendant::input[1])[2]")).clear();
						driver.findElement(By.xpath("(//div[@class='cdx-text-input']/descendant::input[1])[3]"))
						.sendKeys(e.get("retype"));
						driver.findElement(By.xpath("(//div[@class='cdx-text-input']/descendant::input[1])[2]")).clear();
						driver.findElement(By.xpath("(//div[@class='cdx-text-input']/descendant::input[1])[4]"))
						.sendKeys(e.get("Email ID"));
		}
		
	}

	@Then("Account creation is successfull")
	public void account_creation_is_successfull() {
	
		driver.close();
	}

}
