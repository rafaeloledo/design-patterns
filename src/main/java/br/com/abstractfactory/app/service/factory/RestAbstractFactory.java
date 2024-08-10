package br.com.abstractfactory.app.service.factory;

import br.com.abstractfactory.app.service.services.CarService;
import br.com.abstractfactory.app.service.services.UserService;

import br.com.abstractfactory.app.service.services.CarRestApiService;
import br.com.abstractfactory.app.service.services.UserRestApiService;

public class RestAbstractFactory implements ServicesAbstractFactory{

  @Override
  public UserService getUserService() {
    return new UserRestApiService();
  }

  @Override
  public CarService getCarService() {
    return new CarRestApiService();
  }

}
