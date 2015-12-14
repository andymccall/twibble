/**
 * 
 */
package co.twibble.spring.service;

import java.util.List;

import co.twibble.spring.model.Twibble;

/**
 * @author Andy McCall
 *
 */
public interface TwibbleService {

    public void addTwibble(Twibble t);
    public List<Twibble> listTwibbles();
    public void updateTwibble(Twibble t);
    public Twibble getTwibbleById(int id);

}
