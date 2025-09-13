package com.example;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.model.Student;
import com.example.util.HibernateUtil;

public class App {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Nagu mayy");
        student.setEmail("nagumayy.com");

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.persist(student);
        tx.commit();
        session.close();

        System.out.println("Student saved successfully!");
    }
}
