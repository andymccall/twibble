/**
 * 
 */
package co.twibble.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.twibble.spring.dao.UserDAO;
import co.twibble.spring.model.User;

/**
 * @author Andy McCall
 *
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;
	
	 public void setUserDAO(UserDAO userDAO) {
		 userDAO = userDAO;
	    }
	 
	    @Override
	    @Transactional
	    public void addUser(User user) {
	    	userDAO.addUser(user);
	    }
	 
	    @Override
	    @Transactional
	    public List<User> listUsers() {
	        return userDAO.listUsers();
	    }
		
	    @Override
	    @Transactional
	    public void updateUser(User user) {
	    	userDAO.updateUser(user);
	    }
	    
	    @Override
	    @Transactional
		public User getUserByID(int user_id) {
	    	return userDAO.getUserByID(user_id);
		}

}
