package jp.a2kaido.presentation.seekotlinfromjava.defaultargument

class KotlinDefaultArgumentRefine {
    @JvmOverloads
    fun hello(s : String = "Kotlin") : String {
        return "Hello $s!"
    }
}