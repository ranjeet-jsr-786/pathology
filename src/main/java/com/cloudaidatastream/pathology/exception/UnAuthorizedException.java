package com.cloudaidatastream.pathology.exception;

/**
 * Created by Hi on 04-02-2018.
 */
public class UnAuthorizedException extends Exception {

    private static final long serialVersionUID = 1L;

    public UnAuthorizedException(String message) {
        super(message);
    }

}