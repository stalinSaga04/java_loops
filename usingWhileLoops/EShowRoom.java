package usingWhileLoops;

public class EShowRoom {
	int price,discount;
	public EShowRoom(int price, int discount) {
		this.price=price;
		
	}
	EShowRoom(){
		System.out.println("welcome to our shop");
	}

	public static void main(String[] args) {
		EShowRoom tv = new EShowRoom();
		EShowRoom tfridgev = new EShowRoom();
		EShowRoom wm = new EShowRoom();
		EShowRoom acc = new EShowRoom(25000,5);
		acc.buy();
		
	}
	private void buy() {
		// TODO Auto-generated method stub
	System.out.println("the ac price: "+ price);
	System.out.println("the ac price: "+ discount);
	
	}

}
