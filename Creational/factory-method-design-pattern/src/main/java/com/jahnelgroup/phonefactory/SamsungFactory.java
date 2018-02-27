package com.jahnelgroup.phonefactory;

import com.jahnelgroup.phone.Phone;
import com.jahnelgroup.phone.SamsungPhone;

/*
 * 1 of the concrete factories available to use.
 * 
 */
public class SamsungFactory implements PhoneFactory {

    /*
     * Here we have the Factory method return a SamsungPhone.
     * 
     */
    @Override
    public Phone makePhone() {
        return new SamsungPhone();
    }

}
