package ch1;

/**
 * basic string compression
 * @author cho
 *
 */
public class CH1_5 {
	static String compress(String str){
		if(compressedLength(str) > str.length()){
			return str;
		}
		StringBuffer result = new StringBuffer();
		char[] chars = str.toCharArray();
		int cnt = 1;
		for(int i=1; i < str.length(); i ++){
			if(chars[i] != chars[i-1]){
				result.append(chars[i-1]);
				result.append(cnt);
				cnt = 1;
			}else if(i == str.length()-1){
				cnt++;
				result.append(chars[i]);
				result.append(cnt);
			}else{
				cnt++;
			}
		}
		return result.toString();
	}
	
	static int compressedLength(String str){
		if(str.length() == 1){
			return 2;
		}
		char[] chars = str.toCharArray();
		
		int result = 0;
		
		int cnt = 1; 
		for(int i=1; i < str.length(); i++){
			if(chars[i] != chars[i-1]){
//				System.out.println(chars[i-1] + "  " + cnt);
				result = result + 1 + String.valueOf(cnt).length();
				cnt = 1;
			}else if(i == str.length()-1){
//				System.out.println(chars[i-1] + "  " + cnt);
				result = result + 1 + String.valueOf(cnt).length();
			}else{
				cnt++;
			}
		}
		return result;
	}
	
	public static void main(String[] args){
		String input = "aabccccccccccaaa";
		System.out.println(compress(input));
	}
}
