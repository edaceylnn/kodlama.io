package adapters;

import google.GoogleService;
import google.GoogleUser;

public class GoogleServiceAdapter implements GoogleService {

	@Override
	public boolean signIn(GoogleUser googleUser) {
		if( (googleUser.getEmail()!=null) && (googleUser.getPassword()!=null)) {
			System.out.println("Google hesabý ile giriþ yapýldý.");
			return true;
		}
		System.out.println("Email ve þifre gerekli.");
		return false;

}

	}


