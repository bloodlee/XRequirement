package org.yli.xreq.gui;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;

public class ApplicationActionBarAdvisor extends ActionBarAdvisor {

  private IAction quitAction;
  private IAction preferenceAction;
  private IAction aboutAction;

  public ApplicationActionBarAdvisor(IActionBarConfigurer configurer) {
    super(configurer);
  }

  protected void makeActions(IWorkbenchWindow window) {
    quitAction = ActionFactory.QUIT.create(window);
    register(quitAction);
    
    preferenceAction = ActionFactory.PREFERENCES.create(window);
    register(preferenceAction);
    
    aboutAction = ActionFactory.ABOUT.create(window);
    register(aboutAction);
  }

  protected void fillMenuBar(IMenuManager menuBar) {
    
  }

}
