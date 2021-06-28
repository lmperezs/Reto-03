package co.com.choucair.formacion.reto3.tasks;

import co.com.choucair.formacion.reto3.userinterface.SimulacionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class Simulacion implements Task {
    public static Simulacion onThePage() {
        return Tasks.instrumented(Simulacion.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SimulacionPage.PROSER),
                Click.on(SimulacionPage.LEASING),
                Click.on(SimulacionPage.LEASHABITACIONAL),
                Click.on(SimulacionPage.SIMULAR),
                Click.on(SimulacionPage.CALCULAR),
                Enter.theValue("450000000").into(SimulacionPage.VALOR),
                Click.on(SimulacionPage.BOTONPORCENTAJE),
                Click.on(SimulacionPage.PORCENTAJE),
                Enter.theValue("20").into(SimulacionPage.AÑOS),
                Click.on(SimulacionPage.FECHA),
                Click.on(SimulacionPage.FECHAÑO),
                Click.on(SimulacionPage.FECHAMES),
                Click.on(SimulacionPage.FECHADIA),
                Click.on(SimulacionPage.SIMULARVALOR)

        );


    }
}
