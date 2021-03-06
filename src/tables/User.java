package tables;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.io.Serializable;
import java.util.Collection;

/**
 * Created by yevge on 20.12.2016.
 */
@Entity
public class User implements Serializable{
    private String name;
    @Id
    private String login;
    private String password;

    public User(String name, String login, String password) {
        this.name = name;
        this.login = login;
        this.password = password;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @ManyToMany
    private Collection<Family> familys;

    public Collection<Family> getFamilys() {
        return familys;
    }

    public void setFamilys(Collection<Family> familys) {
        this.familys = familys;
    }
}
