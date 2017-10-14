package jp.a2kaido.presentation.seekotlinfromjava.extension;

import org.junit.Assert;
import org.junit.Test;

public class StringExtensionFromJavaTest {

    @Test
    public void StringExtensionの呼び出し() {
        Assert.assertEquals("Hello Kotlin!", StringExtensionKt.hello("ほげ"));
    }

    @Test
    public void StringExtensionRefileの呼び出し() {
        Assert.assertEquals("Hello Kotlin!", String.helloRefine("ほげ"));
    }
}
