import java.util.Random;
import java.util.Arrays;

class DnDCharacter {

    Random rand = new Random();
    private int modifier;
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    private int hitpoints;

    DnDCharacter() {
        rand = new Random();
        strength = ability();
        dexterity = ability();
        constitution = ability();
        intelligence = ability();
        wisdom = ability();
        charisma = ability();
        hitpoints = 10 + modifier(constitution);
    }

    int ability() {
        int[] dices = new int[4];
        for (int i = 0; i < dices.length; i++) {
            dices[i] = rand.nextInt(6)+1;
        }
        Arrays.sort(dices);
        int sum = 0;
        for (int i = 0; i < dices.length-1; i++) {
            sum += dices[i];
        }
        return sum;
    }

    int modifier(int input) {
        return (int) Math.floor((input-10)/2.0);
    }

    int getStrength() {
        return strength;
    }

    int getDexterity() {
        return dexterity;
    }

    int getConstitution() {
        return constitution;
    }

    int getIntelligence() {
        return intelligence;
    }

    int getWisdom() {
        return wisdom;
    }

    int getCharisma() {
        return charisma;
    }

    int getHitpoints() {
        return hitpoints;
    }

}
