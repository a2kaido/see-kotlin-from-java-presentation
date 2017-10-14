package jp.a2kaido.presentation.seekotlinfromjava.tarobuilder

import org.junit.Assert
import org.junit.Test

class PersonFromKotlinTest {

    @Test
    fun Personのビルダー呼び出し() {
        val person = Person("a2kaido", 31, "東京")

        Assert.assertEquals(person, Person.build {
            name = "a2kaido"
            age = 31
            address = "東京"
        })
    }

    @Test
    fun PersonRefineのビルダー呼び出し() {
        val person = PersonRefine("a2kaido", 17, "東京")

        Assert.assertEquals(person, PersonRefine.build {
            name = "a2kaido"
            age = 17
            address = "東京"
        })
    }
}