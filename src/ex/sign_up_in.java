
package ex;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name ="sign_up_in")

public class sign_up_in implements java.io.Serializable   {
    @Id
    @Column(name="username")
    private String username ;
    @Column(name="email")
    private String email ;
    @Column(name="password")
    private String password ;
    
    public sign_up_in() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
     
    
}
