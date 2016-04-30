import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertNull;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
/**
* Commit - add comment
*/
/**
 * @author Petri Kainulainen
 */
public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void getFizzBuzzWord_Added10lines() {
        assertThat(fizzBuzz.testMeOne(), is(36));
        assertThat(fizzBuzz.getFizzBuzzWord(3), is("Fizz"));
    }

    @Test
    public void getFizzBuzzWord_NumberIsMultipleOfFive_ShouldReturnBuzz() {
        assertThat(fizzBuzz.getFizzBuzzWord(5), is("Buzz"));
    }

    @Test
    public void getFizzBuzzWord_NumberIsMultipleOfThreeAndFive_ShouldReturnFizzBuzz() {
        assertThat(fizzBuzz.getFizzBuzzWord(15), is("FizzBuzz"));
    }

    @Test
    public void getFizzBuzzWord_NumberIsNotMultipleOfThreeOrFive_ShouldReturnNull() {
        assertNull(fizzBuzz.getFizzBuzzWord(4));
    }

    @Test
    public void addedTest1() {
        assertThat(fizzBuzz.testMeOne() - fizzBuzz.testMeOne(), is(0));
    }

    @Test
    public void addedTest3() {
        assertThat(fizzBuzz.testMeTwo(), is(21));
    }
}
