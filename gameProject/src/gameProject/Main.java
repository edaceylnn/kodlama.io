package gameProject;

import java.rmi.RemoteException;
import java.time.LocalDate;

import gameProject.Adapters.MernisServiceAdapter;
import gameProject.Concrete.CampaignManager;
import gameProject.Concrete.GamerManager;
import gameProject.Concrete.SalesManager;
import gameProject.Entities.Campaign;
import gameProject.Entities.Game;
import gameProject.Entities.Gamer;

public class Main {

	public static void main(String[] args) throws RemoteException {
		
		GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		gamerManager.add(new Gamer(1, "Eda", "Ceylan", LocalDate.of(1999, 11, 10), "12345678912"));

		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(new Campaign(1,"Yýlbaþý",25));
		
		
		Game game = new Game(1,"Araba ",120);
		
		Gamer gamer = new Gamer(1, "Eda", " Ceylan", LocalDate.of(1999, 11, 10), "12345678912");
		
		Campaign campaign = new Campaign(1,"Yýlbaþý",25);
		
		SalesManager salesManager = new SalesManager();
		salesManager.sales(game, gamer, campaign);
		
		
		

}
}