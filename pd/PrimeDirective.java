// Import statement:
import java.util.ArrayList;


class PrimeDirective {
  
  // Add your methods here:
  public boolean isPrime(int numero){
    
    if(numero == 2){
      return true;
    } else if(numero < 2){
      return false;
    }

    int i = 2;
    while(i < numero){
      if(numero % i == 0){
        return false;
      }
      i++;
    }

    return true;

  }

  public ArrayList<Integer> onlyPrimes(int[] numbers) {
    ArrayList<Integer> primes = new ArrayList<Integer>();

    for(int number : numbers){
      if(isPrime(number)){
        primes.add(number);
      }
    }
    return primes;

  } 
  
  
  public static void main(String[] args) {

    PrimeDirective pd = new PrimeDirective();
    int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
    System.out.println(pd.onlyPrimes(numbers));
    
    // System.out.println(pd.isPrime(7));


  }  

}