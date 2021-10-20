package com.example.android3;

public class Country {
    private int flags;
    private String country;
    private String city;
    private int id;

    public int getId() {
        return id;
    }

    public Country(int image, String country, String city, int id) {
        this.flags = image;
        this.country = country;
        this.city = city;
        this.id = id;

    }

    public Country(int flags, String country, String city) {
        this.flags = flags;
        this.country = country;
        this.city = city;
    }

    public int getFlags() {
        return flags;
    }

    public void setFlags(int flags) {
        this.flags = flags;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
