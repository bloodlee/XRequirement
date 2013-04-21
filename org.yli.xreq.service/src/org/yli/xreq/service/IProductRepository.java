package org.yli.xreq.service;

import org.yli.xreq.domain.Product;
import org.yli.xreq.service.exception.ServiceException;

/**
 * Interface of Product Repository, which will take the charge of creating product, deleting 
 * product and etc.
 * 
 * @author yli
 *
 */
public interface IProductRepository {

  /**
   * Create a dummy product.
   * @return a new product.
   */
  Product create() throws ServiceException;
  
  /**
   * Delete the product
   * @param product a product
   */
  void delete(Product product);
  
}
