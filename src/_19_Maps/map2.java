package _19_Maps;
import java.util.HashMap;
import java.util.Scanner;
public class map2 {
    public static void main(String[] args) {
        
        HashMap<Integer,String> ogrenciBilgileri=new HashMap<>();
        ogrenciBilgileri.put(937, "Ali Can-7/B");
        ogrenciBilgileri.put(531,"Ay�e �etin-8/A");
        ogrenciBilgileri.put(856, "Ahmet Demir-5/B");
        ogrenciBilgileri.put(214,"Melek Durmaz-6/C");
        ogrenciBilgileri.put(632,"Can Mert -6/C");
        
        //yeni bir ��renci giri�i yap�s�n .var olan numara ile kay�t yap�lmaya �al���ld���nda 
        //o numaral� kayd�n oldu�unu ve o numaraya ait ki�inin bilgisini getirsin
        // eger belirtilen numara kay�tl� de�ilse kayd�n�z eklenmi�tir desin.
        Scanner scan=new Scanner(System.in);
        
        /* System.out.println("numara giriniz");
        int numara=scan.nextInt();
        scan.nextLine();
        
        System.out.println("ogrenci bilgisi giriniz");
        String bilgi=scan.nextLine();
        
        if( ogrenciBilgileri.putIfAbsent(numara,bilgi)== null ) {
            
            System.out.println("kayd�n�z eklenmi�tir: "+ ogrenciBilgileri.get(numara));
                        
        }else {
            System.out.println("B�yle bir kay�t mevcuttur : Kay�t "+
        ogrenciBilgileri.putIfAbsent(numara,bilgi)+" ki�isine aittir.");
        }*/ //==> burada di�er souryu ��mek comment e ald�k
        
        // Bir numara girildi�inde o ki�iye ait s�n�f bilgisini bize g�stersin.
        //e�er kay�t yok ise b�yle bir kay�t yok mesaj� versin
        
        
        
        System.out.println("numara giriniz");
        int numara=scan.nextInt();
        
        ogrenciBilgileri.get(numara);     				// input :632 output:"Can Mert -6/C" (syso icine alinsaydi.)
        
        System.out.println(ogrenciBilgileri.get(numara).substring(ogrenciBilgileri.get(numara).indexOf("-")+1));
        System.out.println(ogrenciBilgileri.get(numara).substring(ogrenciBilgileri.get(numara).lastIndexOf("-")+1));
        
        
        
        
        
        
        
        
        
        
        
    }
}