package com.nttdata.petstore;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class ObtenerOrder {

    private static String GET_ORDER = "https://petstore.swagger.io/v2/store/order/";

    @Step("Obtener Order {0} de Petstore")
    public void obtenerOrder(int id){
        SerenityRest.given().get(GET_ORDER+id);
        //SerenityRest.given().log().all().when().get(GET_ORDER+id);
    }
}
