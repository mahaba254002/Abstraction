
interface Printable {

  void print();
}

class Printer implements Printable {
  @Override
  public void print() {
    System.out.println("Printing...");
  }
}

class Scanner implements Printable {
  @Override
  public void print() {
    System.out.println("Scanning...");
  }
}

public class Main {
  public static void main(String[] args) {
    Printable printer = new Printer();
    printer.print();

    Printable scanner = new Scanner();
    scanner.print();
  }
}