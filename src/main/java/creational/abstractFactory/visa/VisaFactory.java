package creational.abstractFactory.visa;

import creational.abstractFactory.interfaces.CreditCard;
import creational.abstractFactory.interfaces.CreditCardFactory;
import creational.abstractFactory.interfaces.CreditCardType;

public class VisaFactory extends CreditCardFactory {
	
	@Override
	public CreditCard getCreditCard(CreditCardType creditCardType) {
		
		switch(creditCardType) {
		case GOLD:
			return new VisaGoldCreditCard();
		case PLATINUM:
			return new VisaPlatinumCreditCard();
		default:
			return null;
		
		}
		
	}

	@Override
	public CreditCard getValidator(CreditCardType creditCardType) {
		return null;
	}

}
