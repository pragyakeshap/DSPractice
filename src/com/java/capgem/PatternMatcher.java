package com.java.capgem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {
	
	public static void main(String[] args) {
		
		String str = ("Mon 01:00-23:00\n" +
                "Tue 01:00-23:00\n" +
                "Wed 01:00-23:00\n" +
                "Thu 01:00-23:00\n" +
                "Fri 01:00-23:00\n" +
                "Sat 01:00-23:00\n" +
                "Sun 01:00-21:00");
		
		String[] meetings = str.split("\n");
		
		Pattern pattern = Pattern.compile("(.*) (.*):(.*)-(.*):(.*)");
		
		for(String meet : meetings) {
			Matcher matcher = pattern.matcher(meet);
		
			//System.out.println(match);
			while(matcher.find()) {
				System.out.println(matcher.group(1));
				System.out.println(matcher.group(2));
				System.out.println(matcher.group(3));
				System.out.println(matcher.group(4));
				System.out.println(matcher.group(5));
			}
		}
		
	}

}
