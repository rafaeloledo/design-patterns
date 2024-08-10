package br.com.abstractfactory.apple.factory.abstractFactory;

import br.com.abstractfactory.apple.model.certificate.Certificate;
import br.com.abstractfactory.apple.model.packing.Packing;

public interface CountryRulesAbstractFactory {
	Certificate getCertificates();
	
	Packing getPacking();
}
