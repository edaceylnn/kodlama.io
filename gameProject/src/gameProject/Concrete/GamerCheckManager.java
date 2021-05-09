package gameProject.Concrete;

import gameProject.Abstract.GamerCheckService;
import gameProject.Entities.Gamer;

public class GamerCheckManager implements GamerCheckService {

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		
		return true;
	}



}
