package creational.abstractFactory.interfaces;

import creational.abstractFactory.amex.AmexFactory;
import creational.abstractFactory.visa.VisaFactory;

public abstract class CreditCardFactory {
	
	public static CreditCardFactory getCreditCardFactory(int creditScore) {
		
		if(creditScore>=700) {
			return new AmexFactory();
		} else {
			return new VisaFactory();
		}
	}
	
	public abstract CreditCard  getCreditCard(CreditCardType creditCardType);
	public abstract CreditCard  getValidator(CreditCardType creditCardType);

}
