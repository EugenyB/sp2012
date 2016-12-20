package dao;

import tables.User;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.util.List;

/**
 * Created by yevge on 20.12.2016.
 */
@Stateless
public class UserDAO implements Serializable{
    @PersistenceContext
    EntityManager em;

    public List<User> findAll() {
        return em.createQuery("select u from User u").getResultList();
    }

    public void create(User user) {
        em.persist(user);
    }
}
