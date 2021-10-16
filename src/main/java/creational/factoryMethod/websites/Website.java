package creational.factoryMethod.websites;

import java.util.ArrayList;
import java.util.List;

import creational.factoryMethod.pages.Page;

public abstract class Website {
	
	protected List<Page> pages = new ArrayList<>();
	
	public List<Page> getPages() {
		return pages;
	}
	
	public Website() {
		this.createSite();
	}

	public abstract void createSite();

	
	

}
