package jp.a2kaido.presentation.seekotlinfromjava.defaultargument;

import org.junit.Assert;
import org.junit.Test;

public class KotlinDefaultArgumentFromJavaTest {

    @Test
    public void KotlinDefaultArgument() {
        KotlinDefaultArgument target = new KotlinDefaultArgument();

        // cannot compile
        // Assert.assertEquals("Hello Kotlin!", target.hello());
        Assert.assertEquals("Hello Kotlin!", target.hello("Kotlin"));
        Assert.assertEquals("Hello Java!", target.hello("Java"));
    }

    @Test
    public void KotlinDefaultArgumentRefine() {
        KotlinDefaultArgumentRefine target = new KotlinDefaultArgumentRefine();

        Assert.assertEquals("Hello Kotlin!", target.hello());
        Assert.assertEquals("Hello Kotlin!", target.hello("Kotlin"));
        Assert.assertEquals("Hello Java!", target.hello("Java"));
    }
}
