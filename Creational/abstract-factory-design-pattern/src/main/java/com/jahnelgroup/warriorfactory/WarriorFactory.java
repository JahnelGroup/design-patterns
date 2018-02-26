package com.jahnelgroup.warriorfactory;

import com.jahnelgroup.armor.AbstractArmor;
import com.jahnelgroup.weapon.AbstractWeapon;

/*
 * Abstract Factory that declares operations that create abstract warrior tools.
 * 
 */
public interface WarriorFactory {
    
    /*
     * @return class that implements AbstractArmor
     * 
     */
    public AbstractArmor getArmor();
    
    /*
     * @return class that implements AbstractWeapon
     * 
     */
    public AbstractWeapon getWeapon();
    
}
