package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.Scanner;

public class WishList {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		ArrayList<String> gifts = new ArrayList<>();
		
		while (true) {
			
			System.out.println("Vuoi aggiungere un regalo alla lista? si/no");
			
			String ansUser = in.nextLine();
			
			if (ansUser.equals("si")) {
				
				System.out.println("Inserisci il regalo da aggiungere alla lista: ");
				
				String gift = in.nextLine();
				
				gifts.add(gift);
				
				System.out.println("lunghezza della lista: " + gifts.size());
				
			} else {
				
				break;
			}
		}
		
		in.close();
		
		System.out.println(gifts);

	}

}
