package com.epam.collections_task1;

public class InvalidInputException extends Exception {

    @Override
    public String getMessage() {
        return "\nThe range of values must exceed their number.";
    }
}
