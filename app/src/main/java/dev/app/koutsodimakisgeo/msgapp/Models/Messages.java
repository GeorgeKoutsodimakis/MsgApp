package dev.app.koutsodimakisgeo.msgapp.Models;

import java.util.ArrayList;

/**
 * Created by koutsodimakisgeo on 09-Oct-17.
 */

public class Messages {

    private ArrayList<Message> messages;

    public Messages() {

    }

    public ArrayList<Message> getMessages() {
        return messages;
    }

    public void setMessages(ArrayList<Message> messages) {
        this.messages = messages;
    }
}