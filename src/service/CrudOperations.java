package service;	

import java.util.ArrayList;
//import java.util.HashMap;
import java.util.List;
//import java.util.Map;
import Model.User;

public class CrudOperations {
	static int value = 0;
	
			
	static List<User> list = new ArrayList<User>();
	
	public List<User> addUser(User user) {
			list.add(user);
				return list;	
				}
	
	public List<User> getAllUsers(){
			return list;
			}

		}


