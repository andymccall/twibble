/**
 * 
 */
package co.twibble.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
 
import co.twibble.spring.model.TwibbleUser;

/**
 * Entity bean with JPA annotations
 * Hibernate provides JPA implementation
 * @author Andy McCall
 *
 */
@Entity
@Table(name="TWIBBLES")
public class Twibble {

	@Id
    @Column(name="TWIBBLEID")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int twibbleId;
    
	@Column(name = "TEXT", nullable = false)
    private String text;

    @ManyToOne
    @JoinColumn(name ="USERID")
	private TwibbleUser user;
	
    public int getTwibbleId() {
        return this.twibbleId;
    }
 
    public void setId(int twibbleid) {
        this.twibbleId = twibbleid;
    }
 
    public String getText() {
        return this.text;
    }
 
    public void setText(String text) {
        text = this.text;
    }  

   public String getUsername() {
      return this.user.getUsername();
   }
   
   public String getFullName() {
	   return this.user.getFullName();
   }
    
   @Override
   public String toString(){
       return "twibbleId= "+ getTwibbleId() + ", text= " + getText() + ", username= " + getUsername();
   }
	
}
