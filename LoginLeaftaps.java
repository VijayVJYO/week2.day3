package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginLeaftaps {
	public static void main(String[] args) {
		//download the driver and set path
		WebDriverManager.chromedriver().setup();
		//launch the chrome browser
		ChromeDriver driver=new ChromeDriver();
		//load the application
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");		
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')] ")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TESTLEAF");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("VJ");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("vijay");
		driver.findElement(By.xpath("//input[@id='createLeadForm_personalTitle']")).sendKeys("MR");
		driver.findElement(By.xpath("//input[@id='createLeadForm_generalProfTitle']")).sendKeys("tester");
		driver.findElement(By.xpath("//input[@id='createLeadForm_annualRevenue']")).sendKeys("50000");
		driver.findElement(By.xpath("//input[@id='createLeadForm_sicCode']")).sendKeys("1111");
		driver.findElement(By.xpath("//input[@id='createLeadForm_parentPartyId']")).sendKeys("3546");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("S");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastNameLocal']")).sendKeys("s");
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("TESTING");
		driver.findElement(By.xpath("//input[@id='createLeadForm_numberEmployees']")).sendKeys("100");
		driver.findElement(By.xpath("//input[@id='createLeadForm_tickerSymbol']")).sendKeys("%$&*");
	

		WebElement eleDropDown1 = driver.findElement(By.xpath("//select[@id='createLeadForm_industryEnumId']"));
		Select dd1=new Select(eleDropDown1);
		dd1.selectByValue("IND_SOFTWARE");
		
		Select dd2=new Select(driver.findElement(By.xpath("//select[@id='createLeadForm_dataSourceId']")));
		dd2.selectByValue("LEAD_CONFERENCE");
		
		Select dd3=new Select(driver.findElement(By.xpath("//select[@id='createLeadForm_ownershipEnumId']")));
		dd3.selectByValue("OWN_PARTNERSHIP");
		
		Select dd4=new Select(driver.findElement(By.xpath("//select[@id='createLeadForm_marketingCampaignId']")));
		dd4.selectByValue("CATRQ_AUTOMOBILE");
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("Im A Good Learner");
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_importantNote']")).sendKeys("hi");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneAreaCode']")).sendKeys("603102");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneExtension']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("vijayanmass1006@gmail.com");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneNumber']")).sendKeys("9360164022");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneAskForName']")).sendKeys("my brother purushothaman");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryWebUrl']")).sendKeys("http://leaftaps.com/crmsfa/control/createLeadForm");
		driver.findElement(By.xpath("//input[@id='createLeadForm_generalToName']")).sendKeys("Suriya");
		driver.findElement(By.xpath("//input[@id='createLeadForm_generalAttnName']")).sendKeys("Vijay");
		driver.findElement(By.xpath("//input[@id='createLeadForm_generalAddress1']")).sendKeys("no-45/9,small st,neikuppi");
		driver.findElement(By.xpath("//input[@id='createLeadForm_generalAddress2']")).sendKeys("neikuppi,anupuram");
		WebElement webelement = driver.findElement(By.xpath("//select[@id='createLeadForm_generalCountryGeoId']"));
		Select dd5=new Select(webelement);
		dd5.selectByValue("IND");
		
		
		driver.findElement(By.xpath("//*[@id=\"createLeadForm_generalCity\"]")).sendKeys("chennai");
		driver.findElement(By.xpath("//*[@id=\"createLeadForm_generalPostalCode\"]")).sendKeys("603102");
		driver.findElement(By.xpath("//*[@id=\"createLeadForm_generalPostalCodeExt\"]")).sendKeys("123");
		WebElement web1 = driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));
		Select dd7=new Select(web1);
		dd7.selectByValue("IN-TN");
		driver.findElement(By.xpath("//input[@id='ext-gen597']")).click();
		
		
	}

}
