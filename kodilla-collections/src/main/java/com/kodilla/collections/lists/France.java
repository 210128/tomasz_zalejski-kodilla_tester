package com.kodilla.collections.lists;

public class France implements Country {
    private String language;

    public France(String language) {
        this.language = language;
    }

    @Override
    public String getLanguage() {
        return language;
    }
}
