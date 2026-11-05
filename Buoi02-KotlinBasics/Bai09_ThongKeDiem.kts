// Họ tên: Bùi Trần Gia Huy - MSSV: 25810024
val diemSV = arrayOf(7.5, 8.0, 6.0, 9.5, 4.5, 5.5, 10.0, 6.5, 7.0, 8.5)
var tongDiem = 0.0
var diemMax = diemSV[0]
var diemMin = diemSV[0]

for (diem in diemSV) {
    tongDiem += diem
    if (diem > diemMax) {
        diemMax = diem
    }
    if (diem < diemMin) {
        diemMin = diem
    }
}
val diemTrungBinh = tongDiem / diemSV.size
println("Điểm trung bình của lớp: $diemTrungBinh")
println("Điểm cao nhất: $diemMax")
println("Điểm thấp nhất: $diemMin")