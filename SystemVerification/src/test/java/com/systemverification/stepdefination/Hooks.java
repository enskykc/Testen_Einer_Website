package com.systemverification.stepdefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import com.systemverification.base.BasePage;
import com.systemverification.base.PageManager;

public class Hooks {

    @Before
    public void start() {
        BasePage.initializeDriver();
        PageManager.initialize();
    }

    @After
    public void end() {
        BasePage.tearDown();
    }
}
