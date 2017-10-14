package jp.a2kaido.presentation.seekotlinfromjava.extension

import org.junit.Assert
import org.junit.Test

class StringExtensionFromKotlinTest {

    @Test
    fun StringExtensionの呼び出し() {
        val s = "ほげ"

        Assert.assertEquals("Hello Kotlin!", s.hello())
    }
}