/*fun main(args: Array<String>) {
    var number = 15
    number = null   // ini akan menyebabkan kesalahan
}*/
fun main(args: Array<String>) {
    var maybeNumber: Int? = 5 // gunakan tanda ? untuk memberikan nilai null pada variabel dan diakhiri dengan tipe data
    maybeNumber = null
    println("maybeNumber: $maybeNumber ${maybeNumber?.hashCode()}")
}