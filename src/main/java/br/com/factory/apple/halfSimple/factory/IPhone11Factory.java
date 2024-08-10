package br.com.factory.apple.halfSimple.factory;

import br.com.factory.apple.halfSimple.model.IPhone;
import br.com.factory.apple.halfSimple.model.IPhone11;
import br.com.factory.apple.halfSimple.model.IPhone11Pro;

public class IPhone11Factory extends IPhoneFactory {

  public IPhone createIPhone(String level) {
    if ("standard".equals(level)) {
      return new IPhone11();
    } else if ("highEnd".equals(level)) {
      return new IPhone11Pro();
    }

    return null;
  }

}
