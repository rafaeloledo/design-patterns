package br.com.abstractfactory.apple.model.iphone;

import br.com.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;

public class IPhoneXSMax extends IPhone {

	public IPhoneXSMax(CountryRulesAbstractFactory rules) {
		super(rules);
	}

	@Override
	public void getHardware() {
		System.out.println("Hardware list");
		System.out.println("\t- 6.5 in. Screen");
		System.out.println("\t- A12 Chipset");
		System.out.println("\t- 4GB RAM");
		System.out.println("\t- 512GB Storage");
	}
}
