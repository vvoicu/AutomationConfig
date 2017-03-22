package com.tests.wiki.search;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.serenity.wiki.steps.EndUserSteps;
import com.tests.BaseTest;
import com.tools.ConfigUtils;
import com.tools.FieldGenerators;
import com.tools.FieldGenerators.Mode;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class SearchByKeywordTest extends BaseTest{


    @Steps
    public EndUserSteps endUserSteps;

    @Issue("#WIKI-1")
    @Test
    public void searching_by_keyword_apple_should_display_the_corresponding_article() {
        endUserSteps.navigateTo(ConfigUtils.getBaseUrl());
        endUserSteps.looks_for(FieldGenerators.generateRandomString(10, Mode.ALPHANUMERIC));
        
//        endUserSteps.looks_for("apple");
        endUserSteps.should_see_definition("A common, round fruit produced by the tree Malus domestica, cultivated in temperate climates.");

    }

    @Test
    public void searching_by_keyword_banana_should_display_the_corresponding_article() {
    	endUserSteps.navigateTo(ConfigUtils.getBaseUrl());
        endUserSteps.looks_for("pear");
        endUserSteps.should_see_definition("An edible fruit produced by the pear tree, similar to an apple but elongated towards the stem.");
    }

    @Pending @Test
    public void searching_by_ambiguious_keyword_should_display_the_disambiguation_page() {
    }
} 