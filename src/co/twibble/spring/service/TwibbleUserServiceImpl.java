/**
 * 
 */
package co.twibble.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.twibble.spring.dao.UserDAO;
import co.twibble.spring.model.TwibbleUser;

/**
 * @author Andy McCall
 *
 */
@Service("twibbleUserService")
@Transactional
public class TwibbleUserServiceImpl implements TwibbleUserService {

	@Autowired
	private UserDAO userDAO;
	
	 public void setUserDAO(UserDAO userDAO) {
		 userDAO = userDAO;
	    }
	 
	    @Override
	    @Transactional
	    public void addUser(TwibbleUser twibbleUser) {
	    	userDAO.addUser(twibbleUser);
	    }
	 
	    @Override
	    @Transactional
	    public List<TwibbleUser> listUsers() {
	        return userDAO.listUsers();
	    }
		
	    @Override
	    @Transactional
	    public void updateUser(TwibbleUser twibbleUser) {
	    	userDAO.updateUser(twibbleUser);
	    }
	    
	    @Override
	    @Transactional
		public TwibbleUser getUserByID(int user_id) {
	    	return userDAO.getUserByID(user_id);
		}

}
