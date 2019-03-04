package com.example.recyclerview;

public class Book {
    private String Title, Category, Description;
    private int Thumbnail;

    public Book() {

    }

    public Book(String title, String category, String description, int thumbnail) {
        Title = title;
        Category = category;
        Description = description;
        Thumbnail = thumbnail;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }
}
