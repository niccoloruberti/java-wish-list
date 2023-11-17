package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import org.lessons.java.christmas.pojo.Gift;

public class WishList {

	public static void main(String[] args) {
		
		//esercizio base
		
//		Scanner in = new Scanner(System.in);
//		
//		ArrayList<String> gifts = new ArrayList<>();
//		
//		while (true) {
//			
//			System.out.println("Vuoi aggiungere un regalo alla lista? si/no");
//			
//			String ansUser = in.nextLine();
//			
//			if (ansUser.equals("si")) {
//				
//				System.out.println("Inserisci il regalo da aggiungere alla lista: ");
//				
//				String gift = in.nextLine();
//				
//				gifts.add(gift);
//				
//				System.out.println("lunghezza della lista: " + gifts.size());
//				
//			} else {
//				
//				break;
//			}
//		}
//		
//		in.close();
//		
//		System.out.println(gifts);
		
		//bonus
		
		Scanner in = new Scanner(System.in);
		
		ArrayList<Gift> gifts = new ArrayList<>();
		
		while (true) {
			
			System.out.println("Vuoi aggiungere un regalo alla lista? si/no");
			
			String ansUser = in.nextLine();
			
			if (ansUser.equals("si")) {
				
				System.out.println("Inserisci il regalo da aggiungere alla lista: ");
				
				String giftName = in.nextLine();
				
				System.out.println("Inserisci il destinatario della lista");
				
				String giftRecipient = in.nextLine();
				
				Gift gift = new Gift(giftName, giftRecipient);
				
				gifts.add(gift);
				
				System.out.println("lunghezza della lista: " + gifts.size());
				
			} else {
				
				break;
			}
		}
		
		System.out.println("In base a cosa vuoi stampare la lista in ordine alfabetico? regalo/destinatario");
		
		String order = in.nextLine();
		
		in.close();
		
		if(order.equals("regalo")) {
			
			Collections.sort(gifts, Comparator.comparing(Gift::getName));
		} else {
			
			Collections.sort(gifts, Comparator.comparing(Gift::getRecipient));
		}
		
		System.out.println("Lista dei regali:");
		
		for ( Gift gift : gifts) {
			
			System.out.println("regalo: " + gift.getName() + " destinatario: " + gift.getRecipient());
		}

	}

}
