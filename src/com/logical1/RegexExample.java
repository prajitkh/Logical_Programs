package com.logical1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {

	public static void main(String[] args) {

		final String ss = "test";
		String s1 = new String("test");

		System.out.println(ss == s1);
		String htmlContent = "<p><a style=\"color:blue\" emailid:\"wojivib114@egela.com|63\" class=\"wysiwyg-mention\" data-mention data-value=\"wojivib wojivib\">@wojivib wojivib</a>  2sr comment check,</p>\n"
				+ "<p><a style=\"color:blue\" emailid:\"wojivib114@egela.com|63\" class=\"wysiwyg-mention\" data-mention data-value=\"wojivib wojivib\">@wojivib wojivib</a>  3rs comment check</p>";

		String regex = "<a[^>]+>@([^<]+)<\\/a>\\s*([^<]+)";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(htmlContent);

		while (matcher.find()) {
			String username = matcher.group(1);
			String comment = matcher.group(2).trim();
			System.out.println("@" + username + " " + comment);
		}
	}
}