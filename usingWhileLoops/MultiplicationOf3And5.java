package usingWhileLoops;

public class MultiplicationOf3And5 extends MultiplicationOf3{
	public static void main(String[] args) {
		
	
	MultiplicationOf3And5 m3and5 = new MultiplicationOf3And5();
	m3and5.mul_of_three(5);
	System.out.println("");
	m3and5.mul_of_five(5);
}

	void mul_of_five(int num) {
	int count = num;
	while (num>0) {
	int result = ((count-num + 1)*5);
	
		System.out.print(result + " ");
		num = num-1;
		
	}
	}
}
