package Greenest;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {


        List<Plant> hotelPlantList = new ArrayList<>();
        hotelPlantList.add(new Cactus("Igge", 20));
        hotelPlantList.add(new Palm("Laura", 500));
        hotelPlantList.add(new Palm("Putte", 100));
        hotelPlantList.add(new Carnivorous("Meatloaf", 70));
        userInputReader(hotelPlantList);

    }


    //Frågar efter vilken växt, validerar inmatning. Kallar på en metod för att få index från listan hotelPlantList vilken planta det gäller. Tar därefter fram relevant info.
    private static void userInputReader(List<Plant> hotelPlantList) {

        while (true) {
            String userInput = JOptionPane.showInputDialog(null,
                    "Which plant's water requirements do you want to know about?",
                    "Greenest water-systems",
                    JOptionPane.INFORMATION_MESSAGE);


            if (userInput == null) {
                JOptionPane.showMessageDialog(null, "Quiting Greenest water-systems", "Exiting", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            } else if (userInput.isBlank()) {
                JOptionPane.showMessageDialog(null, "No input read", "Invalid input", JOptionPane.INFORMATION_MESSAGE);
                userInputReader(hotelPlantList);
            }


            //Kallar på metoden, indexOfPlantInList för att få fram index på inskrivna objektet. Retunerar -1 om objekt ej hittas i listan.
            int indexNumber = indexOfPlantInList(userInput, hotelPlantList);


            if (indexNumber == -1) {
                JOptionPane.showMessageDialog(null, "No plant named " + userInput + " found.", "Not found", JOptionPane.INFORMATION_MESSAGE);
                userInputReader(hotelPlantList);
            } else { //Polyformism sker. Kallar på metod som skiljer sig beroende på vilken subclass som objektet är.
                String plantInfo = (hotelPlantList.get(indexNumber).getName() + " needs " + hotelPlantList.get(indexNumber).getWaterRequirements());
                JOptionPane.showMessageDialog(null, plantInfo, "Plant requirements", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
    //Kolar om userInput String är likadan som någon av Plant-objekten i listan hotelPlantList, retunerar index om sant.
    private static int indexOfPlantInList(String userInput, List<Plant> hotelPlantList) {
        for (int i = 0; i < hotelPlantList.size(); i++) {
            if (userInput.trim().equalsIgnoreCase(hotelPlantList.get(i).getName())) {
                return i;
            }
        }
        return -1;
    }
}







