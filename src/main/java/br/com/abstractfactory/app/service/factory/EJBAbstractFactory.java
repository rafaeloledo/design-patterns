package br.com.abstractfactory.app.service.factory;

import br.com.abstractfactory.app.service.services.CarService;
import br.com.abstractfactory.app.service.services.UserService;

import br.com.abstractfactory.app.service.services.CarEJBService;
import br.com.abstractfactory.app.service.services.UserEJBService;

public class EJBAbstractFactory implements ServicesAbstractFactory{

  @Override
  public UserService getUserService() {
    return new UserEJBService();
  }

  @Override
  public CarService getCarService() {
    return new CarEJBService();
  }
  
}
