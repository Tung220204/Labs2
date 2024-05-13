package com.poly.demo01.Buoi4;

import com.poly.demo01.Entity.SinhVien;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class PosttManApi {
    @GetMapping("/getStudentInformation")
    public ResponseEntity<?> doGetStudentInformation(SinhVien sinhvien) {
        Map<String, Object> result = new HashMap<>();
        result.put("message", "Call api success");
        result.put("status", true);
        result.put("data", sinhvien);
        return ResponseEntity.ok(result);
    }
}
