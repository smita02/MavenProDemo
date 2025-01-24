package com.jarvis.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.jarvis.base.keyword.Keyword;

public class Searchpage {

	By productdescription = By.xpath("");

	public List<String> getAllProductDescription() {
		List<WebElement> descriptions = Keyword.driver.findElements(productdescription);
		List<String> productDescriptions = new ArrayList<String>();
		for (WebElement description : descriptions) {
			productDescriptions.add(description.getText());
		}
		return null;
	}
}
