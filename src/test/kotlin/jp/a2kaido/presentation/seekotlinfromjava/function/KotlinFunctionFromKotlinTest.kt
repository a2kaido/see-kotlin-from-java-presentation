package jp.a2kaido.presentation.seekotlinfromjava.function

import org.junit.Assert
import org.junit.Test

class KotlinFunctionFromKotlinTest {

    @Test
    fun KotlinFunction() {
        Assert.assertEquals("Hello Kotlin!", hello())
        Assert.assertEquals("Hello Kotlin!", hello2())
    }
}