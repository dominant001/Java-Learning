package lexExercisesNotUsable;

public class percentage {

	public static void main(String[] args) {
		
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
