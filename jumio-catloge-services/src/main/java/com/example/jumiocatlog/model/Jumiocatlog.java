package com.example.jumiocatlog.model;

public class Jumiocatlog {

    private String name;
    private String type;
    private String rating;

    public Jumiocatlog(){
        this.name = name;
        this.type = type;
        this.rating = rating;
    }

    public void setName(String name) { this.name = name; }
    public String getName() { return name; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getRating() { return rating; }
    public void setRating(String rating) { this.rating = rating; }
}
