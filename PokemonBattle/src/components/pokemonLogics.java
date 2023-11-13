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

        HashMap<String, String> electric = new HashMap<>();
        electric.put("type", "electric");
        listOfArr.add(electric);

        HashMap<String, String> wind = new HashMap<>();
        wind.put("type", "wind");
        listOfArr.add(wind);

        return listOfArr;
    }

    public HashMap<String, ArrayList<HashMap<String, String>>> pokemonList() {
        // fire pokemon
        // https://docs.google.com/spreadsheets/d/1-H0jSCkrJHQvZ-molqqFeYcc2VWl5lHzKmVohOvkqBg/edit#gid=0
        ArrayList<HashMap<String, String>> fire = new ArrayList<>();
        Map<String, String> fireIndex = new HashMap<>();
        fireIndex.put("type", "fire");
        fireIndex.put("fileName", "f-1.png");
        fireIndex.put("name", "Flareon");
        fire.add((HashMap<String, String>) fireIndex);

        Map<String, String> fireIndex2 = new HashMap<>();
        fireIndex2.put("type", "fire");
        fireIndex2.put("fileName", "f-2.png");
        fireIndex2.put("name", "Salamander");
        fire.add((HashMap<String, String>) fireIndex2);

        Map<String, String> fireIndex3 = new HashMap<>();
        fireIndex3.put("type", "fire");
        fireIndex3.put("fileName", "f-3.png");
        fireIndex3.put("name", "Firy");
        fire.add((HashMap<String, String>) fireIndex3);

        Map<String, String> fireIndex4 = new HashMap<>();
        fireIndex4.put("type", "fire");
        fireIndex4.put("fileName", "f-4.png");
        fireIndex4.put("name", "Fwirle");
        fire.add((HashMap<String, String>) fireIndex4);

        // water pokemon
        ArrayList<HashMap<String, String>> water = new ArrayList<>();
        Map<String, String> waterIndex = new HashMap<>();
        waterIndex.put("type", "water");
        waterIndex.put("fileName", "w-1.png");
        waterIndex.put("name", "Vaporeon");
        water.add((HashMap<String, String>) waterIndex);

        Map<String, String> waterIndex2 = new HashMap<>();
        waterIndex2.put("type", "water");
        waterIndex2.put("fileName", "w-2.png");
        waterIndex2.put("name", "Squirtle");
        water.add((HashMap<String, String>) waterIndex2);

        Map<String, String> waterIndex3 = new HashMap<>();
        waterIndex3.put("type", "water");
        waterIndex3.put("fileName", "w-3.png");
        waterIndex3.put("name", "Snaky");
        water.add((HashMap<String, String>) waterIndex3);

        Map<String, String> waterIndex4 = new HashMap<>();
        waterIndex4.put("type", "water");
        waterIndex4.put("fileName", "w-4.png");
        waterIndex4.put("name", "Siorsy");
        water.add((HashMap<String, String>) waterIndex4);

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

        Map<String, String> natureIndex3 = new HashMap<>();
        natureIndex3.put("type", "nature");
        natureIndex3.put("fileName", "n-3.png");
        natureIndex3.put("name", "n3");
        nature.add((HashMap<String, String>) natureIndex3);

        Map<String, String> natureIndex4 = new HashMap<>();
        natureIndex4.put("type", "nature");
        natureIndex4.put("fileName", "n-4.png");
        natureIndex4.put("name", "n4");
        nature.add((HashMap<String, String>) natureIndex4);

        Map<String, String> natureIndex5 = new HashMap<>();
        natureIndex5.put("type", "nature");
        natureIndex5.put("fileName", "n-5.png");
        natureIndex5.put("name", "n5");
        nature.add((HashMap<String, String>) natureIndex5);

        // electric pokemon
        ArrayList<HashMap<String, String>> electric = new ArrayList<>();
        Map<String, String> electricIndex = new HashMap<>();
        electricIndex.put("type", "electric");
        electricIndex.put("fileName", "e-1.png");
        electricIndex.put("name", "pikachu");
        electric.add((HashMap<String, String>) electricIndex);

        Map<String, String> electricIndex2 = new HashMap<>();
        electricIndex2.put("type", "electric");
        electricIndex2.put("fileName", "e-2.png");
        electricIndex2.put("name", "Pawmi");
        electric.add((HashMap<String, String>) electricIndex2);

        // wind pokemon

        ArrayList<HashMap<String, String>> wind = new ArrayList<>();
        Map<String, String> windIndex1 = new HashMap<>();
        windIndex1.put("type", "wind");
        windIndex1.put("fileName", "wi-1.png");
        windIndex1.put("name", "Pidgeot");
        wind.add((HashMap<String, String>) windIndex1);

        Map<String, String> windIndex2 = new HashMap<>();
        windIndex2.put("type", "wind");
        windIndex2.put("fileName", "wi-2.png");
        windIndex2.put("name", "noivern");
        wind.add((HashMap<String, String>) windIndex2);

        // final hashmap
        HashMap<String, ArrayList<HashMap<String, String>>> fHashMap = new HashMap<>();
        fHashMap.put("fire", fire);
        fHashMap.put("water", water);
        fHashMap.put("nature", nature);
        fHashMap.put("electric", electric);
        fHashMap.put("wind", wind);
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

        if (userSelect == "fire" && computer == "water") {
            return 0;
        }
        if (userSelect == "fire" && computer == "nature") {
            return 1;
        }
        if (userSelect == "fire" && computer == "electric") {
            return 0;
        }
        if (userSelect == "fire" && computer == "wind") {
            return 1;
        }
        if (userSelect == "fire" && computer == "fire") {
            return 2;
        }

        if (userSelect == "water" && computer == "fire") {
            return 1;
        }
        if (userSelect == "water" && computer == "nature") {
            return 0;
        }
        if (userSelect == "water" && computer == "electric") {
            return 1;
        }
        if (userSelect == "water" && computer == "wind") {
            return 0;
        }
        if (userSelect == "water" && computer == "water") {
            return 2;
        }

        if (userSelect == "nature" && computer == "fire") {
            return 0;
        }
        if (userSelect == "nature" && computer == "water") {
            return 1;
        }
        if (userSelect == "nature" && computer == "electric") {
            return 0;
        }
        if (userSelect == "nature" && computer == "wind") {
            return 1;
        }
        if (userSelect == "nature" && computer == "nature") {
            return 2;
        }

        if (userSelect == "electric" && computer == "fire") {
            return 1;
        }
        if (userSelect == "electric" && computer == "water") {
            return 0;
        }
        if (userSelect == "electric" && computer == "nature") {
            return 1;
        }
        if (userSelect == "electric" && computer == "wind") {
            return 0;
        }
        if (userSelect == "electric" && computer == "electric") {
            return 2;
        }

        if (userSelect == "wind" && computer == "fire") {
            return 1;
        }
        if (userSelect == "wind" && computer == "water") {
            return 0;
        }
        if (userSelect == "wind" && computer == "nature") {
            return 0;
        }
        if (userSelect == "wind" && computer == "electric") {
            return 1;
        }
        if (userSelect == "wind" && computer == "wind") {
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