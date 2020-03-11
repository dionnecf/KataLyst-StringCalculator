import org.junit.Assert;
import org.junit.Test;

public class StringCalculatorMust {

    @Test

    public void returnZeroForEmptyString() {

        //Arrange

        StringCalculator stringcalculator = new StringCalculator();

        //Act

        int result = stringcalculator.add("");

        //Assert

        Assert.assertEquals(0, result);

    }

    @Test

    public void returnFourForFourInt() {

        //Arrange

        StringCalculator stringcalculator = new StringCalculator();

        //Act

        int result = stringcalculator.add("4");

        //Assert
        Assert.assertEquals(4, result);

    }
    @Test

    public void returnSumForTwoNumbers() {

        //Arrange

        StringCalculator stringcalculator = new StringCalculator();

        //Act

        int result = stringcalculator.add("1,2");

        //Assert

        Assert.assertEquals(3,result);
    }

    @Test

    public void returnIntForArbitraryNumberSize() {

        //Arrange

        StringCalculator stringcalculator = new StringCalculator();

        //Act
        int result = stringcalculator.add("1,2,3,4,5,6,7,8,9");

        //Assert

        Assert.assertEquals(45, result);

    }

}
