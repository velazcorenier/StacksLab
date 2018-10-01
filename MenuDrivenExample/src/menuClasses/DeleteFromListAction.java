package menuClasses;

import ioManagementClasses.IOComponent;
import dataManager.DMComponent;

public class DeleteFromListAction implements Action {

	@Override
	public void execute(Object arg) {
		IOComponent io = IOComponent.getComponent(); 
		DMComponent dm = (DMComponent) arg; 
		String name = io.getInput("Enter the name of the list: ");
		int value = -1;
		try {
		value = Integer.parseInt(io.getInput("Enter the value to remove: ")); 
		} catch (NumberFormatException e) {  
		}
		dm.removeElementFromList(name, value);
	}

}
