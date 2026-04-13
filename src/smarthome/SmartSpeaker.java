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
public class SmartSpeaker {
    int volume = 50;
    int currentTrack = 0;
    boolean isPlaying = false;
    String[] track ={"DIM", "Pagan Poetry", "Takedown", "Crank It", "Do It"};
    
   
    public void controlSpeaker(){
        int option;
    do{
    String[] speakerChoices ={"Play/Pause", "Next Track", "Volume Up", "Volume  Down"};
        option = JOptionPane.showOptionDialog(null, (isPlaying ? "Playing - " : "Paused - ") + track[currentTrack] + "\nVolume: " + volume ,
                 "Smart Speaker", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, speakerChoices, speakerChoices[0] );   
    
    switch (option){
        case 0:
            isPlaying = !isPlaying;
            break;
        case 1:
            currentTrack = (currentTrack +1) % track.length;
            break;
        case 2:
            if(volume < 100){
                volume += 5;
            }
            break;
        case 3:
        if(volume > 0){
            volume -= 5;
        }
            break;
    
        }
    }while(option != 4 && option != -1);
}
}
