package com.example.urlhitcounter.model;

public class Visitors {
    private int count;
    private String name;

    public Visitors(int count,String name) {
        this.count = count;
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //    @Override
//    public String toString() {
//        return "Visitors{" +
//                "Visitors=" + count +
//                '}';
//    }
}
