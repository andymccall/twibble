/**
 * 
 */
package co.twibble.spring.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import co.twibble.spring.model.TwibbleUser;

/**
 * @author Andy McCall
 *
 */
@Repository("userDao")
public class UserDAOImpl extends AbstractDAO implements UserDAO {
 
	public void addUser(TwibbleUser user) {
		persist(user);
	}

	@SuppressWarnings("unchecked")
	public List<TwibbleUser> listUsers() {
		Criteria criteria = getSession().createCriteria(TwibbleUser.class);
		return (List<TwibbleUser>) criteria.list();
	}
	
	public void updateUser(TwibbleUser user) {
		getSession().update(user);
	}
	
    public TwibbleUser getUserById(int userId) {
        Criteria criteria = getSession().createCriteria(TwibbleUser.class);
        criteria.add(Restrictions.eq("userId",userId));
        return (TwibbleUser) criteria.uniqueResult();
    }
    
    public void deleteUserById(int userId) {
    	TwibbleUser user = getUserById(userId);
    	getSession().delete(user);
    }

}
