package com.jahnelgroup.singleton;

public final class ThreadSafeSingleton {

    private static volatile ThreadSafeSingleton instance = null;
    
    /*
     * It is crucial to have private constructors. 
     * You will only be able to create a new instance from within the Singleton class.
     * 
     */
    private ThreadSafeSingleton() { }
    
    /*
     * Create ThreadSafeSingleton if instance is null within a synchronized code block.
     * This ensures that 1 ThreadSafeSingleton is being created throughout all threads.
     * @return ThreadSafeSingleton instance
     * 
     */
    public static ThreadSafeSingleton getInstance() {
        if(instance == null) {
            synchronized(ThreadSafeSingleton.class){
                if(instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}
