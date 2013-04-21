package org.yli.xreq.service;

import java.sql.Connection;

public interface IDbConnectionInitializer {

  void setHost(String host);
  
  void setPort(int port);
  
  void setDbName(String dbname);
  
  void setUser(String user);
  
  void setPassword(String password);
  
  Connection getDbConnection();
  
}
