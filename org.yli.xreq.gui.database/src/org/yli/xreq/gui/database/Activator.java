package org.yli.xreq.gui.database;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.yli.xreq.common.osgi.OSGiUtil;
import org.yli.xreq.gui.database.preferences.PreferenceConstants;
import org.yli.xreq.service.IDbConnectionInitializer;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.yli.xreq.gui.database"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	
	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		
		// initialize the db properties
		IDbConnectionInitializer initializer = OSGiUtil.queryService(IDbConnectionInitializer.class, context);
		if (initializer != null) {
		  IPreferenceStore prefStore = getPreferenceStore();
		  initializer.setHost(prefStore.getString(PreferenceConstants.DB_HOST));
		  initializer.setPort(prefStore.getInt(PreferenceConstants.DB_PORT));
		  initializer.setDbName(prefStore.getString(PreferenceConstants.DB_DATABASE));
		  initializer.setUser(prefStore.getString(PreferenceConstants.DB_USER));
		  initializer.setPassword(prefStore.getString(PreferenceConstants.DB_PASSWORD));
		}
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

}
