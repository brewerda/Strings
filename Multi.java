public class Multi {

	public static void main(String[] args) {
		int[][] a = {	{1, 2, 3, 4, 5},
						{6, 7, 8, 9, 10},
						{11,12,13,14,15} };

						// sumRow(a, 2);
						//sumCol(a, 1);
						//sumTotal(a);
						//reverseRow(a, 1);
						//

						snakeDraft(10,3);
	}
	public void print(int[][] a) {
		for (int r=0; r<a.length; r++) {
			for (int c=0; c<a[r].length; c++) {
				System.out.print(a[r][c] + " ");
			}
			System.out.println();
		}
	}
	public static void  sumRow(int[][] a, int y) {
		int sumRow = 0;
		for (int r=0; r<a[y].length; r++) {
				sumRow = sumRow + a[y][r];
		}
		System.out.println(sumRow + " ");
	}
	public static void sumCol(int[][] a, int y) {
		int sumCol = 0;
		for (int r=0; r<a.length; r++) {
				sumCol = sumCol + a[r][y];
			}
			System.out.println(sumCol + " ");
	}
	public static void sumTotal(int[][] a) {
		int sum = 0;
		for (int r=0; r<a.length; r++) {
			for (int c=0; c<a[r].length; c++) {
				sum = sum + a[r][c];
			}
		}
		System.out.println(sum + " ");
	}
	public static void reverseRow(int[][] a, int y) {

		for (int r= a.length + 1; r >= 0; r--) {
			System.out.println(a[y][r] + " ");
		}
		
	}
	public static void reverseCol(int[][] a) {
			
	}
	public static int[][] snakeDraft(int players, int rounds) {
		int[][] b = new int[players][rounds];
		for (int r=0; r<= players; r++) {
			int[players] = r;
			for (int c=0; r<; ) {
				
			}
				
			
		}
			
		}
	}
	public static int[][] rectangularize(int[] a, int rows, int cols)

}