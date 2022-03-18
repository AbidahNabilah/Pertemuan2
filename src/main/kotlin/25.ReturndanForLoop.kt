fun main(args: Array<String>) {
    returnLoop()
}
// return berguna untuk keluar dari fungsi dan mengembalikan suatu nilai kepda pemanggil fungsi
fun returnLoop() {
    var x: Int
    println("Example of return in For-Loop")
    for (x in 1..10) {
        if (x < 5) {
            print("${x - 1} ")
        } else {
            return
        }
        print("$x ")
    }
    print("Tidak akan pernah dieksekusi")
}