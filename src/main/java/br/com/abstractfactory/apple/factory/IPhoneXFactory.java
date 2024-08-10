package br.com.abstractfactory.apple.factory;

import br.com.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;
import br.com.abstractfactory.apple.model.iphone.IPhone;
import br.com.abstractfactory.apple.model.iphone.IPhoneX;
import br.com.abstractfactory.apple.model.iphone.IPhoneXSMax;

public class IPhoneXFactory extends IPhoneFactory {

	public IPhoneXFactory(CountryRulesAbstractFactory rules) {
		super(rules);
	}

	public IPhone createIPhone(String level) {
		if("standard".equals(level)) {
			return new IPhoneX(rules);
		} else if("highEnd".equals(level)) {
			return new IPhoneXSMax(rules);
		}
		return null;
	}

}