package beans;

import dao.UserDAO;
import tables.User;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

/**
 * Created by yevge on 20.12.2016.
 */
@Named
@SessionScoped
public class UserBean implements Serializable{
    @Inject
    private User user;

    @Inject
    UserDAO userDAO;
//    @PostConstruct
//    public void init(){
//        user = new User();
//    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String check() {
        if (user.getLogin()!=null && !user.getLogin().isEmpty()
                && user.getPassword()!=null && !user.getPassword().isEmpty()
                && user.getName()!=null && !user.getName().isEmpty()) {
            userDAO.create(user);
            return "show";
        }
        return null;
    }

    public List<User> getUsers() {
        return userDAO.findAll();
    }
}
