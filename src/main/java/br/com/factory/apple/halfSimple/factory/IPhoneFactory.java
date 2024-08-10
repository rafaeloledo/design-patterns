package br.com.factory.apple.halfSimple.factory;

import br.com.factory.apple.halfSimple.model.IPhone;

public abstract class IPhoneFactory {

  protected abstract IPhone createIPhone(String level);

  public IPhone orderIPhone(String level) {
    IPhone device = null;

    device = createIPhone(level);

    device.getHardware();
    device.assemble();
    device.certificates();
    device.pack();

    return device;
  }

}
