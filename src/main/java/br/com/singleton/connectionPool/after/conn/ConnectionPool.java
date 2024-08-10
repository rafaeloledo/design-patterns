package br.com.singleton.connectionPool.after.conn;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {
	private static ConnectionPool singleton = new ConnectionPool();
	public final static int POOL_SIZE = 2;
	private List<Connection> connectionsPool;

	public static ConnectionPool getInstance() {
		return singleton;
	}

	private ConnectionPool() {
		System.out.println("Creating Connection Pool");
		connectionsPool = new ArrayList<Connection>();
		for (int i = 0; i < POOL_SIZE; i++) {
			connectionsPool.add(new Connection());
		}
	}

	public Connection getConnection() {
		Connection available = null;
		for (Connection conn : connectionsPool) {
			if (!conn.isInUse()) {
				available = conn;
				break;
			}
		}
		if (available == null) {
			System.out.println("No Connections avaiable");
			return null;
		}
		available.setInUse(true);
		return available;
	}

	public void leaveConnection(Connection conn) {
		conn.setInUse(false);
	}
}
