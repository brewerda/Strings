import java.util.ArrayList;

public class Students {

	private String str;

	public ArrayLists(String str) {
		this.str = str;
	}
	public void doSomething(String str) {
		if(str !=null && str.size() > 6) {

		}
	}





	public static void main(String[] args) {
		String[] students = {"Brick","Ron","Brian","jack","Champ"};

		ArrayList<String> students = new ArrayList<String>();

		students.add("KNerlan");
		students.add("Conor");
		students.set(1, "BED TIME");
		students.add("NSA");

		students.remove(2);

		System.out.println(students.get(3));
		for (int i=0; i< students.size(); i++) {
			System.out.println(students.get(is));
		}
		for (String s : students) {
			System.out.println(s);
		}
	}
}