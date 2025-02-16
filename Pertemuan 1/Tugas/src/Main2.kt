class IndeksNilaiMatkul(val nilai: Int) {
    fun hitungIndeks(): String {
        return when {
            nilai in 80..100 -> "A"
            nilai in 70..79 -> "AB"
            nilai in 60..69 -> "BC"
            nilai in 50..59 -> "C"
            nilai in 40..49 -> "D"
            nilai in 0..39 -> "E"
            else -> "Nilai di luar jangkauan"
        }
    }
}

fun main(args: Array<String>) {
    if (args.isEmpty()) {
        println("Kosong Nilai harus diisi")
        return
    }

    val nilai: Int? = args[0].toIntOrNull()

    if (nilai == null) {
        println("Kosong Nilai harus diisi")
    } else {
        val indeksNilai = IndeksNilaiMatkul(nilai)
        val hasil = indeksNilai.hitungIndeks()
        println("Input: $nilai")
        println("Output: $hasil")
    }
}
