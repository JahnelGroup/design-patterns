package com.jahnelgroup.warriorfactory;

import com.jahnelgroup.armor.AbstractArmor;
import com.jahnelgroup.armor.SamuraiArmor;
import com.jahnelgroup.weapon.AbstractWeapon;
import com.jahnelgroup.weapon.Katana;

/*
 * Concrete factory that groups together classes that go together.
 * 
 */
public class SamuraiFactory implements WarriorFactory {

    @Override
    public AbstractArmor getArmor() {
        return new SamuraiArmor();
    }

    @Override
    public AbstractWeapon getWeapon() {
        return new Katana();
    }

}
