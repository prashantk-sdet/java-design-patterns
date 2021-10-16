package creational.factoryMethod.main;

import creational.factoryMethod.websites.Website;
import creational.factoryMethod.websites.WebsiteFactory;
import creational.factoryMethod.websites.WebsiteType;

public class FactoryDemo {

	public static void main(String[] args) {
		
		Website shop = WebsiteFactory.getWebsite(WebsiteType.SHOP);
		System.out.println(shop.getPages());
		
		Website blog = WebsiteFactory.getWebsite(WebsiteType.BLOG);
		System.out.println(blog.getPages());

	}

}
