package com.jahnelgroup.phonefactory;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.jahnelgroup.phone.ApplePhone;
import com.jahnelgroup.phone.SamsungPhone;

/*
 * Testing that the Factory method is returning classes specific to the subclass of the concrete factory used.
 * 
 */
public class PhoneFactoryTests {

    @Test
    public void shouldReturnSamsungPhoneWhenCreatingASamsungPhoneFactory() {
        PhoneFactory factory = new SamsungFactory();
        //Checks to see if the class of the Phone returned is SamsungPhone.
        assertTrue(factory.makePhone().getClass().equals(SamsungPhone.class));
    }
    
    @Test
    public void shouldReturnApplePhoneWhenCreatingAApplePhoneFactory() {
        PhoneFactory factory = new AppleFactory();
        //Checks to see if the class of the Phone returned is ApplePhone.
        assertTrue(factory.makePhone().getClass().equals(ApplePhone.class));
    }

}
