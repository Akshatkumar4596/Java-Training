package Day_5;

public class Q4 {
	public static void main(String[] args) {
		String s1 = "Akshat";
//		char[] arr = s1.toCharArray();
//		System.out.println(arr[3]);
		String s2 = " Kumar   ";
		int count = 0;
//		System.out.println(s1.concat(s2));
//		System.out.println(s1);
//		System.out.println(s1.charAt(2));
//		System.out.println(s1.indexOf('a'));
//		System.out.println(s1.compareTo(s2));
//		for (int i = 0; i < s1.length()-1; i++) {
//			if(s1.toLowerCase().charAt(i)=='a')
//				count++;
//		}
//		System.out.println(count);
//		System.out.println(s1.substring(2,6));
//		System.out.println(s2.trim());
		String s3 = "Rahul 21 7 7.28 75000 Bhopal 48200";
		String a[] = s3.split(" ");
		System.out.println("Name:" + a[0]);
		System.out.println("Age:" + a[1]);
		System.out.println("Sem:" + a[2]);
		System.out.println("CGPA:" + a[3]);
		System.out.println("Fees:" + a[4]);
		System.out.println("City:" + a[5]);
		System.out.println("PIN:" + a[6]);
	}
}
