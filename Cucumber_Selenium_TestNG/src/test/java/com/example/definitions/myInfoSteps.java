package com.example.definitions;
import com.example.base;
import com.example.pom.adminpage;
import com.example.pom.helppage;
import com.example.pom.homepage;
import com.example.pom.login;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

import static com.example.base.driver;

public class myInfoSteps {

    @Before
    public  void setUp() {

        base baseInstance = new base();
        //baseInstance.setUp(); // Initialize the WebDriver
        driver = base.driver;
        hp = new helppage(driver);

    }

    public void navigateto myinfopage(){

    }


}
