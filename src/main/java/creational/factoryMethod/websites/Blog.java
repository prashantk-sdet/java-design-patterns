package creational.factoryMethod.websites;

import creational.factoryMethod.pages.*;

public class Blog extends Website {

	@Override
	public void createSite() {
		pages.add(new PostPage());
		pages.add(new CommentPage());
		pages.add(new AboutPage());
		pages.add(new ContactPage());
	}

}
