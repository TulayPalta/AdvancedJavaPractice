package _19_Maps;

import java.util.HashMap;

public class map1 {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm1=new HashMap<>();
		hm1.put(101, "Ali Han");// eleman eklemek i�in kullan�l�r. 
		hm1.put(102, "veli Can");
		hm1.put(103, "Ay�e Tan");
		hm1.put(101, "Kemal Y�ld�z"); // ayn� key kullan�ld���nda eski kayd�n �zerine yazar.
		System.out.println(hm1);
		
		hm1.put(104, "veli Can"); //tekrarl� kye izin vermez ancak tekrarl� value ya izin verir.
		System.out.println(hm1);
		
		hm1.put(null, "merve aslan");
		
		System.out.println(hm1);
		
		
		hm1.put(null,"hakan inal");
		System.out.println(hm1);
		
		hm1.put(105,null);
		System.out.println(hm1);
		hm1.put(106,null);
		System.out.println(hm1);
		
		System.out.println(hm1.get(103));
		
		System.out.println(hm1.values());
		
		System.out.println(hm1.keySet());
		
		hm1.putIfAbsent(104, "kubilay tuncel");//belirtilen key e ait key ve value oldu�u i�in eklemedi
		System.out.println(hm1);
		
		hm1.putIfAbsent(107, "hakan tetik");
		System.out.println(hm1);
		
		hm1.putIfAbsent(105, "faruk efehan");
		System.out.println(hm1);
		
		System.out.println("1. mapin eleman say�s� :"+hm1.size());
		
		HashMap<Integer,String>hm2=new HashMap<>();
		hm2.put(107, "elma");
		hm2.put(106, "Armut");
		hm2.put(200, "mandalina");
		
		System.out.println("2. mapin eleman say�s� :"+hm2.size());
		
		hm1.putAll(hm2);
		
		System.out.println(hm1);
		System.out.println("1. mapin eleman say�s� :"+hm1.size());
		//hm2.putAll(hm1);
		System.out.println(hm2);
		
		
		

	}

}