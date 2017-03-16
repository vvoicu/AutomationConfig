package com.serenity.wiki.steps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

import com.serenity.AbstractSteps;
import com.serenity.wiki.pages.DictionaryPage;

import net.thucydides.core.annotations.Step;

public class EndUserSteps extends AbstractSteps{

	private static final long serialVersionUID = 8094729769383567241L;
	DictionaryPage dictionaryPage;

    @Step
    public void enters(String keyword) {
        dictionaryPage.enter_keywords(keyword);
    }

    @Step
    public void starts_search() {
        dictionaryPage.lookup_terms();
    }

    @Step
    public void should_see_definition(String definition) {
        assertThat(dictionaryPage.getDefinitions(), hasItem(containsString(definition)));
    }


    @Step
    public void looks_for(String term) {
        enters(term);
        starts_search();
    }
}