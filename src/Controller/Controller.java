package Controller;

import java.util.List;
import java.util.ArrayList;
import tools.model.Kahoot;
import model.view.PopupDisplay;

public class Controller 
{
	// i made an awesome kahoot list.
	
	private List<Kahoot> myKahoots;
	private PopupDisplay popup;
	
	
	public Controller()
	{
		
		myKahoots = new ArrayList<Kahoot>();
		popup = new PopupDisplay();
	}
	
	public void start()
	{
		Kahoot myFirstKahoot = new Kahoot();
		myKahoots.add(myFirstKahoot);
		fillTheList();
		showTheList();
	}
	
	private void showTheList()
	{
		for (int index =0; index < myKahoots.size(); index += 1)
		{
			popup.displayText(myKahoots.get(index).toString());
		}
	}
	
	//I added a bunch of kahoots to my kahoot list.
	private void fillTheList()
	{
		Kahoot fiftyStates = new Kahoot("Kashish", 50);
		Kahoot mySecondKahoot = new Kahoot("Ethan", 2);
		Kahoot dinosaurTypes = new Kahoot("Connor", 700);
		Kahoot worldCountries = new Kahoot("Will", 191);
		Kahoot animalColor = new Kahoot("Branton", 10);
		Kahoot presidents = new Kahoot("Obama", 44);
		myKahoots.add(fiftyStates);
		myKahoots.add(mySecondKahoot);
		myKahoots.add(dinosaurTypes);
		myKahoots.add(worldCountries);
		myKahoots.add(animalColor);
		myKahoots.add(presidents);
	}
}
