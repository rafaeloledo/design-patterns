package br.com.abstractfactory.apple;

import br.com.abstractfactory.apple.factory.IPhoneFactory;
import br.com.abstractfactory.apple.factory.IPhoneXFactory;

import br.com.abstractfactory.apple.factory.abstractFactory.BrazilianRulesAbstractFactory;
import br.com.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;

public class Client {
	
	public static void main(String[] args) {
		CountryRulesAbstractFactory rules = new BrazilianRulesAbstractFactory();
		IPhoneFactory genXFactory = new IPhoneXFactory(rules);
		System.out.println("--- Ordering an iPhone X");
		System.out.println(genXFactory.orderIPhone("standard"));
	}
}