package com.ea;

public class Main {

    public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver_win.exe");

                    driver = new ChromeDriver();

                    driver.manage().window().maximize();
    }
}
