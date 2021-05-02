package polymorphism;

public class Calculator {

	public static void main(String[] args) {
		Calculator obj = new Calculator();
		obj.add(1, 2);
		obj.add(1, 2, 3);
	obj.subtract(10, 8);
	obj.subtract(10.5, 8.5);
	obj.multiply(5, 5);
	obj.multiply(5, 2.5);
	obj.Divide(8, 4);
	obj.Divide(12, 6.5);
	

	}
public void add(int num1, int num2) {
	int num3= num1 + num2;
	System.out.println("sum of 2 values "+num3);
}
public void add(int num1, int num2, int num3) {
	int num4= num1 + num2 + num3;

	System.out.println("sum of 3 values "+num4);
}
public void multiply(int num1, int num2) {
	int multi = num1*num2;
	System.out.println("multiple of 2 values "+multi);
}
public void multiply(int num1, Double num2) {
	Double multi = (num1*num2);
	System.out.println("multiple of 2 values "+multi);
}
public void subtract(int num1, int num2) {
	int sub ;
	if(num1>num2) {
		 sub = num1-num2;
		 System.out.println("substration of 2 values " +sub);
	}
	else {
		sub = num2-num1;
		System.out.println("substration of 2 values " +sub);
	}
	
	
}
public void subtract(Double num1, Double num2) {
	Double sub ;

	if(num1>num2) {
		 sub = num1-num2;
		 System.out.println("substration of 2 values " +sub);
	}
	else {
		sub = num2-num1;
		System.out.println("substration of 2 values " +sub);
	}
	
	
}
public void Divide(int num1, int num2) {
	int Div = num1/num2;
	System.out.println("Division of 2 values "+Div);
}
public void Divide(int num1, Double num2) {
	Double Div = num1/num2;
	System.out.println("Division of 2 values "+Div);
}


}
