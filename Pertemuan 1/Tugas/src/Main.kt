class PersegiPanjang(val height: Int, val width: Int) {
    fun rumusLuas(): Int {
        return height * width
    }

    fun rumusKeling(): Int {
        return (height + width) * 2
    }
}

fun main(args: Array<String>) {
    val panjang = args[0].toInt()
    val lebar = args[1].toInt()

    val persegiPanjang = PersegiPanjang(panjang, lebar)
    val luas = persegiPanjang.rumusLuas()
    val kelling = persegiPanjang.rumusKeling()

    println("Panjang: $panjang")
    println("Lebar: $lebar")
    println("Luas: $luas")
    println("Kelling: $kelling")
}
