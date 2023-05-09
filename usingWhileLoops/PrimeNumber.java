package usingWhileLoops;

public class PrimeNumber {
	public static void main(String[] args) {
	
		PrimeNumber pn = new PrimeNumber();
		pn.find_prime_number(2,10);
		
	}
	void find_prime_number(int num,int num2) {
		//int count=0,init =2;// if we declare a local variable count before the 
		while (num<=num2) {    //passed arguments initialization. count value never
			int count=0,init =2;		//re-initialization/decrement (it (count=0) never become 
								//zero again)even make changes in the parameter
		while(init<=num/2){
			if(num%init==0) {
				count=count+1;
				//break;
				//System.out.print(init+" ");
			}
			init++;	
		}
		if (count==0) {
			System.out.println(num+" is a prime number");
		}
		/*
		 * else { System.out.println(""+num + " is not a prime number"); }
		 */
		num=num+1;
		}
		
		
	}

}
