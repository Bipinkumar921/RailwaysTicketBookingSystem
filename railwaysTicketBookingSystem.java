/**
 * ticketbooking
 */ import java.util.Scanner;

public class railwaysTicketBookingSystem {

    String  passengerName;
    int passengerAge = 0 ;
    String gender;
    long passengerMobileNumber;
    String trainName;
    String seatType;
    int seatCharge;
    int numberOfTickets;
     int gst = 5;
      
     

    public railwaysTicketBookingSystem(String passengerName  , int passengerAge , String gender , long passengerMobileNumber,   String trainName, String seatType,int seatCharge,int numberOfTickets){
         this.passengerName = passengerName;
         this.passengerAge = passengerAge;
         this.gender = gender;
         this.passengerMobileNumber =  passengerMobileNumber;
         this.trainName = trainName;
         this.seatType=seatType;
         this.seatCharge= seatCharge;
         this.numberOfTickets = numberOfTickets;
    }

    void passengerDetail(){
         
         System.out.println("========passenger Detail============");
         System.out.println("Name  : " + passengerName);
         System.out.println("Age : "+ passengerAge);
         System.out.println("Gender : "+ gender);
         System.out.println("Mobile Number: "+ passengerMobileNumber);
         //  class  Details 

    }

    void trainNameDetails(){
         System.out.println("Train Name: "+ trainName);
    }

     
     void ticketcharge(){
          System.out.println("Train Seat: "+ seatType);
          System.out.println("Ticket  Fare : $"+ seatCharge);
          System.out.println("No of Tickets : "+ numberOfTickets);
          int totalBilling = seatCharge * numberOfTickets;
          System.out.println("Total Fare: $"+ totalBilling);
          // Gst 
           int totalGst = (totalBilling * gst)/100;
           System.out.println("GST 5% : $"+ totalGst);
           if( totalBilling >=100000){
             int discountRate = 30;
             int dicsountBilling = (totalBilling*discountRate)/100;
            
             System.out.println("Discount :$"+ dicsountBilling);
             long finalbillfare = totalBilling-dicsountBilling;
              long finalFare = finalbillfare + totalGst;
             System.out.println("Final Amount :$+"+ finalFare );

           }else{
             System.out.println("Not Discount: $"+ "00" );
               long withoutDiscountBill = totalGst + totalBilling;
             System.out.println("Total Amount :$"+ withoutDiscountBill);
           }
        }
  

    public static void main(String[] args) {
         Scanner sc  = new Scanner(System.in);

          

          String passengerName="";
          int passengerAge =0;
          String gender="";
          long passengerMobileNumber;
  
          // I/p passenger name
             System.out.println("Enter your name");
              passengerName  = sc.nextLine();

              // i/p age 

              System.out.println("Enter your Age:");
              passengerAge = sc.nextInt();

              // geder
               sc.nextLine();
              System.out.println("Enter your gender:");
              gender = sc.nextLine();

              // mobile number
                 System.out.println("Enter your mobile number");
                 passengerMobileNumber = sc.nextLong();
                    

  int trainChoice;

  String trainName="";
           
    
      System.out.println("============Train Details.:====================");
      System.out.println("1. Vande Bharat Exp.");
      System.out.println("2. Awad Aasam Exp.");
      System.out.println("3. Gorakh Dham Superfast Exp.");
      System.out.println("4. Delhi Express");
      System.out.println("5. Bihar Sampark kranti Express");

       System.out.println("Select Train for journey.");
          trainChoice = sc.nextInt();
             
           switch (trainChoice) {
            case 1 : 
              trainName =" Vande Bharat Exp.";
              break;

              case 2: 
               trainName = "Awad Assam Exp.";
               break;
            
            case 3: 
             trainName ="Gorakh Dham Superfast Exp.";
                       break;
         
              case 4:
                  trainName = "Delhi Express";
                   break;
                   
                case 5:
                     trainName = "Bihar Sampark kranti Exp.";
                     break;
                     default:
                           System.out.println("Invalid choice...");
                           break;
                                
           }
 // seat choice

   
 
    String seatType ="";
    int seatCharge=0;
    int seatchoice;
     
     System.out.println("============== SEAT DETAILS=======================");
      System.out.println(" 1. Sleeper ( $ 200)");
      System.out.println(" 2. Ac 2 Tier( $500)");
      System.out.println(" 3. Ac 3 Tier($ 1000)");
      System.out.println(" 4. Ac First ($ 2000)");

        System.out.println("Chhoose your seat..");
          seatchoice = sc.nextInt();

   switch (seatchoice) {
      case 1: 
        
           seatType = " Sleeper";
           seatCharge =200;
           break;

        case 2: 
         seatType = "Ac 2 Tier";
         seatCharge=500;
         break;

         case 3:
             seatType = "Ac 3 Tier";
             seatCharge= 1000;
             break;

             case 4:
                 seatType ="Ac First ";
                 seatCharge=2000;
                 break;
                 default:
                    System.out.println("Invalid choice....");
                    break;
                    
   }



    System.out.println("Enter No. of Tickets.");
         int  numberOfTickets = sc.nextInt();
               sc.close();
            
            // train seat and seattype

           railwaysTicketBookingSystem tkbk = new railwaysTicketBookingSystem(passengerName,passengerAge, gender, passengerMobileNumber, trainName , seatType , seatCharge,numberOfTickets);
                   tkbk.passengerDetail();
                   tkbk.trainNameDetails();
                   tkbk.ticketcharge();


           
}
}