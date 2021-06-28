package co.com.choucair.formacion.reto3.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SimulacionPage extends PageObject {

    public static final Target PROSER = Target.the
            ("Seleccione la opcion PRODUCTOS Y SERVICIOS").located(By.xpath("//A[@id='menu-productos']"));

    public static final Target LEASING = Target.the
            ("Seleccione la opcion LEASING").located(By.xpath("//A[@id='header-productos-leasing']"));

    public static final Target LEASHABITACIONAL = Target.the
            ("Seleccione la opcion LEASING HABITACIONAL").located(By.xpath("//*[@id=\"category-detail\"]/div/div/div[2]/div/div[2]/h2/a\n"));

    public static final Target SIMULAR = Target.the
            ("Seleccione la opcion LEASING").located(By.xpath("//A[@href='/personas/creditos/vivienda/simulador-credito-vivienda'][text()='\n" +
            "                IR AL SIMULADOR\n" + "            ']"));

    public static final Target CALCULAR = Target.the
            ("Seleccione la opcion SEGUN EL VALOR DE LA VIVIENDA").located(By.xpath("//DIV[@id='calcular-cuotas']"));

    public static final Target VALOR = Target.the
            ("Digite el valor comercial de la vivienda").located(By.xpath("//INPUT[@id='valor-simulacion']"));

    public static final Target BOTONPORCENTAJE = Target.the("click para ver los porcentajes sujeridos")
            .located(By.xpath("//DIV[@class='mat-select-arrow-wrapper']"));

    public static final Target PORCENTAJE = Target.the("seleccione el porcentaje que necesita (Mnor a 80% y mayor al 1%)")
            .located(By.xpath("//SPAN[@class='mat-option-text'][text()=' 10% ']"));

    public static final Target AÑOS = Target.the
            ("Seleccione a cuantos años desea el credito").located(By.xpath("//INPUT[@id='valor-year']"));

    public static final Target FECHA = Target.the("Click en el campo Fecha")
            .located(By.xpath("//INPUT[@id='campo-fecha']"));

    public static final Target FECHAÑO = Target.the(" click en el año de naciemiento")
            .located(By.xpath("//DIV[@class='mat-calendar-body-cell-content'][text()=' 1997 ']"));

    public static final Target FECHAMES = Target.the(" click en el mes de nacimiento")
            .located(By.xpath("//DIV[@class='mat-calendar-body-cell-content'][text()=' ABR ']"));

    public static final Target FECHADIA = Target.the(" Click en el dia de nacimiento")
            .located(By.xpath("//DIV[@class='mat-calendar-body-cell-content'][text()=' 11 ']"));

    public static final Target SIMULARVALOR = Target.the
            ("Simular valor").located(By.xpath("//BUTTON[@id='boton-simular']")

    );
}



//BUTTON[@id='boton-simular']