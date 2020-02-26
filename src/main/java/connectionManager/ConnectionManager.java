package connectionManager;

import java.sql.Connection;

public interface ConnectionManager {
    Connection getConnection();
    int get15();
}