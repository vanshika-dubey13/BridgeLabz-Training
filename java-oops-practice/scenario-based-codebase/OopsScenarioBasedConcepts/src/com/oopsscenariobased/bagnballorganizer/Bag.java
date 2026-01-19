package com.oopsscenariobased.bagnballorganizer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


class Bag implements Storable {
	
	//attributes
    private String id;
    private String color;
    private int capacity;
    private List<Ball> balls;

    //constructor
    public Bag(String id, String color, int capacity) {
        this.id = id;
        this.color = color;
        this.capacity = capacity;
        this.balls = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    //method to add ball in bag
    public boolean addBall(Ball ball) {
        if (balls.size() >= capacity) {
            return false;
        }
        balls.add(ball);
        return true;
    }

    //method to remove ball from bag
    public boolean removeBall(String ballId) {
        Iterator<Ball> it = balls.iterator();
        while (it.hasNext()) {
            Ball b = it.next();
            if (b.getId().equals(ballId)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    //method to display balls in bag
    public void displayBalls() {
        if (balls.isEmpty()) {
            System.out.println("No balls in this bag.");
            return;
        }
        for (Ball b : balls) {
            System.out.println(b);
        }
    }

    //method to return total number of balls in bag
    public int getBallCount() {
        return balls.size();
    }

    //displaying details
    @Override
    public String toString() {
        return "Bag[ID=" + id + ", Color=" + color +
               ", Capacity=" + capacity +
               ", Balls=" + balls.size() + "]";
    }
}