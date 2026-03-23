/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smarthome;

import javax.swing.JOptionPane;
import javax.swing.JComboBox;

/**
 *
 * @author 63927
 */
public class SecurityFloodlight extends SmartLight{
    String[] floodlightOption = {"Brightness",  "Color", "Motion Sensitivity"};
    String[] motionSensitivity = {"Low", "Medium", "High"};
    String currentSensitivity = "Medium";
    int floodlightChoice;
    
    @Override
  void  adjustLight(){
      do{
       floodlightChoice = JOptionPane.showOptionDialog(
                null, "Brightness Level: " + brightness + "\n Light Color: " + color + "\n Motion Sensitivity " + currentSensitivity, "Smart Light"
                , JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, floodlightOption, floodlightOption[0]);
        
        switch(floodlightChoice){
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
                    
                case 2:
                    JComboBox<String> sensitivityList = new JComboBox<>(motionSensitivity); 
                    int result = JOptionPane.showConfirmDialog(null, sensitivityList, "Select Motion Sensitivity", JOptionPane.OK_CANCEL_OPTION);
                    if(result == JOptionPane.OK_OPTION){
                        String selected = (String) sensitivityList.getSelectedItem();
                        JOptionPane.showMessageDialog(null, "Sensitivity set to " + selected);
                    }
                    break;
            }
        }while(floodlightChoice != -1);
      }
}
