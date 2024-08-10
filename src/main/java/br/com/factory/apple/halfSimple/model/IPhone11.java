package br.com.factory.apple.halfSimple.model;

public class IPhone11 extends IPhone {
	@Override
	public String toString() {
		return "iPhone 11";
	}

	@Override
	public void getHardware() {
		System.out.println("Hardware list");
		System.out.println("\t- 6.1 in. Screen");
		System.out.println("\t- A13 Chipset");
		System.out.println("\t- 4GB RAM");
		System.out.println("\t- 256GB Storage");
	}
}
