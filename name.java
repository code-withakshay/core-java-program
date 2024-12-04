import java.util.ArrayList;
public class GenericToolboxExample 
{
	// A generic class that can hold any type of tool
	static class Toolbox<T> 
	{
		private ArrayList<T> tools = new ArrayList<>();
		public void addTool(T tool) 
		{
			tools.add(tool);
		}
		public T getTool(int index) 
		{
			return tools.get(index);
		}
	}
	public static void main(String[] args) 
	{
		// Creating a toolbox for wrenches
		Toolbox<String> wrenchBox = new Toolbox<>();
		wrenchBox.addTool("Adjustable Wrench");
		wrenchBox.addTool("Pipe Wrench");
		// Creating a toolbox for screwdrivers
		Toolbox<String> screwdriverBox = new Toolbox<>();
		screwdriverBox.addTool("Flathead Screwdriver");
		screwdriverBox.addTool("Phillips Screwdriver");
		// Retrieving tools
		System.out.println("Wrenches: " + wrenchBox.getTool(0) + ", " + wrenchBox.getTool(1));
		System.out.println("Screwdrivers: " + screwdriverBox.getTool(0) + ", " +screwdriverBox.getTool(1));
	}
}