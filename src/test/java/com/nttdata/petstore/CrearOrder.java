package com.nttdata.petstore;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class CrearOrder {
    private static String CREATE_ORDER = "https://petstore.swagger.io/v2/store/order";

    @Step("Crear order {0} en PetStore")
    public void crearOrder(int id, int petId, int quantity){
        SerenityRest.given()
                .contentType("application/json")
                .body("{\n" +
                        "  \"id\":"+id+",\n" +
                        "  \"petId\":"+petId+",\n" +
                        "  \"quantity\":"+quantity+",\n" +
                        "  \"shipDate\": \"2022-12-08T18:20:48.379Z\",\n" +
                        "  \"status\": \"placed\",\n" +
                        "  \"complete\": true\n" +
                        "}")
                .post(CREATE_ORDER);
    }
}
