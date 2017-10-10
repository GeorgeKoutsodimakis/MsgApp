package dev.app.koutsodimakisgeo.msgapp.Models;

import com.google.gson.annotations.SerializedName;

import retrofit2.http.Body;

/**
 * Created by koutsodimakisgeo on 09-Oct-17.
 */

public class Result {
    @SerializedName("error")
    private Boolean error;

    @SerializedName("message")
    private String message;

    @SerializedName("user")
    private User user;

    public Result(Boolean error, String message, User user) {
        this.error = error;
        this.message = message;
        this.user = user;
    }

    public Boolean getError() {
        return error;
    }

    public String getMessage() {
        return message;
    }

    public User getUser() {
        return user;
    }
}