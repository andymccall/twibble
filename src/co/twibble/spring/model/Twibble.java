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
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.SecondaryTables;
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
    @Column(name="TWIBBLE_ID")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    
	@Column(name = "TEXT", nullable = false)
    private String text;

    @ManyToOne
    @JoinColumn(name ="USER_ID")
	private TwibbleUser user;
	
    public int getId() {
        return this.id;
    }
 
    public void setId(int twibble_id) {
        this.id = twibble_id;
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
    
   @Override
   public String toString(){
       return "twibble_id= "+ getId() + ", text= " + getText() + ", username= " + getUsername();
   }
	
}
