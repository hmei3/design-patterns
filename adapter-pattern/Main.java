public class Main {
  public static void main(String[] args) {
    EUWallOutlet wallOutlet = new EUWallOutlet();
    USPlug uPlug = new USPlug();
    USPlugAdapter uPlugAdapter = new USPlugAdapter(uPlug);
  
    wallOutlet.connect(uPlugAdapter);
  }
} 

