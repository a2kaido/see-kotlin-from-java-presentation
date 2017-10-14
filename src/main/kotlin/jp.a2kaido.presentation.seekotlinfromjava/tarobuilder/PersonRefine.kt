package jp.a2kaido.presentation.seekotlinfromjava.tarobuilder

data class PersonRefine(
        val name: String,
        val age: Int,
        val address: String
) {
    class Builder {
        var name: String? = null
        var age: Int? = null
        var address: String? = null

        fun build(): PersonRefine =
                PersonRefine(
                        name = requireNotNull(name),
                        age = requireNotNull(age),
                        address = requireNotNull(address)
                )
    }

    companion object {
        @JvmStatic
        fun build(f: Builder.() -> Unit): PersonRefine {
            val builder = Builder()
            builder.f()
            return builder.build()
        }
    }
}