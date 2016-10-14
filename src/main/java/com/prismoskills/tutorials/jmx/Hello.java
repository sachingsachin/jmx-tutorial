package com.prismoskills.tutorials.jmx;

public class Hello implements HelloMBean {

    private final String name = "hello-name"; 
    private int cacheSize = 100; 

    public void sayHello() {
        System.out.println("hello world"); 
    }

    public int add(int x, int y) {
        return x+y;
    }

    public String getName() {
        return name;
    }

    public int getCacheSize() {
        return cacheSize;
    }

    public void setCacheSize(int size) {
        this.cacheSize = size;
    }
}
