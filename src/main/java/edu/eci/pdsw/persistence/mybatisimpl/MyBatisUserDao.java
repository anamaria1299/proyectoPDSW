package edu.eci.pdsw.persistence.mybatisimpl;

import java.util.List;
import com.google.inject.Inject;
import edu.eci.pdsw.entities.User;
import edu.eci.pdsw.persistence.UserDAO;
import edu.eci.pdsw.persistence.mybatisimpl.mappers.UserMapper;
import edu.eci.pdsw.samples.services.ServicesException;

public class MyBatisUserDao implements UserDAO{
	
	@Inject
	UserMapper userMapper;
	
	public List<User> loadAll() throws ServicesException {
		// TODO Auto-generated method stub
		return null;
	}

	public User load(int id) throws ServicesException {
		try {
			return userMapper.consultUser(id);
		}catch(Exception e) {
			e.printStackTrace();
			throw new ServicesException("Load user"+id+ "persistence error");
		}
	}
}