/**
 * 
 */
package co.twibble.spring.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import co.twibble.spring.model.Twibble;

/**
 * @author Andy McCall
 *
 */
@Repository("twibbleDao")
public class TwibbleDAOImpl extends AbstractDAO implements TwibbleDAO {
 
	public void addTwibble(Twibble twibble) {
		persist(twibble);
	}

	@SuppressWarnings("unchecked")
	public List<Twibble> listTwibbles() {
		Criteria criteria = getSession().createCriteria(Twibble.class);
		return (List<Twibble>) criteria.list();
	}
	
	public void updateTwibble(Twibble twibble) {
		getSession().update(twibble);
	}
	
    public Twibble getTwibbleByID(int id) {
        Criteria criteria = getSession().createCriteria(Twibble.class);
        criteria.add(Restrictions.eq("id",id));
        return (Twibble) criteria.uniqueResult();
    }

	
}
