package com.bhanu;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setId(3);
        s1.setName("bhanu");
//        s1.setTech("java");
        s1.setTech("cpp"); // earlier he like java now he like cpp we want to upadate
        // we will use merge : is there upate unless create a new one

        Configuration config = new Configuration();
        config.addAnnotatedClass(com.bhanu.Student.class);
        config.configure("hibernate.cfg.xml");
        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
//        session.persist(s1);
//        Student s = session.byId(Student.class).getReference(3); lazy loading
            // jab hama data use krna hoga tab layaga
        // Student s = session.get(Student.class , 3 ); // early loading
        // means is the data is not printing it fires the query
//        session.merge(s1);
        // delete
        Student s = session.find(Student.class , 3);
        session.remove(s); //
         transaction.commit();

//        System.out.println(s);
        session.close();
        factory.close();
        }
}
