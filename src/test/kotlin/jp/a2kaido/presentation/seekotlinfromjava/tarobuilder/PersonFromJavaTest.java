package jp.a2kaido.presentation.seekotlinfromjava.tarobuilder;

import org.junit.Assert;
import org.junit.Test;

public class PersonFromJavaTest {

    @Test
    public void Person() {
        Person person = new Person("a2kaido", 31, "東京");

        Assert.assertEquals(person, Person.Companion.build((builder) -> {
            builder.setName("a2kaido");
            builder.setAge(31);
            builder.setAddress("東京");
            return null;
        }));
    }
}
