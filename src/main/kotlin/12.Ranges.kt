fun main(args: Array<String>) {
    //Ranges menyediakan sebuah operator yang dapat membantu dalam sebuah angka melalui suatu itersi
    // deklrasi dan inisialisasi ranges
    val i:Int = 2
    for (j in 1..4)
        print(j) // hasil output yang akan dihasilkan "1234"
    println()
    if (i in 1..10) { // setara dengan 1 <= i && i <= 10
        println("we found your number --"+i)
    }
}