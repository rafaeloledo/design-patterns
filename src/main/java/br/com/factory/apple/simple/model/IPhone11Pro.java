package br.com.factory.apple.simple.model;

public class IPhone11Pro extends IPhone {
	@Override
	public String toString() {
		return "iPhone 11 Pro";
	}

	@Override
	public void getHardware() {
		System.out.println("Hardware list");
		System.out.println("\t- 6.5 in. Screen");
		System.out.println("\t- A13 Bionic 7nm+ Chipset");
		System.out.println("\t- 4GB RAM");
		System.out.println("\t- 512GB Storage");
	}
}
