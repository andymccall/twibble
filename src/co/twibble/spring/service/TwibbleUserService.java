/**
 * 
 */
package co.twibble.spring.service;

import java.util.List;

import co.twibble.spring.model.TwibbleUser;

/**
 * @author Andy McCall
 *
 */
public interface TwibbleUserService {
   
    public void addUser(TwibbleUser twibbleUser);
    public List<TwibbleUser> listUsers();
    public void updateUser(TwibbleUser twibbleUser);
    public TwibbleUser getUserByID(int userId);

}
