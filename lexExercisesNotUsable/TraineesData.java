package lexExercisesNotUsable;

public class TraineesData {

	public static void main(String[] args) {
		System.out.println("My name is Maria Jerome");
		System.out.println("My designation is System engineer");
		
		
			int discountPercentage = 10;
			double totalPrice = 800;
			double priceAfterDiscount = totalPrice * (1 - ((double) discountPercentage / 100));
			System.out.println("Customer has paid a bill of amount: "+ priceAfterDiscount);
			if (totalPrice > 500) {
				priceAfterDiscount = priceAfterDiscount * (1 - ((double) 5 / 100));
			}
			System.out.println("Customer has paid a bill of amount: "+ priceAfterDiscount);
		


	}

}
