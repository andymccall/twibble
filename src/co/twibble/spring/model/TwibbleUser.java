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
    @Column(name="USERID")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int userId;

	@Column(name = "USERNAME", nullable = false)
	private String username;
	
	@Column(name = "FIRSTNAME", nullable = false)
	private String firstName;
	
	@Column(name = "LASTNAME", nullable = false)
	private String lastName;

	@Column(name = "EMAILADDRESS", nullable = false)
	private String emailAddress;
	
	public int getUserId() {
        return userId;
    }
 
    public void setUserId(int userId) {
        this.userId = userId;
    }
	
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username ;
    }
    
    public void setFirstName(String firstname) {
         this.firstName = firstname ;
    }
    
    public String getFirstName() {
        return this.firstName;
    }
   
    public void setLastName(String lastname) {
        this.lastName = lastname ;
   }
   
   public String getLastName() {
       return this.lastName;
   }
    
   public String getFullName() {   
	   return this.firstName + " " + this.lastName;
   }
   
    public String getEmailAddress() {
    	return emailAddress;
    }

    public void setEmailAddress(String emailaddress) {
    	this.emailAddress = emailaddress;
    }

	@Override
    public String toString(){
        return "userId=" + userId + "," + "username=" + username + "," + "firstName:" + firstName + "," + "lastName:" + lastName;
    }
	
}
