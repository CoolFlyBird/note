package com.unual.note.dto;


public class Result<T> {
    private boolean success;
    private String error;
    private T data;

    public Result(T data) {
        this.success = true;
        this.data = data;
    }

    public Result(String error) {
        this.success = false;
        this.error = error;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "{success=" + success + ", data=" + data + ", error=" + error + "}";
    }
}
