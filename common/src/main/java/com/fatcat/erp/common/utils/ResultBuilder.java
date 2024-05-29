package com.fatcat.erp.common.utils;


import com.fatcat.erp.common.entity.ApiResponse;

import java.time.LocalDateTime;

public class ResultBuilder {

    public static <T> ApiResponse<T> success(String message, T data){
        return new ApiResponse<>(200, message, data, LocalDateTime.now());
    }

    public static <T> ApiResponse<T> success(T data){
        return success("success", data);
    }

    public static <T> ApiResponse<T> success(String message){
        return success(message, null);
    }

    public static <T> ApiResponse<T> success() {
        return success("success!", null);
    }


}
