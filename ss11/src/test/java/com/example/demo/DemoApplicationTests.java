package com.example.demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Test
    @DisplayName("Kiểm tra nạp Application Context thành công")
    void contextLoads() {
        // Kiểm tra Spring Context khởi tạo mà không phát sinh lỗi
    }

}
