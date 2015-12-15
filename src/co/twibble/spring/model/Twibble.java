/**
 * 
 */
package co.twibble.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.SecondaryTables;
import javax.persistence.Table;
 
/**
 * Entity bean with JPA annotations
 * Hibernate provides JPA implementation
 * @author Andy McCall
 *
 */
@Entity
@Table(name="TWIBBLES")
@SecondaryTable(name="USERS")
public class Twibble {

	@Id
    @Column(name="TWIBBLE_ID")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    
	@Column(name = "TEXT", nullable = false)
    private String text;

	@Column(table = "USERS", name = "USERNAME", nullable = false)
	private String username;
	
    public int getId() {
        return this.id;
    }
 
    public void setTwibbleId(int twibble_id) {
        this.id = twibble_id;
    }
 
    public String getText() {
        return this.text;
    }
 
    public void setText(String text) {
        text = this.text;
    }  

   public String getUsername() {
      return this.username;
   }
    
   @Override
   public String toString(){
       return "twibble_id="+id+", text="+text+", username="+username;
   }
	
}
