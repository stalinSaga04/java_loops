package usingWhileLoops;

public class DivisorOfGivenNum {
	
public static void main(String[] args) {
	DivisorOfGivenNum divisor = new DivisorOfGivenNum();
	divisor.find_divisor_of_number(1020);
	
}
 int find_divisor_of_number(int num) {
	 //int original = num;
	 int count = 1;
	 int no_count=0;
	 while (num>0) {
		//if (original%num==0) {
		if(num%count==0) {	
			System.out.print(count +" ");
			no_count=no_count+1;
		}
		num = num-1;
		count = count+1;
	}
	 System.out.println("");
	 System.out.println("count of the divisors number: "+no_count);
	 return count;
 }
}
