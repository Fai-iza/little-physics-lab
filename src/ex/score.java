
package ex;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name ="scores")

public class score implements java.io.Serializable {
    @Id
    @Column(name="username")
    private String username ;
    @Column(name="Resistivity_of_wire")
    private int Resistivity_of_wire ;
    @Column(name="Simple_Pendulum")
    private int Simple_Pendulum ;
    @Column(name="Newtons_third_low")
    private int Newtons_third_low ;
    

    public score() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getResistivity_of_wire() {
        return Resistivity_of_wire;
    }

    public void setResistivity_of_wire(int Resistivity_of_wire) {
        this.Resistivity_of_wire = Resistivity_of_wire;
    }

    public int getSimple_Pendulum() {
        return Simple_Pendulum;
    }

    public void setSimple_Pendulum(int Simple_Pendulum) {
        this.Simple_Pendulum = Simple_Pendulum;
    }

    public int getNewtons_third_low() {
        return Newtons_third_low;
    }

    public void setNewtons_third_low(int Newtons_third_low) {
        this.Newtons_third_low = Newtons_third_low;
    }

  
   


    
    
 
}
