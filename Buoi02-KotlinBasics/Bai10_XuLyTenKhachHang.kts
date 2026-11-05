// Họ tên: Bùi Trần Gia Huy - MSSV: 25810024
val tenHopLe: String? = "Nguyễn Văn A"
val tenRong: String? = null

println("--- 1. Sử dụng Safe Call (?.) ---")
println("Độ dài tên hợp lệ: ${tenHopLe?.length}")
println("Độ dài tên rỗng: ${tenRong?.length}")
println("\n--- 2. Sử dụng toán tử Elvis (?:) ---")
val tenHienThi1 = tenRong ?: "Khách vãng lai"
println("Tên sau khi áp dụng Elvis cho biến null: $tenHienThi1")
println("\n--- 3. Sử dụng toán tử Not-null assertion (!!) ---")
val doDaiThucTe = tenHopLe!!.length
println("Độ dài dùng (!!): $doDaiThucTe")

// nếu bỏ comment Đoạn dưới đây và chạy với tenRong sẽ crash ứng dụng:
// val loiCrash = tenRong!!.length
