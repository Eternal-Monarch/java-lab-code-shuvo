class Main {
    private String name;
  
    // constructor
    Main() {
      System.out.println("Constructor Called:");
      name = "Roll 104";
    }
  
    public static void main(String[] args) {
  
   
      // creating an object of the Main class
      Main obj = new Main();
      System.out.println("The name is " + obj.name);
    }
  }
