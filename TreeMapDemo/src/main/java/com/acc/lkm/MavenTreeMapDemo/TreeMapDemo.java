package com.acc.lkm.MavenTreeMapDemo;

import java.util.*;

public class TreeMapDemo {
	public static void main(String[] args) {
		// TreeMap used for storing marks
		TreeMap<String, Integer> treemap = new TreeMap<String, Integer>();

		treemap.put("Havish", 75);
		treemap.put("Aditya", 80);
		treemap.put("Sneha", 100);
		treemap.put("Ravi", 55);
		treemap.put("Ram", 88);

		for (Map.Entry m1 : treemap.entrySet()) {
			System.out.println(m1.getKey() + " has scored " + m1.getValue() + " marks in Assignment - 1");
		}

	}
}
