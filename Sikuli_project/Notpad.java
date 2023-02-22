import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Notpad {

		public static void main1(String[] args) throws FindFailed 
		{
			
			
				System.setProperty("webdriver.chrome.driver","chromedriver.exe");
				WebDriver driver= new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				
				Screen s = new Screen();
			    Pattern p=new Pattern("C:\\Users\\Mohs10 Technologies\\Pictures\\Screenshots\\Notepad1.png");
			    s.type("d",Key.WIN);
			    s.doubleClick(p);
			  //  s.type("notepad.png","This is Nice Sikuli Tutorial!!!!");
				
				
				
			}	

	}

}
