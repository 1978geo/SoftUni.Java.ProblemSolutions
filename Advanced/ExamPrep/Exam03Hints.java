package SoftUniJavaProblemSolutions.Advanced.ExamPrep;

public class Exam03Hints {
    public static void main(String[] args) {


    }
//
//    public boolean remove(String name) {
//        return employees.removeIf(e -> e.getName().equals(name));
//    }
//
//    public boolean remove(String name) {
//
//        for (int i = 0; i < data.size(); i++) {
//            if (this.data.get(i).getName().equals(name)) {
//                this.data.remove(data.get(i));
//                return true;
//            }
//
//
//        }
//        return false;
//    }
//
//    public boolean buy(String name) {
//        return this.data.removeIf(salad -> salad.getName().equals(name));
//    }
//
//    public JavaAdvancedProjects.bakery.Employee getEmployee(String name) {
//        for (Employee employee : employees) {
//            if (employee.getName().equals(name)) {
//                return employee;
//            }
//        }
//
//        return null;
//    }
//
//    public Present getPresent(String doll) {
//        Present p = null;
//        for (int i = 0; i < data.size(); i++) {
//            if (data.get(i).getName().equals(doll)) {
//                p = this.data.get(i);
//                return p;
//            }
//        }
//        return p;
//    }
//
//    public Pet getPet(String name, String owner) {
//
//        Pet p = null;
//
//        for (int i = 0; i < data.size(); i++) {
//
//            if (this.data.get(i).getName().equals(name) && this.data.get(i).getOwner().equals(owner)) {
//                p = this.data.get(i);
//                return p;
//            }
//        }
//        return p;
//    }
//
//    public Present heaviestPresent() {
//        Present present = null;
//        for (Present presents : data) {
//            if (present == null || present.getWeight() < presents.getWeight()) {
//                present = presents;
//            }
//        }
//        return present;
//    }
//
//    public Salad getHealthiestSalad() {
//        return this.data.stream().min(Comparator.comparing(Salad::getTotalCalories)).orElse(null);
//    }
//
//    public void promotePlayer(String name) {
//        for (Player player : this.roster) {
//            if (player.getName().equals(name)) {
//                player.setRank("Member");
//                break;
//            }
//        }
//
//    }
//    public void demotePlayer(String name) {
//        for (Player player : this.roster) {
//            if (player.getName().equals(name)) {
//                player.setRank("Trial");
//                break;
//            }
//        }
//
//    }
//
//    public Player[] kickPlayersByClass(String clazz){
//        Player[] players = this.roster.stream()
//                .filter(p -> p.getClazz().equals(clazz))
//                .toArray(Player[]::new);
//
//        this.roster.removeIf(p->p.getClazz().equals(clazz));
//
////        for (Player player : players) {
////
////            this.roster.removeIf(p->p.getName().equals(player.getName()));
////
////        }
//        return players;
//    }
//
//    public String registerStudent(Student student) {
//
//        StringBuilder out = new StringBuilder();
//
//        if (this.data.size() > this.capacity) {
//            out.append("No seats in the JavaAdvancedProjects.classroom");
//
//        }
//        if (this.data.contains(student)) {
//            out.append("Student is already in the JavaAdvancedProjects.classroom");
//
//        } else {
//            this.data.add(student);
//            out.append("Added student ").append(this.data.get(data.size() - 1).getFirstName())
//                    .append(" ").append(this.data.get(data.size() - 1).getLastName());
//
//        }
//
//        return out.toString();
//    }
//
//    public Student getStudent(String firstName, String lastName) {
//        Student s = null;
//        for (int i = 0; i < data.size(); i++) {
//            if (data.get(i).getFirstName().equals(firstName)&&
//                    data.get(i).getLastName().equals(lastName)){
//                s = data.get(i);
//            }
//        }
//        return s;
//    }
//
//    public String dismissStudent(Student student) {
//        String s = "";
//        int index = 0;
//        for (int i = 0; i < data.size(); i++) {
//            if (this.data.contains(student)) {
//                index = i;
//                s = String.format("Removed student %s %s", this.data.get(index).getFirstName(),
//                        this.data.get(index).getLastName());
//                data.remove(student);
//                break;
//            } else {
//                s = "Student not found";
//            }
//        }
//        return s;
//    }
//
//    public List<Rabbit> sellRabbitBySpecies(String species){
//        List<Rabbit>JavaAdvancedProjects.rabbits = new ArrayList<>();
//
//        for (int i = 0; i < data.size(); i++) {
//            Rabbit rab = data.get(i);
//            if(rab.getSpecies().equals(species)){
//                rab.setAvailable(false);
//                JavaAdvancedProjects.rabbits.add(rab);
//            }
//        }
//        return JavaAdvancedProjects.rabbits;
//    }
//
//    public Rabbit sellRabbit(String name){
//        Rabbit rabbit = null;
//        for (int i = 0; i < data.size(); i++) {
//            Rabbit rab = data.get(i);
//            if(rab.getName().equals(name)){
//                rab.setAvailable(false);
//                rabbit = rab;
//                break;
//            }
//        }
//        return rabbit;
//    }
//
//
//    public Hero getHeroWithHighestIntelligence() {
//        return this.data.values()
//                .stream()
//                .sorted((f, s) -> s.getItem().getIntelligence() - f.getItem().getIntelligence())
//                .collect(Collectors.toList())
//                .get(0);
//    }
}
