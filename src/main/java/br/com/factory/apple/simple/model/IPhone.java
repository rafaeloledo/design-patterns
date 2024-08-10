package br.com.factory.apple.simple.model;

public abstract class IPhone {

	@Override
	public String toString() {
		return "iPhone";
	}

	public abstract void getHardware();

	public void assemble() {
		System.out.println("Assembling all the hardwares");
	}

	public void certificates() {
		System.out.println("Testing all the certificates");
	}

	public void pack() {
		System.out.println("Packing the device");
	}

}
