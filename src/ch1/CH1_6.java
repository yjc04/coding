package ch1;

/**
 * N x N matrix each pixel is 4bytes : rotate the image by 90 degrees
 * @author cho
 *
 */
public class CH1_6 {
	static int[][] rotate(int[][] input){
		int len = input.length;
		System.out.println(len);
		int[][] result = new int[len][len];
		for(int i=0 ; i < len; i++){
			for(int j=0; j < len; j++){
				result[j][len-1-i] = input[i][j];
			}
		}
		return result;
	}
	
	public static void main(String[] args){
		int[][] input = {{1,1,1},{2,2,2},{3,3,3}};
		int[][] result = rotate(input);
		for(int i =0; i < 3 ; i++){
			for(int j = 0; j < 3; j++){
				System.out.print(result[i][j]);
			}
			System.out.println();
		}
	}
}
