package jp.a2kaido.presentation.seekotlinfromjava.function;

import org.junit.Assert;
import org.junit.Test;
import static jp.a2kaido.presentation.seekotlinfromjava.function.KotlinFunctionKt.hello;

public class KotlinFunctionFromJavaTest {

    @Test
    public void KotlinFunction() {
        Assert.assertEquals("Hello Kotlin!", hello());
    }

    @Test
    public void KotlinObjectRefine() {
        Assert.assertEquals("Hello Kotlin!", KotlinFunctionRefine.helloRefine());
    }
}
