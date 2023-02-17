package com.coleen.springbt.errorhandling;

public class DepartmentNotFoundException extends Exception{

    public DepartmentNotFoundException(String message) {
        super(message);
    }

}
