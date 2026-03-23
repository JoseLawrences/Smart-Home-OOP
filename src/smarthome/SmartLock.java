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
public class SmartLock {
    boolean lockState = true;
    int pin = 1234;
    
void deviceUnlock(){
   while(lockState){
       for(int i = 5; i >= 1; i--){  
        String input =  JOptionPane.showInputDialog(null, "Please Input PIN. You only have " + i + " attempt(s)");
        
        if (input == null){
           break;
        }
        
         try{
                  int checkPIN = Integer.parseInt(input);
                  if(checkPIN == pin){
                      lockState = false;
                      JOptionPane.showMessageDialog(null, "PIN correct. Now unlocking. To lock the device again, click the Smart Lock button again.");
                      break;
                  }else{
                      JOptionPane.showMessageDialog(null, "Incorrect PIN");
                  }
              }catch(NumberFormatException e){
                  JOptionPane.showMessageDialog(null, "Please input using numbers.");
              }
         
         if(i == 1 && lockState ){
                    JOptionPane.showMessageDialog(null, "All unlock attempts failed. Try again later.");
                }
            }
        }
    }

    void deviceLock(){
        lockState = true;
        JOptionPane.showMessageDialog(null, "Device is now locked. To unlock, click the Smart Lock button again.");
    }
}
