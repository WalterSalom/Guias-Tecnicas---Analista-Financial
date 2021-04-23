package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class SearchCoursePage extends PageObject {

    public static final Target BUTTON_UC= Target.the("Selecciona Curso y Certificados").
            located(By.id("certificaciones"));

    public static final Target SELECT_COURSE = Target.the("Da clic para seleccionar el curso").
            located(By.xpath("//*[@id=\"category-course-list\"]/div/div[2]/div/div[1]/div/div/a/div[2]/h4"));
            //LINK Foundation Express

    public static final Target NAME_COURSE = Target.the("Extrae el nombre del curso").
            located(By.xpath("//*[@id=\"page-header\"]/div/div/div[2]/div[1]/div[1]/a/div/div/h1"));

}
