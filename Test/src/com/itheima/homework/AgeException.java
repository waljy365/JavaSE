package com.itheima.homework;

/**
 * @author : 王希辰
 * @date : 2023/3/4 20:18
 */
public class AgeException extends RuntimeException {
    public AgeException() {
    }

    public AgeException(String message) {
        super(message);
    }
}
