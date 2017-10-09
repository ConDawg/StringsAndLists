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
//		showTheList();
//		changeTheList();
		editTheList();
		
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
			// same thing but in a different way.
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

	private void changeTheList()
	{
		popup.displayText("The current list size is: " + myKahoots.size());
		Kahoot removed = myKahoots.remove(1);
		popup.displayText("I removed the Kahoot by " + removed.getCreator());
		popup.displayText("The list now has: " + myKahoots.size() + " items inside.");
		myKahoots.add(0, removed);
		
		popup.displayText("The list is still: " + myKahoots.size() + " items big." );
		removed = myKahoots.set(2, new Kahoot());
		popup.displayText("The kahoot by " + removed.getCreator() + " was replaced with " + myKahoots.get(2).getCreator());
		
	}
	
	private void editTheList()
	{
		popup.displayText("Welcome to Connor Johnson's super awesome practice in list editing!!!XD");
		popup.displayText("The current list of kahoots currently has " + myKahoots.size() + " Kahoots in it!");
		Kahoot removed = myKahoots.remove(1);
		popup.displayText("I removed " + removed.getCreator() + "'s Kahoot!");
		popup.displayText("Poor " + removed.getCreator() + " is now lonely in the void.");
		popup.displayText("I dont want " + removed.getCreator() + " to be lonely forever!");
		popup.displayText("I think I have an idea");
		Kahoot removedTwo = myKahoots.remove(3);
		popup.displayText("Now I removed " + removedTwo.getCreator() + " as well!");
		popup.displayText("Now " + removed.getCreator() + " and " + removedTwo.getCreator() + " are both lonely in the void, but they're lonely together, which I guess is nice.");
		popup.displayText("The list now has " + myKahoots.size() + " Kahoots inside.");
		removed = myKahoots.set(2, new Kahoot());
		removedTwo = myKahoots.set(4, new Kahoot());
		popup.displayText("The kahoot by " + removed.getCreator() + " was replaced with " + myKahoots.get(2).getCreator() + "'s Kahoot and the Kahoot by " + removedTwo.getCreator() + " was replaced by " + myKahoots.get(4).getCreator() + ".");
		popup.displayText("Now my Kahoots are in Kahoots with the other Kahoots.");
	}

	public PopupDisplay getPopup()
	{
		return popup;
	}
	
	public ArrayList<Kahoot> getMyKahoots()
	{
		return (ArrayList<Kahoot>) myKahoots;
	}
	
}
