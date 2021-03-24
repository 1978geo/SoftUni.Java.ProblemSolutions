package SoftUniJavaProblemSolutions.Advanced.DefiningClasses.E0606PokеmonTrainer;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Pokemon pokemon = null;
        Trainer trainer = null;
        LinkedHashMap <String, List<String>> pokemons = new LinkedHashMap<>();
        List<String> trainerPokemonData = new ArrayList<>();
        LinkedHashMap<String, Pokemon> pokemonInfo = new LinkedHashMap<>();

        while(!input.equals("Tournament")){
            String [] tokens = input.split("\\s+");
            String trainerName = tokens[0];
            String pokemonName = tokens[1];
            String element = tokens[2];
            int health = Integer.parseInt(tokens[3]);
//            Pesho Charizard Fire 100

            trainer = new Trainer(trainerName, 0, pokemons);

            pokemon = new Pokemon(pokemonName,element,health);

            pokemons.putIfAbsent(trainerName, new ArrayList<>());
            pokemons.get(trainerName).add(pokemonName);

            pokemonInfo.put(trainerName, pokemon);


            input = scanner.nextLine();
        }

        input = scanner.nextLine();

        while(!input.equals("End")){
            switch (input){
                case "Fire":
                    for (int i = 0; i < pokemons.size(); i++) {

                        if(pokemon.getElement().equals("Fire")){
                            trainer.numberBadges++;
                        } else{
                            pokemon.health-=10;
                            if(pokemon.health<=0){
                                trainerPokemonData.remove(pokemon.pokemonName);
                                trainer.pokemons.remove(pokemon.pokemonName);
                            }
                        }
                    }
                    break;
                case "Water":
                    for (int i = 0; i < pokemons.size(); i++) {

                        if(pokemon.getElement().equals("Water")){
                            trainer.numberBadges++;
                        } else{
                            pokemon.health-=10;
                            if(pokemon.health<=0){
                                trainerPokemonData.remove(pokemon.pokemonName);
                                trainer.pokemons.remove(pokemon.pokemonName);
                            }
                        }
                    }
                    break;
                case "Electricity":
                    for (int i = 0; i < pokemons.size(); i++) {

                        if(pokemon.getElement().equals("Electricity")){
                            trainer.numberBadges++;
                        } else{
                            pokemon.health-=10;
                            if(pokemon.health<=0){
                                trainerPokemonData.remove(pokemon.pokemonName);
                                trainer.pokemons.remove(pokemon.pokemonName);
                            }
                        }
                    }
                    break;
                default:
                    System.out.println("no such case");
                    break;

            }


            input = scanner.nextLine();
        }



        System.out.println(trainer);


    }
}
