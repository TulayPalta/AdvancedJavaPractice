package _20_Maps;

import java.util.HashMap;
import java.util.Scanner;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 1- Kullan�c�dan bir�ok kimlik numars�n�(4 haneli), tam ismini, adresini
		 * ,telefonunu al�n. 2- Kimlik numaras�n� key olarak, di�er bilgileri
		 * valueolarak bir mape depolay�n 3- Kimlik numaras�n� girerek kullan�c�n�n
		 * bilgilerini ekrana yazd�r�n 4- t�m kullan�c�lar�n isimlerini ekrana
		 * yaz�dral�m.
		 */

		String secim = "";

		HashMap<Integer, HashMap<String, String>> kisiListesi = new HashMap<>();

		Scanner scan = new Scanner(System.in);
		do {

			HashMap<String, String> kisiBilgileri = new HashMap<>();

			System.out.println("Lutfen adinizi ve soyadinizi girin: ");
			// String isim=scan.nextLine();
			kisiBilgileri.put("ad", scan.nextLine());

			System.out.println("Lutfen adresinizi girin: ");
			// String adres=scan.nextLine();
			kisiBilgileri.put("adres", scan.nextLine());

			System.out.println("Lutfen telefonunuzu girin: ");
			// String tel=scan.nextLine();
			kisiBilgileri.put("telefon", scan.nextLine());

			System.out.println("4 haneli kimlik no giriniz: ");
			// int kimlikNo=scan.nextInt();
			kisiListesi.put(scan.nextInt(), kisiBilgileri);

			scan.nextLine();
			System.out.println(kisiBilgileri);
			System.out.println(kisiListesi);
			System.out.println("DEvam etmek istiyor musnuz(E/H)");
			secim = scan.nextLine();
		} while (secim.equalsIgnoreCase("E"));

		System.out.println("g�r�nt�lemek istedi�iniz ki�inin kimlik numaras�n� girin ");
		System.out.println(kisiListesi.get(scan.nextInt()));

	}

}
