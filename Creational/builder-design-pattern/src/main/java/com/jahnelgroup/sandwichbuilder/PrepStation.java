package com.jahnelgroup.sandwichbuilder;

import com.jahnelgroup.sandwich.Ingredient;
import com.jahnelgroup.sandwich.Sandwich;

import java.util.ArrayList;
import java.util.List;

/*
    Concrete implementation of a SandwichBuilder.
    This class knows how to build a sandwich and will build one with the ingredients that are requested.
 */
public class PrepStation implements SandwichBuilder {


    private Ingredient bread;
    private List<Ingredient> meats = new ArrayList<>();
    private List<Ingredient> vegs = new ArrayList<Ingredient>();
    private List<Ingredient> conds = new ArrayList<Ingredient>();

    @Override
    public SandwichBuilder bread(Ingredient bread) {
        this.bread = bread;
        return this;
    }

    @Override
    public SandwichBuilder meat(Ingredient meat) {
        meats.add(meat);
        return this;
    }

    @Override
    public SandwichBuilder veg(Ingredient veg) {
        vegs.add(veg);
        return this;
    }

    @Override
    public SandwichBuilder cond(Ingredient cond) {
        conds.add(cond);
        return this;
    }

    /*
        This method will build the sandwich with all the ingredients specified by the Customer.
     */
    @Override
    public Sandwich build() {
        Sandwich s = new Sandwich();
        if(this.bread != null){
            s.addLayer(this.bread);
        }
        for(Ingredient m : this.meats) { s.addLayer(m);}
        for(Ingredient v : this.vegs) { s.addLayer(v);}
        for(Ingredient c : this.conds) { s.addLayer(c);}
        if(this.bread != null){
            s.addLayer(this.bread);
        }
        return s;
    }
}
