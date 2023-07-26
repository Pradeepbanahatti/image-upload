package com.imageupload.exception;

import org.springframework.http.HttpStatus;

public class ImageUloadExceptions extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = 5080258806642169279L;

    public ImageUloadExceptions(String msg, HttpStatus statusCode) {

    }

    public static final class InvalidUserException extends RuntimeException {
        private static final long serialVersionUID = 1L;
        //private HttpStatus statusCode;
        public InvalidUserException(String msg) {
            super(msg);
        }
    }
}
