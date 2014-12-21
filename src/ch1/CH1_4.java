package ch1;

// replaces all spaces in a string with '%20'
public class CH1_4 {
	/**
	 * replaces all blank spaces in a string with '%20'
	 * @param str
	 * @return
	 */
	static String replace(String str){
		StringBuffer result = new StringBuffer();
		int cursor = 1;
		while(cursor < str.length()){
			if(str.charAt(cursor-1)==' ' && str.charAt(cursor) == ' '){
				cursor = cursor - 2;
				break;
			}
			cursor++;
		}
		for(int i=cursor; i >= 0; i--){
			if(str.charAt(i)==' '){
				result.insert(0,"%20");
			}else{
				result.insert(0,str.charAt(i));
			}
		}
		return result.toString();
	}
	
	public static void main(String[] args){
		String input = "Mr John Smith  ";
		System.out.println(replace(input));
	}
}
