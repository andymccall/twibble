/**
 * 
 */
package co.twibble.spring.dao;

import java.util.List;

import co.twibble.spring.model.Twibble;

/**
 * @author Andy McCall
 *
 */
public interface TwibbleDAO {
	
    public void addTwibble(Twibble twibble);
    public List<Twibble> listTwibbles();
    public void updateTwibble(Twibble twibble);
    public Twibble getTwibbleByID(int twibble_id);

}