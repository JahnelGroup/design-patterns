package com.jahnelgroup.phonefactory;

import com.jahnelgroup.phone.ApplePhone;
import com.jahnelgroup.phone.Phone;

/*
 * 1 of the concrete factories available to use.
 * 
 */
public class AppleFactory implements PhoneFactory {

    /*
     * Here we have the Factory method return a ApplePhone.
     * 
     */
    @Override
    public Phone makePhone() {
        return new ApplePhone();
    }

}
