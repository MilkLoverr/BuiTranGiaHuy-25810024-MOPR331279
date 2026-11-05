// Họ tên: Bùi Trần Gia Huy - MSSV: 25810024

    val soLuong: Int = 3
    val donGia: Double = 45000.0

    val tienHang = soLuong.toDouble() * donGia
    val thue = tienHang * 0.08
    val tongTien = tienHang + thue

    println("Số lượng sản phẩm: $soLuong")
    println("Đơn giá: $donGia VNĐ")
    println("Tiền hàng: $tienHang VNĐ")
    println("Thuế (8%): $thue VNĐ")
    println("Tổng tiền phải trả: $tongTien VNĐ")
