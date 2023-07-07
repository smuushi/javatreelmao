public class Droid {

    String name;
    int batteryLevel; 
  
    public Droid(String droidName){
      name = droidName;
      batteryLevel = 100;
    }
  
    public String toString(){
      return "Hello, I'm the droid: " + this.name;
    }
  
    public void performTask(String task){
      System.out.println(this.name + " is performing task: " + task);
      this.batteryLevel -= 10;
    }
  
  
    public void energyReport(){
      System.out.println(this.batteryLevel);
    }
  
  
    public static void main(String[] args){
      Droid codey = new Droid("Codey");
      System.out.println(codey);
      codey.performTask("grape");
      codey.energyReport();
    }
  }