package com.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Demo {

	public static void main(String[] args) {
		 WebDriver d = new SafariDriver();
		 d.get("https://www.google.com");
	}
}
