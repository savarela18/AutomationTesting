package com.demoqa.automation.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Open;

public class OpenBrowser implements Interaction {

    private String url;

    public OpenBrowser(String url){
        this.url = url;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(url));
    }

    public static OpenBrowser start(String url){
        return  new OpenBrowser(url);
    }
}
