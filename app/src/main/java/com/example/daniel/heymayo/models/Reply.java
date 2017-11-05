package com.example.daniel.heymayo.models;

import com.google.firebase.database.Exclude;
import com.google.firebase.database.IgnoreExtraProperties;
import com.google.firebase.database.ServerValue;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jsayler on 11/5/17.
 */
@IgnoreExtraProperties
public class Reply {

    public String uid;
    public String author;
    public String title;
    public String body;
    //public int karmaCount = 0;
    //public Map<String, Boolean> karmaPoints = new HashMap<>();

    public Reply() {}

    public Reply(String uid, String body) {
        this.uid = uid;
        this.body = body;
    }

    @Exclude
    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("uid", uid);
        //result.put("author", author);
        result.put("body", body);
        //result.put("starCount", starCount);
        //result.put("stars", stars);

        return result;
    }
}
