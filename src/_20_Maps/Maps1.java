package _20_Maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Maps1 {
	public static void main(String[] args) {
		//MAplarde bir keye kar��l�k birden fazla value olabilir mi?
		
			/*  meyveler			--> elma
								armut
								�ilek
				sebzeler		-->kabak
								patl�can
								marul
								�spanak
								
				vitaminler		a
								b
								c
								d
								
								*/
				
			HashMap<String, List<String> > karisik =new HashMap<>();
			
			/*					
			List<String>meyveler=new ArrayList();
			meyveler.add("elma");
			meyveler.add("armut");
			meyveler.add("�ilek");
			System.out.println(meyveler);
			*/
			
			List<String> meyveler=Arrays.asList("elma","armut","�ilek");
			karisik.put("meyveler",meyveler );
			
			List<String> sebzeler=Arrays.asList("kabak","patl�can","marul","�spanak");
			karisik.put("sebzeler", sebzeler);
			
			List<String> vitaminler=Arrays.asList("a","b","c","d");
			karisik.put("vitaminler", vitaminler);
			System.out.println(karisik);
			
	}

}
