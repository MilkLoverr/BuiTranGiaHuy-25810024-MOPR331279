// Họ tên: Bùi Trần Gia Huy - MSSV: 25810024
var a = 0
var b = 1
var index = 0

println("Dãy số Fibonacci nhỏ hơn 100:")
while (a < 100) {
    println("Vị trí $index: $a")
    val sum = a + b
    a = b
    b = sum
    index++
}