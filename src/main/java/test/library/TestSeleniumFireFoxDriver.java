package test.library;
// Created by ZG on 15/9/1.
// 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class TestSeleniumFireFoxDriver {
    public static void main(String[] args) {

        String url = "https://login.weibo.cn/login/?backURL=http%3A%2F%2Fm.weibo.cn%2F&backTitle=%E6%89%8B%E6%9C%BA%E6%96%B0%E6%B5%AA%E7%BD%91&vt=4";

        FirefoxProfile profile = new FirefoxProfile();
        profile.setPreference("general.useragent.override", "Mozilla/5.0 (Linux; U; Android 4.3; en-us; SM-N900T Build/JSS15J) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.0 Mobile Safari/534.30");
        WebDriver driver = new FirefoxDriver();

//        WebDriver driver = new ChromeDriver();

        driver.get(url);
        driver.findElement(By.name("mobile")).sendKeys("111");
        driver.findElement(By.xpath("//*[@type=\"password\"]")).sendKeys("1111");
        driver.findElement(By.name("submit")).click();

        System.out.println(driver.manage().getCookies());
        driver.close();
    }
}
