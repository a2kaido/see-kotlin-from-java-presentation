package jp.a2kaido.presentation.seekotlinfromjava.object;

import org.junit.Assert;
import org.junit.Test;

public class KotlinObjectFromJavaTest {

    @Test
    public void KotlinObjectのメソッド呼び出し() {
        Assert.assertEquals("Hello Kotlin!", KotlinObject.INSTANCE.hello());
    }

    @Test
    public void KotlinObjectRefineのメソッド呼び出し() {
        Assert.assertEquals("Hello Kotlin!", KotlinObjectRefine.hello());
    }
}
