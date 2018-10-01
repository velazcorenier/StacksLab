package menuClasses;

import dataManager.DMComponent;
import ioManagementClasses.IOComponent;

public class DeleteListAction implements Action {

	@Override
	public void execute(Object arg) {
		IOComponent io = IOComponent.getComponent(); 
		DMComponent dm = (DMComponent) arg; 
		String name = io.getInput("Enter the name of the list to delete: ");
		dm.deleteList(name); 		
	}

}
