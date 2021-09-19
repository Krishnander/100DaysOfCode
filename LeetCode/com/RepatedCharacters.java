package com;

import java.util.HashMap;

public class RepatedCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "onometopoeia";
		countchars(s);

	}

	private static void countchars(String s) {
		// TODO Auto-generated method stub
		var n = s.length();
		var hm = new HashMap<Character, Integer>();
		for (int i = 0; i < n; i++) {
			if (hm.containsKey(s.charAt(i))) {
				hm.put(s.charAt(i), hm.get(s.charAt(i)) + 1);
			} else {
				hm.put(s.charAt(i), 1);
			}
		}
		hm.keySet().forEach(i -> {
			System.out.println(i + " is present " + hm.get(i) + " times");
		});
	}

}
