package org.yli.xreq.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnector {

  private static Connection connection;
  
  private static String connectionLink = "";
  
  private static String user = "";
  
  private static String password = "";
  
  public static Connection getInstance() {
    if (connection == null) {
      synchronized (DbConnector.class) {
        if (connection == null) {
          try {
            Class.forName("org.postgresql.Driver");
          } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
          }
          
          try {
            connection = DriverManager.getConnection(connectionLink, user, password);
          } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
          }
          
        }
      }
    }
    return connection;
  }

  /**
   * @param connectionLink the connectionLink to set
   */
  public static void setConnectionLink(String connectionLink) {
    DbConnector.connectionLink = connectionLink;
  }

  /**
   * @param user the user to set
   */
  public static void setUser(String user) {
    DbConnector.user = user;
  }

  /**
   * @param password the password to set
   */
  public static void setPassword(String password) {
    DbConnector.password = password;
  }
  
}
