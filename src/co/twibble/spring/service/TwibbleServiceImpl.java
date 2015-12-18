/**
 * 
 */
package co.twibble.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.twibble.spring.dao.TwibbleDAO;
import co.twibble.spring.model.Twibble;

/**
 * @author Andy McCall
 *
 */
@Service("twibbleService")
@Transactional
public class TwibbleServiceImpl implements TwibbleService {

	@Autowired
	private TwibbleDAO twibbleDAO;
	 
    public void setTwibbleDAO(TwibbleDAO twibbleDAO) {
        twibbleDAO = twibbleDAO;
    }
 
    @Override
    @Transactional
    public void addTwibble(Twibble twibble) {
        twibbleDAO.addTwibble(twibble);
    }
 
    @Override
    @Transactional
    public List<Twibble> listTwibbles() {
        return twibbleDAO.listTwibbles();
    }
	
    @Override
    @Transactional
    public void updateTwibble(Twibble twibble) {
        twibbleDAO.updateTwibble(twibble);
    }
    
    @Override
    @Transactional
    public Twibble getTwibbleById(int twibbleid) {
    	return twibbleDAO.getTwibbleByID(twibbleid);
    }

    
}

