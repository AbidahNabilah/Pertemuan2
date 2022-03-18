fun main(args: Array<String>) {
    // Deklarasi dan Inisialisai array
    val x: IntArray = intArrayOf(1,2,3)
    x[0] = x[1] + x[2]
    x.forEach { print(it.toString()+' ')  }
    print('\n')

    //Array dengan tipe Interger dengan ukuran nilai 5
    val byteArray = ByteArray(5)
    byteArray.forEach { print(it.toString()+ ' ') }
    print('\n')

    //menginsialisasi nilai dalam array dengan konstanta
    val shortArray = ShortArray(5) {42}
    shortArray.forEach { print(it.toString()+' ') }
    print('\n')

    // menginisialisasi nilai dalam array menggunakan lambda
    var intArray = IntArray(5) {it * 1}
    intArray.forEach { print(it.toString()+ ' ') }
    print('\n')
}