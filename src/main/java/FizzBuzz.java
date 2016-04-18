/**
 * @author Petri Kainulainen
 */
public class FizzBuzz {

    public String getFizzBuzzWord(int number) {
        StringBuilder fizzBuzzWord = new StringBuilder();

        if (number % 3 == 0) {
            fizzBuzzWord.append("Fizz");
        }

        if (number % 5 == 0) {
            fizzBuzzWord.append("Buzz");
        }

        return (fizzBuzzWord.length() == 0) ? null : fizzBuzzWord.toString();
    }

    public Integer testMeOne() {
        int value = 0; //1
        value += 6; //7
        value += 7; //8
        value += 8; //9
        return value; //10
    }

    public Integer testMeTwo() {
        int value = 0; //1
        value += 1; //2
        value += 2; //3
        value += 3; //4
        return value; //5
    }
}
