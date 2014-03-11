public class Sorting {

	public static void main(String[] args) {
		int[] test = {3,1,6,7,1,2};
		int[] fixed = selection(test);
		int[] fixed1 = insertion(test);
		int[] fixed2 = bubble(test);

		if(isSorted(fixed)) {
			System.out.println("Selection");
		print(fixed);
		}
		if(isSorted(fixed1)) {
			System.out.println("Insertion");
			print(fixed1);
		}
		if(isSorted(fixed2)) {
			System.out.println("Bubble");
			print(fixed);
		}
	}
	public static int[] selection(int[] test) {
		for (int i=0, j=test.length-1;i<test.length; i++,j--) {
			for (int k=0;k<test.length ; k++) {
				if(test[k] < test[i]) {
					int first = test[i];
					test[i] = test[k];
					test[k] = first;
				}
			}
			int second = test[i];
			test[i] = test[j];
			test[j] = second;
			print(test);

		}

		return test;
	}
	public static int[] insertion(int[] test) {
		for (int i=0; i<test.length-1; i++) {
			if(test[i] > test[i+1]) {
				int first = test[i];
				test[i] = test[i+1];
				test[i+1] = first;
			}

		}
		return test;
	}
	public static int[] bubble(int[] test) {
		for (int i=0; i<test.length-1; i++) {
			if(test[i] > test[i+1]) {
				int temp = test[i+1];
				test[i+1] = test[i];
				test[i] = temp; 
			}

		}
		return test;
	}





	public static void print(int[] test) {
		for (int i=0; i<test.length; i++) {
			System.out.print(test[i]+ " ");
		}
		System.out.println();
	}

	public static boolean isSorted(int[] test) {
		for(int i=1;i<test.length;i++) {
			if(test[i] < test[i-1]) {
				return false;
			}
		}
		return true;
	}

}





