public class StampMachineTest
{
  public static void main(String[] args){
      StampMachine machine = new StampMachine();
      machine.insert(4);
      System.out.println("First Class Stamps: " + machine.giveFirstClassStamps());
      System.out.println("penny stamps; " + machine.givePennyStamps());
  }
}
