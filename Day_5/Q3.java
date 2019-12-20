package Day_5;

public class Q3 {

	public static void main(String[] args) {
		String s1 = "INDIA";
		String s2 = "india";
		if(s1.equals(s2))
			System.out.println("Equal");
		else
			System.out.println("Not equal");
		if(s1.equalsIgnoreCase(s2))
			System.out.println("Equal");
		else
			System.out.println("Not equal");
	}
}
