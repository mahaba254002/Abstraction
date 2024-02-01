// Interface for flying behavior
interface Flyable {
  void fly();
}

// Interface for swimming behavior
interface Swimmable {
  void swim();
}

// Class implementing both Flyable and Swimmable interfaces
class Bird implements Flyable, Swimmable {
  @Override
  public void fly() {
      System.out.println("Bird is flying");
  }

  @Override
  public void swim() {
      System.out.println("Bird is swimming");
  }
}

// Main class
public class Und_Int{
  public static void main(String[] args) {
      Bird bird = new Bird();
      bird.fly();
      bird.swim();
  }
}