package class15;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver chrome = new ChromeDriver();
        chrome.navigate().to("https://facebook.com");
        System.out.println(chrome.getTitle());
        Thread.sleep(3000); // program waits 3 seconds before closing 1000 millis = 1 second
        chrome.navigate().to("https://amazon.com");
        Thread.sleep(3000);
        chrome.navigate().refresh();
        Thread.sleep(3000);
        chrome.navigate().back();
        Thread.sleep(5000);
        chrome.close();
    }
}
