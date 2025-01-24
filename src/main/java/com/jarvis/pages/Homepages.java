package com.jarvis.pages;

import org.openqa.selenium.By;

import com.jarvis.base.keyword.Keyword;

public class Homepages {
	
	
	By menMenu =  By.xpath("//a[@href=\"/shop/men\"]");
	By womenMenu =  By.xpath("//a[@href=\"/shop/men\"]");
	public void hoverOnMenMenu() {
		Keyword keyword = new Keyword();
		keyword.mouseHoverOn(Keyword.driver.findElement(menMenu));
		
		
	}
	
	public void hoverOnWomenMenu() {
		Keyword keyword = new Keyword();
		keyword.mouseHoverOn(Keyword.driver.findElement(menMenu));
		
		
	}
	
	

}
