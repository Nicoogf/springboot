package practica.curso.curso.Models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

public class UserData {
    public String name;

    @JsonIgnore
    public int age ;

    @JsonProperty("real_address")
    public String address ;

    @JsonGetter("Information")
    public String infoComplete(){
        return "El usuario se llama " + name + " tiene " + age + " y vive en " + address ;
    }


    public UserData(String name , int age , String address){
        this.name = name ;
        this.age = age ;
        this.address = address ;
    }
}
