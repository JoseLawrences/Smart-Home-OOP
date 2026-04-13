/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package smarthome;

/**
 *
 * @author 63927
 */
import javax.swing.JOptionPane;
public class SmartHome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] options ={"Smart Light", "Thermostat", "Security Camera", "Smart Speaker", "Smart Lock", "Security Floodlight"};
        int choice;
        
        SecurityCamera Camera = new SecurityCamera();
        SecurityFloodlight Floodlight = new SecurityFloodlight();
        SmartLight Light = new SmartLight();
        SmartLock Lock = new SmartLock();
        SmartSpeaker Speaker = new SmartSpeaker();
        Thermostat Thermo = new Thermostat();
        do{
        choice = JOptionPane.showOptionDialog(null, "Placeholder", "Smart Home",
                 JOptionPane.DEFAULT_OPTION,  JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        
        switch(choice){
            case 0:
                Light.adjustLight();
                break;
            case 1:
                Thermo.changeTemp();
                break;
            case 2:
                break;
            case 3:
                Speaker.controlSpeaker();
                break;
            case 4:
                if(Lock.lockState){
                Lock.deviceUnlock();
                }else{
                Lock.deviceLock();
            }
                break;
            case 5:
                Floodlight.adjustLight();
                break;
         }
        }while(choice != -1);
    }
    
}
