package br.com.factory.app.dbadapter.after.factory;

import br.com.factory.app.dbadapter.after.db.DB;
import br.com.factory.app.dbadapter.after.db.PostgresDB;

public class PostgresFactory {
  
  public DB getDatabase() {
    return new PostgresDB();
  }

}
