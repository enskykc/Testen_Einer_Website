package com.systemverification.stepdefination;

import com.systemverification.page.OpenOptionsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class OpenOptionsSD {

    @Given("I am on the Home Page")
    public void verifyHomePage() {
        String expectedUrl = "https://systemverification.com/en/";
        Assert.assertEquals(expectedUrl, OpenOptionsPage.verifyUrl());
    }

    @When("I click Careers from tabs")
    public void clickCareersTab(){

        OpenOptionsPage.clickCareers();
    }

    @And("I click Open Options from Careers tab")
    public void clickOpenOptionsTab(){

        OpenOptionsPage.clickOpenOptions();
    }

    @Then("Check Open Options Page verify url")
    public void openOptionsPageUrl(){

        String expectedUrl = "https://systemverification.com/en/open-positions/";
        Assert.assertEquals(expectedUrl, OpenOptionsPage.verifyUrl());
    }

    @Given("First step click Careers from tabs")
    public void firstStep (){

        OpenOptionsPage.clickCareers();
    }

    @When("Second step click Open Options from Careers tab")
    public void secondStep(){

        OpenOptionsPage.clickOpenOptions();
    }
    @Then("I select Hamburg on Category")
    public void selectLocation(){
        OpenOptionsPage.selectMenu();
    }

}
