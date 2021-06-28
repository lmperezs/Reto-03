package co.com.choucair.formacion.reto3.stepdefinitions;

import co.com.choucair.formacion.reto3.tasks.OpenUp;
import co.com.choucair.formacion.reto3.tasks.Simulacion;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class simuladorStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }


    @Dado("^que Laura quiere ingresar al simulador de Cannon Financiero")
    public void queLauraQuiereIngresarAlSimuladorDeCannonFinanciero() {
        OnStage.theActorCalled("Laura").wasAbleTo(OpenUp.thePage(), Simulacion.onThePage());
    }

    @Cuando("^Laura ingrese los campos solicitados en el formulario$")
    public void lauraIngreseLosCamposSolicitadosEnElFormulario()  {
    }

    @Entonces("^Laura puede visualizar la simulacion de Cannon Financiero$")
    public void lauraPuedeVisualizarLaSimulacionDeCannonFinanciero() {
    }

}
