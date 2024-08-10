package br.com.factory.apple.after.factory;

import br.com.factory.apple.after.model.IPhone;

public abstract class IPhoneFactory {

  protected abstract IPhone createIPhone();

  public IPhone orderIPhone() {
    IPhone device = null;

    device = createIPhone();

    device.getHardware();
    device.assemble();
    device.certificates();
    device.pack();

    return device;
  }

}
