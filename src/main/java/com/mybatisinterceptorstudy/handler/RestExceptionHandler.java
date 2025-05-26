package com.mybatisinterceptorstudy.handler;

import com.mybatisinterceptorstudy.util.ResultDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler {

    // NullPointerException 처리 예시
    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<ResultDTO<Void>> handleNullPointerException(NullPointerException ex) {
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(ResultDTO.fail("Null Pointer Exception : " + ex.getMessage()));
    }

    // IllegalArgumentException 처리 예시
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<ResultDTO<Void>> handleIllegalArgumentException(IllegalArgumentException ex) {
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(ResultDTO.fail("Illegal Argument Exception : " + ex.getMessage()));
    }

    // 모든 예외 처리
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ResultDTO<Void>> handleGeneralException(Exception ex) {
        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(ResultDTO.error("Internal Server Error: " + ex.getMessage()));
    }

}