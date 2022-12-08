package com.nttdata.petstore;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class CrearOrderStepsDefs {
    @Steps
    CrearOrder crearOrder;

    @When("creo la orden con id {int}, petId {int}, quantity {int}")
    public void crearOrder(int id, int petId,int quantity){
        crearOrder.crearOrder(id, petId, quantity);
    }
    @Then("el código de respuesta es {int}")
    public void elCódigoDeRespuestaEs(int statusCode) {
        restAssuredThat(response -> response.statusCode(statusCode));
    }
    @And("el id es {int}")
    public void elIdEs(int id) {
        restAssuredThat(response -> response.body("'id'", equalTo(id)));
        System.out.println("ID: " + SerenityRest.lastResponse().body().path("id").toString());
    }
}