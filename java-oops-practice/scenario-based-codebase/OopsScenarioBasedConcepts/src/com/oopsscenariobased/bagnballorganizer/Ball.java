package com.oopsscenariobased.bagnballorganizer;

/* Ball Class */
class Ball implements Storable {
	
	//attributes
    private String id;
    private String color;
    private String size; 

    //constructor
    public Ball(String id, String color, String size) {
        this.id = id;
        this.color = color;
        this.size = size;
    }

    //getters and setter
    public String getId() {
        return id;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    ///overriding method of interface to display ball details
    @Override
    public String toString() {
        return "Ball[ID=" + id + ", Color=" + color + ", Size=" + size + "]";
    }
}