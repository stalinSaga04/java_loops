package usingWhileLoops;

public class Binary2Decimal {
public static void main(String[] args) {
	Binary2Decimal b2deci = new Binary2Decimal();
	b2deci.find_prime(15);
	//System.out.println(" is a Prime number ");
}
	private void find_prime(int num) {
		int count=0,init=1;
		//boolean status=false;
		while (init<num) {
			if (num%init==0) {
				count=count+1;
				//status=true;
				break;
			}
			init=init+1;
		
			if (count==0) {
				System.out.println(num+" is a Prime number ");
			}
			//num--;
		}
				
		}
	}


