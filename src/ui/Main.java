package ui;

import model.PokemonConstroller;

import java.util.Scanner;

public class Main {

    private PokemonConstroller  pokemonConstroller;
    private Scanner reader;

    //Constructor de la clase que inicializa los atributos
    public Main(){
        this.pokemonConstroller = new PokemonConstroller(0);
        this.reader = new Scanner(System.in);
    }

    public static void main(String[] args){
        Main Main = new Main();
        Main.menu();
    }

    public void menu (){
        System.out.println("");

        System.out.println("Digite el tamaño del array");
        int size = reader.nextInt();
        reader.nextLine();
        pokemonConstroller.reSizePokemons(size);

        boolean flag = true;
        while (flag) {
            System.out.println("Tamaño del arreglo: " + pokemonConstroller.sizeArrayPokemons());
            System.out.println("Menu:");
            System.out.println("1. Añadir un pokemon");
            System.out.println("2. Ver pokemones");
            System.out.println("3. Cambiar el tamaño del array");
            System.out.println("4. Salir");
            int opcion = reader.nextInt();
            reader.nextLine();

            switch(opcion){

                case (1):
                    addedPokemon();
                    break;
                case (2):
                    pokemons();
                    break;
                case (3):
                    newsize();
                    break;
                case (4):
                    System.out.println("Gracias");
                    flag = false;
                    break;
                default:
                    System.out.println("Número fuera del rango");
            }
        }
    }

    public void addedPokemon(){
        System.out.println("Nombre: ");
        String nombre = reader.nextLine();

        System.out.println("Genero: ");
        String genere = reader.nextLine();

        System.out.println("Id: ");
        String id = reader.nextLine();

        Boolean added = pokemonConstroller.create(nombre, genere, id);

        if (added == true){
            System.out.println("Se ha agregado un nuevo pokemon");
        }else {
            System.out.println("No se ha podido agregar el nuevo pokemon");
        }
    }

    public void pokemons(){
        System.out.println("");
        String report = pokemonConstroller.showPokemons();

        if (report.length()>0){
            System.out.println(report);
            System.out.println("");
        }else {
            System.out.println("No hay pokemons");
            System.out.println("");
        }
    }


    public void newsize(){

        System.out.println("");
        System.out.println("Digite el nuevo tamaño del array");
        int size = reader.nextInt();
        reader.nextLine();

        pokemonConstroller.reSizePokemons(size);
    }
}
