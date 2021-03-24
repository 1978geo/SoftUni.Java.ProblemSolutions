package SoftUniJavaProblemSolutions.Fundamentals.FinalExamPrep;

import java.util.*;

public class FinalExamPrep03HeroesOfCodeARRAY2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, int[]> heroesArray = new HashMap<>();


        for (int i = 0; i < n; i++) {

            String inputHpMp = scanner.nextLine();
            String[] heroesInfo = inputHpMp.split(" ");
            String name = heroesInfo[0];
            int HP = Integer.parseInt(heroesInfo[1]);
            int MP = Integer.parseInt(heroesInfo[2]);
            int [] points = new int[] {HP, MP};

            heroesArray.put(name, points);

        }
        String orders = scanner.nextLine();

        while (!orders.equals("End")){
            String[] commands = orders.split("[- ]+");
            String name = commands[1];
            int amount = Integer.parseInt(commands[2]);
            switch (commands[0]){

                case"Heal":
                    if (heroesArray.get(name)[0] + amount > 100) {
                        amount = 100 - heroesArray.get(name)[0];
//                        heroesArray.get(name)[0]=100;
                    }
                       heroesArray.get(name)[0]+=amount;

                    System.out.printf("%s healed for %d HP!%n", name, amount);
                    break;
                case"Recharge":

                    if (heroesArray.get(name)[1]+amount>200){
                        amount = 200 - heroesArray.get(name)[1];
//                        heroesArray.get(name)[1]=200;
                    }
                        heroesArray.get(name)[1]+=amount;

                    System.out.printf("%s recharged for %d MP!%n", name, amount);
                    break;
                case"TakeDamage":
                    String attacker = commands[3];
                    if(heroesArray.get(name)[0]-amount > 0){
                        heroesArray.get(name)[0]-=amount;
                        System.out.printf("%s was hit for %d HP by %s and " +
                                "now has %d HP left!%n",name, amount, attacker, heroesArray.get(name)[0]);
                    } else {
                        System.out.printf("%s has been killed by %s!%n", name, attacker);
                        heroesArray.remove(name);
                    }
                    break;
                case"CastSpell":
                    String spell = commands[3];
                    if(heroesArray.get(name)[1]-amount >= 0){
                        heroesArray.get(name)[1]-=amount;
                        System.out.printf("%s has successfully cast %s " +
                                "and now has %d MP!%n",name, spell, heroesArray.get(name)[1]);
                    } else {
                        System.out.printf("%s does not have enough MP to cast %s!%n", name, spell);
                    }
                    break;
            }
            orders = scanner.nextLine();
        }

//        heroesList.entrySet().stream()
//                .sorted((a,b) -> b.getValue().get(0) - a.getValue().get(0))
//                .forEach(e -> System.out.printf("%s%nHP: %d%nMP: %d%n",
//                       e.getKey(), e.getValue().get(0), e.getValue().get(1) ));

        heroesArray.entrySet().stream()
                .sorted((a,b) -> {
                    int result = b.getValue()[0] - a.getValue()[0];
                    if ( result == 0){
                        result = a.getKey().compareTo(b.getKey());
                    }
                        return result;

                })
                .forEach(e -> System.out.printf("%s%nHP: %d%nMP: %d%n",
                        e.getKey(), e.getValue()[0], e.getValue()[1] ));
    }
}
