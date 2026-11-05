// Họ tên: Bùi Trần Gia Huy - MSSV: 25810024
val canNang = 65.0 // kg
val chieuCao = 1.75 // mét
val bmi = canNang / (chieuCao * chieuCao)
val phanLoai = if (bmi < 18.5) {
    "Gầy"
} else if (bmi < 25.0) {
    "Bình thường"
} else if (bmi < 30.0) {
    "Thừa cân"
} else {
    "Béo phì"
}

println("Chỉ số BMI của bạn: $bmi")
println("Phân loại: $phanLoai")