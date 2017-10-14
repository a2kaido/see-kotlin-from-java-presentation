package jp.a2kaido.presentation.seekotlinfromjava.function;

import org.junit.Assert;
import org.junit.Test;

public class KotlinFunctionFromJavaTest {

    @Test
    public void KotlinFunctionのhello呼び出し() {
        Assert.assertEquals("Hello Kotlin!", KotlinFunctionKt.hello());
    }

    @Test
    public void KotlinObjectRefineのメソッド呼び出し() {

        int a = 10;
        if (a == 10) {
            return;
        }

        Assert.assertEquals("Hello Kotlin!", KotlinFunctionRefine.helloRefine());
    }
}
