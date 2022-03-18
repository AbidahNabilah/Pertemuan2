fun main(args: Array<String>) {
    // Deklrasi dan Inisialisasi Variabel Array
    var arrA =arrayOf<Int>()
    arrA += 34
    println(arrA[0])

    var arrB = arrayOf<Int>()
    for (i in 1..10) {
        arrB += i
    }

    for (i in arrB){
        print("$i")
    }

    // membuat array string dengan ukuran 5 dan nilai ['0', '1', '4', '9', '16']
    // berikut contoh pembuatan array berdasarkan template array standart kotlin
    val asc = Array(5){
        i -> (i * i).toString()
    }
    asc.forEach { println(it) }
}