package se;

import java.util.Scanner;

public class Studienberatung {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hast du Abitur?");
		String ans = sc.next();
			if (ans.equalsIgnoreCase("ja")) {
				System.out.println("Bist du wissbegierig?");
				ans = sc.next();
					if (ans.equalsIgnoreCase("ja")) {
						System.out.println("Auf jeden Fall studieren");
					}
					else if (ans.equalsIgnoreCase("nein")) {
						System.out.println("Nicht studieren");
					}
			}
			else if (ans.equalsIgnoreCase("nein")) {
				System.out.println("Hast du Fachabitur? ");
				ans = sc.next();
				if (ans.equalsIgnoreCase("ja")) {
					System.out.println("Hast du eine Berufsausbildung? ");
					ans = sc.next();
					if (ans.equalsIgnoreCase("ja")) {
						System.out.println("Du kannst ja später noch studieren");
					}
					else if (ans.equalsIgnoreCase("nein")) {
						System.out.println("Besser noch studieren.");
					}
				}
				else if (ans.equalsIgnoreCase("nein")) {
					System.out.println("Nicht studieren");
				}
			}

	}

}
