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
	
    public void addTwibble(Twibble t);
    public List<Twibble> listTwibbles();

}