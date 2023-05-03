package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Hooks.SetUp;
import PageObject.InscriAssuranceObject;
import io.cucumber.java.en.*;



public class inscriAssuranceStepDef {
	
public WebDriver driver;
	
	// instantiation class authentification object
	
	private  InscriAssuranceObject INCRI = new InscriAssuranceObject (driver);
	
	// création d'un constructeur 
	
	public inscriAssuranceStepDef () {
		driver = SetUp.driver;
		PageFactory.initElements(driver, InscriAssuranceObject.class);
}
	
	@Given("accerder a l URL {string}")
	public void accerder_a_l_url(String string) {
		driver.get(string);
	}
	    

	@When("cliquer sur le boutton obtient tarif")
	public void cliquer_sur_le_boutton_obtient_tarif() {
		INCRI.acceptCookies();
		INCRI.clickTarif();
	    
	}

	@When("selectionner la recherche par plaque")
	public void selectionner_la_recherche_par_plaque() {
		INCRI.selectplaque();
	}

	@When("saisir la plaque d immatriculation {string}")
	public void saisir_la_plaque_d_immatriculation(String string) throws InterruptedException {
		INCRI.Saisirplaque(string);
		INCRI.confirmer();
		
		
	}

	@Then("verifier que la vehicule trouve {string}")
	public void verifier_que_la_vehicule_trouve(String string) {
		Assert.assertEquals(string, INCRI.Verif());
	}

}
