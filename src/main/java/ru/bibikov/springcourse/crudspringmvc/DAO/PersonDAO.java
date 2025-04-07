package ru.bibikov.springcourse.crudspringmvc.DAO;

import org.springframework.stereotype.Component;
import ru.bibikov.springcourse.crudspringmvc.models.Person;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private static int PEOPLE_COUNT;
    private List<Person> people;

    {
        people = new ArrayList<>();

        people.add(new Person(++PEOPLE_COUNT, "Tom",32,true));
        people.add(new Person(++PEOPLE_COUNT, "Bob",13,false));
        people.add(new Person(++PEOPLE_COUNT, "Mike",22,false));
        people.add(new Person(++PEOPLE_COUNT, "Katy",59,true));
    }

    public List<Person> index() {
        return people;
    }

    public Person show(int id) {
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }

    public void save(Person person){
        person.setId(++PEOPLE_COUNT);
        people.add(person);
    }
    public void update(int id,Person updatePerson){
        Person personToBeUpdated=show(id);

        personToBeUpdated.setName(updatePerson.getName());
        personToBeUpdated.setAge(updatePerson.getAge());
        personToBeUpdated.setMarried(updatePerson.isMarried());

    }
}
