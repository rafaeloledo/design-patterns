package br.com.abstractfactory.app.service.factory;

import br.com.abstractfactory.app.service.services.CarService;
import br.com.abstractfactory.app.service.services.UserService;

public interface ServicesAbstractFactory {

  UserService getUserService();

  CarService getCarService();
}
