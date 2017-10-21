
package vsms.folder;


public class Menufacturer {
    private int id;
    private String manufacturer_name;
    
    public Menufacturer(int id,String m){
        this.id = id;
        this.manufacturer_name = m;
    }
    
        public int getId(){
        return this.id;
    }
    public String getManufacturerName(){
        return this.manufacturer_name;
    }
    
}
