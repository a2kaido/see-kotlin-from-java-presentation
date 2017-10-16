package jp.a2kaido.presentation.seekotlinfromjava.object;

import org.junit.Assert;
import org.junit.Test;

public class KotlinObjectFromJavaTest {

    @Test
    public void KotlinObject() {
        Assert.assertEquals("Hello Kotlin!", KotlinObject.INSTANCE.hello());
        Assert.assertEquals("Hello Kotlin!", KotlinObject.INSTANCE.hello2());
    }

    @Test
    public void KotlinObjectRefine() {
        Assert.assertEquals("Hello Kotlin!", KotlinObjectRefine.hello());
        Assert.assertEquals("Hello Kotlin!", KotlinObjectRefine.hello2());
    }
}
