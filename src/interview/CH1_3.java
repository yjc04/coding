package interview;

import java.util.HashMap;
import java.util.Map;

public class CH1_3 {
	public boolean isPerm(String s1, String s2){
		Map map = new HashMap<String, Integer>();
		
		String big = s1.length() >= s2.length() ? s1 : s2;
		String small = big.equals(s1) ? s2 : s1;
		System.out.println(" big = " + big + "  small = " + small);
		
		for(int i = 0; i < small.length(); i++){
			if(map.containsKey(small.charAt(i))){
				map.put(small.charAt(i), (Integer)map.get(small.charAt(i)) + 1);
			}else{
				map.put(small.charAt(i), new Integer(1));
			}
		}
		return true;
		//
	}
}
