interface First {

    fun one()
}

interface Seconed : First {
    fun two()
}


class Clss: Seconed{

    override fun one() {
        println("Inheritance from the first interface ")
    }

    override fun two() {
        println("Inheritance from the seconed interface")
    }
}

fun main( ) {
    val ob = Clss()

    ob.one()
    ob.two()
}