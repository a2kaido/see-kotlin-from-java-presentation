package jp.a2kaido.presentation.seekotlinfromjava.function

import org.junit.Assert
import org.junit.Test

class KotlinFunctionFromKotlinTest {

    @Test
    fun KotlinFunctionのhello呼び出し() {
        Assert.assertEquals("Hello Kotlin!", hello())
    }
}