package com.nttdata.petstore;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class ObtenerOrderStepsDefs {
    @Steps
    ObtenerOrder obtenerOrder;

    @When("quiero la orden con id {int}")
    public void obtenerOrder(int id){
        obtenerOrder.obtenerOrder(id);
    }
    @Then("response Code es {int}")
    public void elCódigoDeRespuestaEs(int statusCode) {
        restAssuredThat(response -> response.statusCode(statusCode));
    }
    @And("ID: {int}")
    public void elIdEs(int id) {
        restAssuredThat(response -> response.body("'id'", equalTo(id)));
        System.out.println("ID: " + SerenityRest.lastResponse().body().path("id").toString());
        System.out.println(SerenityRest.lastResponse().print());
    }
}
