package jp.a2kaido.presentation.seekotlinfromjava.extension

import org.junit.Assert
import org.junit.Test

class StringExtensionFromKotlinTest {

    @Test
    fun StringExtension() {
        Assert.assertEquals("Hello Kotlin!", "hoge".hello())
    }

    @Test
    fun StringExtensionRefine() {
        Assert.assertEquals("Hello Kotlin!", "hoge".helloRefine())
    }
}