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
public class TwibbleUser {

	@Id
    @Column(name="USER_ID")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

	@Column(name = "USERNAME", nullable = false)
	private String username;
	
	public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
	
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
         this.username = username ;
    }
    
    @Override
    public String toString(){
        return "user_id="+id+", username="+username;
    }
	
}
