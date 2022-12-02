package org.adactin.stpedefinition;

import org.adactin.runner.RunnerClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition {

	public static WebDriver driver = RunnerClass.driver;

	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {

		driver.get("https://adactinhotelapp.com/");
	}

	@When("^user Enter The Username In Username Field$")
	public void user_Enter_The_Username_In_Username_Field() throws Throwable {

		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));

		username.sendKeys("jeyarajalwin");
	}

	@When("^user Enter The Password In Password Field$")
	public void user_Enter_The_Password_In_Password_Field() throws Throwable {

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("T436W1");

	}

	@Then("^user Click The Login Buttion And It Navigate To Search Hotel Page$")
	public void user_Click_The_Login_Buttion_And_It_Navigate_To_Search_Hotel_Page() throws Throwable {

		driver.findElement(By.xpath("//input[@id='login']")).click();

	}

	@When("^user Select The Location In Select Location Field$")
	public void user_Select_The_Location_In_Select_Location_Field() throws Throwable {

		WebElement element = driver.findElement(By.xpath("//select[@id='location']"));

		Select sc = new Select(element);

		sc.selectByValue("Melbourne");

	}

	@When("^user Select The Hotel In Select Hotel Page$")
	public void user_Select_The_Hotel_In_Select_Hotel_Page() throws Throwable {

		WebElement element = driver.findElement(By.xpath("//select[@id='hotels']"));

		Select sc = new Select(element);

		sc.selectByValue("Hotel Sunshine");

	}

	@When("^user Select RoomType In Roomtype Field$")
	public void user_Select_RoomType_In_Roomtype_Field() throws Throwable {

		WebElement element = driver.findElement(By.xpath("//select[@id='room_type']"));

		Select sc = new Select(element);

		sc.selectByValue("Standard");

	}

	@When("^user Select No of Rooms In No Of Rooms Field$")
	public void user_Select_No_of_Rooms_In_No_Of_Rooms_Field() throws Throwable {

		WebElement element = driver.findElement(By.xpath("//select[@id='room_nos']"));

		Select sc = new Select(element);

		sc.selectByValue("2");

	}

	@When("^user Enter The Checkindate In Check In Date Field$")
	public void user_Enter_The_Checkindate_In_Check_In_Date_Field() throws Throwable {
		
		driver.findElement(By.xpath("//input[@id='datepick_in']")).sendKeys("04/12/2020");
		
	}

	@When("^user Enter The CheckOutDate In Check Out Date Field$")
	public void user_Enter_The_CheckOutDate_In_Check_Out_Date_Field() throws Throwable {
		
		driver.findElement(By.xpath("//input[@id='datepick_out']")).sendKeys("05/12/2022");
		
	}

	@When("^user Select No Of Adults In Adults Per Room$")
	public void user_Select_No_Of_Adults_In_Adults_Per_Room() throws Throwable {

		WebElement element = driver.findElement(By.xpath("//select[@id='adult_room']"));

		Select sc = new Select(element);

		sc.selectByValue("2");

	}

	@When("^user Select No Of Children In Children Per Room Field$")
	public void user_Select_No_Of_Children_In_Children_Per_Room_Field() throws Throwable {

		WebElement element = driver.findElement(By.xpath("//select[@id='child_room']"));

		Select sc = new Select(element);

		sc.selectByValue("1");

	}

	@Then("^user Click On Search Button And It Navigate to Select Hotel Page$")
	public void user_Click_On_Search_Button_And_It_Navigate_to_Select_Hotel_Page() throws Throwable {
		
		driver.findElement(By.xpath("//input[@id='Submit']")).click();
		
	}

	@When("^user Select The Hotel In Select Button Field$")
	public void user_Select_The_Hotel_In_Select_Button_Field() throws Throwable {

		driver.findElement(By.xpath("//input[@id='radiobutton_0']")).click();

	}

	@Then("^user Click The Countinue Button And It Navigate To User Deatils Page$")
	public void user_Click_The_Countinue_Button_And_It_Navigate_To_User_Deatils_Page() throws Throwable {
		
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		
	}

	@When("^user Enter First Name In First Name Field$")
	public void user_Enter_First_Name_In_First_Name_Field() throws Throwable {
		
		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Alwin");
		
	}

	@When("^user Enter Last Name In Last Name Field$")
	public void user_Enter_Last_Name_In_Last_Name_Field() throws Throwable {
		
		driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("jebakumar");
		
	}

	@When("^user Enter Address In Billing Address Field$")
	public void user_Enter_Address_In_Billing_Address_Field() throws Throwable {
		
		driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("2/119,MettuStreet,Melauppoorani");
		
	}

	@When("^user Enter Credit Card No in Credit Card No Field$")
	public void user_Enter_Credit_Card_No_in_Credit_Card_No_Field() throws Throwable {
		
		driver.findElement(By.xpath("//input[@id='cc_num']")).sendKeys("8973450769123456");
		
	}

	@When("^user Select The Card Type In Credit Card Type Field$")
	public void user_Select_The_Card_Type_In_Credit_Card_Type_Field() throws Throwable {

		WebElement element = driver.findElement(By.xpath("//select[@id='cc_type']"));

		Select sc = new Select(element);

		sc.selectByValue("VISA");

	}

	@When("^user Select The Expiry Month In Select Month Field$")
	public void user_Select_The_Expiry_Month_In_Select_Month_Field() throws Throwable {

		WebElement element = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));

		Select sc = new Select(element);

		sc.selectByVisibleText("December");

	}

	@When("^user Select The Expiry Year In Select Year Field$")
	public void user_Select_The_Expiry_Year_In_Select_Year_Field() throws Throwable {

		WebElement element = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));

		Select sc = new Select(element);

		sc.selectByVisibleText("2022");

	}

	@When("^user Enter The CVV No in CVV No Field$")
	public void user_Enter_The_CVV_No_in_CVV_No_Field() throws Throwable {
		
		driver.findElement(By.xpath("//input[@id='cc_cvv']")).sendKeys("123");
		
	}

	@Then("^user Click BookNow Button And It Navigate To Show Page$")
	public void user_Click_BookNow_Button_And_It_Navigate_To_Show_Page() throws Throwable {
		
		driver.findElement(By.xpath("//input[@id='book_now']")).click();
		
		Thread.sleep(5000);
	}

	@Then("^user Click Logout Button And It Navigate To Login Page$")
	public void user_Click_Logout_Button_And_It_Navigate_To_Login_Page() throws Throwable {
		
		driver.findElement(By.xpath("//input[@id='logout']")).click();
		
	}

}
