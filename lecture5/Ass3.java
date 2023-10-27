public class Exercise03 {

static class Animal{
public String name;

public Animal(){
name="";
}

public Animal(String name){
this.name = name;
}

public void onomatopoeia(){
System.out.println("There is no onomatopoeia for" + name);
}

}

static class Dog extends Animal{
public void onomatopoeia(){
System.out.println("Woof");
}
}

static class Lion extends Animal{
public void onomatopoeia(){
System.out.println("Roar");
}
}

static class Frog extends Animal{
public void onomatopoeia(){
System.out.println("Croak");
}
}

static class SARA_MOUNTAIN_DOG extends Dog{
public void onomatopoeia(){
System.out.println("Woof but special");
}
}

public static void main(String[] args) {
Dog dog1 = new Dog();
Lion lion = new Lion();
Frog frog = new Frog();
SARA_MOUNTAIN_DOG dog2 = new SARA_MOUNTAIN_DOG();

dog1.onomatopoeia();
lion.onomatopoeia();
frog.onomatopoeia();
dog2.onomatopoeia();

}
}
