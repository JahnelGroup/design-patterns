package com.jahnelgroup.singleton;

public final class Singleton {
    
    /*
     * This is the only place this class will be instantiated.
     * 
     */
    private static Singleton INSTANCE = new Singleton();
    
    private String data;
    
    /*
     * It is crucial to have private constructors. 
     * You will only be able to create a new instance from within the Singleton class.
     * 
     */
    private Singleton() { }
    
    /*
     * @return Singleton instance
     * 
     */
    public static Singleton getInstance() {
        return INSTANCE;
    }
    
    public String getData() {
        return data;
    }
    
    public void setData(String data) {
        this.data = data;
    }
    
}
