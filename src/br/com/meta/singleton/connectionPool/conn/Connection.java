package br.com.meta.singleton.connectionPool.conn;

public class Connection {

    private boolean inUse;

    public Connection() {
        inUse = false;
    }

    public Object query(final String sql) {
        System.out.println("Running '" + sql + "' in Connection " + this);
        return null;
    }

    boolean isInUse() {
        return inUse;
    }

    void setInUse(boolean status) {
        inUse = status;
    }
}
