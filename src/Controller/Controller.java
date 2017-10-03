package Controller;

import java.util.List;
import java.util.ArrayList;
import tools.model.Kahoot;

public class Controller 
{
	private List<Kahoot> myKahoots;
	
	public Controller()
	{
		myKahoots = new ArrayList<Kahoot>();
	}
	
	public void start()
	{
		Kahoot myFirstKahoot = new Kahoot();
		myKahoots.add(myFirstKahoot);
	}
}
