package com.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class Demo {

	@Test
	public void test1() {
		 WebDriver d = new SafariDriver();
		 d.get("https://www.google.com");
	}
}
