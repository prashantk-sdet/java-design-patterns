package creational.builder;

public class LunchOrderDemo {

	public static void main(String[] args) {
		
		LunchOrder.Builder lunchOrderBuilder = new LunchOrder.Builder();
		
		lunchOrderBuilder.bread("Wheat").condiments("lettuce").meat("chicken").dressing("mayo");
		
		LunchOrder lunchOrder = lunchOrderBuilder.build();
		
		System.out.println(lunchOrder);
	}

}
