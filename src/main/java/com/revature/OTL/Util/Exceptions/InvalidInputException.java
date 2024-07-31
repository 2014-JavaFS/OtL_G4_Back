package com.revature.otl.Util.Exceptions;

public class InvalidInputException extends RuntimeException{
    public InvalidInputException(String message){
        super(message); // the constructor from the inherited class above
    }
}
