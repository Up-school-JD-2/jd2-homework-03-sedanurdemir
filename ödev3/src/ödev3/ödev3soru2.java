package ödev3;

import java.util.Scanner;

public class ödev3soru2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Lütfen kelimenizi giriniz: ");
		String kelime = sc.next();
		
		String terskelime ="";
		
		
		
		for(int i=(kelime.length()-1);i>=0;i--) {
			terskelime+=kelime.charAt(i);
			
		}
		System.out.println("Girdiğiniz kelimenin tersi "+terskelime);
		
		if(terskelime.equals(kelime)) {
			System.out.println("Girdiğiniz kelime bir palindromdur.");
			
		}
		else {
			System.out.println("Girdiğiniz kelime palindrom değildir. ");
		}

	}

}
