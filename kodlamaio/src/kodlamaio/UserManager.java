package kodlamaio;

public class UserManager {

	public void signIn(User user) {
		System.out.println(user.getUserName() + " baþarýyla giriþ yapýldý.");

	}

	public void signOut(User user) {
		System.out.println(user.getUserName() + " çýkýþ yapýldý.");

	}


	public void register(User user) {
		System.out.println(user.getFirstName() + " kaydýnýz gerçekleþti.");

	}

}
