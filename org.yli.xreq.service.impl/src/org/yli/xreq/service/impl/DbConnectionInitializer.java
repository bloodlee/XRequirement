package org.yli.xreq.service.impl;

import java.sql.Connection;

import org.yli.xreq.database.DbConnector;
import org.yli.xreq.service.IDbConnectionInitializer;

public class DbConnectionInitializer implements IDbConnectionInitializer {

  private String host;
  
  private int port;
  
  private String dbName;
  
  private String user;
  
  private String password;
  
  @Override
  public void setHost(String host) {
    this.host = host;
  }

  @Override
  public void setPort(int port) {
    this.port = port;
  }

  @Override
  public void setDbName(String dbname) {
    this.dbName = dbname;
  }

  @Override
  public void setUser(String user) {
    this.user = user;

  }

  @Override
  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public Connection getDbConnection() {
    DbConnector.setConnectionLink(
        String.format("jdbc:postgresql://%s:%d/%s", host, port, dbName));
    DbConnector.setUser(user);
    DbConnector.setPassword(password);
    
    return DbConnector.getInstance();
  }

}
