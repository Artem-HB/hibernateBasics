package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Subject Math = new Subject("Math");
        Subject Chemistry = new Subject("Chemistry");
        Subject Physics = new Subject("Physics");

        Teacher teacher1 = new Teacher(1,"Jeremy Munci",3000,new Health("2023.08.08","At home coronavirus, lessons online"));
        Teacher teacher2 = new Teacher(2,"Anna Cumpara",3000,new Health("2023.08.27"));
        Teacher teacher3 = new Teacher(3,"Margo Belini",3000,new Health("2023.08.08"));

        Grades grade11A = new Grades(1,teacher2);
        Grades grade10B = new Grades(2,teacher3);

        Student student1 = new Student(1,grade11A,"Andrew Toad","example@mail.com", new Health("2023.08.24"));
        Student student2 = new Student(2,grade11A,"Angelina Maxis","example@mail.com", new Health("2023.08.22"));
        Student student3 = new Student(3,grade10B,"Roberto Oaspat","example@mail.com", new Health("2023.08.21"));


        session.persist(student1);
        session.persist(student2);
        session.persist(student3);



        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}