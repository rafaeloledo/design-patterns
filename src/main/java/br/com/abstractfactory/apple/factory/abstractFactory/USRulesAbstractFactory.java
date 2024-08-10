package br.com.abstractfactory.apple.factory.abstractFactory;

import br.com.abstractfactory.apple.model.certificate.USCertificate;
import br.com.abstractfactory.apple.model.packing.USPacking;

import br.com.abstractfactory.apple.model.certificate.Certificate;
import br.com.abstractfactory.apple.model.packing.Packing;

public class USRulesAbstractFactory implements CountryRulesAbstractFactory {

  @Override
  public Certificate getCertificates() {
    return new USCertificate();
  }

  @Override
  public Packing getPacking() {
    return new USPacking();
  }
  
}
