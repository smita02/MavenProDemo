package com.jarvis.base.keyword;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Keyword {
			public static RemoteWebDriver driver;

		public void openbrowser(String BrowserName) {
			if (BrowserName.equalsIgnoreCase("Chrome")) {
				driver = new ChromeDriver();
			} else if (BrowserName.equalsIgnoreCase("Firefox")) {
				driver = new FirefoxDriver();
			} else if (BrowserName.equalsIgnoreCase("Edge")) {

			} else {
				System.out.println("Invalid Browser name");
			}
			System.out.println("Launched" + BrowserName + "browser");

		}

		public void closeBrowser() {
			driver.quit();
		}

		public void launchUrl(String url) {
			driver.get(url);

		}

		public void mouseHoverOn(WebElement element) {
			Actions mouseActions = new Actions(driver);
			mouseActions.moveToElement(element).perform();
		}

	}
