package jp.a2kaido.presentation.seekotlinfromjava.extension;

import org.junit.Assert;
import org.junit.Test;

public class StringExtensionFromJavaTest {

    @Test
    public void StringExtension() {
        Assert.assertEquals("Hello Kotlin!", StringExtensionKt.hello("hoge"));
    }

    @Test
    public void StringExtensionRefile() {
        Assert.assertEquals("Hello Kotlin!", String.helloRefine("hoge"));
    }
}
