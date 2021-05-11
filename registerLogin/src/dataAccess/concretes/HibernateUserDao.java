package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class HibernateUserDao implements UserDao {
	
	List<User> userList = new ArrayList<User>();

	@Override
	public void add(User user) {
		System.out.println("Kiþi eklendi : " + user.getFirstName() + ' ' + user.getLastName());
		userList.add(user);
	}


	@Override
	public void delete(User user) {
		
		
	}

	@Override
	public User get(int id) {
		for(User users: userList) {
			if(users.getId() == id) {
				return users;
			}
		}
		
		return null;
	}

	@Override
	public List<User> getAll() {
		
		return userList;
	}

}
