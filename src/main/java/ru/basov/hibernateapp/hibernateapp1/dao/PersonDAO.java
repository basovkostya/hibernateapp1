package ru.basov.hibernateapp.hibernateapp1.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ru.basov.hibernateapp.hibernateapp1.models.Book;
import ru.basov.hibernateapp.hibernateapp1.models.Person;


import java.util.List;
import java.util.Optional;

@Component
public class PersonDAO {

    private SessionFactory sessionFactory;

    @Autowired
    public PersonDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    @Transactional
    public List<Person> index(){
        Session session = sessionFactory.getCurrentSession();
        return null;
    }
    public Optional<Person> show(String name){
        return null;
    }
    public Person show(int id){
        return null;
    }
    public void save(Person savePerson){

    }
    public void update(int id, Person updatePerson){

    }
    public void delete(int id){

    }
    public List<Book> getBook(int id) {
        return null;
    }

}
