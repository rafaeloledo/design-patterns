package br.com.factory.app.dbadapter.after.factory;

import br.com.factory.app.dbadapter.after.db.DB;
import br.com.factory.app.dbadapter.after.db.OracleDB;

public class OracleFactory {

  public DB getDatabase() {
    return new OracleDB();
  }

}
