package com.example.Proyecto4;

import java.io.Serializable;

public class Usuario implements Serializable {
    private static final long serialVersionUID= 1L;

    private String name;
    private String date;
    private String Description;
    private String img;

    public Usuario(String name, String date, String Description, String img){
        this.name = name;
        this.date = date;
        this.Description = Description;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", Description='" + Description + '\'' +
                ", img='" + img + '\'' +
                '}';
    }
}
