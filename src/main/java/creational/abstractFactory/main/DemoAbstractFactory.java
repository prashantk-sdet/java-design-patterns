package creational.abstractFactory.main;

import creational.abstractFactory.interfaces.CreditCard;
import creational.abstractFactory.interfaces.CreditCardFactory;
import creational.abstractFactory.interfaces.CreditCardType;

public class DemoAbstractFactory {

	public static void main(String[] args) {
		
		CreditCardFactory creditCardFacotry = CreditCardFactory.getCreditCardFactory(700);
		CreditCard creditCard = creditCardFacotry.getCreditCard(CreditCardType.GOLD);
		System.out.println(creditCard);
		
		creditCardFacotry = CreditCardFactory.getCreditCardFactory(699);
		creditCard = creditCardFacotry.getCreditCard(CreditCardType.GOLD);
		System.out.println(creditCard);
		

	}

}
