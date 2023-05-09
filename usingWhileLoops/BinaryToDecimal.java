package usingWhileLoops;

public class BinaryToDecimal {
public static void main(String[] args) {
	BinaryToDecimal b2d = new BinaryToDecimal();
	b2d.find_decimal(101);
	b2d.swap_number(10,100);
	b2d.find_prime();
	int pow = b2d.power_of(2, 3);
	System.out.println(pow);
}	

private void find_decimal(int num) {
	int decimal = 0,rem = 0,pow=0;
	while(num>0) {
		rem = num%10;
		decimal = decimal+(rem * power_of(2, pow));
		num = num/10;
		pow+=1;
		
	}
	System.out.println(decimal);
	
	
	
}
private int power_of(int base, int pow){
	int res = 1;
	while(pow>0) {
		res = res * base;
		pow = pow-1;
	}
	//System.out.print(res);
	return res;
}
private void swap_number(int n1, int n2) {
	System.out.println("before swap  n1, n2 is  " +n1+" " +n2);
	n1 = n1+n2;
	n2=n1-n2;
	n1 = n1-n2;
	System.out.println("after swap n1, n2 is  " +n1 +"  "+n2);
	
}
private int find_prime() {
	
	return 0;
}
}
