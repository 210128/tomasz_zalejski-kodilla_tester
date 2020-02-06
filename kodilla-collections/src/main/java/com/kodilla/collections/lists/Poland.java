package com.kodilla.collections.lists;

public class Poland implements Country {
    private String language;

    public Poland(String language) {
        this.language = language;
    }

    @Override
    public String getLanguage() {
        return language;
    }
}
