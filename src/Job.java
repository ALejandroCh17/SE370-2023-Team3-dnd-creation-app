
import java.util.ArrayList;
import java.util.Scanner;
public class Job {
    private int baseHP;
    //to be added to finalHP in character class while calculating final stats
    ArrayList<String> proficienciesTypes = new ArrayList<String>();
    //Arraylist index 0 = armor, 1 = weapons, 2 = tools
    ArrayList<String> skills = new ArrayList<String>();
    ArrayList<String> equipment = new ArrayList<String>();

    private Boolean strengthSV;
    private Boolean dexteritySV;
    private Boolean constitutionSV;
    private Boolean intelligenceSV;
    private Boolean wisdomSV;
    private Boolean charismaSV;

    Job() {
        baseHP = 0;
        proficienciesTypes.add("");
        proficienciesTypes.add("");
        proficienciesTypes.add("");
        strengthSV = false;
        dexteritySV = false;
        constitutionSV = false;
        intelligenceSV = false;
        wisdomSV = false;
        charismaSV = false;
    }

    int getBaseHP(){
        return baseHP;
    }

    Boolean getStr(){
        return strengthSV;
    }

    Boolean getDex(){
        return dexteritySV;
    }

    Boolean getCon(){
        return constitutionSV;
    }

    Boolean getInt(){
        return intelligenceSV;
    }

    Boolean getWis(){
        return wisdomSV;
    }

    Boolean getCha(){
        return charismaSV;
    }

    ArrayList<String> getSkills() {
        return skills;
    }

    ArrayList<String> getProficiancy() {
        return proficienciesTypes;
    }

    ArrayList<String> getEquipment() {
        return equipment;
    }

    class Barbarian extends Job{
        //Constructor   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v

        Barbarian(){
            strengthSV = true;
            constitutionSV = true;
            baseHP = 12;
            proficienciesTypes.set(0, "light armor, medium armor, shields");
            proficienciesTypes.set(1, "simple weapons, martial weapons");

            Scanner input = new Scanner(System.in);
            System.out.printf("Type the first of the following skills that you'd like,\nAnimal Handling, Athletics, Intimidation, Nature, Perception, Survival:\n");
            skills.add(input.nextLine());
            System.out.printf("Type the second of the following skills that you'd like,\n*Animal Handling, Athletics, Intimidation, Nature, Perception, Survival:\n");
            skills.add(input.nextLine());

            System.out.printf("Equipment:\n");
            System.out.printf("type Greataxe or any martial melee weapon:\n");
            equipment.add(input.nextLine());
            System.out.printf("Two handaxes or any simple weapon:\n");
            equipment.add(input.nextLine());
            equipment.add("Explorer’s pack");
            equipment.add("Four javalins");
        }




        //Class Abilities   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v

        String rage = "In battle, you fight with primal ferocity. On your turn,\r\n" + //
                "you can enter a rage as a bonus action.\r\n" + //
                "   While raging, you gain the following benefits if you\r\n" + //
                "aren't wearing heavy armor:\r\n" + //
                "- You have advantage on Strength checks and Strength\r\n" + //
                "saving throws.\r\n" + //
                "- When you make a melee weapon attack using\r\n" + //
                "Strength, you gain a bonus to the damage roll that\r\n" + //
                "increases as you gain levels as a barbarian, as shown\r\n" + //
                "in the Rage Damage colum n of the Barbarian table.\r\n" + //
                "- You have resistance to bludgeoning, piercing, and\r\n" + //
                "slashing damage.";
    }

    class Bard extends Job {
        //Constructor   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v

        Bard() {
            dexteritySV = true;
            charismaSV = true;
            baseHP = 8;
            proficienciesTypes.set(0, "light armor");
            proficienciesTypes.set(1, "simple weapons, hand crossbows, longswords, rapiers, shortswords");
            proficienciesTypes.set(2, "Three musical instruments of your choice");

            Scanner input = new Scanner(System.in);
            System.out.printf("The Bard class gives access to any three skills,\n type the first skill :\n");
            skills.add(input.nextLine());
            System.out.printf("Type the second skill:\n");
            skills.add(input.nextLine());
            System.out.printf("Type the third skill:\n");
            skills.add(input.nextLine());

            System.out.printf("Equipment:\n");
            System.out.printf("type rapier, longsword, or any simple weapon:\n");
            equipment.add(input.nextLine());
            System.out.printf("Diplomat’s pack or an entertainer's pack:\n");
            equipment.add(input.nextLine());
            System.out.printf("Lute or any other musical instrument:\n");
            equipment.add(input.nextLine());
            equipment.add("Leather armor");
            equipment.add("Dagger");
        }
    }

    class Cleric extends Job {
        //Constructor   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v

        Cleric() {
            wisdomSV = true;
            charismaSV = true;
            baseHP = 8;
            proficienciesTypes.set(0, "Light armor, medium armor, shields");
            proficienciesTypes.set(1, "All simple weapons");

            Scanner input = new Scanner(System.in);
            System.out.printf("Type the first of two skills,\nHistory, Insight, Medicine, Persuasion, and Religion:\n");
            skills.add(input.nextLine());
            System.out.printf("Type the second skill:\n");
            skills.add(input.nextLine());

            System.out.printf("Equipment:\n");
            System.out.printf("Type mace, or warhammer (if proficient):\n");
            equipment.add(input.nextLine());
            System.out.printf("Scale mail, leather armor, or chain mail (if proficient):\n");
            equipment.add(input.nextLine());
            System.out.printf("light crossbow and 20 bolts or any simple weapon:\n");
            equipment.add(input.nextLine());
            System.out.printf("Priest’s pack or an explorer’s pack:\n");
            equipment.add(input.nextLine());
            System.out.printf("Holy symbol:\n");
            equipment.add(input.nextLine());
            equipment.add("Shield");

        }
    }

    class Druid extends Job {
        //Constructor   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v

        Druid() {
            intelligenceSV = true;
            wisdomSV = true;
            baseHP = 8;
            proficienciesTypes.set(0, "light armor, medium armor, shields");
            proficienciesTypes.set(1, "clubs, daggers, darts, javelins, maces, quarterstaffs, scimitars, sickles, slings, spears");
            proficienciesTypes.set(2, "Herbalism kit");

            Scanner input = new Scanner(System.in);
            System.out.printf("Type the first of two skills,\nArcana, Animal Handling, Insight, Medicine, Nature, Perception, Religion, and Survival:\n");
            skills.add(input.nextLine());
            System.out.printf("Type the second skill:\n");
            skills.add(input.nextLine());

            System.out.printf("Equipment:\n");
            System.out.printf("Type wooden shield or any simple weapon:\n");
            equipment.add(input.nextLine());
            System.out.printf("Scimitar or any simple melee weapon:\n");
            equipment.add(input.nextLine());
            equipment.add("Leather armor");
            equipment.add("Explorers pack");
            equipment.add("Druidic focus");
        }
    }

    class Fighter extends Job {
        //Constructor   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v

        Fighter() {
            strengthSV = true;
            constitutionSV = true;
            baseHP = 10;
            proficienciesTypes.set(0, "All armor, shields");
            proficienciesTypes.set(1, "Simple weapons, martial weapons");
            String in = "";

            Scanner input = new Scanner(System.in);
            System.out.printf("Type the first of two skills,\nAcrobatics, Animal Handling, Athletics, History, Insight, Intimidation, Perception, and Survival:\n");
            skills.add(input.nextLine());
            System.out.printf("Type the second skill:\n");
            skills.add(input.nextLine());

            System.out.printf("Equipment:\n");
            System.out.printf("Type chain mail or B for leather armor, longbow, and 20 arrows:\n");
            in = input.nextLine();
            if (in == "b")
            {
                equipment.add("leather armor");
                equipment.add("long bow");
                equipment.add("20 arrows");
            } else {
                equipment.add(input.nextLine());
            }

            System.out.printf("A martial weapon and a shield or two martial weapons:\n");
            equipment.add(input.nextLine());
            System.out.printf("A light crossbow and 20 bolts, or two handaxes:\n");
            equipment.add(input.nextLine());
            System.out.printf("Dungeoneer’s pack or (b) an explorer’s pack:\n");
            equipment.add(input.nextLine());
        }
    }

    class Monk extends Job {
        //Constructor   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v

        Monk() {
            dexteritySV = true;
            strengthSV = true;
            baseHP = 8;
            proficienciesTypes.set(1, "simple weapons, shortswords");
            proficienciesTypes.set(2, "Choose one type of artisan’s tools or one musical instrument");

            Scanner input = new Scanner(System.in);
            System.out.printf("Type the first of two skills,\nAcrobatics, Athletics, History, Insight, Religion, and Stealth:\n");
            skills.add(input.nextLine());
            System.out.printf("Type the second skill:\n");
            skills.add(input.nextLine());

            System.out.printf("Equipment:\n");
            System.out.printf("type shortsword or any simple weapon:\n");
            equipment.add(input.nextLine());
            System.out.printf("Dungeoneer’s pack or an explorer’s pack:\n");
            equipment.add(input.nextLine());
            equipment.add("10 Darts");
        }
    }

    class Paladin extends Job {
        //Constructor   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v

        Paladin() {
            wisdomSV = true;
            charismaSV = true;
            baseHP = 10;
            proficienciesTypes.set(0, "all armor, shields");
            proficienciesTypes.set(1, "simple weapons, martial weapons");
            String in;

            Scanner input = new Scanner(System.in);
            System.out.printf("Type the first of two skills,\nAthletics, Insight, Intimidation, Medicine, Persuasion, and Religion:\n");
            skills.add(input.nextLine());
            System.out.printf("Type the second skill:\n");
            skills.add(input.nextLine());

            System.out.printf("Equipment:\n");
            System.out.printf("Type a martial weapon then shield or B for two martial weapons:\n");
            in = input.nextLine();
            if (in == "b")
            {
                System.out.printf("Martial weapon 1:\n");
                equipment.add(input.nextLine());
                System.out.printf("Martial weapon 2:\n");
                equipment.add(input.nextLine());
            } else {
                equipment.add(input.nextLine());
                equipment.add(input.nextLine());
            }

            System.out.printf("Five javelins or any simple melee weapon:\n");
            equipment.add(input.nextLine());
            System.out.printf("A priest’s pack or an explorer’s pack:\n");
            equipment.add(input.nextLine());
            System.out.printf("Dungeoneer’s pack or (b) an explorer’s pack:\n");
            equipment.add(input.nextLine());
            equipment.add("Chainmail");
            equipment.add("Holy symbol");
        }
    }

    class Ranger extends Job {
        //Constructor   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v

        Ranger() {
            dexteritySV = true;
            strengthSV = true;
            baseHP = 10;
            proficienciesTypes.set(0, "Light armor");
            proficienciesTypes.set(1, "Simple weapons, martial weapons");

            Scanner input = new Scanner(System.in);
            System.out.printf("Type the first of three skills,\nAnimal Handling, Athletics, Insight, Investigation, Nature, Perception, Stealth, and Survival\n");
            skills.add(input.nextLine());
            System.out.printf("Type the second skill:\n");
            skills.add(input.nextLine());
            System.out.printf("Type the third skill:\n");
            skills.add(input.nextLine());

            String in;
            System.out.printf("Equipment:\n");
            System.out.printf("Type two shortswords or b for two simple melee weapons:\n");
            in = input.nextLine();
            if (in == "b")
            {
                System.out.printf("Simple weapon 1:\n");
                equipment.add(input.nextLine());
                System.out.printf("Simple weapon 2:\n");
                equipment.add(input.nextLine());
            } else {
                equipment.add("Shortsword");
                equipment.add("Shortsword");
            }

            System.out.printf("Type scale mail or leather armor:\n");
            equipment.add(input.nextLine());
            System.out.printf("Dungeoneer’s pack or an explorer’s pack:\n");
            equipment.add(input.nextLine());
            equipment.add("longbow + quiver of 20 arrows");
        }
    }

    class Rogue extends Job {
        //Constructor   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v

        Rogue() {
            dexteritySV = true;
            intelligenceSV = true;
            baseHP = 8;
            proficienciesTypes.set(0, "Light armor");
            proficienciesTypes.set(1, "Simple weapons, hand crossbows, longswords, rapiers, shortswords");
            proficienciesTypes.set(2, "Thieves’ tools");

            Scanner input = new Scanner(System.in);
            System.out.printf("Type the first of four skills,\nAcrobatics, Athletics, Deception. Insight, Intimidation, Investigation, Perception, Performance. Persuasion, Sleight of Hand, and Stealth\n");
            skills.add(input.nextLine());
            System.out.printf("Type the second skill:\n");
            skills.add(input.nextLine());
            System.out.printf("Type the third skill:\n");
            skills.add(input.nextLine());
            System.out.printf("Type the fourth skill:\n");
            skills.add(input.nextLine());

            System.out.printf("Equipment:\n");
            System.out.printf("Type rapier or a shortsword:\n");
            equipment.add(input.nextLine());
            System.out.printf("Shortbow and 20 arrows or a shortsword:\n");
            equipment.add(input.nextLine());
            System.out.printf("Burglar’s pack, a dungeoneer’s pack, or an explorer’s pack:\n");
            equipment.add(input.nextLine());
            equipment.add("Leather armor");
            equipment.add("Two daggers");
            equipment.add("Theives tools");
        }
    }

    class Sorcerer extends Job {
        //Constructor   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v

        Sorcerer() {
            dexteritySV = true;
            constitutionSV = true;
            baseHP = 6;
            proficienciesTypes.set(1, "Daggers, darts, slings, quarterstaffs, light crossbows");

            Scanner input = new Scanner(System.in);
            System.out.printf("Type the first of two skills,\nArcana, Deception, Insight, Intimidation, Persuasion, and Religion:\n");
            skills.add(input.nextLine());
            System.out.printf("Type the second skill:\n");
            skills.add(input.nextLine());

            String in;
            System.out.printf("Equipment:\n");
            System.out.printf("Type any simple weapon or b for a light crossbow and 20 bolts:\n");
            in = input.nextLine();
            if (in == "b")
            {
                equipment.add("Light crossbow");
                equipment.add("20 Bolts");
            } else {
                equipment.add(in);
            }

            System.out.printf("Type component pouch or an arcane focus:\n");
            equipment.add(input.nextLine());
            System.out.printf("Dungeoneer’s pack or an explorer’s pack:\n");
            equipment.add(input.nextLine());
            equipment.add("Two daggers");
        }
        }


    class Warlock extends Job {
        //Constructor   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v

        Warlock() {
            wisdomSV = true;
            charismaSV = true;
            baseHP = 8;
            proficienciesTypes.set(0, "Light armor");
            proficienciesTypes.set(1, "Simple weapons");

            Scanner input = new Scanner(System.in);
            System.out.printf("Type the first of two skills,\nArcana, Deception, History, Intimidation, Investigation, Nature, and Religion:\n");
            skills.add(input.nextLine());
            System.out.printf("Type the second skill:\n");
            skills.add(input.nextLine());

            String in;
            System.out.printf("Equipment:\n");
            System.out.printf("Type any simple weapon or b for a light crossbow and 20 bolts:\n");
            in = input.nextLine();
            if (in == "b")
            {
                equipment.add("Light crossbow");
                equipment.add("20 Bolts");
            } else {
                equipment.add(in);
            }

            System.out.printf("Type component pouch or an arcane focus:\n");
            equipment.add(input.nextLine());
            System.out.printf("scholar’s pack or a dungeoneer’s pack:\n");
            equipment.add(input.nextLine());
            System.out.printf("Type any simple weapon:\n");
            equipment.add(input.nextLine());
            equipment.add("Two daggers");
            equipment.add("Leather armor");

        }
    }

    class Wizard extends Job {
        //Constructor   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v   v

        Wizard() {
            wisdomSV = true;
            intelligenceSV = true;
            baseHP = 6;
            proficienciesTypes.set(1, "Daggers, darts, slings, quarterstaffs, light crossbows");

            Scanner input = new Scanner(System.in);
            System.out.printf("Type the first of two skills,\nArcana, History, Insight, Investigation, Medicine, and Religion:\n");
            skills.add(input.nextLine());
            System.out.printf("Type the second skill:\n");
            skills.add(input.nextLine());

            System.out.printf("Equipment:\n");
            System.out.printf("Type quarterstaff or dagger:\n");
            equipment.add(input.nextLine());
            System.out.printf("Type component pouch or an arcane focus:\n");
            equipment.add(input.nextLine());
            System.out.printf("scholar’s pack or a explorer’s pack:\n");
            equipment.add(input.nextLine());
            equipment.add("Spellbook");
        }
    }
}
