package org.example;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    public void personShouldHaveNameLastNameGenderAge(){
        Person person = new Person("niev", "loke", "m",2);
        assertEquals("niev",person.getName());
        assertEquals("loke", person.getLastName());
        assertEquals("m",person.getSex());
        assertEquals(2, person.getAge());

    }
    @Test
    public void personShouldHaveAllTheDetails (){
        var person = new Person("Someone","something", "Somebody", "m",45 );
        assertTrue(true ,person.getName());
        assertEquals("something",person.getMiddleName());
        assertEquals("somebody", person.getLastName());
        assertEquals("m",person.getSex());
        assertEquals(45, person.getAge());

    }
    @Test
    public void shouldBeAbleToGetMother(){
//        make instance of Person for child
        var child = new Person();
//        make instance of Person for mother
        var mother = new Person();
//   set person2 as mother of person 1
        child.setMother(mother);

        assertEquals(mother,child.getMother());

    }
    @Test
            public void shouldBeAbleToAddChildren( ) {
//        Arrange
        var child1 = new Person();
        var child2 = new Person();
        var child3 = new Person();
        var mother = new Person();
//        setting kids to a List;
        List<Person> kids = new ArrayList<>() ;
        kids.add(child1);
        kids.add(child2);
        kids.add(child3);
//    Act
      List<Person> children = mother.getChildren();
//   Assert
        assertEquals(mother,children);
//        or
        assertEquals(mother,mother.getChildren());

    }
}
