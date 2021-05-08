package coffeeShops.Abstract;

import java.rmi.RemoteException;

import coffeeShops.Entities.Customer;

public interface CustomerCheckService {
	boolean CheckIfRealPerson(Customer customer) throws NumberFormatException, RemoteException;

}
