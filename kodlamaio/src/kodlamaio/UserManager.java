package kodlamaio;

public class UserManager {

	public void signIn(User user) {
		System.out.println(user.getUserName() + " ba�ar�yla giri� yap�ld�.");

	}

	public void signOut(User user) {
		System.out.println(user.getUserName() + " ��k�� yap�ld�.");

	}


	public void register(User user) {
		System.out.println(user.getFirstName() + " kayd�n�z ger�ekle�ti.");

	}

}
