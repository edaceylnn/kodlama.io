package business.concretes;


import business.abstracts.UserAuthorizationService;


public class UserAuthorizationManager implements UserAuthorizationService{


	@Override
	public boolean validation(String email) {
		
		if (email!=null) {
			System.out.println("E-posta do�rulamas� i�in linke t�kland�.");
			return true;
		}
			
			return false;
		}
	}



