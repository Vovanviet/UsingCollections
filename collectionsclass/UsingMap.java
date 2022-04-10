package com.collectionsclass;

import java.util.*;

public class UsingMap {
    private static final String[] names={"Mercury","Venus","Earth","Mars","Jupiter","Saturn","Uranus","Neptune","Pluto"};
    private static final float[] diameters={4800f,12103.36f,3456.6f,3455f,3456.543f,345543f,334566f,27532f,34627f};

    public static void main(String[] args) {
//        Map planets=new HashMap();
//        Map planets=new LinkedHashMap();
        Map planets=new TreeMap();

        for (int i=0;i< names.length;i++)
            planets.put(names[i],diameters[i]);
        Iterator it=planets.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry e=(Map.Entry)it.next();
            System.out.println(e.getKey()+": "+e.getValue());
        }
        System.out.println("-----------------------------------");
        while (true){
            System.out.print("Find planet (ENTER to quit: ");
            String name=(new Scanner(System.in)).nextLine();
            if (name.length()==0)break;
            if (!planets.containsKey(name))
                System.out.println("Planet "+name+" not found!");
            else
                System.out.println("The diameter of "+name+" is "+planets.get(name));
        }
    }

}
