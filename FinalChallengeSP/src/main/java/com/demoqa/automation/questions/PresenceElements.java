package com.demoqa.automation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class PresenceElements implements Question <Boolean> {

    private Target target;

    public PresenceElements(net.serenitybdd.screenplay.targets.Target target){
        this.target = target;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        WaitUntil.the(target, WebElementStateMatchers.isVisible());
        return target.resolveFor(actor).isVisible();
    }

    public static PresenceElements visible (Target target){
        return new PresenceElements(target);
    }
}
