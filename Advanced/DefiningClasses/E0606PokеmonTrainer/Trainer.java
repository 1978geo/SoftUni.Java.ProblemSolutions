package SoftUniJavaProblemSolutions.Advanced.DefiningClasses.E0606PokеmonTrainer;

import java.util.LinkedHashMap;
import java.util.List;

//Trainer has a name, number of badges and a collection of pokemon
public class Trainer {

    String trainerName;
    int numberBadges;
    LinkedHashMap <String, List<String>> pokemons;

    public Trainer(String trainerName, int numberBadges, LinkedHashMap <String, List<String>> pokemons) {
        this.trainerName = trainerName;
        this.numberBadges = 0;
        this.pokemons = new LinkedHashMap<>();
    }

    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    public int getNumberBadges() {
        return numberBadges;
    }

    public void setNumberBadges(int numberBadges) {
        this.numberBadges = numberBadges;
    }

    public LinkedHashMap<String,List<String>> getPokemons() {
        return pokemons;
    }

    public void setPokemons(LinkedHashMap<String,List <String>> pokemons) {
        this.pokemons = pokemons;
    }


    //"<TrainerName> <Badges> <NumberOfPokemon
    @Override
    public String toString() {
        return String.format("%s %d %d", this.trainerName,
                this.numberBadges,this.pokemons.get(trainerName).size());
    }
}
