import java.util.Scanner;

class Main {
  public static void main(String[] args) 
  {
     //These are the questions that will lead to the first method
    Scanner scan = new Scanner(System.in);

    System.out.println("Would you like to return your car?");
    String returnCar = scan.next();
    System.out.println("What year is your car from?");
    //These next two questions are two calculate how old your car is
    int carYear = scan.nextInt();
    System.out.println("What year is it?");
    int currentYear = scan.nextInt();

  //This is the return for the first metod
    int age = carComp(currentYear, carYear);
    System.out.println("Your car is " + age +  " years old.");

   // This is for my second method string
    System.out.println( "Your rate depreciates by 50% for every year you've owned are you sure you would like to return it still? true or false");
    //This is a true or false for the return policy with deprecation
    boolean carReturn = scan.nextBoolean();
    System.out.println("What was your cars orginal price? ");
    //This is asking the Orignal price for the math to find the new price
    double originalPrice = scan.nextDouble();

  // This is the final calculation being printed and also just a script.
    double rateCar = deprecation(age, originalPrice);
    System.out.println(" Your car's new price is: " + rateCar + " if you return your car we can either give you this money or we can help you find a new car. If you do find a new car please let us know to see if we still need to return money or you need to pay the diffrence. Let us know if you find anything! Thank you for shopping at Wesley Chapel Toyota!");


  }
    //this is my first method
  static int carComp(int currentYear, int carYear ){
    int yearComp = currentYear - carYear;
    return yearComp;
  }
// this is my second method
  static double deprecation( int age, double originalPrice ){
    double newPrice = originalPrice - (age * .50);
    return newPrice;
  }

}