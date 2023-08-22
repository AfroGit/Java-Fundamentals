class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }
}
/*Below is a class declaration. The class body (the area between the braces) contains all the code that provides for the life cycle of the objects created from the class: constructors for initializing new objects, declarations for the fields that provide the state of the class and its objects, and methods to implement the behavior of the class and its objects. */ 

class MyClass {
    // field, 
  //   constructor, and 
    // method declarations
}

/*You can provide more information about the class, such as the name of its superclass, whether it implements any interfaces, and so on, at the start of the class declaration. For example, */ 

class MyClass extends MySuperClass implements YourInterface {
    // field, constructor, and
    // method declarations
}


/*Field declarations are composed of three components, in order:

   1.) Zero or more modifiers, such as public or private.
   2.) The field's type.
   3.) The field's name.
 */ 
class Bicycle{
  public int cadence;
  public int gear;
  public int speed;
  // public modifier—the field is accessible from all classes.
// private modifier—the field is accessible only within its own class
}

/* */ 


public class Bicycle {
        //For encapsulation,make fields private.
  // meaning they can only be directly accessed from the Bicycle class
    private int cadence;
    private int gear;
    private int speed;
        // We still need access to these values, however. This can be done indirectly by adding public methods that obtain the field values for us:
    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }
        
    public int getCadence() {
        return cadence;
    }
        
    public void setCadence(int newValue) {
        cadence = newValue;
    }
        
    public int getGear() {
        return gear;
    }
        
    public void setGear(int newValue) {
        gear = newValue;
    }
        
    public int getSpeed() {
        return speed;
    }
        
    public void applyBrake(int decrement) {
        speed -= decrement;
    }
        
    public void speedUp(int increment) {
        speed += increment;
    }
}