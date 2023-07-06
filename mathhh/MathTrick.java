public class MathTrick {
	public static void main(String[] args) {

    int myNumber = 6777;
    // ^ this is the original number!;

    int stepOne;
    stepOne = myNumber * myNumber;

    int stepTwo;
    stepTwo = stepOne + myNumber;

		int stepThree; 
    stepThree = stepTwo / myNumber;

    int stepFour;
    stepFour = stepThree + 17;

    int stepFive;
    stepFive = stepFour - myNumber;

    int stepSix;
    stepSix = stepFive / 6;

    System.out.println(stepSix);

	}
}