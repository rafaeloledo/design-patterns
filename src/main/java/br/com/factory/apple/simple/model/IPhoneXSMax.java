package br.com.factory.apple.simple.model;

public class IPhoneXSMax extends IPhone {
	@Override
	public String toString() {
		return "iPhone XS Max";
	}

	@Override
	public void getHardware() {
		System.out.println("Hardware list");
		System.out.println("\t- 6.5 in. Screen");
		System.out.println("\t- A12 Chipset");
		System.out.println("\t- 4GB RAM");
		System.out.println("\t- 512GB Memory");
	}
}
