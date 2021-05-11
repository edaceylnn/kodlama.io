package saveLogin;

import adapters.GoogleServiceAdapter;
import business.abstracts.UserService;
import entities.concretes.User;
import google.GoogleUser;
import business.concretes.UserManager;
import business.concretes.UserAuthorizationManager;
import dataAccess.concretes.HibernateUserDao;


public class Main {

	public static void main(String[] args) {
		
		
		User user = new User(1,"Eda","Ceylan","eda@gmail.com","1234567");
		User user1 = new User(2,"Ebru","Ceylan","ebru@gmail.com","45678912");
		
		UserService userService = new UserManager(new UserAuthorizationManager(),new HibernateUserDao());
		userService.register(user);
		userService.register(user1);
		
		
		GoogleUser googleUser = new GoogleUser(1,"eda@gmail.com",null);
		GoogleServiceAdapter googleServiceAdapter = new GoogleServiceAdapter();
		googleServiceAdapter.signIn(googleUser);
		
		

		
	}

}
