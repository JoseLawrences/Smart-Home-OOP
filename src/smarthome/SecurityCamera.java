```java
package smarthome;
import javax.swing.JOptionPane;

public class SecurityCamera extends SmartDevice {
    boolean powerState = false;
    boolean recordingState = false;

    public SecurityCamera(String name) { super(name); }

    @Override
    public String getStatus() {
        return "Power: " + (powerState ? "ON" : "OFF") + " | Recording: " + (recordingState ? "YES" : "NO");
    }

    @Override
    public void performBehavior() {
        if (!powerState) {
            int choice = JOptionPane.showConfirmDialog(null, name + " is OFF. Turn it ON?", "Power Control", JOptionPane.YES_NO_OPTION);
            if (choice == JOptionPane.YES_OPTION) powerState = true;
        } else {
            recordingState = !recordingState;
            JOptionPane.showMessageDialog(null, "Recording " + (recordingState ? "Started" : "Stopped"));
        }
    }

    @Override
    public void execute() {
        powerState = true;
        recordingState = true;
        JOptionPane.showMessageDialog(null, name + ": [EXECUTE] Powering ON and starting recording.");
    }
}
```