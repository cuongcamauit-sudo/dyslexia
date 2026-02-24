package com.uth.dyslexia.request;

import lombok.Getter;
import lombok.Setter;

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
@Setter
@Getter
public class LoginRequest {
    private String username;
    private String password;
}
