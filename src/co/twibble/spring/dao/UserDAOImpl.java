/**
 * 
 */
package co.twibble.spring.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import co.twibble.spring.model.User;

/**
 * @author Andy McCall
 *
 */
@Repository("userDao")
public class UserDAOImpl extends AbstractDAO implements UserDAO {
 
	public void addUser(User user) {
		persist(user);
	}

	@SuppressWarnings("unchecked")
	public List<User> listUsers() {
		Criteria criteria = getSession().createCriteria(User.class);
		return (List<User>) criteria.list();
	}
	
	public void updateUser(User user) {
		getSession().update(user);
	}
	
    public User getUserByID(int user_id) {
        Criteria criteria = getSession().createCriteria(User.class);
        criteria.add(Restrictions.eq("user_id",user_id));
        return (User) criteria.uniqueResult();
    }

}
