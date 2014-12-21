package ch1;
/**
 * algorithm such that if an element in an M by N matrix is 0, its entire row and column are set to 0
 * @author cho
 *
 */
public class CH1_7 {
	static void setZero(int[][] matrix){
		boolean[] isZeroRow = new boolean[matrix.length];
		boolean[] isZeroCol = new boolean[matrix[0].length];
		
		for(int i=0; i < matrix.length; i++){
			for(int j=0; j < matrix[0].length; j++){
				if(matrix[i][j] == 0){
					isZeroRow[j] = true;
					isZeroCol[i] = true;
				}
			}
		}
		
		for(int i=0; i < matrix.length; i++){
			for(int j=0; j < matrix[0].length; j++){
				if(isZeroRow[j] || isZeroCol[i]){
					matrix[i][j] = 0;
				}
			}
		}
	}
	
	public static void main(String[] args){
		int[][] matrix = {{1,2,0},{1,2,0},{1,2,3}};
		setZero(matrix);
		for(int i=0; i < matrix.length; i++){
			for(int j = 0; j < matrix[0].length; j ++){
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
		//should be 
		// 000
		// 000
		// 120
	}
}
