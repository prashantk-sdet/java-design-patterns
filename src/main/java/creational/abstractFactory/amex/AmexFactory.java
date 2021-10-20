package creational.abstractFactory.amex;

import creational.abstractFactory.interfaces.CreditCard;
import creational.abstractFactory.interfaces.CreditCardFactory;
import creational.abstractFactory.interfaces.CreditCardType;

public class AmexFactory extends CreditCardFactory {
	
	public CreditCard getCreditCard(CreditCardType creditCardType) {
		
		switch(creditCardType) {
		case GOLD:
			return new AmexGoldCreditCard();
		case PLATINUM:
			return new AmexPlatinumCreditCard();
		default:
			return null;
		
		}
		
	}

	@Override
	public CreditCard getValidator(CreditCardType creditCardType) {
		// TODO Auto-generated method stub
		return null;
	}

}
