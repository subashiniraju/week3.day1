package week3.day2.assisnments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1="stops";
		String text2="potss";
		if (text1.length()==text2.length()) {
			System.out.println("Both are equal");
			}
		char[] charArray = text1.toCharArray();
		char[] charArray2 = text2.toCharArray();
		Arrays.sort(charArray);
		Arrays.sort(charArray2);
		if (Arrays.equals(charArray, charArray2)) {
			System.out.println("Anagram");
			}
		else {
	System.out.println("Not Anagram");
	}
}}
