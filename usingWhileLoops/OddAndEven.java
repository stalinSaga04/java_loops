package usingWhileLoops;

public class OddAndEven {
	
	public static void main(String [] args) {
		OddAndEven oe = new OddAndEven();
		oe.find_method(10);
		
	}
	void find_method(int num){
		int count = num;
		while (num>0) {
			if (num%2 != 0)// odd numbers
			//if(num%2==0)
			{
				System.out.print(count - num+" ");
			}
			num = num-1;
		}
	}

}

