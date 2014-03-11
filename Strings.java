public class Strings {
	public static void main(String[] args) {
		String str = new String("A String");
		String s = "A string";

		// if ( str.equals(s)) {
		// 	System.out.println("A");
		// } else {
		// 	System.out.println("B");
		// }

		// for (int i=0; i < str.length(); i++) {
		// 	System.out.println(str.charAt(i));
		// }

		// for (int i=0; i<str.length()-1; i++) {
		// 	System.out.println(str.substring(i, i+2));
		// }

		// if (contains("baseball", "ball")) {
		// 	System.out.println("Yes");
		// } else {
		// 	System.out.println("No");
		// }


		// count("people", "e");
		//hasAnA("apple");
		if (isAbecedarian("daflux")) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		if (isDupledrome("llama")) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		captainCrunch("Hello");
	}


	public static int count(String s, String t) {
		int total = 0;
		for (int i=0; i< s.length();i++ ) {
			if(s.substring(i, i+t.length()).equals(t)) {
				total = total + 1;
			}
			
			
		}
		System.out.println("The string: " + t);
		System.out.println("Is inside: " + s);
		System.out.println(total + " Times");
		return total;
		
	}
	// public static boolean hasAnA(String s) {
	// 	char a = 'a';
		
	// 	for (int i=0; i < s.length(); i++) {
	// 		if (s.substring(i).contains('a')) {
	// 			System.out.println("Yes");
	// 			return true;
	// 		}
	// 	}
	// 	return false;
	// }

	// public static boolean isPalindrome(String s) {
	// 	for (int i=0; i<=s.length(); i++) {
							
	// 		if(s.substring(i, i+s.length()).equals(s)) {
	// 			return true;
	// 	}
			
	// 	}
	// 	return false;
	// }
	public static boolean contains(String s, String t) {
		for (int i=0; i < s.length()-t.length() + 1; i++) {
			if(s.substring(i, i+t.length()).equals(t)) {
				return true;
			}
		}
		return false;
	}
	public static boolean isAbecedarian(String s) {
		String text = s.toLowerCase();
		for (int i=0; i < s.length()-1; i++) {
			if (text.charAt(i) > text.charAt(i+1) ) {
				return false;
			}
		}
		return true;
	}
	public static boolean isDupledrome(String s) {
<<<<<<< HEAD
		
	}
}
=======
		for(int i=0; i<s.length; i++) {
			if(s.charAt(i) == s.chatAt(i+1) {
				return true;
			}
		}
		return false;
	}
	public static String captainCrunch(String s) {
		String end = "";
		
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			char inCode = c + 13;
			
			end = end + inCode;
		}
		System.out.println(end);
		return end;
	}
}
>>>>>>> 81fc20d6ceff7756697c9e10991e8cc045781f22
