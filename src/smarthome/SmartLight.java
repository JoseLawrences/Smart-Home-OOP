/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smarthome;

import javax.swing.JOptionPane;

/**
 *
 * @author 63927
 */
public class SmartLight {
    int brightness;
    String color = "White";
    int lightChoice;
    String[] lightOptions = {"Adjust Brightness", "Change Color"};
    
    void adjustLight(){
        do{
           lightChoice =  JOptionPane.showOptionDialog(null, "Brightness Level: " + brightness + "\n Light Color: " + color, "Smart Light",
                 JOptionPane.DEFAULT_OPTION,  JOptionPane.QUESTION_MESSAGE, null, lightOptions, lightOptions[0]);
           
            switch(lightChoice){
                case 0:
                    String input = JOptionPane.showInputDialog(null, "Adjust Brightness (0-100)", "Brightness", JOptionPane.QUESTION_MESSAGE);
                    
                    if(input != null){
                        try{
                            int tempBrightness = Integer.parseInt(input);
                            if (tempBrightness >= 0 && tempBrightness <= 100){
                                brightness = tempBrightness;
                            }else{
                                JOptionPane.showMessageDialog(null, "Enter a number from 0 to 100.");
                            }
                        }
                        catch(NumberFormatException e){
                            JOptionPane.showMessageDialog(null, "Please use numbers.");
                        }
                    }
                    break;
                    
                case 1:
                    color = JOptionPane.showInputDialog("Enter a color for your Lights: ");
                    break;
            }
        }while(lightChoice != -1);
    }
}
