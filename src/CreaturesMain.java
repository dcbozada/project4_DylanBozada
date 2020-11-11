import java.util.*;

// Creature superclass with the eatfood method
abstract class Creature {
    public abstract String eatFood();
}

// Reproduction interface yielding the modeOfReproduction method
interface Reproduction {
    String modeOfReproduction();
}

// Base class that extends the Creature clsss. Implements reproduction, and overrides previous two methods
class Plant extends Creature implements Reproduction {
    @Override
    public String eatFood() {
        return "sunlight (aka photosynthesis)";
    }

    @Override
    public String modeOfReproduction() {
        return "Seeds";
    }
}

// Same functions as Plant class, but for the animal Class
class Animal extends Creature implements Reproduction {
    @Override
    public String eatFood() {
        return "ingestion";
    }

    @Override
    public String modeOfReproduction() {
        return "Sexual Reproduction";
    }
}

// Same function as Animal, and Plant class
class Fungi extends Creature implements Reproduction {
    @Override
    public String eatFood() {
        return "external digestion with hyphae";
    }

    @Override
    public String modeOfReproduction() {
        return "Spores";
    }
}

// This class extends the plant class, and overrides the tostring method, and instead calls the food, and mode of reproduction method
class SunFlower extends Plant {
    @Override
    public String toString() {
        String result = "";

        result += "Plant: Sun Flower\n";
        result += "Eat Food: " + eatFood() + "\n";
        result += "Mode Of Reproduction: " + modeOfReproduction() + "\n";
        result += "Sunflowers are known for being happy flowers";

        return result;
    }
}

// Same function as Sunflower class
class Hibiscus extends Plant {
    @Override
    public String toString() {
        String result = "";

        result += "Plant: Hibiscus\n";
        result += "Eat Food: " + eatFood() + "\n";
        result += "Mode Of Reproduction: " + modeOfReproduction() + "\n";
        result += "Other names of Hibiscus include hardy hibiscus, rose of sharon, and tropical hibiscus";

        return result;
    }
}

// Extends the animal class, and serves same function as sunflower class but different extension
class Wolf extends Animal {
    @Override
    public String toString() {
        String result = "";

        result += "Animal: Wolf\n";
        result += "Eat Food: " + eatFood() + "\n";
        result += "Mode Of Reproduction: " + modeOfReproduction() + "\n";
        result += "The banded fur of a wolf is usually mottled white, brown, gray, and black";

        return result;
    }
}

// Same function as the Wolf class
class Lion extends Animal {
    @Override
    public String toString() {
        String result = "";

        result += "Animal: Lion\n";
        result += "Eat Food: " + eatFood() + "\n";
        result += "Mode Of Reproduction: " + modeOfReproduction() + "\n";
        result += "The lion is a species in the family Felidae and a member of the genus Panthera";

        return result;
    }
}

// Same function as previous clasees, but extending the fungi class
class Chytrids extends Fungi {
    @Override
    public String toString() {
        String result = "";

        result += "Fungi: Chytrids\n";
        result += "Eat Food: " + eatFood() + "\n";
        result += "Mode Of Reproduction: " + modeOfReproduction() + "\n";
        result += "Chytridiomycota are a division of zoosporic organisms in the kingdom Fungi, informally known as chytrids";

        return result;
    }
}

// Extension of Fungi
class Zygomycota extends Fungi {
    @Override
    public String toString() {
        String result = "";

        result += "Fungi: Zygomycota\n";
        result += "Eat Food: " + eatFood() + "\n";
        result += "Mode Of Reproduction: " + modeOfReproduction() + "\n";
        result += "Zygomycota, or zygote fungi, is a former division or phylum of the kingdom Fungi.";

        return result;
    }
}

// Main function
public class CreaturesMain{
    public static void main(String[] args) {
        // Creating 3 list for plant, animal, and fungi
        List<Plant> plantsList = new ArrayList<>();
        plantsList.add(new SunFlower());
        plantsList.add(new Hibiscus());

        List<Animal> animalsList = new ArrayList<>();
        animalsList.add(new Wolf());
        animalsList.add(new Lion());

        List<Fungi> fungiList = new ArrayList<>();
        fungiList.add(new Chytrids());
        fungiList.add(new Zygomycota());

        //Creating a loop for each of the list, and printing to screen with the tostring method
        System.out.println("The Plant details follows:\n");
        for (Plant plant : plantsList) {
            System.out.println(plant.toString() + "\n");
        }

        System.out.println("The Animal details follows:\n");
        for (Animal animal : animalsList) {
            System.out.println(animal.toString() + "\n");
        }

        System.out.println("The Fungi details follows:\n");
        for (Fungi fungi : fungiList) {
            System.out.println(fungi.toString() + "\n");
        }
    }
}  