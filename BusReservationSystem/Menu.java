import java.lang.ArrayIndexOutOfBoundsException;
import java.util.InputMismatchException;
import java.util.Scanner;
class Menu{
  static int numOfBus=0;
  public static void displaymenu(){
    String ans="";
    ans+="  Welcome to bus reservation system"+"\n";
    ans+="1. Add a bus"+"\n";
    ans+="2. Reservation"+"\n";
    ans+="3. Show buses information"+"\n";
    ans+="4. Cancal a reservation"+"\n";
    ans+="5. Exit"+"\n";
    ans+="Enter your choice (a number):"+"\n";
    System.out.print(ans);
  }
  public static boolean reservation(Bus bus,int seatId,String name){
    return bus.reserve(seatId, name);
  }
  public static boolean userInputIsValid(String input){
    int[] options={1,2,3,4};
    try{
      int _option=Integer.parseInt(input);
      _option=options[_option-1];
    }
    catch(ArrayIndexOutOfBoundsException e){
      System.out.print("Please enter number from 1-4");
      return false;
    }
    catch(InputMismatchException e){
      System.out.print("Please Enter an number");
      return false;
    }
    return true;
  }
  public static String getString(String question,Scanner inputScan){
    System.out.println(question);
    String _input=inputScan.nextLine();
    return _input;
  }
  public static int getInteger(String question,Scanner inputScan){
    System.out.println(question);
    int _input=inputScan.nextInt();
    return _input;
  }
  public static void performAction(Bus[] bus,int _option,Scanner inputScan){
    switch(_option){
      case 1:
        System.out.println("Initialise a new bus");
        String driver=getString("Enter Driver: ",inputScan);
        String destination=getString("Enter Destination: ",inputScan);
        bus[numOfBus]=new Bus(driver,destination,true);
        bus[numOfBus].setBusId(numOfBus+1);
        bus[numOfBus].printBusInfo();
        numOfBus++;
        System.out.println("Bus ID: "+bus[numOfBus-1].getBusId()+" has been Successfully initialized");
        break;
      
      case 2:
        int seatId=getInteger("Enter seat ID: ",inputScan);
        int busId=getInteger("Enter bus ID: ",inputScan);
        inputScan.nextLine();
        String name=getString("Enter your name: ",inputScan);
        for(int i=0;i<numOfBus;i++){
          if(busId==bus[i].getBusId()){
            if(bus[i].busIsAvaliable==true&&reservation(bus[i], seatId, name))
              System.out.println("Reserve Success");
            else
              System.out.println("This seat has been reserved by others, choose another seat");
          }
        }
        break;
      case 3:
        System.out.println("Print bus information");
        for(int i=0;i<numOfBus;i++)
          bus[i].printBusInfo();
        
        break;
      case 4:
        System.out.println("Cancel a reservation");
        String passengerName=getString("Please enter your name: ",inputScan);
        int busNum=getInteger("Please enter bus ID: ",inputScan);
        for(int i=0;i<bus[busNum].seat.length;i++){
          for(int j=0;j<bus[busNum].seat[i].length;j++){
            if(bus[busNum].seat[i][j].getPassengerName().equals(passengerName)){
              bus[busNum].seat[i][j].setIsReserved(false);
              bus[busNum].seat[i][j].setPassengerName("unnamed");
              bus[busNum].numberOfSeatAvaliable--;
              System.out.println("Cancelled");
              break;
            }
          }
        }
        System.out.println("No passenger named: "+passengerName);
        break;
      case 5:
        System.out.println("Thank you for using");
        System.exit(0);
        break;
    }
  }
  public static void main(String[] args){
    Bus[] bus=new Bus[100];
    while(true){
      displaymenu();
      Scanner inputScan=new Scanner(System.in);
      String input;
      do{
        input=inputScan.next();
        inputScan.nextLine();
      }while(!userInputIsValid(input));
      int _option=Integer.parseInt(input);
      performAction(bus, _option, inputScan);
      // bus[0]=new Bus("wei","willan",true);
      // bus[0].printBusInfo();
    }
  }
}