fun main(args: Array<String>) {
    //pengguna when adalah sebagai operator switch-case di bahasa pemrograman C
    //Deklarasi dan inisalisasi penggunaan when
    var x:Int = 5
    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> {
            println("x is neither 1 nor 2")
        }
    }
    x = 2
    when (x) {
        1,2 -> println("Value of X either 1,2")
        else -> {
            println("x is neither 1 nor 2")
        }
    }
}
