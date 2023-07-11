public class CarLoan {

    // int carLoan;
    // int loanLength;
    // int
  
    // class Carloan{
  
    // }
  
  
      public static void main(String[] args) {
  
      int carLoan = 10000;
      int loanLength = 3;
      int interestRate = 5;
      int downPayment = 2000;
      // edit above to change rates or something.. 
  
      if (loanLength <= 0 || interestRate <= 0) {
        System.out.println("Error! You must take out a valid car loan.");
      } else if (downPayment >= carLoan) {
        System.out.println("The car can be paid in full");
      } else {
        int remainingBalance = carLoan - downPayment;
        int months = loanLength * 12;
        int interest = (remainingBalance / months) * interestRate / 100;
        int monthlyPayment = remainingBalance / months + interest;
        System.out.println(monthlyPayment);
      }
  
  
      }
  }