fun main(args: Array<String>) {
    // eksepsi merupakan teknik menghalangi aplikasi kita memberikan output yang salah saat runtime
    // semua eksepsi adalah turunan Throwable
    try {
        val myVar:Int = 10;
        val v:String = "Rekayasa Perangkat Lunak";
        v.toInt();
    } catch(e:Exception) {
        e.printStackTrace()
    } finally {
        println("Exception Handeling in Kotlin");
    }
}