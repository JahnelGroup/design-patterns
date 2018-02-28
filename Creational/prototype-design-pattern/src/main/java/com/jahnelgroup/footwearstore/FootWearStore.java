package com.jahnelgroup.footwearstore;

import java.util.HashMap;
import java.util.Map;

import com.jahnelgroup.footwear.Boots;
import com.jahnelgroup.footwear.FlipFlops;
import com.jahnelgroup.footwear.FootWear;
import com.jahnelgroup.footwear.Sneakers;

/*
 * This class is in charge of keeping a cache of what you can clone.
 * 
 */
public class FootWearStore {

    /*
     * This map will contain all of the cloneable footwear.
     * You are able to add more FootWear dynamically to clone since it is not final.
     * 
     */
    private static Map<Long , FootWear> footWearCache = new HashMap<>();
    
    /*
     * Make Clone of FootWear whose id is equal to @param id.
     * 
     */
    public static FootWear getFootWear(Long id) {
        return footWearCache.get(id).clone();
    }
    
    /*
     * This method is loading the cache of FootWear to clone.
     * 
     */
    public static void loadInventory() {
        footWearCache.put(1l, new Sneakers(1l, "Red"));
        footWearCache.put(2l, new FlipFlops(2l, "Black"));
        footWearCache.put(3l, new Boots(3l, "Brown"));
    }
    
}
