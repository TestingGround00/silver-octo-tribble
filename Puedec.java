

import java.lang.*;
import java.util.*;

public class Puedec {
        
    private int Puedec_size;
    private int Puedec_size_fill_count;
    
    // doesn't work, sizes to  [0]. When I give it N, get NullPointerException.
    private Pue [] pue_ArrayList  = new Pue [getCapacity()]; 

    //private ArrayList<Pue> pue_ArrayList = new ArrayList<Pue>(getCapacity());// <---- Arraylist works

    
    public Puedec() {
        
        this(20);
        
    }
    
    public Puedec(int capacity) {
        
        Puedec_size = capacity;
        
    }
    
    public int getSize() {
        
        return Puedec_size_fill_count;
        
    }
    
    public int getCapacity() {
        
        return Puedec_size;
        
    }

    public boolean addPue(String spa) {
        
        if(getSize() == getCapacity()) {
            
            System.out.println("Error");
            
            return false;
            
        }else {
            for(Pue p : pue_ArrayList) {
                
                if(p.getSpa().contains(spa)) {
                    
                    System.out.println("Error");
                    
                    return false;
                }
                
            }
            
            
            pue_ArrayList[Puedec_size_fill_count] = new Pue(spa); 
            
            //pue_ArrayList.add(new Pue(spa)); // <---- adds object as expected

            ++Puedec_size_fill_count;
            return true;
         }  
        
    }


}
