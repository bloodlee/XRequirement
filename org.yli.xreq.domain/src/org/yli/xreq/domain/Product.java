package org.yli.xreq.domain;

/**
 * Product domain, which will store the brief information of product. 
 * @author yli
 *
 */
public class Product {

  private String id;

  private String name;
  
  private String description;

  public Product(String id) {
    this.id = id;
  }
  
  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * @param description the description to set
   */
  public void setDescription(String description) {
    this.description = description;
  }
  
    /**
   * @return the id
   */
  public String getId() {
    return id;
  }

  
}
