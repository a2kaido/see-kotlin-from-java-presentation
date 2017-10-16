package jp.a2kaido.presentation.seekotlinfromjava.tarobuilder

import org.junit.Assert
import org.junit.Test

class PersonFromKotlinTest {

    @Test
    fun PersonTest() {
        val person = Person("a2kaido", 31, "東京")

        Assert.assertEquals(person, Person.build {
            name = "a2kaido"
            age = 31
            address = "東京"
        })
    }
}