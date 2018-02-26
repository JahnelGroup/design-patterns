package com.jahnelgroup.warriorfactory;

import com.jahnelgroup.armor.AbstractArmor;
import com.jahnelgroup.armor.KnightArmor;
import com.jahnelgroup.weapon.AbstractWeapon;
import com.jahnelgroup.weapon.LongSword;

/*
 * Concrete factory that groups together classes that go together.
 * 
 */
public class KnightFactory implements WarriorFactory {

    @Override
    public AbstractArmor getArmor() {
        return new KnightArmor();
    }

    @Override
    public AbstractWeapon getWeapon() {
        return new LongSword();
    }

}
