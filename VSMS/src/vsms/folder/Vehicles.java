
package vsms.folder;

import javax.swing.ImageIcon;


public class Vehicles {
    private int id;
    private String model,make,catagory,added_on,statuss,bought,sold_on;
    private byte[] image;
    
    public Vehicles(int id,String mo,String ma,String ca,String ad,String st,String b,String so,byte[] imag){
        this.id = id;
        this.model = mo;
        this.make = ma;
        this.catagory =ca;
        this.added_on= ad;
        this.statuss= st;
        this.bought= b;
        this.sold_on= so;
        this.image= imag;
    
}
        public int getId(){
        return this.id;
    }
    public String getModel(){
        return this.model;
    }
    public String getMake(){
        return this.make;
    }
    public String getCatagory(){
        return this.catagory;
    }
        public String getAddedOn(){
        return this.added_on;
    }
    public String getStatuss(){
        return this.statuss;
    }
        public String getBought(){
        return this.bought;
    }
    public String getSoldOn(){
        return this.sold_on;
    }
    public byte[] getMyImage(){
        return this.image;
    }
    
    
    
    
}
