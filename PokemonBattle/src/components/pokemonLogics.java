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
        fireIndex.put("type2", "fire2");
        fireIndex.put("fileName", "f-1.png");
        fireIndex.put("fileName2", "f2-1.png");
        fireIndex.put("name", "Flareon");
        fireIndex.put("name2", "Megareon");
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
        // level2
        Map<String, String> fire2Index1 = new HashMap<>();
        fire2Index1.put("type", "fire2");
        fire2Index1.put("fileName", "f2-1.png");
        fire2Index1.put("name", "f1");
        fire.add((HashMap<String, String>) fire2Index1);

        // water pokemon
        ArrayList<HashMap<String, String>> water = new ArrayList<>();
        Map<String, String> waterIndex = new HashMap<>();
        waterIndex.put("type", "water");
        waterIndex.put("type2", "water2");
        waterIndex.put("fileName", "w-1.png");
        waterIndex.put("fileName2", "w2-1.png");
        waterIndex.put("name", "Vaporeon");
        waterIndex.put("name2", "Megareon");
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
        // level2
        Map<String, String> water2Index1 = new HashMap<>();
        water2Index1.put("type", "water2");
        water2Index1.put("fileName", "w2-1.png");
        water2Index1.put("name", "Megareon");
        water.add((HashMap<String, String>) water2Index1);

        // nature pokemon
        ArrayList<HashMap<String, String>> nature = new ArrayList<>();
        Map<String, String> natureIndex = new HashMap<>();
        natureIndex.put("type", "nature");
        natureIndex.put("type2", "nature2");
        natureIndex.put("fileName", "n-1.png");
        natureIndex.put("fileName2", "n2-1.png");
        natureIndex.put("name", "bulbasaur");
        natureIndex.put("name2", "Megasaur");
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

        // level2
        Map<String, String> nature2Index1 = new HashMap<>();
        nature2Index1.put("type", "nature2");
        nature2Index1.put("fileName", "n2-1.png");
        nature2Index1.put("name", "n1");
        nature.add((HashMap<String, String>) nature2Index1);

        // electric pokemon
        ArrayList<HashMap<String, String>> electric = new ArrayList<>();
        Map<String, String> electricIndex = new HashMap<>();
        electricIndex.put("type", "electric");
        electricIndex.put("type2", "electric2");
        electricIndex.put("fileName", "e-1.png");
        electricIndex.put("fileName2", "e2-1.png");
        electricIndex.put("name", "pikachu");
        electricIndex.put("name2", "Raychu");
        electric.add((HashMap<String, String>) electricIndex);

        Map<String, String> electricIndex2 = new HashMap<>();
        electricIndex2.put("type", "electric");
        electricIndex2.put("fileName", "e-2.png");
        electricIndex2.put("name", "Pawmi");
        electric.add((HashMap<String, String>) electricIndex2);

        Map<String, String> electricIndex3 = new HashMap<>();
        electricIndex3.put("type", "electric");
        electricIndex3.put("fileName", "e-3.png");
        electricIndex3.put("name", "e3");
        electric.add((HashMap<String, String>) electricIndex3);

        Map<String, String> electricIndex4 = new HashMap<>();
        electricIndex4.put("type", "electric");
        electricIndex4.put("fileName", "e-4.png");
        electricIndex4.put("name", "e4");
        electric.add((HashMap<String, String>) electricIndex4);

        Map<String, String> electricIndex5 = new HashMap<>();
        electricIndex5.put("type", "electric");
        electricIndex5.put("fileName", "e-5.png");
        electricIndex5.put("name", "e5");
        electric.add((HashMap<String, String>) electricIndex5);

        // lvl2
        Map<String, String> electric2Index1 = new HashMap<>();
        electric2Index1.put("type", "electric2");
        electric2Index1.put("fileName", "e2-1.png");
        electric2Index1.put("name", "e1");
        electric.add((HashMap<String, String>) electric2Index1);

        // wind pokemon

        ArrayList<HashMap<String, String>> wind = new ArrayList<>();
        Map<String, String> windIndex1 = new HashMap<>();
        windIndex1.put("type", "wind");
        windIndex1.put("type2", "wind2");
        windIndex1.put("fileName", "wi-1.png");
        windIndex1.put("fileName2", "wi2-1.png");
        windIndex1.put("name", "Pidgeot");
        windIndex1.put("name2", "Megageot");
        wind.add((HashMap<String, String>) windIndex1);

        Map<String, String> windIndex2 = new HashMap<>();
        windIndex2.put("type", "wind");
        windIndex2.put("fileName", "wi-2.png");
        windIndex2.put("name", "noivern");
        wind.add((HashMap<String, String>) windIndex2);

        Map<String, String> windIndex3 = new HashMap<>();
        windIndex3.put("type", "wind");
        windIndex3.put("fileName", "wi-3.png");
        windIndex3.put("name", "wi3");
        wind.add((HashMap<String, String>) windIndex3);

        Map<String, String> windIndex4 = new HashMap<>();
        windIndex4.put("type", "wind");
        windIndex4.put("fileName", "wi-4.png");
        windIndex4.put("name", "wi4");
        wind.add((HashMap<String, String>) windIndex4);

        Map<String, String> windIndex5 = new HashMap<>();
        windIndex5.put("type", "wind");
        windIndex5.put("fileName", "wi-5.png");
        windIndex5.put("name", "wi5");
        wind.add((HashMap<String, String>) windIndex5);

        // lvl2
        Map<String, String> wind2Index1 = new HashMap<>();
        wind2Index1.put("type", "wind2");
        wind2Index1.put("fileName", "wi2-1.png");
        wind2Index1.put("name", "wi1");
        wind.add((HashMap<String, String>) wind2Index1);

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
        // water
        // water
        if (userSelect == "water" && computer == "water") {
            return 1;
        }
        if (userSelect == "water" && computer == "water2") {
            return 0;
        }
        if (userSelect == "water" && computer == "nature") {
            return 0;
        }
        if (userSelect == "water" && computer == "nature2") {
            return 0;
        }
        if (userSelect == "water" && computer == "fire") {
            return 1;
        }
        if (userSelect == "water" && computer == "fire2") {
            return 0;
        }
        if (userSelect == "water" && computer == "electric") {
            return 1;
        }
        if (userSelect == "water" && computer == "electric2") {
            return 0;
        }
        if (userSelect == "water" && computer == "wind") {
            return 1;
        }
        if (userSelect == "water" && computer == "wind2") {
            return 0;
        }
        // water2
        if (userSelect == "water2" && computer == "water") {
            return 1;
        }
        if (userSelect == "water2" && computer == "water2") {
            return 1;
        }
        if (userSelect == "water2" && computer == "nature") {
            return 1;
        }
        if (userSelect == "water2" && computer == "nature2") {
            return 0;
        }
        if (userSelect == "water2" && computer == "fire") {
            return 1;
        }
        if (userSelect == "water2" && computer == "fire2") {
            return 0;
        }
        if (userSelect == "water2" && computer == "electric") {
            return 1;
        }
        if (userSelect == "water2" && computer == "electric2") {
            return 0;
        }
        if (userSelect == "water2" && computer == "wind") {
            return 1;
        }
        if (userSelect == "water2" && computer == "wind2") {
            return 0;
        }
        // nature
        if (userSelect == "nature" && computer == "water") {
            return 1;
        }
        if (userSelect == "nature" && computer == "water2") {
            return 0;
        }
        if (userSelect == "nature" && computer == "nature") {
            return 1;
        }
        if (userSelect == "nature" && computer == "nature2") {
            return 0;
        }
        if (userSelect == "nature" && computer == "fire") {
            return 1;
        }
        if (userSelect == "nature" && computer == "fire2") {
            return 0;
        }
        if (userSelect == "nature" && computer == "electric") {
            return 1;
        }
        if (userSelect == "nature" && computer == "electric2") {
            return 0;
        }
        if (userSelect == "nature" && computer == "wind") {
            return 1;
        }
        if (userSelect == "nature" && computer == "wind2") {
            return 0;
        }
        // nature2
        if (userSelect == "nature2" && computer == "water") {
            return 1;
        }
        if (userSelect == "nature2" && computer == "water2") {
            return 0;
        }
        if (userSelect == "nature2" && computer == "nature") {
            return 1;
        }
        if (userSelect == "nature2" && computer == "nature2") {
            return 1;
        }
        if (userSelect == "nature2" && computer == "fire") {
            return 1;
        }
        if (userSelect == "nature2" && computer == "fire2") {
            return 0;
        }
        if (userSelect == "nature2" && computer == "electric") {
            return 1;
        }
        if (userSelect == "nature2" && computer == "electric2") {
            return 0;
        }
        if (userSelect == "nature2" && computer == "wind") {
            return 1;
        }
        if (userSelect == "nature2" && computer == "wind2") {
            return 0;
        }
        // fire
        if (userSelect == "fire" && computer == "water") {
            return 0;
        }
        if (userSelect == "fire" && computer == "water2") {
            return 0;
        }
        if (userSelect == "fire" && computer == "nature") {
            return 1;
        }
        if (userSelect == "fire" && computer == "nature2") {
            return 0;
        }
        if (userSelect == "fire" && computer == "fire") {
            return 1;
        }
        if (userSelect == "fire" && computer == "fire2") {
            return 0;
        }
        if (userSelect == "fire" && computer == "electric") {
            return 0;
        }
        if (userSelect == "fire" && computer == "electric2") {
            return 0;
        }
        if (userSelect == "fire" && computer == "wind") {
            return 1;
        }
        if (userSelect == "fire" && computer == "wind2") {
            return 1;
        }
        // fire2
        if (userSelect == "fire2" && computer == "water") {
            return 1;
        }
        if (userSelect == "fire2" && computer == "water2") {
            return 0;
        }
        if (userSelect == "fire2" && computer == "nature") {
            return 1;
        }
        if (userSelect == "fire2" && computer == "nature2") {
            return 0;
        }
        if (userSelect == "fire2" && computer == "fire") {
            return 1;
        }
        if (userSelect == "fire2" && computer == "fire2") {
            return 1;
        }
        if (userSelect == "fire2" && computer == "electric") {
            return 0;
        }
        if (userSelect == "fire2" && computer == "electric2") {
            return 0;
        }
        if (userSelect == "fire2" && computer == "wind") {
            return 1;
        }
        if (userSelect == "fire2" && computer == "wind2") {
            return 1;
        }
        // electric
        if (userSelect == "electric" && computer == "water") {
            return 0;
        }
        if (userSelect == "electric" && computer == "water2") {
            return 0;
        }
        if (userSelect == "electric" && computer == "nature") {
            return 0;
        }
        if (userSelect == "electric" && computer == "nature2") {
            return 0;
        }
        if (userSelect == "electric" && computer == "fire") {
            return 1;
        }
        if (userSelect == "electric" && computer == "fire2") {
            return 1;
        }
        if (userSelect == "electric" && computer == "electric") {
            return 1;
        }
        if (userSelect == "electric" && computer == "electric2") {
            return 0;
        }
        if (userSelect == "electric" && computer == "wind") {
            return 1;
        }
        if (userSelect == "electric" && computer == "wind2") {
            return 0;
        }
        // electric2
        if (userSelect == "electric2" && computer == "water") {
            return 1;
        }
        if (userSelect == "electric2" && computer == "water2") {
            return 1;
        }
        if (userSelect == "electric2" && computer == "nature") {
            return 1;
        }
        if (userSelect == "electric2" && computer == "nature2") {
            return 0;
        }
        if (userSelect == "electric2" && computer == "fire") {
            return 0;
        }
        if (userSelect == "electric2" && computer == "fire2") {
            return 0;
        }
        if (userSelect == "electric2" && computer == "electric") {
            return 1;
        }
        if (userSelect == "electric2" && computer == "electric2") {
            return 1;
        }
        if (userSelect == "electric2" && computer == "wind") {
            return 1;
        }
        if (userSelect == "electric2" && computer == "wind2") {
            return 0;
        }
        // wind
        if (userSelect == "wind" && computer == "water") {
            return 0;
        }
        if (userSelect == "wind" && computer == "water2") {
            return 0;
        }
        if (userSelect == "wind" && computer == "nature") {
            return 1;
        }
        if (userSelect == "wind" && computer == "nature2") {
            return 0;
        }
        if (userSelect == "wind" && computer == "fire") {
            return 1;
        }
        if (userSelect == "wind" && computer == "fire2") {
            return 0;
        }
        if (userSelect == "wind" && computer == "electric") {
            return 1;
        }
        if (userSelect == "wind" && computer == "electric2") {
            return 0;
        }
        if (userSelect == "wind" && computer == "wind") {
            return 1;
        }
        if (userSelect == "wind" && computer == "wind2") {
            return 0;
        }
        // wind2
        if (userSelect == "wind2" && computer == "water") {
            return 1;
        }
        if (userSelect == "wind2" && computer == "water2") {
            return 1;
        }
        if (userSelect == "wind2" && computer == "nature") {
            return 1;
        }
        if (userSelect == "wind2" && computer == "nature2") {
            return 0;
        }
        if (userSelect == "wind2" && computer == "fire") {
            return 1;
        }
        if (userSelect == "wind2" && computer == "fire2") {
            return 0;
        }
        if (userSelect == "wind2" && computer == "electric") {
            return 0;
        }
        if (userSelect == "wind2" && computer == "electric2") {
            return 0;
        }
        if (userSelect == "wind2" && computer == "wind") {
            return 1;
        }
        if (userSelect == "wind2" && computer == "wind2") {
            return 1;
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