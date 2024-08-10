package br.com.factory.apple.simple.model;

public class IPhoneX extends IPhone {
	@Override
	public String toString() {
		return "iPhone X";
	}

	@Override
	public void getHardware() {
		System.out.println("Hardware list");
		System.out.println("\t- 5.8 in. Screen");
		System.out.println("\t- A11 Bionic 10nm Chipset");
		System.out.println("\t- 3GB RAM");
		System.out.println("\t- 256GB Storage");
	}
}
