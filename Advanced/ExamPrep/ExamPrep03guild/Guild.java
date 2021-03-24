package SoftUniJavaProblemSolutions.Advanced.ExamPrep.ExamPrep03guild;

import java.util.ArrayList;
import java.util.List;

public class Guild {

    String name;
    int capacity;
    List<Player> roster;

    public Guild(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.roster = new ArrayList<Player>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Player> getRoster() {
        return roster;
    }

    public void setRoster(List<Player> roster) {
        this.roster = roster;
    }

    public void addPlayer(Player player) {
        if (this.roster.size() < capacity) {
            this.roster.add(player);
        }
    }

    public boolean removePlayer(String name) {
        return roster.removeIf(n -> n.getName().equals(name));
    }

    public void promotePlayer(String name) {
        for (Player player : this.roster) {
            if (player.getName().equals(name)) {
                player.setRank("Member");
                break;
            }
        }

    }
    public void demotePlayer(String name) {
        for (Player player : this.roster) {
            if (player.getName().equals(name)) {
                player.setRank("Trial");
                break;
            }
        }

    }

    public int count (){
        return this.roster.size();
    }
    public Player[] kickPlayersByClass(String clazz){
        Player[] players = this.roster.stream()
                .filter(p -> p.getClazz().equals(clazz))
                .toArray(Player[]::new);

        this.roster.removeIf(p->p.getClazz().equals(clazz));

//        for (Player player : players) {
//
//            this.roster.removeIf(p->p.getName().equals(player.getName()));
//
//        }
        return players;
    }

    public String report() {
        StringBuilder out = new StringBuilder("Players in the JavaAdvancedProjects.guild: " + this.name + ":");

        for (Player player : roster){
            out.append(System.lineSeparator());
            out.append(player.toString());

        }
        return out.toString();
    }
}
//•	Method addPlayer(Player player) - adds an entity to the roster if there is room for it
//        •	Method removePlayer(String name) - removes a player by given name, if such exists, and returns boolean
//        •	Method promotePlayer(String name) - promote (set his rank to "Member")
//        the first player with the given name. If the player is already a "Member", do nothing.
//        •	Method demotePlayer(String name)- demote (set his rank to "Trial") the first player with the given name.
//        If the player is already a "Trial",  do nothing.
//        •	Method kickPlayersByClass(String clazz) - removes all the players by the given class and
//        returns all removed players from that class as an array
//•	Method count() - returns the number of players
//        •	Method report() - returns a String in the following format:
//        o	"Players in the JavaAdvancedProjects.guild: {guildName}:
//        {Player1}
//        {Player2}
//        (…)"
