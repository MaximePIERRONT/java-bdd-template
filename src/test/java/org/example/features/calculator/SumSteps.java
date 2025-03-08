package org.example.features.calculator;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.calculator.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumSteps {
    private int result;

    @Given("I have a sum function")
    public void iHaveASumFunction() {
        //This is just for context
    }

    @When("I add {int} and {int}")
    public void iAddAnd(int a, int b) {
        Calculator calculator = new Calculator();
        result = calculator.sum(a,b);
    }

    @Then("the result should be {int}")
    public void theResultShouldBe(int sumResult) {
        assertEquals(sumResult, result);
    }
}
