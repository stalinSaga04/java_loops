package usingWhileLoops;

public class MultiplicationOf3 {
	static int res ;
	public static void main(String [] args) {
		MultiplicationOf3 mul = new MultiplicationOf3();
		mul.mul_of_three(10);
		
	}
	  int mul_of_three(int num) {
		  //int dup = num;
		  int count = 1;
		  while(count<=num) {
			  if ( count%5==0||count%3==0 ) {
				System.out.print(
						count+" ");
			}
			  count++;
			 // num = num-1;
		  }
		  return res;
	}

}
