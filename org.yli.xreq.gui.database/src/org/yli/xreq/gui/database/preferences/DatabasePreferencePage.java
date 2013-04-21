package org.yli.xreq.gui.database.preferences;

import org.eclipse.jface.preference.*;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.yli.xreq.gui.database.Activator;

/**
 * This class represents a preference page that
 * is contributed to the Preferences dialog. By 
 * subclassing <samp>FieldEditorPreferencePage</samp>, we
 * can use the field support built into JFace that allows
 * us to create a page that is small and knows how to 
 * save, restore and apply itself.
 * <p>
 * This page is used to modify preferences only. They
 * are stored in the preference store that belongs to
 * the main plug-in class. That way, preferences can
 * be accessed directly via the preference store.
 */

public class DatabasePreferencePage
	extends FieldEditorPreferencePage
	implements IWorkbenchPreferencePage {

	public DatabasePreferencePage() {
		super(GRID);
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		setDescription("A demonstration of a preference page implementation");
	}
	
	/**
	 * Creates the field editors. Field editors are abstractions of
	 * the common GUI blocks needed to manipulate various types
	 * of preferences. Each field editor knows how to save and
	 * restore itself.
	 */
	public void createFieldEditors() {
	  
	  StringFieldEditor hostEditor = 
	      new StringFieldEditor(PreferenceConstants.DB_HOST, "&Host", getFieldEditorParent());
	  hostEditor.setEmptyStringAllowed(false);
	  addField(hostEditor);
	  
	  IntegerFieldEditor portEditor = new IntegerFieldEditor(PreferenceConstants.DB_PORT, "&Port", getFieldEditorParent());
	  portEditor.setValidRange(1, 65535);
	  addField(portEditor);
	  
	  StringFieldEditor dbNameEditor = new StringFieldEditor(PreferenceConstants.DB_DATABASE, "&Database", getFieldEditorParent());
	  dbNameEditor.setEmptyStringAllowed(false);
	  addField(dbNameEditor);
	  
	  StringFieldEditor userEditor = new StringFieldEditor(PreferenceConstants.DB_USER, "&User", getFieldEditorParent());
	  userEditor.setEmptyStringAllowed(false);
	  addField(userEditor);
			
	  StringFieldEditor passwordEditor = 
	      new StringFieldEditor(PreferenceConstants.DB_PASSWORD, "Pa&ssword", getFieldEditorParent());
	  addField(passwordEditor);
			
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
	}
	
}