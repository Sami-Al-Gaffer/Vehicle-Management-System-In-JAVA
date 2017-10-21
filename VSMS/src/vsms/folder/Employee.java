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
public class Employee {
    private int id;
    private String type,password,address,position,gender,email,first_name,last_name,mobile,birthday;
    
    public Employee(int id,String password,String address,String type,String position,String gender,String email,String first_name,String last_name,String mobile,String birthday){
        this.id = id;
        this.type = type;
        this.password = password;
        this.address= address;
        this.position = position;
        this.gender = gender;
        this.email = email;
        this.first_name = first_name;
        this.last_name = last_name;
        this.mobile= mobile;
        this.birthday = birthday;
    }
    
    public int getId(){
        return this.id;
    }
    public String getType(){
        return this.type;
    }
    public String getPosition(){
        return this.position;
    }
    public String getGender(){
        return this.gender;
    }
    public String getEmail(){
        return this.email;
    }
    public String getFirstName(){
        return this.first_name;
    }
    public String getLastName(){
        return this.last_name;
    }
    public String getMobile(){
        return this.mobile;
    }
    public String getBirthday(){
        return this.birthday;
    }
    public String getPassword(){
        return this.password;
    }
    public String getAddress(){
        return this.address;
    }
    
}

