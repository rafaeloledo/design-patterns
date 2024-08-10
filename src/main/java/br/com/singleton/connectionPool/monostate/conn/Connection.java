package br.com.singleton.connectionPool.monostate.conn;

public class Connection {
  private boolean inUse;

  public Connection() {
    inUse = false;
  }

  public Object query(String sql) {
    System.out.println("Running '" + sql + "' in connection " + this);
    return null;
  }

  boolean isInUse() {
    return inUse;
  }

  void setInUse(boolean status) {
    inUse = status;
  }
}
