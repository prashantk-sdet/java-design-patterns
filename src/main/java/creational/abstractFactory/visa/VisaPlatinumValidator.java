package creational.abstractFactory.visa;

import creational.abstractFactory.interfaces.CreditCard;
import creational.abstractFactory.interfaces.Validator;

public class VisaPlatinumValidator extends Validator {

	@Override
	public boolean isValid(CreditCard creditCard) {
		return false;
	}

}
