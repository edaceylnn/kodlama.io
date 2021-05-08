package coffeeShops.Concrete;

import java.rmi.RemoteException;

import coffeeShops.Abstract.BaseCustomerManager;
import coffeeShops.Abstract.CustomerCheckService;
import coffeeShops.Entities.Customer;


public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckService customerCheckService;
	
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) throws RemoteException {
		if(customerCheckService.CheckIfRealPerson(customer)) {
			//save(customer);
			System.out.println(customer.getFirstName() + " " + customer.getLastName() + "  veritabanýna baþarýyla eklendi");
		}else {
			System.out.println("Kayýt edilemedi");
		}
		
	}



}
