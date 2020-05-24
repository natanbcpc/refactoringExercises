package exercise3;

public class App {

	public static void main(String[] args) {

		Person john = new Person();
		// ...
		Department dep = john.getDepartment();
		Person manager = dep.getManager();
	}
}
