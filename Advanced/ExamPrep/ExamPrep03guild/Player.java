package SoftUniJavaProblemSolutions.Advanced.ExamPrep.ExamPrep03guild;

public class Player {
    String name;
    String clazz;

    String rank;
    String description;


    public Player(String name, String clazz) {
        this.name = name;
        this.clazz = clazz;
        this.rank = "Trial";
        this.description = "n/a";


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }




    @Override
    public String toString() {
        return String.format("Player %s: %s%n" +
                "Rank: %s%n" +
                "Description: %s", name, clazz, rank, description);
    }
}
