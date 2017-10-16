package jp.a2kaido.presentation.seekotlinfromjava.`object`

import org.junit.Assert
import org.junit.Test
import jp.a2kaido.presentation.seekotlinfromjava.`object`.KotlinObject as KO
import jp.a2kaido.presentation.seekotlinfromjava.`object`.KotlinObjectRefine as KOR

class KotlinObjectFromKotlinTest {

    @Test
    fun KotlinObject() {
        Assert.assertEquals("Hello Kotlin!", KO.hello())
        Assert.assertEquals("Hello Kotlin!", KO.hello2())
    }

    @Test
    fun KotlinObjectRefine() {
        Assert.assertEquals("Hello Kotlin!", KOR.hello())
        Assert.assertEquals("Hello Kotlin!", KOR.hello2())
    }
}