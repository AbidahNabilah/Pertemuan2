fun main(args: Array<String>) {
    /*
    cara alin untuk menulis fungsi dikotlin agar lebih ringkas
    jika terdapar kondisi yangbisa menghilangkan return statement, blok program
    dan return type secara bersamaan
     */
    println("Max value from max function = ${max(4,7)}")
    println("Max value from newMax function = ${newMax(3,5)}")
    }
    fun max(a: Int, b:Int): Int {
        val maxValue = if(a > b) a else b
        return maxValue
    }
    fun newMax(a: Int, b:Int) : Int = if(a > b) a else b
