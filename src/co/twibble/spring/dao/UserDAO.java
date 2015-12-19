/**
 * 
 */
package co.twibble.spring.dao;

import java.util.List;

import co.twibble.spring.model.TwibbleUser;

/**
 * @author Andy McCall
 *
 */
public interface UserDAO {
	
    public void addUser(TwibbleUser user);
    public List<TwibbleUser> listUsers();
    public void updateUser(TwibbleUser user);
    public TwibbleUser getUserById(int userId);
    public void deleteUserById(int userId);

}