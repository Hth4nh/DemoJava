package chuong3.Slide79.model;

import chuong3.Slide79.util.Configs;

public class NhanVienFullTime extends NhanVien {
    private int ngayLamThem;
    private int loaiChucVu;

    public NhanVienFullTime(String ten) {
        super(ten);
    }

    public NhanVienFullTime(String ten, int ngayLamThem) {
        super(ten);
        this.ngayLamThem = ngayLamThem;
    }

    public void setLoaiChucVu(int loaiChucVu) {
        this.loaiChucVu = loaiChucVu;
    }

    @Override
    public String loaiNhanVien() {
        return "Nhan vien full time";
    }

    public void tinhLuong() {
        long luongCoBan = (loaiChucVu == Configs.NHAN_VIEN_LINH)
                            ? Configs.LUONG_NHAN_VIEN_FULL_TIME_LINH
                            : Configs.LUONG_NHAN_VIEN_FULL_TIME_SEP;
        luong = luongCoBan + ngayLamThem * Configs.LUONG_LAM_THEM_MOI_NGAY;
    }
}
