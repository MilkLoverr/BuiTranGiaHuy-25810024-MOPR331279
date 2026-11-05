// Họ tên: Bùi Trần Gia Huy - MSSV: 25810024
val diemTrungBinh = 8.5
val xepLoai = when (diemTrungBinh) {
    in 8.5..10.0 -> "Xuất sắc"
    in 7.0..8.4 -> "Giỏi"
    in 5.5..6.9 -> "Khá"
    in 4.0..5.4 -> "Trung bình"
    in 0.0..3.9 -> "Yếu"
    else -> "Điểm không hợp lệ"
}
println("Điểm trung bình: $diemTrungBinh")
println("Xếp loại học lực: $xepLoai")
