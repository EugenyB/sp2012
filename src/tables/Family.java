package tables;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by yevge on 20.12.2016.
 */
@Entity
public class Family {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    private String familystate;

    public String getFamilystate() {
        return familystate;
    }

    public void setFamilystate(String familystate) {
        this.familystate = familystate;
    }

    @ManyToMany(mappedBy = "familys")
    private Collection<User> users;

    public Collection<User> getUsers() {
        return users;
    }

    public void setUsers(Collection<User> users) {
        this.users = users;
    }
}
