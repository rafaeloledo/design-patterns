package br.com.factory.apple.simple.factory;

import br.com.factory.apple.simple.model.IPhone;
import br.com.factory.apple.simple.model.IPhone11;
import br.com.factory.apple.simple.model.IPhone11Pro;
import br.com.factory.apple.simple.model.IPhoneX;
import br.com.factory.apple.simple.model.IPhoneXSMax;

public class IPhoneSimpleFactory {
  
  /**
   * @param generation
   *  Can be "X" or "11"
   * @param level
   *  Can be "standard" or "highEnd"
   * @return
   *  an instance of iPhone
   */

  public static IPhone orderIPhone (String generation, String level) {
    IPhone device = null;

    if ("X".equals(generation)) {
      if ("standard".equals(level)) {
        device = new IPhoneX();
      } else if ("highEnd".equals(level)) {
        device = new IPhoneXSMax();  
      }
    } else if ("11".equals(generation)) {
      if ("standard".equals(level)) {
        device = new IPhone11();
      } else if ("highEnd".equals(level)) {
        device = new IPhone11Pro();
      }
    }

    if(device == null) {
      return null;
    }

    device.getHardware();
    device.assemble();
    device.certificates();
    device.pack();

    return device;
  }

}
