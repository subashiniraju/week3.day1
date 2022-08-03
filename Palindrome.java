package week3.day2.assisnments;

public class Palindrome {

	public static void main(String[] args) {
		String str="madam";
		String rev="";
		for (int i = str.length()-1; i >=0; i--) {
			//Add the char into rev
			rev=str.charAt(i)+rev;
			System.out.print(str.charAt(i));
			
		}
		
		
	}

}
