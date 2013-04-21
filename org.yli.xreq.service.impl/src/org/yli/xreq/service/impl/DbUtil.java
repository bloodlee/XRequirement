package org.yli.xreq.service.impl;

import java.sql.Connection;

public class DbUtil {

  public static Connection getDbConnection() {
    return Activator.getDefault().getDbConnectionInitializer().getDbConnection();
  }
    
}
