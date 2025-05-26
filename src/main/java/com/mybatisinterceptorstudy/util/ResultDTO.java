package com.mybatisinterceptorstudy.util;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@Builder
@Data
public class ResultDTO<T> {
    private HttpStatus status;
    private String message;
    private T data;

    // 응답 생성 static 메서드
    public static <T> ResultDTO<T> res(HttpStatus status, String message, T data) {
        return ResultDTO.<T>builder()
                .status(status)
                .message(message)
                .data(data)
                .build();
    }


    // 성공 응답 (data 포함)
    public static <T> ResultDTO<T> ok(T data) {
        return res(HttpStatus.OK, "success", data);
    }

    // 성공 응답 (data 없음)
    public static <T> ResultDTO<T> ok() {
        return res(HttpStatus.OK, "success", null);
    }

    // BAD_REQUEST
    public static <T> ResultDTO<T> fail(String message){
        return res(HttpStatus.BAD_REQUEST, message, null);
    }

    // 실패 응답
    public static <T> ResultDTO<T> error(String message) {
        return res(HttpStatus.INTERNAL_SERVER_ERROR, message, null);
    }
}
