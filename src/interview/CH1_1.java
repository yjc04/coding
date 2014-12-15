package interview;

public class CH1_1 {
	
	// solution has O(1) : traverse the string and update the boolean field for each character
	public static boolean allCharUnique(String str){
		String test = str;
		for(int i = 0; i < test.length(); i++){
			String sub = test.substring(i, i+1); // i th character of the string
			String behind = test.substring(i+1); // substring starting right after i'th character exclusive
			if(behind.contains(sub)){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] arg){
		String abc = "abcda";
		System.out.println(" test result : " + allCharUnique(abc));
		
	}
}
