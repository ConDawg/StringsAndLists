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
		String currentCreator = "";
		for (int index =0; index < myKahoots.size(); index += 1)
		{
			currentCreator = myKahoots.get(index).getCreator();
			
			Kahoot currentKahoot = myKahoots.get(index);
			String creator = currentKahoot.getCreator();
			
			popup.displayText(myKahoots.get(index).toString());
			
			if (currentCreator.equals("nobody"))
			{
				for (int loop = 0; loop < 5; loop += 1)
				{
					popup.displayText("wow nobody does a lot");
				}
			}
			
			for (int currentLetterIndex = 0; currentLetterIndex < currentCreator.length(); currentLetterIndex += 1)
			{
				popup.displayText(currentCreator.substring(currentLetterIndex, currentLetterIndex + 1));
			}
			
			String topic = currentKahoot.getTopic();
			
			for (int letter = currentKahoot.getTopic().length() - 1; letter >= 0; letter -= 1)
			{
				popup.displayText(topic.substring(letter, letter + 1));
			}
		}
	}
	
	//I added a bunch of kahoots to my kahoot list.
	private void fillTheList()
	{
		Kahoot fiftyStates = new Kahoot("Kashish", 50, "The fifty United States");
		Kahoot mySecondKahoot = new Kahoot("Ethan", 2, "The Double Data Type");
		Kahoot dinosaurTypes = new Kahoot("Connor", 700, "Wow thats a lot of dinosaurs");
		Kahoot worldCountries = new Kahoot("Will", 191, "All the World Countries");
		Kahoot animalColor = new Kahoot("Branton", 10, "all the colors of the animals");
		Kahoot presidents = new Kahoot("Obama", 44, "The 44th president of the US");
		myKahoots.add(fiftyStates);
		myKahoots.add(mySecondKahoot);
		myKahoots.add(dinosaurTypes);
		myKahoots.add(worldCountries);
		myKahoots.add(animalColor);
		myKahoots.add(presidents);
	}
}
