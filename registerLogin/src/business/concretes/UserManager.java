package business.concretes;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import business.abstracts.UserAuthorizationService;
import business.abstracts.UserService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService {
	
	private UserAuthorizationService userAuthorizationService;
	private UserDao userDao;
	
	
	public UserManager(UserAuthorizationService userAuthorizationService, UserDao userDao) {
		this.userAuthorizationService = userAuthorizationService;
		this.userDao = userDao;
	}


	@Override
	public boolean register(User user) {
		if(registerRules(user) && emailControl(user)) {
			if(validationLink(user)) {
				userDao.add(user);
				return true;
			}else {
				System.out.println("�ye de�ilsiniz.");
				
			}
		}
		System.out.println("Tekrar deneyiniz.");
		return false;
	}

	@Override
	public void login(String email, String password) {
		for(User user: userDao.getAll()) {
			if(user.getEmail()==email && user.getPassword()==password) {
				System.out.println("Ba�ar�yla giri� yap�ld� : " + user.getFirstName() + ' ' + user.getFirstName());
			}
			
			System.out.println("Email veya �ifre hatal�. Tekrar deneyiniz.");
		}
		
	}

	
	
	public boolean registerRules(User user) {
		
		String regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
		Pattern pattern = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
		Matcher control = pattern.matcher(user.getEmail());
		
		return user.getFirstName().length() > 2 && user.getPassword().length() >= 6 && user.getLastName().length() > 2 && control.matches();
	}
	
	
	
	public boolean emailControl(User user) {
		for(User users : userDao.getAll()) {
			if(users.getEmail() == user.getEmail()) {
				System.out.println("Email daha �nce kullan�lm��t�r.");
				return false;
			}
		}
		return true;
	}
	
	
	public boolean validationLink(User user) {
		if(userAuthorizationService.validation(user.getEmail())==true) {
			System.out.println("Do�rulama e-postas� g�nderildi : " + user.getFirstName() + ' ' + user.getLastName());
			return true;
		}
		return false;
		
	}
	
	
	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}



	

}
