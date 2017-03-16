package com.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class AbstractSteps extends ScenarioSteps{

	private static final long serialVersionUID = 9210642586998408049L;
	private AbstractPage abstractPage;
	
	@Step
    public void navigateTo(String URL) {
		abstractPage.navigateTo(URL);
    }
}
