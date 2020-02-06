package com.kodilla.collections.lists;

public class Germany implements Country {
    private String language;

    public Germany(String language) {
        this.language = language;
    }

    @Override
    public String getLanguage() {
        return language;
    }
}
