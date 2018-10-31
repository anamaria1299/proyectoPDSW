
package services.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import entities.Comment;
import entities.Initiative;
import entities.User;
import entities.UserType;
import services.ServicesException;
import services.InitiativeServices;

public class InitiativeServicesImplStub implements InitiativeServices {
	
	 private final Map<Long,User> users;
	 private final Map<Integer,UserType> usersType;
	 private final Map<Integer,Initiative> initiatives;
	 private final Map<Integer,Comment> comments;
	 
	 public InitiativeServicesImplStub() {
		   users = new HashMap<>();
		   usersType = new HashMap<>();
	       initiatives = new HashMap<>();
	       comments = new HashMap<>();
	 }


	@Override
	public void createUser(User user) throws ServicesException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> listUsers() throws ServicesException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createInitiative(Initiative i) throws ServicesException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createComment(long idUser, int idIni, String comment) throws ServicesException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerVote(long idUser, int idIni) throws ServicesException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Comment> searchCommentsByInitiative(int id) throws ServicesException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Initiative searchInitiative(int idIni) throws ServicesException {
		// TODO Auto-generated method stub
		return null;
	}
	
	 private void poblar() {
		 UserType admin=new UserType(1,"Admin");
		 UserType pmo_odi=new UserType(2,"PMO-ODI");
		 UserType proponent=new UserType(3,"Proponent");
		 UserType publico=new UserType(4,"Public");
		 
		 usersType.put(1,admin);
		 usersType.put(2,pmo_odi);
		 usersType.put(3,proponent);
		 usersType.put(4, publico);
		 
		 User u1=new User(1016095672,"juanito","choachi","juan.choachi@gmail.com",proponent);
		 User u2=new User(123456789,"santiago","rocha","S.R@gmail.com",proponent);
		 User u3=new User(111111111,"diego","carvajal","diego-c@gmail.com",proponent);
		 User u4=new User(987654321,"ana","rincon","anaRincon@gmail.com",pmo_odi);
		 User u5=new User(1015475102,"karen","duran","k26duran@gmail.com",admin);
		 
		 users.put((long)1, u1);
		 users.put((long)2, u2);
		 users.put((long)3, u3);
		 users.put((long)4, u4);
		 users.put((long)5, u5);
		 
		 List<String> keyWords= Arrays.asList("Jardin","Baño","Tecnologia");
		 
		 Initiative ini1=new Initiative ("Hacer más baños", keyWords,"Logistica",u2);
		 Initiative ini2=new Initiative ("Expandir zona verde", keyWords,"Jardineria",u1);
		 Initiative ini3=new Initiative ("Mas computadores", keyWords,"Tecnologia",u3);
		 
		 initiatives.put(1, ini1);
		 initiatives.put(2, ini2);
		 initiatives.put(3, ini3);
		 
		 Comment comment1=new Comment(1, 1, "muy buena idea");
		 Comment comment2=new Comment(1, 2, "Más espacio para comer!!");
		 
		 comments.put(1, comment1);
		 comments.put(2, comment2);
	 }


	

}