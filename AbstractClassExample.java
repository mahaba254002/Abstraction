
abstract class AbstractClassExample {
  protected String name;

  public AbstractClassExample(String name) {
    this.name = name;
  }

  public void display() {
    System.out.println("Name: " + name);
  }
  

  public abstract void performAction();
}

class ConcreteClassExample extends AbstractClassExample {
  public ConcreteClassExample(String name) {
    super(name);
  }

  @Override
  public void performAction() {
    System.out.println("Performing action in ConcreteClassExample");
  }

  public static void staticMethod() {
    System.out.println("This is a static method in ConcreteClassExample");
  }
}

// Main class
class Main {
  public static void main(String[] args) {
    ConcreteClassExample obj = new ConcreteClassExample("John");

    obj.display();
    obj.performAction(); 
    ConcreteClassExample.staticMethod(); 
  }
}