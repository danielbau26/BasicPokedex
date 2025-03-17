package model;

public class PokemonConstroller {

    private Pokemon[] pokemons;

    public PokemonConstroller (int size){
        this.pokemons = new Pokemon[size];
    }

    // Si quiero mostrarlo en otra clase lo necesito
    public Pokemon[] getPokemons(){
        return pokemons;
    }

    // Si quiero modificarlo en otra clase lo necesito
    public void setPokemons(Pokemon[] pokemons){
        this.pokemons = pokemons;
    }

    // Crear un nuevo pokemon
    public Boolean create (String name, String genere, String id){
        Pokemon newPokemon = new Pokemon(name, genere, id); // Creo un nuevo pokemon con el constructor de Student
        Boolean added = false;
        for (int i = 0; i<pokemons.length; i++){
            if (pokemons[i] == null){
                pokemons[i] = newPokemon;
                added = true;
                break;
            }
        }

        return added;
    }

    public void reSizePokemons (int size){

        Pokemon [] newPokemons = new Pokemon[size]; // inicializo un array que me va ayudar a modificar el original

        for (int i = 0; i<pokemons.length; i++){

            if (newPokemons.length>= pokemons.length){
                newPokemons[i] = pokemons[i]; // Almacena cada valor que había en el nuevo array
            }   
        }

        pokemons = newPokemons; // Reemplaza el array
    }

    public String showPokemons (){
        String report = "";
        for (int i = 0; i<pokemons.length; i++){
            if (pokemons[i] != null){
                report += "Nombre: " + pokemons[i].getName() + "\n";
                report += "Genero: " + pokemons[i].getGender() + "\n";
                report += "Id: " + pokemons[i].getId() + "\n";
                report += "----------------------------------------------";
            }
        }

        return report;
    }

    public int sizeArrayPokemons(){
        return pokemons.length;
    }
}
