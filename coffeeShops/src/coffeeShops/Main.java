package coffeeShops;


import java.time.LocalDate;

import coffeeShops.Abstract.BaseCustomerManager;
import coffeeShops.Entities.Customer;
import coffeeShops.Adapters.MernisServiceAdapter;
import coffeeShops.Concrete.StarbucksCustomerManager;


import java.rmi.RemoteException;


public class Main {

	public static void main(String[] args) throws RemoteException {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1,"Eda","Ceylan", LocalDate.of(1999,11,10), "12345678912"));
	  
		
	
	
		
		

	}

}
