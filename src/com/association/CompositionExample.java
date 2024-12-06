package com.association;

import java.util.List;
import java.util.ArrayList;

class Mobile1
{
    public String name;
    public String ram;
    public String rom;
    Mobile1(String name, String ram, String rom)
    {
        this.name = name;
        this.ram = ram;
        this.rom = rom;
    }
}
class MobileStore
{
    private final List<Mobile1> mobiles;
    MobileStore (List<Mobile1> mobiles)
    {
        this.mobiles = mobiles;
    }
    public List<Mobile1> getTotalMobileInStore(){
        return mobiles;
    }
}
public class CompositionExample {
    public static void main (String[] args)
    {
        Mobile1 mob1 = new Mobile1("Realme6","8GB", "128GB");
        Mobile1 mob2 = new Mobile1("SAMSUNG A21S", "4GB", "128");
        Mobile1 mob3 = new Mobile1("SAMSUNG M10", "4GB", "64GB");
        List<Mobile1> mobiles = new ArrayList<Mobile1>();
        mobiles.add(mob1);
        mobiles.add(mob2);
        mobiles.add(mob3);
        MobileStore store = new MobileStore(mobiles);
        List<Mobile1> mob = store.getTotalMobileInStore();
        for(Mobile1 mb : mob){
            System.out.println("Name : " + mb.name + " RAM :" +mb.ram + " and "
                    +" ROM : " + mb.rom);
        }
    }
}
