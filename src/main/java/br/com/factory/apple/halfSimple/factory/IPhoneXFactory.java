package br.com.factory.apple.halfSimple.factory;

import br.com.factory.apple.halfSimple.model.IPhone;
import br.com.factory.apple.halfSimple.model.IPhoneX;
import br.com.factory.apple.halfSimple.model.IPhoneXSMax;

public class IPhoneXFactory extends IPhoneFactory {

  public IPhone createIPhone(String level) {
    if ("standard".equals(level)) {
      return new IPhoneX();
    } else if ("highEnd".equals(level)) {
      return new IPhoneXSMax();
    }

    return null;
  }

}
