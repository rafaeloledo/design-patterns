package br.com.factory.apple.before;

import br.com.factory.apple.before.model.IPhone;
import br.com.factory.apple.before.model.IPhone11;
import br.com.factory.apple.before.model.IPhone11Pro;
import br.com.factory.apple.before.model.IPhoneX;
import br.com.factory.apple.before.model.IPhoneXSMax;

public class Client {
	public IPhone orderIPhone (String generation, String level) {
		IPhone device = null;

		if ("X".equals(generation)) {
			if ("standard".equals(level)) {
				device = new IPhoneX();
			} else if ("highEnd".equals(level)) {
				device = new IPhoneXSMax();
			}
		} else if (generation.equals("11")) {
			if ("standard".equals(level)) {
				device = new IPhone11();
			} else if ("highEnd".equals(level)) {
				device = new IPhone11Pro();
			}
		}

		if (device == null) {
			return null;
		}

		device.getHardware();
		device.assemble();
		device.certificates();
		device.pack();

		return device;
	}

	public static void main(String[] args) {
		Client client = new Client();
		
		System.out.println("--- Ordering an iPhone X");
		IPhone iphone = client.orderIPhone("X", "standard");
		System.out.println(iphone);

		System.out.println("\n\n--- Ordering an iPhone 11 HighEnd");
		IPhone iphone2 = client.orderIPhone("11", "highEnd");
		System.out.println(iphone2);
	}
}
