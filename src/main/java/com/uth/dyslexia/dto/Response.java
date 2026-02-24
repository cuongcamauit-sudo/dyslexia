package com.uth.dyslexia.dto;


import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.Date;

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
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)

@JsonPropertyOrder({
        "success",
        "status",
        "message",
        "body",
        "token",
        "timestamp"
})
public class Response {
    @Builder.Default
    Boolean success = true;
    @Builder.Default
    Integer status = 200;
    @Builder.Default
    String message = null;
    @Builder.Default
    Object body = null;
    @Builder.Default
    String token = null;
    @Builder.Default
    Date timestamp = new Date();
}

