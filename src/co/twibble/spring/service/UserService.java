/**
 * 
 */
package co.twibble.spring.service;

import java.util.List;

import co.twibble.spring.model.User;

/**
 * @author Andy McCall
 *
 */
public interface UserService {
   
    public void addUser(User user);
    public List<User> listUsers();
    public void updateUser(User user);
    public User getUserByID(int user_id);

}
