/**
 * 
 */
package co.twibble.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
/**
 * Entity bean with JPA annotations
 * Hibernate provides JPA implementation
 * @author Andy McCall
 *
 */
@Entity
@Table(name="Users")
public class User {

	@Id
    @Column(name="USER_ID")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int user_id;

	@Column(name = "USERNAME", nullable = false)
	private String username;
	
	public int getUserId() {
        return user_id;
    }
 
    public void setUserId(int user_id) {
        this.user_id = user_id;
    }
	
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
         this.username = username ;
    }
    
    @Override
    public String toString(){
        return "user_id="+user_id+", username="+username;
    }
	
}
