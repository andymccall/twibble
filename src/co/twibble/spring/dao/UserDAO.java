/**
 * 
 */
package co.twibble.spring.dao;

import java.util.List;

import co.twibble.spring.model.User;

/**
 * @author Andy McCall
 *
 */
public interface UserDAO {
	
    public void addUser(User user);
    public List<User> listUsers();
    public void updateUser(User user);
    public User getUserByID(int user_id);

}