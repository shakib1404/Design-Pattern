package composite22;
import java.util.*;

public class Guccho implements Component {
	
	 private List<Component> components = new ArrayList<>();

	    // Add a component to the folder
	    public void add(Component component) {
	        components.add(component);
	    }

	    // Remove a component from the folder
	    public void remove(Component component) {
	        components.remove(component);
	    }

	    @Override
	    public void execute() {
	        System.out.println("Executing folder component.");
	        
	        // Iterate through child components and execute them
	        for (Component component : components) {
	            component.execute();
	        }
	    }

}
