package usingWhileLoops;

public class GroceryShop {
	
		  int mrp, discount, actual_price; 
		  
		  // No-args Constructor
		  //Zero args Constructor
		 GroceryShop(int price, int discount) {
			  this();
		    this.mrp = mrp; 
		    this.discount = discount; 
		    this.actual_price = calculate_price(mrp, discount);
		    System.out.println("Welcome");
		    System.out.println();
		  }
		  public GroceryShop() {
			System.out.println("welcome to our shop");
		}
		  
		private int calculate_price(int mrp, int discount) {
		    // TODO Auto-generated method stub
		    return mrp - discount; 
		    
		  }
		  public static void main(String[] args) {
		    // TODO Auto-generated method stub
		    GroceryShop prod1 = new GroceryShop(100,10);
		    
		    
		  }

		

}
	
