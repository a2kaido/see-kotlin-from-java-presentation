package jp.a2kaido.presentation.seekotlinfromjava.defaultargument;

import org.junit.Assert;
import org.junit.Test;

public class KotlinDefaultArgumentFromJavaTest {

    @Test
    public void KotlinDefaultArgumentの呼び出し() {
        KotlinDefaultArgument target = new KotlinDefaultArgument();

        Assert.assertEquals("Hello Kotlin!", target.hello("Kotlin"));

        // cannot compile
        // Assert.assertEquals("Hello Kotlin!", kotlinDefaultArgument.hello());
    }

    @Test
    public void KotlinDefaultArgumentRefineの呼び出し() {
        KotlinDefaultArgumentRefine target = new KotlinDefaultArgumentRefine();

        Assert.assertEquals("Hello Kotlin!", target.hello());
        Assert.assertEquals("Hello Kotlin!", target.hello("Kotlin"));
        Assert.assertEquals("Hello Java!", target.hello("Java"));
    }
}
