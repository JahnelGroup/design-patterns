package com.jahnelgroup.warriorfactory;

import static org.junit.Assert.*;

import org.junit.Test;

import com.jahnelgroup.armor.KnightArmor;
import com.jahnelgroup.armor.SamuraiArmor;
import com.jahnelgroup.weapon.Katana;
import com.jahnelgroup.weapon.LongSword;

public class WarriorFactoryTests {

    /*
     * Test that the KnightFactory class only returns objects that it knows about.
     * 
     */
    @Test
    public void shouldReturnKnightRelatedClassesWhenKnightFactoryIsCreated() {
        WarriorFactory factory = new KnightFactory();
        assertTrue(factory.getArmor().getClass().equals(KnightArmor.class));
        assertTrue(factory.getWeapon().getClass().equals(LongSword.class));
    }
    
    /*
     * Test that the SamuraiFactory class only returns objects that it knows about.
     * 
     */
    @Test
    public void shouldReturnSamuraiRelatedClassesWhenSamuraiFactoryIsCreated() {
        WarriorFactory factory = new SamuraiFactory();
        assertTrue(factory.getArmor().getClass().equals(SamuraiArmor.class));
        assertTrue(factory.getWeapon().getClass().equals(Katana.class));
    }

}
