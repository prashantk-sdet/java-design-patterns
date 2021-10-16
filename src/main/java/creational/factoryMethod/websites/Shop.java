package creational.factoryMethod.websites;

import creational.factoryMethod.pages.*;

public class Shop extends Website {

	@Override
	public void createSite() {
		pages.add(new CartPage());
		pages.add(new ItemPage());
		pages.add(new SearchPage());
	}

}
