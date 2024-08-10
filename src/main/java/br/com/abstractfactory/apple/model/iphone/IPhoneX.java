package br.com.abstractfactory.apple.model.iphone;

import br.com.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;

public class IPhoneX extends IPhone {

	public IPhoneX(CountryRulesAbstractFactory rules) {
		super(rules);
	}

	@Override
	public void getHardware() {
		System.out.println("Hardware list");
		System.out.println("\t- 5.8 in. Screen");
		System.out.println("\t- A11 Chipset");
		System.out.println("\t- 3GB RAM");
		System.out.println("\t- 256GB Storage");
	}
}
