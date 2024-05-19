/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Lily
 */
public class Manga {
    private int id;
    private String nombre;
    private String path;
    private ArrayList<Tag> tags;
    private int demografia;
    private int type;
    
    public Manga(){
        this.id=0;
        this.nombre = "";
        this.path = "";
        this.tags = new ArrayList<>();
        this.type = 0;
        this.demografia = 0;
    }
    public Manga(int id, String name, String path, ArrayList<Tag> tags, int type, int demografia){
        this.id = id;
        this.nombre = name;
        this.path = path;
        this.tags = tags;
        this.type = type;
        this.demografia = demografia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public ArrayList<Tag> getTags() {
        return tags;
    }

    public void setTags(ArrayList<Tag> tags) {
        this.tags = tags;
    }

    public int getDemografia() {
        return demografia;
    }

    public void setDemografia(int demografia) {
        this.demografia = demografia;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
    
}
