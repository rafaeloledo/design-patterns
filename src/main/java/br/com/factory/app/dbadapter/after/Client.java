package br.com.factory.app.dbadapter.after;

// import br.com.factory.app.dbadapter.after.factory.PostgresFactory;
import br.com.factory.app.dbadapter.after.factory.OracleFactory;
import br.com.factory.app.dbadapter.after.db.DB;

public class Client {

	public static void main(String[] args) {
		// DB db1 = new PostgresFactory().getDatabase();
		DB db2 = new OracleFactory().getDatabase();
		db2.query("SELECT * FROM USERS");
		db2.update("INSERT INTO users VALUES ('User', 25)");
	}

}
