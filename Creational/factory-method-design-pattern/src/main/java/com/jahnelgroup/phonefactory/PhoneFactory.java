package com.jahnelgroup.phonefactory;

import com.jahnelgroup.phone.Phone;

/*
 * Interface that user interacts with to create make a phone.
 * 
 */
public interface PhoneFactory {
    
    /*
     * This method is the Factory Method being used in this example.
     * It will return a type of Phone depending on what subclass the user uses.
     * 
     */
    public Phone makePhone();
    
}
