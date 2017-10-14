package jp.a2kaido.presentation.seekotlinfromjava.defaultargument

import org.junit.Assert
import org.junit.Test

class KotlinDefaultArgumentFromKotlinTest {

    @Test
    fun KotlinDefaultArgumentの呼び出し() {
        val target = KotlinDefaultArgument()

        Assert.assertEquals("Hello Kotlin!", target.hello())
        Assert.assertEquals("Hello Kotlin!", target.hello("Kotlin"))
        Assert.assertEquals("Hello Java!", target.hello("Java"))
    }

    @Test
    fun KotlinDefaultArgumentRefineの呼び出し() {
        val target = KotlinDefaultArgumentRefine()

        Assert.assertEquals("Hello Kotlin!", target.hello())
        Assert.assertEquals("Hello Kotlin!", target.hello("Kotlin"))
        Assert.assertEquals("Hello Java!", target.hello("Java"))
    }
}