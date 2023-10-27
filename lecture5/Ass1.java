public class Exercise01 {
static class Engine {
public void start() {
System.out.println(" The engine is turned ON ");
}

public void drive() {
System.out.println(" The engine is working and the car is driving ");
}

public void stop() {
System.out.println(" The engine is turned OFF ");
}
}

static class Wheel {
int diameter;
Integer pressure;

public Wheel() {
pressure = 2;
}

public void precnik(int psi) {
diameter=psi;
System.out.println("this wheel has a diameter of " + psi + "inches");
}

public void inflate() {
System.out.println("The wheel is inflated. Inflate it");
}

public void inflate(int BAR) {
pressure = BAR;
System.out.println("The inflate pressure is " + BAR + " bars.");
}
}

static class Car_Window {
String car_window;

Car_Window(String cw) {
car_window = cw;
}

public void OpenWindow() {
System.out.println("The " + car_window + " car window is opened.");
}

public void CloseWindow() {
System.out.println("The " + car_window + " car window is closed");
}
}

static class Door {
String door;
public Car_Window car_win;

public Door(String v) {
door = v;
car_win = new Car_Window(door);
}

public void OpenDoor() {
System.out.println("the " + door + " door is opened");
}

