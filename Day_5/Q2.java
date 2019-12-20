package Day_5;

public class Q2 {

	public static void main(String[] args) {
		String s1 = new String("Hello ");
		System.out.println(s1);
		String s2 = "World!!";
		System.out.println(s2);
		String s3 = s1+s2;
		System.out.println(s3);
		System.out.println(s3.toUpperCase());
		System.out.println(s3.charAt(11));
		System.out.println(s3.length());
		System.out.println(s3.replace('l', '_'));
		System.out.println(s3.substring(6));
	}
}
