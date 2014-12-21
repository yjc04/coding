package ch1;

import java.util.HashMap;
import java.util.Map;


//finds out if one of the string is the permutation of another string 
public class CH1_3 {	
	public static boolean isPerm(String s1, String s2){
		if(s1.length() != s2.length()){
			return false;
		}else{
			char[] a1 = s1.toCharArray();
			char[] a2 = s2.toCharArray();
			int[] a1Char = new int[256];
			int[] a2Char = new int[256];
			
			//update the char frequency for two strings
			for(char c : a1){
				a1Char[c]++;
			}
			for(char c : a2){
				a2Char[c]++;
			}
			
			for(char c : a1){
				if(a1Char[c] != a2Char[c]){
					return false;
				}
			}
			
			return true;
		}
	}
	
	public static void main(String[] args){
		String t1 = "abcd";
		String t2 = "acdb";
		
		System.out.println("test result = " + isPerm(t1,t2));
	}
}
