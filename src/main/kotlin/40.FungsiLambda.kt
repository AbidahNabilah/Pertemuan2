fun main(args: Array<String>) {
    println(MyFunction("Rekayasa Perangkat Lunak"))
    // deklarasi dan inisialisasi penggunaan lambda
    val mylambda :(String)->Unit = {s:String->print(s)}
    val v:String = "Jurusan Teknik Informatika"
    mylambda(v)
    //fungsi inline
    myFun(v,mylambda) //melewati lambda sebagai parameter fungsi lain
}
fun MyFunction(x: String): String {
    var c:String = "yooo!! Welcome To ---"
    return (c+x)
}
fun myFun(a:String, action:(String)->Unit) {
    print("\nHeyyy!!!")
    action(a)// memanggil fungsi lambda
}
