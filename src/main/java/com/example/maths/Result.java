package com.example.maths;

public class Result {

    private int mathResult;
    private String message;

    public int getMathResult() {
        return mathResult;
    }

    public Result(int mathResult, String message) {
        this.mathResult = mathResult;
        this.message = message;
    }

    public void setMathResult(int mathResult) {
        this.mathResult = mathResult;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
