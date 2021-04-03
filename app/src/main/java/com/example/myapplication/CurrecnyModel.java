package com.example.myapplication;

/**
 * Created by DieHard_04 on 03-04-2021.
 */
public class CurrecnyModel {

    private String name;
    private String currancyName;
    private String callingCodes;
    private String id;


//    public CurrecnyModel(String name, String currancyName, String callingCodes, String id) {
//        this.name = name;
//        this.currancyName = currancyName;
//        this.callingCodes = callingCodes;
//        this.id = id;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrancyName() {
        return currancyName;
    }

    public void setCurrancyName(String currancyName) {
        this.currancyName = currancyName;
    }

    public String getCallingCodes() {
        return callingCodes;
    }

    public void setCallingCodes(String callingCodes) {
        this.callingCodes = callingCodes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
