package lab_1;

import lejos.nxt.LCD;
import lejos.robotics.navigation.DifferentialPilot;
public class test {
public static void main(String argv[]) throws Exception {
    LCD.drawString("Hello World", 0, 3);
    Thread.sleep(3000);


    DifferentialPilot pilot = new DifferentialPilot();


    // Rotate 120
    pilot.setTravelSpeed(35);
    pilot.rotate(120);

    // Forward 2500
    pilot.setTravelSpeed(25);
    pilot.forward(2500);

    //Rotate -300
    pilot.setTravelSpeed(35);
    pilot.rotate(-300);

    // Backward 3500
    pilot.setTravelSpeed(25);
    pilot.backward(3500);

    // Rotate 60
    pilot.setTravelSpeed(35);
    pilot.rotate(60);

    // forward
    pilot.setTravelSpeed(25);
    pilot.travel(10);


}
}