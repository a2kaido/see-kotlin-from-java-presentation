package jp.a2kaido.presentation.seekotlinfromjava.tarobuilder;

import org.junit.Assert;
import org.junit.Test;

public class PersonFromJavaTest {

    @Test
    public void Personのビルダー呼び出し() {
        Person person = new Person("a2kaido", 17, "東京");

        Assert.assertEquals(person, Person.Companion.build((builder) -> {
            builder.setName("a2kaido");
            builder.setAge(17);
            builder.setAddress("東京");
            return null;
        }));
    }

    @Test
    public void PersonRefineのビルダー呼び出し() {
        PersonRefine person = new PersonRefine("a2kaido", 17, "東京");

        Assert.assertEquals(person, PersonRefine.build((builder) -> {
            builder.setName("a2kaido");
            builder.setAge(17);
            builder.setAddress("東京");
            return null;
        }));
    }
}
