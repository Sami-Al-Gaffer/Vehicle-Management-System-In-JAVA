/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vsms.folder;

/**
 *
 * @author SAMI
 */
public class SoldVehicles {
    private int id;
    private String firstName,lastName,email,mobile,model,make,price,sold,profit,dateOfSale,warrantyEnd,insurance,engine;
    
    
     public SoldVehicles(int id,String fn,String ln,String email,String mo,String mod,String ma,String p,String so,String pr,String d,String w,String i,String e){
        this.id = id;
        this.firstName = fn;
        this.lastName= ln;
        this.email = email;
        this.mobile= mo;
        this.model = mod;
        this.make = ma;
        this.price = p;
        this.sold = so;
        this.profit= pr;
        this.dateOfSale = d;
        this.warrantyEnd = w;
        this.insurance = i;
        this.engine = e;
    
}
     public String getEmail(){
         return this.email;
     }
     public String getDateOfSale(){
         return this.dateOfSale;
     }
     public String getWarrantyEnd(){
         return this.warrantyEnd;
     }
     public String getInsurance(){
            return this.insurance;
        }
     public String getEngine(){
            return this.engine;
        }
     
        public int getId(){
        return this.id;
    }
        public String getFirstName(){
            return this.firstName;
        }
        
        public String getLastName(){
            return this.lastName;
        }
        
        public String getMobile(){
            return this.mobile;
        }
        public String getModel(){
            return this.model;
        }
        public String getMake(){
            return this.make;
        }
        public String getPrice(){
            return this.price;
        }
        public String getSold(){
            return this.sold;
        }
        public String getProfit(){
            return this.profit;
        }
        
        
}

