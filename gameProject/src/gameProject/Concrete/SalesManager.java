package gameProject.Concrete;


import gameProject.Abstract.CampaignService;
import gameProject.Abstract.SalesService;
import gameProject.Entities.Campaign;
import gameProject.Entities.Game;
import gameProject.Entities.Gamer;

public  class SalesManager implements SalesService,CampaignService{

	public void sales(Game game, Gamer gamer,Campaign campaign) {
		System.out.println(campaign.getDiscount() + " indirim uygulandý : " + " Yeni fiyat " + (game.getUnitPrice()-campaign.getDiscount()));
		System.out.println(game.getGameName() + "oyunu " + gamer.getFirstName() + gamer.getLastName() + " tarafýndan satýn alýndý.");
		
	
	}

	@Override
	public void add(Campaign campaign) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Campaign campaign) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Campaign campaign) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sales(Game game, Gamer gamer) {
		// TODO Auto-generated method stub
		
	}




}
