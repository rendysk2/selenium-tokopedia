package selenium.tokopedia;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tokopedia {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			JavascriptExecutor js = (JavascriptExecutor) driver;

			String url = "https://tokopedia.com";
			driver.get(url);
			driver.manage().window().maximize();
			String pageTitle = driver.getTitle();
			System.out.println(pageTitle);

			driver.findElement(By.xpath("//input[@class=\"css-1wc186l e110g5pc0\"]")).sendKeys("asus rog phone 6");
			driver.findElement(By.xpath("//button[@aria-label='Kirimkan']")).click();
			delay(5);
			for(int second=0;; second++) {
				if(second>=60) {
					break;
				}
				((JavascriptExecutor)driver).executeScript("window.scrollBy(0,300)","");
			}
			driver.findElement(By.xpath("//button[@aria-label='Laman 53']")).click();
			
			for(int second=0;; second++) {
				if(second>=60) {
					break;
				}
				//((JavascriptExecutor)driver).executeScript("window.scrollBy(0,300)","");
			}
			//((JavascriptExecutor)driver).executeScript("window.scrollTo(0, document.body.scrollTop)");
			System.out.println("search oke");
			System.out.println("scroll bawah");
			System.out.println("Menampilkan 3121 - 3136 barang dari total 3.136 untuk asus rog phone 6");
			System.out.println("quit");

			delay(5);
			driver.quit();
		}

		
		static void delay(int detik) {
			try {
				Thread.sleep(1000 * detik);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		}


