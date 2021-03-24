package SoftUniJavaProblemSolutions.Fundamentals.FinalExamPrep;

import java.util.*;

public class FinalExamPrep03HeroesOfCodeAndLogicVII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        TreeMap<String, List<Integer>> heroesList = new TreeMap<>();

        for (int i = 0; i < n; i++) {

            String inputHpMp = scanner.nextLine();
            String[] heroesInfo = inputHpMp.split(" ");
            String name = heroesInfo[0];
            int hitPoints = Integer.parseInt(heroesInfo[1]);
            int manaPoints = Integer.parseInt(heroesInfo[2]);

            if (!heroesList.containsKey(name)) {
                heroesList.put(name, new ArrayList<>());
                heroesList.get(name).add(0, hitPoints);
                heroesList.get(name).add(1, manaPoints);
            }
            else{
                int currentHitPoints = heroesList.get(name).get(0);
                int currentManaPoints = heroesList.get(name).get(1);
                heroesList.get(name).set(0, hitPoints + currentHitPoints);
                heroesList.get(name).set(1, manaPoints + currentManaPoints);
            }

        }
            String orders = scanner.nextLine();

            while (!orders.equals("End")){
                String[] commands = orders.split("[- ]+");
               String heroesName = commands[1];
               switch (commands[0]){

                    case"Heal":
                        int currentHitPoints = heroesList.get(heroesName).get(0);
                        int hitPoints = Integer.parseInt(commands[2]);
                        if (hitPoints+currentHitPoints<100){
                            heroesList.get(heroesName).set(0, hitPoints+currentHitPoints);
                            System.out.printf("%s healed for %d HP!%n", heroesName, hitPoints);
                        } else {
                            heroesList.get(heroesName).set(0,100);
                            System.out.printf("%s healed for %d HP!%n", heroesName, 100-currentHitPoints);
                        }

                        break;
                    case"Recharge":
                        int currentManaPoints = heroesList.get(heroesName).get(1);
                        int manaPoints = Integer.parseInt(commands[2]);
                        if (manaPoints+currentManaPoints<200){
                            heroesList.get(heroesName).set(1, manaPoints+currentManaPoints);
                            System.out.printf("%s recharged for %d MP!%n", heroesName, manaPoints);
                        } else {
                            heroesList.get(heroesName).set(1,200);
                            System.out.printf("%s recharged for %d MP!%n", heroesName, 200-currentManaPoints);
                        }

                        break;
                        case"TakeDamage":
                            currentHitPoints = heroesList.get(heroesName).get(0);
                        int damage = Integer.parseInt(commands[2]);
                        String attacker = commands[3];
                        if(currentHitPoints-damage > 0){
                            heroesList.get(heroesName).set(0, currentHitPoints-damage);
                            System.out.printf("%s was hit for %d HP by %s and " +
                                    "now has %d HP left!%n",heroesName,damage, attacker, currentHitPoints-damage);
                        } else {
                            System.out.printf("%s has been killed by %s!%n", heroesName, attacker);
                            heroesList.remove(heroesName);
                        }
                            break;
                    case"CastSpell":
                        currentManaPoints = heroesList.get(heroesName).get(1);
                        int neededMP = Integer.parseInt(commands[2]);
                        String spell = commands[3];
                        if(currentManaPoints-neededMP >= 0){
                            heroesList.get(heroesName).set(1, currentManaPoints-neededMP);
                            System.out.printf("%s has successfully cast %s " +
                                    "and now has %d MP!%n",heroesName, spell, currentManaPoints-neededMP);
                        } else {
                            System.out.printf("%s does not have enough MP to cast %s!%n", heroesName, spell);

                        }
                        break;
                }
                orders = scanner.nextLine();
            }

//        heroesList.entrySet().stream()
//                .sorted((a,b) -> b.getValue().get(0) - a.getValue().get(0))
//                .forEach(e -> System.out.printf("%s%nHP: %d%nMP: %d%n",
//                       e.getKey(), e.getValue().get(0), e.getValue().get(1) ));

        heroesList.entrySet().stream()
                .sorted((a,b) -> {
                    if (b.getValue().get(0) - a.getValue().get(0) != 0){
                        return b.getValue().get(0) - a.getValue().get(0);
                    } else {
                        return a.getKey().compareTo(b.getKey());
                    }
                })
                .forEach(e -> System.out.printf("%s%nHP: %d%nMP: %d%n",
                        e.getKey(), e.getValue().get(0), e.getValue().get(1) ));
    }
}
