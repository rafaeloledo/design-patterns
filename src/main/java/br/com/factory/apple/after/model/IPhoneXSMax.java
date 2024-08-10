package br.com.factory.apple.after.model;

public class IPhoneXSMax extends IPhone {
	@Override
	public String toString() {
		return "iPhone XS Max";
	}

	@Override
	public void getHardware() {
		System.out.println("Hardware list");
		System.out.println("\t- 6.5in Screen");
		System.out.println("\t- A12 Chipset");
		System.out.println("\t- 4Gb RAM");
		System.out.println("\t- 512Gb Memory");
	}
}
