package org.yli.xreq.gui.database.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

import org.yli.xreq.gui.database.Activator;

/**
 * Class used to initialize default preference values.
 */
public class PreferenceInitializer extends AbstractPreferenceInitializer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		store.setDefault(PreferenceConstants.DB_HOST, "localhost");
		store.setDefault(PreferenceConstants.DB_PORT, 5432);
		store.setDefault(PreferenceConstants.DB_DATABASE, "xreq");
		store.setDefault(PreferenceConstants.DB_USER, "postgre");
		store.setDefault(PreferenceConstants.DB_PASSWORD, "");
	}

}
