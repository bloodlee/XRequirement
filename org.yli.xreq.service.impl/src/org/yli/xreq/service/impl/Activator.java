package org.yli.xreq.service.impl;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.yli.xreq.service.IDbConnectionInitializer;
import org.yli.xreq.service.IProductRepository;

public class Activator implements BundleActivator {

	private static BundleContext context;
	
	private IDbConnectionInitializer dbConnectionInitializer;
	
	private static Activator plugin;

	static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		plugin = this;
		
		IProductRepository productRepository = new ProductRepository();
		bundleContext.registerService(IProductRepository.class, productRepository, null);
		
		dbConnectionInitializer = new DbConnectionInitializer();
		bundleContext.registerService(IDbConnectionInitializer.class, dbConnectionInitializer, null);
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
		plugin = null;
	}

  /**
   * @return the dbConnectionInitializer
   */
  public IDbConnectionInitializer getDbConnectionInitializer() {
    return dbConnectionInitializer;
  }

  /**
   * @return the plugin
   */
  public static Activator getDefault() {
    return plugin;
  }

}
