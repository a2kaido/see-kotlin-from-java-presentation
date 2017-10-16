package jp.a2kaido.presentation.seekotlinfromjava.defaultinterface;

import org.junit.Assert;
import org.junit.Test;

public class DefaultInterfaceFromJavaTest {
    @Test
    public void DefaultInterfaceJavaImpl() {
        DefaultInterfaceJavaImpl target = new DefaultInterfaceJavaImpl();

        Assert.assertEquals("Hello Kotlin!", target.hello());
        Assert.assertEquals("Hello Kotlin!", target.hello2());
    }

    @Test
    public void DefaultInterfaceKotlinImpl() {
        DefaultInterfaceKotlinImpl target = new DefaultInterfaceKotlinImpl();

        Assert.assertEquals("Hello Kotlin!", target.hello());
        Assert.assertEquals("Hello Kotlin!", target.hello2());
    }
}