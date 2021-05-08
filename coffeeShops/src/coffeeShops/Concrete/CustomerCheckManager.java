package coffeeShops.Concrete;

import coffeeShops.Abstract.CustomerCheckService;
import coffeeShops.Entities.Customer;



public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		return true;
		
	}

}
