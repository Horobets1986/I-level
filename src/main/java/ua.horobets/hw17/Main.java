package ua.horobets.hw17;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
         Task2();
         Task3();
         Task4();
    }

    public static void Task2() {
        Configuration configuration = new Configuration();
        configuration.configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.getTransaction();
            transaction.begin();

            User blad = new User();
            blad.setFirstName("Vlad");
            blad.setLastName("Blad");
            session.persist(blad);

            User user = session.find(User.class, 10L);
            System.out.println(user);

            user.setFirstName("");
            session.update(user);
            System.out.println(user);

            session.remove(user);

            transaction.commit();
        }
        sessionFactory.close();
    }

    public static void Task3() {
        Configuration configuration = new Configuration();
        configuration.configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.getTransaction();
            transaction.begin();

            User user = User.builder()
                    .firstName("Pit")
                    .lastName("Bull")
                    .build();
            session.persist(user);

            Order car = Order.builder()
                    .name("car")
                    .orders(Math.abs(ThreadLocalRandom.current().nextInt()))
                    .user(user)
                    .build();
            session.persist(car);

            Order bus = Order.builder()
                    .name("bus")
                    .orders(Math.abs(ThreadLocalRandom.current().nextInt()))
                    .user(user)
                    .build();
            session.persist(bus);

            Order tank = Order.builder()
                    .name("tank")
                    .orders(Math.abs(ThreadLocalRandom.current().nextInt()))
                    .user(user)
                    .build();
            session.persist(tank);

            User findUser = session.find(User.class, 11L);
            System.out.println(findUser);

            User bUser = session.find(User.class, 2L);
            Order ship = Order.builder()
                    .name("ship")
                    .orders(Math.abs(ThreadLocalRandom.current().nextInt()))
                    .build();
            ship.setUser(bUser);
            session.persist(ship);
            System.out.println(bUser);

            transaction.commit();
        }
        sessionFactory.close();
    }

    public static void Task4() {
        Configuration configuration = new Configuration();
        configuration.configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.getTransaction();
            transaction.begin();

            Query<Order> selectEFromOrderE = session.createQuery("select g from User g WHERE size(g.orders) = 1", Order.class);
            List<Order> list = selectEFromOrderE.list();
            System.out.println(list);

            List<User> select = session.createQuery("select g from User g", User.class).list();
            for (User user : select) {
                user.setLocalDateTimeata(LocalDateTime.now());
            }

            List<User> findingOrdersWithinTime =
                    session.createQuery("select g from User g where g.Data between:startData and :endData",
                                    User.class)
                            .setParameter("startData", LocalDateTime.now().minus(1, ChronoUnit.DAYS))
                            .setParameter("endData", LocalDateTime.now())
                            .list();

            System.out.println(findingOrdersWithinTime);

            List<Object[]> results = session.createQuery(
                            "select  g, count(p) " +
                                    "from User g " +
                                    "left join g.orders p " +
                                    "group by g", Object[].class)
                    .list();

            for (Object[] result : results) {
                User user = (User) result[0];
                Long number = (Long) result[1];
                System.out.println(user + ", Number : " + number);
                transaction.commit();
            }
            sessionFactory.close();
        }
    }
}