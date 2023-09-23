import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class lab {
	WebDriver driver = new ChromeDriver();
	SoftAssert Assert = new SoftAssert();
	String ExResult1 = "English";
	String ExResult2 = "SAR";

	@BeforeTest
	public void myBeforeTest() {
		driver.get("https://www.almosafer.com/ar?ncr=1");
	}

	@Test()
	public void myTest1() {

		String AcResult1 = driver.findElement(By.className("hcOfTd")).getText();

		Assert.assertEquals(AcResult1, ExResult1, "check the language!");
		Assert.assertAll();
	}

	@Test()
	public void myTest2() {

		String AcResult2 = driver.findElement(By.className("dWRKFC")).getText();

		Assert.assertEquals(AcResult2, ExResult2, "check the curreny!");
		Assert.assertAll();
	}

	@Test()
	public void myTest3() {

		String AcResult3 = driver.findElement(By.id("uncontrolled-tab-example-tab-flights")).getText();

		Assert.assertEquals(AcResult3, "طيران");
		Assert.assertAll();
	}

	@AfterTest
	public void MyAfterTest() {

		driver.quit();
	}

}
