package coffeeShops.Abstract;

import java.rmi.RemoteException;

import coffeeShops.Entities.Customer;

public interface CustomerService {
	
	void save(Customer customer) throws RemoteException;
}
