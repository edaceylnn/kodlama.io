package gameProject.Abstract;

import java.rmi.RemoteException;

import gameProject.Entities.Gamer;

public interface GamerService {

	void add(Gamer gamer) throws RemoteException;
	void update(Gamer gamer);
	void delete(Gamer gamer);
}
