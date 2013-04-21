package org.yli.xreq.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.yli.xreq.domain.Product;
import org.yli.xreq.service.IProductRepository;
import org.yli.xreq.service.exception.ServiceException;

public class ProductRepository implements IProductRepository {

  @Override
  public Product create() throws ServiceException {
    try {
      Connection dbConnection = DbUtil
        .getDbConnection();
      PreparedStatement ps = 
          dbConnection
            .prepareStatement(
                "insert into products (name, description) values ('', '')");
                // new String[] {"''", "'"});
      
      ps.execute();
      
      // ResultSet generatedKeys = ps.getGeneratedKeys();

      return null;
      
    } catch (SQLException e) {
      throw new ServiceException("Can't create product", e);
    }
    
  }

  public Product get(int sequence) {
    return null;
  }
  
  @Override
  public void delete(Product product) {
    // TODO Auto-generated method stub
    
  }

}
