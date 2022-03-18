fun main(args: Array<String>) {
    //panggil tanpa argumen
    connectToDb()
    println()
    //panggil dengan 2 argumen
    connectToDb("sqlserver", "depandi")
}
    /*
    parameter juga bisa memiliki nilai default yang membolehkan fungsi untuk menghilangkan
    beberapa argumen ketika dipanggil
     */
fun connectToDb(hostname: String = "localhost",
                username: String = "mysql",
                password:String = "secret") {
    println("hostname : $hostname")
    println("username : $username")
    println("password : $password")
}
