package com.itheima.d1_exception;

/**
 * @author : 王希辰
 * @date : 2023/3/4 11:05
 */
public class AgeOutBoundsException extends Exception{
// public class AgeOutBoundsException extends RuntimeException{
    public AgeOutBoundsException() {
    }

    public AgeOutBoundsException(String message) {
        super(message);
    }

    public AgeOutBoundsException(String message, Throwable cause) {
        super(message, cause);
    }

    public AgeOutBoundsException(Throwable cause) {
        super(cause);
    }

    public AgeOutBoundsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
