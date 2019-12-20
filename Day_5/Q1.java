package Day_5;

class Person{
	private int age;
	private float amount;
	
	public Person(int age,float amount)
	{
		this.age = age;
		this.amount = amount;
	}
	
	public void voting()
	{
		if(age>18)
			System.out.println("You can vote");
		else
			System.out.println("You cannot vote");
	}
	public void calTax()
	{
		System.out.println(amount*0.125);
	}
}


public class Q1 {

	public static void main(String[] args) {
		Person p = new Person(11,3000.00f);
		p.voting();
		p.calTax();
	}
}
