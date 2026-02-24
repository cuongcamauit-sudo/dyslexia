package com.uth.dyslexia.controller;

import com.uth.dyslexia.dto.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 *
 * <p>Mô tả chi tiết:</p>
 *
 * @param
 * @author DanielDanzel
 * @version 1.0
 * @return
 * @throws
 * @since 2/24/2026
 */
@RestController
@RequestMapping("/admin")
public class AdminController {
    @GetMapping("/data")
    public ResponseEntity<Response> adminOnly() {
        return ResponseEntity.ok(
                Response.builder()
                        .message("Admin Only")
                        .build()
        );
    }
}
