package jp.a2kaido.presentation.seekotlinfromjava.defaultargument

class KotlinDefaultArgument {
    fun hello(s : String = "Kotlin") = "Hello $s!"
}

class KotlinDefaultArgumentRefine {
    @JvmOverloads
    fun hello(s : String = "Kotlin") = "Hello $s!"
}
