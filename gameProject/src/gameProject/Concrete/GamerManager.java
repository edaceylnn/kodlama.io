package gameProject.Concrete;

import java.rmi.RemoteException;

import gameProject.Abstract.GamerCheckService;
import gameProject.Abstract.GamerService;
import gameProject.Entities.Gamer;

public class GamerManager implements GamerService{

	private GamerCheckService gamerCheckService;
	
	
	public GamerManager(GamerCheckService gamerCheckService) {
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void add(Gamer gamer) throws RemoteException {
		
		if(gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println("Kullanıcı doğrulandı : " + gamer.getFirstName() + ' ' + gamer.getLastName());
		}else {
			System.out.println("Kullanıcı bulunamadı" );
		}
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Kullanıcı güncellendi : " + gamer.getFirstName());
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Kullanıcı silindi" );
		
	}

}
