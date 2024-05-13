package com.poly.demo01.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SinhVien {
    private String MaSV;
    private String Ten;
    private int Tuoi;
    private String QueQuan;
    private String Lop;
    private String DiaChi;
}
