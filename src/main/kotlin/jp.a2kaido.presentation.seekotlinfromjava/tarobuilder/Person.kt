package jp.a2kaido.presentation.seekotlinfromjava.tarobuilder

data class Person(
        val name: String,
        val age: Int,
        val address: String
) {
    class Builder {
        var name: String? = null
        var age: Int? = null
        var address: String? = null

        fun build(): Person =
                Person(
                        name = requireNotNull(name),
                        age = requireNotNull(age),
                        address = requireNotNull(address)
                )
    }

    companion object {
        fun build(f: Builder.() -> Unit): Person {
            val builder = Builder()
            builder.f()
            return builder.build()
        }
    }
}
