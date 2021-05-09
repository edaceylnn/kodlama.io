package gameProject.Abstract;

import java.rmi.RemoteException;

import gameProject.Entities.Gamer;

public interface GamerCheckService {
	boolean checkIfRealPerson(Gamer gamer) throws NumberFormatException, RemoteException;

}
