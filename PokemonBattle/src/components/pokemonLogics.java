package components;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class pokemonLogics {

    public ArrayList<HashMap<String, String>> pokemonLogics() {
        // Create an ArrayList to store all hashmap questions object
        ArrayList<HashMap<String, String>> listOfArr = new ArrayList<>();

        // Create some HashMaps and add them to the ArrayList
        HashMap<String, String> fire = new HashMap<>();
        fire.put("type", "fire");
        listOfArr.add(fire);

        HashMap<String, String> water = new HashMap<>();
        water.put("type", "water");
        listOfArr.add(water);

        HashMap<String, String> nature = new HashMap<>();
        nature.put("type", "nature");
        listOfArr.add(nature);
        return listOfArr;
    }

    public HashMap<String, ArrayList<HashMap<String, String>>> pokemonList() {
        // fire pokemon
        ArrayList<HashMap<String, String>> fire = new ArrayList<>();
        Map<String, String> fireIndex = new HashMap<>();
        fireIndex.put("type", "fire");
        fireIndex.put("fileName", "f-1.png");
        fireIndex.put("name", "Flareon");
        fire.add((HashMap<String, String>) fireIndex);

        // water pokemon
        ArrayList<HashMap<String, String>> water = new ArrayList<>();
        Map<String, String> waterIndex = new HashMap<>();
        waterIndex.put("type", "water");
        waterIndex.put("fileName", "w-1.png");
        waterIndex.put("name", "Vaporeon");
        water.add((HashMap<String, String>) waterIndex);

        // nature pokemon
        ArrayList<HashMap<String, String>> nature = new ArrayList<>();
        Map<String, String> natureIndex = new HashMap<>();
        natureIndex.put("type", "nature");
        natureIndex.put("fileName", "n-1.png");
        natureIndex.put("name", "bulbasaur");
        nature.add((HashMap<String, String>) natureIndex);

        Map<String, String> natureIndex2 = new HashMap<>();
        natureIndex2.put("type", "nature");
        natureIndex2.put("fileName", "n-2.png");
        natureIndex2.put("name", "Blawhi");
        nature.add((HashMap<String, String>) natureIndex2);

        // final hashmap
        HashMap<String, ArrayList<HashMap<String, String>>> fHashMap = new HashMap<>();
        fHashMap.put("fire", fire);
        fHashMap.put("water", water);
        fHashMap.put("nature", nature);

        return fHashMap;
    }

    public int randomNumber(Integer maxNum) {
        Random random = new Random();
        int randomNumber = random.nextInt(maxNum);
        return randomNumber;
    }

    public Map<String, String> userSelect(String type, String fileName, String name) {
        Map<String, String> userSelect = new HashMap<>();
        userSelect.put("type", type);
        userSelect.put("fileName", fileName);
        userSelect.put("name", name);
        return userSelect;
    }

    public int pokemonFighting(String userSelect, String computer) {
        // logic
        // https://docs.google.com/spreadsheets/d/1DaU3NjJgt3ZD0y417fKNhUfMWEjrWy6aecw9_tvSMbI/edit#gid=0
        // user select fire
        if (userSelect == "fire" && computer == "water") {
            return 0;
        }
        if (userSelect == "fire" && computer == "nature") {
            return 1;
        }
        if (userSelect == "fire" && computer == "fire") {
            return 2;
        }

        // user select water
        if (userSelect == "water" && computer == "fire") {
            return 1;
        }
        if (userSelect == "water" && computer == "nature") {
            return 0;
        }
        if (userSelect == "water" && computer == "water") {
            return 2;
        }

        // user select nature
        if (userSelect == "nature" && computer == "fire") {
            return 0;
        }
        if (userSelect == "nature" && computer == "water") {
            return 1;
        }
        if (userSelect == "nature" && computer == "nature") {
            return 2;
        }

        return 9;
    }

    public HashMap<String, String> computerPick(String type) {
        HashMap<String, ArrayList<HashMap<String, String>>> pokemonList = this.pokemonList();
        ArrayList<HashMap<String, String>> selectedType = pokemonList.get(type);
        Integer randomNumber = this.randomNumber(selectedType.size());
        return selectedType.get(randomNumber);
    }

}