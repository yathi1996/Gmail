package Testing;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmailapp {

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Yathish\\Desktop\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://mail.google.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//login 
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("yathishcr07@gmail.com");
	
	driver.findElement(By.xpath("//span[text()='Next']")).click();

	driver.findElement(By.xpath("//*[@id='password']/div/div/div/input")).sendKeys("yathi*1996");
	driver.findElement(By.xpath("//div[text()='Show password']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='nH oy8Mbf qp']/header/div[2]/div/div")).click();
	//compose message
    driver.findElement(By.xpath("//div[@class='aic']//div//div")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@class='Hq aUG']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@peoplekit-id='kE8AEc']/div/div/input")).sendKeys("yathishcrchinnu@gmail.com");
	driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("Regarding for the job");
	
    driver.findElement(By.xpath("//td[@class='Ap']/div/following-sibling::div/div")).sendKeys("Am Yathish from Shimoga");
    driver.findElement(By.xpath("//td[@class='gU Up']/div/div[2]/div[1]")).click();
	Thread.sleep(5000);
    driver.findElement(By.xpath("//a[text()='Sent']")).click();
    
    //check whether the primary is displayed or not
    boolean primary=driver.findElement(By.xpath("//div[text()='Primary']")).isDisplayed();
     System.out.println("primary is displayed =" + primary);
     
    driver.findElement(By.xpath("//div[@class='aAy aJi-aLe']")).click();
	Thread.sleep(3000);

    driver.findElement(By.xpath("//div[@class='aAy aKe-aLe']")).click();
	Thread.sleep(3000);

    driver.findElement(By.xpath("//a[text()='Starred']")).click();
	Thread.sleep(3000);
    driver.findElement(By.xpath("//a[text()='Snoozed']")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//a[text()='Sent']")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//a[text()='Drafts']")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//span[text()='More']")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//a[text()='Important']")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//a[text()='Chats']")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//a[text()='Scheduled']")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//a[text()='All Mail']")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//a[text()='Spam']")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//a[text()='Bin']")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//a[text()='Categories']")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//a[text()='Social']")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//a[text()='Updates']")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//a[text()='Forums']")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//a[text()='Promotions']")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//a[text()='Categories']")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//span[text()='Less']")).click();
    Thread.sleep(2000);
     boolean img =driver.findElement(By.xpath("//a[@class='gb_pe gb_Cc gb_ne']/img")).isDisplayed();
     System.out.println("gmail image should be displayed =" +img);
      
     //Logout Gmail
     driver.findElement(By.xpath("//a[@class='gb_e gb_1a gb_s']/img")).click();
     driver.switchTo().frame("account");

     driver.findElement(By.xpath("//div[text()='Sign out']")).click();
   
	}

}
