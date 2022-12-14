package _05_StringManipulation;

import java.util.Scanner;

public class Q10_calis {
    public static void main(String[] args) {
        /*
            TASK :
         * Kullanıcıdan aldığınız  Adı, Soyadı ve kredi kartı numaralarını aşağıdaki gibi özel forma dönüştürün
         * Kredi kartı numarasını kontrol edin, yoksa 16 haneden küçük olursa   "Geçersiz kredi kartı numarası" yazdırın.
         * input : John White 1234234534561478
           output: Ad : J*** Soyad :W**** kartNo:***********1478 (Adın baş harfleri ve soyadı büyük olmalıdır)
         */

		 /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
		 1) \\d    ==> tum rakamlar         0->9
		  	 \\D    ==> tum rakam disi character ler  0->9    _ disindaki hersey
		 2) \\w   ==> A->Z		a->z
		 	 \\W  ==> A->Z		a->z		tum harf disi character ler
		 3) \\s   ==> space
		 	 \\S   ==> space disindaki hersey
	 */

        String isim = "John";
        String soyisim = "White";
        String kart = "1234234534561478";
        String depo=" Ad : "+ isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*")
                +" Soyad : "+ soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).replaceAll("\\w","*")
                +" kartNo:"+kart.substring(0,12).replaceAll("\\w","*")+kart.substring(12);

        System.out.println(depo);




       //String kelime="Zeynep1453*#";
       //System.out.println(kelime.replaceAll("\\D", ""));
       //System.out.println(kelime.replaceAll("[a-zA-Z]", ""));
       //String yeniKelime=kelime.replaceAll("[0-9]", "");
       //System.out.println(yeniKelime.replaceAll("\\W", ""));


    }
}
