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
public class Thermostat {
    int  temp;
    
    void changeTemp(){
          do{
              String input =  JOptionPane.showInputDialog(null, "Currently set temperature: " + temp + "\n You can set temperature between 16C to 30C");
              if(input == null){
                  break;
              }
              
              try{
                  int tempTemperature = Integer.parseInt(input);
                  if(tempTemperature >= 16 && tempTemperature <= 30){
                      temp = tempTemperature;
                      break;
                  }else{
                      JOptionPane.showMessageDialog(null, "You can only adjust temperature between 16C to 30C");
                  }
              }catch(NumberFormatException e){
                  JOptionPane.showMessageDialog(null, "Please input using numbers.");
              }
          
       }while(true);
    }
}
