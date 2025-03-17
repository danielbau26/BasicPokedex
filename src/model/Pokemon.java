package model;

public class Pokemon {
    
    private String nombre;
    private String gender;
    private String id;

    public Pokemon(String nombre, String gender, String id){
        this.nombre = nombre;
        this.gender = gender;
        this.id = id;
    }

    public String getName (){
        return nombre;
    }

    public void setName (String nombre){
        this.nombre = nombre;
    }

    public String getGender (){
        return gender;
    }

    public void setGender (String gender){
        this.gender = gender;
    }

    public String getId (){
        return id;
    }

    public void setId (String id){
        this.id = id;
    }


}
