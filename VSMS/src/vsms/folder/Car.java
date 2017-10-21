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
public class Car {
    
    private int id;
    private String modelName,manufacturerName,description;
    
    public Car(int id,String mod,String manu,String des){
        this.id = id;
        this.modelName = mod;
        this.manufacturerName = manu;
        this.description= des;
     
    }
    
    public int getId(){
        return this.id;
    }
    public String getModelName(){
        return this.modelName;
    }
    public String getManufacturerName(){
        return this.manufacturerName;
    }
    public String getDescription(){
        return this.description;
    }

    
}
