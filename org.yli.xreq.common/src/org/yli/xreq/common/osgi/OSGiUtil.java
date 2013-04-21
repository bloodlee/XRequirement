package org.yli.xreq.common.osgi;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

public class OSGiUtil {

  /**
   * Query service in bundle context
   * @param clz the service class.
   * @param context the bundle context.
   * @return the service. If service is not there, null will be returned.
   */
  public static <T> T queryService(Class<T> clz, BundleContext context) {
    ServiceReference<T> serviceRef = context.getServiceReference(clz);
		if (serviceRef != null) {
		  return context.getService(serviceRef);
		} else {
		  return null;
		}
  }
  
}
