package usingWhileLoops;

public class LoopingDemo2 {
	public static void main(String[] args) {
		LoopingDemo2 fs = new LoopingDemo2 ();
		fs.fibonici_nums();
		//fs.fibonici_without_3rdvariable();
		//fs.find_sqr_root(49);
	}
	private void find_sqr_root(int num) {
		int div=2;
		while (div<num) {
		if (num/div==div) {
			System.out.println("square root of the "+num+" is "+div);
			break;
		}
		div++;
		
	
	}}
	private void fibonici_without_3rdvariable() {
		// TODO Auto-generated method stub
		int p1=0,p2=1;
		while (p1<=20) {
			System.out.println(p1);
			p2=p1+p2; 		// without third variable
			p1=p2-p1;
					
		}
		
	}
	private void fibonici_nums() {
		int p3, p1=0,p2=1;
		while (p1<=8) {
			System.out.println(p1+" ");
			
			p3 = p1+p2;
			p1 = p2;
			p2=p3;
			
		}
	}
		/*
		 * int p3=p1+p2; System.out.println(p1); p1=p2; p2=p3; p3=p1+p2
		 */
		/*
		 * System.out.println(p1); p1=p2; p2=p3; p3=p1+p2; System.out.println(p1);
		 * p1=p2; p2=p3; p3=p1+p2; System.out.println(p1); p1=p2; p2=p3; p3=p1+p2;
		 * System.out.println(p1); p1=p2; p2=p3; p3=p1+p2; System.out.println(p1);
		 * p1=p2; p2=p3; p3=p1+p2; System.out.println(p1);
		 */
		
	}