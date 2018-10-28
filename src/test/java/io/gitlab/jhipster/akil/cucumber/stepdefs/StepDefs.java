package io.gitlab.jhipster.akil.cucumber.stepdefs;

import io.gitlab.jhipster.akil.JHipsterAkilApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = JHipsterAkilApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
