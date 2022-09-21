package _19_Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class keyValuesSum {
	
	public static void main(String[] args) {
		
		HashMap<Integer,String> hm1=new HashMap<>();
		hm1.put(101, "Ali Han");// eleman eklemek i�in kullan�l�r. 
		hm1.put(102, "veli Can");
		hm1.put(103, "Ay�e Tan");
		hm1.put(101, "Kemal Y�ld�z");
		
		
		//stream api
		
		System.out.println(hm1.keySet().stream().filter(t-> t!=null).reduce(0, (a, b) -> a + b));
		
		
		// other
		
		List<Integer> keytop= new ArrayList<>();
        int keytop1=0;
        for (Integer each : hm1.keySet()) {
            keytop.add(each);
		}
            for (int i = 0; i < keytop.size(); i++) {
                
                if (keytop.get(i)!=null) {
                    keytop1+=keytop.get(i);
                }   
            }
		
		
		
	}

}
