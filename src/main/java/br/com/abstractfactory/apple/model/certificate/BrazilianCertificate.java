package br.com.abstractfactory.apple.model.certificate;

public class BrazilianCertificate implements Certificate {

	public String applyCertification() {
		return "\t- Calibrating Brazilian Rules\n\t- Applying Anatel's Stamp";
	}

}
