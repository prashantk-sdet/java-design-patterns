package creational.abstractFactory.amex;

import creational.abstractFactory.interfaces.CreditCard;
import creational.abstractFactory.interfaces.Validator;

public class AmexGoldValidator extends Validator {

	@Override
	public boolean isValid(CreditCard creditCard) {
		return false;
	}

}
