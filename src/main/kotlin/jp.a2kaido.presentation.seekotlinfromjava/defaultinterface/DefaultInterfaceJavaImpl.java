package jp.a2kaido.presentation.seekotlinfromjava.defaultinterface;

import org.jetbrains.annotations.NotNull;

public class DefaultInterfaceJavaImpl implements DefaultInterface {

    @NotNull
    @Override
    public String hello() {
        return DefaultImpls.hello(this);
    }

    @NotNull
    @Override
    public String hello2() {
        return "Hello Kotlin!";
    }
}