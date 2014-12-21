package ch1;

public class CH1_8 {
	static boolean isSubstring(String s1, String s2){
		return true;
	}
	//determines if s2 is a rotation of s1 using only one call to isSubstring
	static boolean isRotation(String s1, String s2){
		return isSubstring(s1+s1, s2);
	}
	public static void  main(String[] args){
		String s1 = "waterbottle";
		String s2 = "terbottlewa";
	}
}
