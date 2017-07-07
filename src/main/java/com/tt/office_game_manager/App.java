package com.tt.office_game_manager;

import com.tt.office_game_manager.entities.Team;
import com.tt.office_game_manager.entities.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.HashSet;
import java.util.Set;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

//        session.save(User.builder().login("Ja xD").password("xyz").build());
//        session.save(User.builder().login("Jan Kowalski").password("xyz").build());
//        session.save(User.builder().login("RuchaczPuchacz3000").password("xyz").build());
//        session.save(User.builder().login("trololololol").password("xyz").build());

        User owner = (User) session.createCriteria(User.class).add(Restrictions.like("userId",Long.valueOf(3))).list().get(0);
        Set<User> user = new HashSet<User>(session.createCriteria(User.class).add(Restrictions.between("userId",Long.valueOf(2),Long.valueOf(4))).list());
        session.save(Team.builder().name("minionki").owner(owner).users(user).build());

        transaction.commit();

        session.close();
        HibernateUtil.getSessionFactory().close();
    }
}
