package jp.a2kaido.presentation.seekotlinfromjava.defaultargument

class KotlinDefaultArgument {
    fun hello(s : String = "Kotlin") : String {
        return "Hello $s!"
    }
}