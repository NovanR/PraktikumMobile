class PersegiPanjang(val height: Int, val width: Int) {
    fun rumusluas(): Int {
        return height * width
    }

    fun rumuskeliling(): Int {
        return (height + width) * 2
    }

}


fun main() {
    val panjang = 4
    val lebar = 2

    val persegipanjang = PersegiPanjang(panjang, lebar)

    println("Panjang: $panjang")
    println("Lebar: $lebar")

    val luas = persegipanjang.rumusluas()
    println("Luas: $luas")

    val keliling = persegipanjang.rumuskeliling()
    println("Keliling: $keliling")
}