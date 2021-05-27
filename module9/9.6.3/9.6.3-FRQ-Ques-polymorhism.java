/*
 * Programmer: HackOlympus  
 * Date: 27 May 
 * Purpose: 9.6.3-FRQ-Ques-polymorhism  
 */ 


// removing public 

import java.util.ArrayList ; 
class ShippingItems
{
    private double weight ; 
    // static variable i.e constant
    private static double COST_PER_OZ = 1.5 ; 
    public ShippingItems(double weight){
        this.weight = weight ;  
    } 
    public double getCost(){
        return weight * 1.5  ; 
    }
}

class InsuredShippingItem extends ShippingItems
{
    private double insuredAmt ; 
    public InsuredShippingItem(double weight, double iamt){
        super(weight) ; 
        insuredAmt = iamt ; 
    }
    public double getCost() {
        return super.getCost() + insuredAmt  ;      
    }
}

class FRQ_Ques_polymorphism_test
{
    public static void main(String[] args){
        ShippingItems item = new ShippingItems(10) ; 
        System.out.println(item.getCost());
        
        ShippingItems insitem = new InsuredShippingItem(10,50) ; 
        System.out.println(insitem.getCost()) ;
        
        ArrayList<ShippingItems> itemList = new ArrayList<ShippingItems>() ; 

        double cost = 0 ; 
        itemList.add(new ShippingItems(10)) ;
        itemList.add(new InsuredShippingItem(10,20)) ; 
        
        for (int i = 0 ; i<itemList.size() ; i++) {
            cost += itemList.get(i).getCost() ; 
        }
        
        System.out.println(cost) ; 
        
        // Here enhanced for loop is better option 
        cost = 0 ; 
        for (ShippingItems s: itemList){
            cost += s.getCost() ; 
        }
        System.out.println(cost) ; 

    }
}
