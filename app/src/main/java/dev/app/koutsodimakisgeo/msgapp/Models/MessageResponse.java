package dev.app.koutsodimakisgeo.msgapp.Models;

/**
 * Created by koutsodimakisgeo on 09-Oct-17.
 */


public class MessageResponse {
    private boolean error;
    private String message;

    public MessageResponse() {

    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}