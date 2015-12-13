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
@Table(name="TWIBBLE")
public class Twibble {

	@Id
    @Column(name="ID")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    
	@Column(name = "TWIBBLE", nullable = false)
    private String twibble; 

    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
    public String getTwibble() {
        return twibble;
    }
 
    public void setTwibble(String twibble) {
        this.twibble = twibble;
    }  
     
    @Override
    public String toString(){
        return "id="+id+", twibble="+twibble;
    }
	
}
