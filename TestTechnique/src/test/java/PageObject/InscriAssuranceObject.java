package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class InscriAssuranceObject {
	

	WebDriver driver;

	public InscriAssuranceObject (WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy (how = How.XPATH , using ="//a[@class='Wrapper_1nnIU3 Primary_JHcVmg Clickable_2CHx7g']" )
	public static WebElement BoutonTarif;
	
	@FindBy (how = How.XPATH , using ="//body/div/div[@class='css-1dbjc4n r-13awgt0']/div/div[@class='FullWidthLayout_1BMidt FullWidthWithHeader_2gKC17']/form[@class='ScreenTemplate_1XiRnb']/div[@class='OuterContainer_2gJzzG']/div[@class='InnerContainer_cqq-1L']/div/div[@class='Choices_2RIy46']/div[1]" )
	public static WebElement RecherchePlaque;
	
	@FindBy (how = How.NAME , using ="vehiculeImmatriculation" )
	public static WebElement ChampPlaque;
	
	@FindBy (how = How.XPATH , using ="//button[contains(@type,'submit')]//div[contains(@class,'kitt_Content_oxWk7')]" )
	public static WebElement ConfirmPlaque;
	
	@FindBy (how = How.ID , using ="axeptio_btn_acceptAll")
	public static WebElement acceptCookies;
	
	@FindBy (how = How.XPATH , using ="//button[contains(@type,'submit')]//div[contains(@class,'kitt_Content_oxWk7')]" )
	public static WebElement ConfirmVoiture;
	
	
	
	@FindBy (how = How.ID , using ="vehiculeAcquisition-day" )
	public static WebElement JourAchat;
	
	@FindBy (how = How.ID , using ="vehiculeAcquisition-month" )
	public static WebElement MoisAchat;
	
	@FindBy (how = How.ID , using ="vehiculeAcquisition-year" )
	public static WebElement AnneeAchat;
	
	@FindBy (how = How.XPATH , using ="//button[@type='submit']//div[@class='kitt_Content_oxWk7']" )
	public static WebElement ConfirmDateAchat;
	
	@FindBy (how = How.XPATH, using ="//input[contains(@placeholder,'JJ')]" )
	public static WebElement JourContrat;
	
	@FindBy (how = How.XPATH , using ="//input[@placeholder='MM']" )
	public static WebElement MoisContrat;
	
	@FindBy (how = How.XPATH , using ="//input[@placeholder='AAAA']" )
	public static WebElement AnneeContart;
	
	@FindBy (how = How.XPATH , using ="//button[@type='submit']//div[@class='kitt_Content_oxWk7']" )
	public static WebElement ConfirmContart;
	
	@FindBy (how = How.XPATH , using ="//h5[contains(@class,'')]" )
	public static WebElement vehiculetouve;
	
	
	public void acceptCookies() {
		acceptCookies.click();
	}
	
	public void clickTarif() {
		BoutonTarif.click();
	}
	
	public void selectplaque() {
		RecherchePlaque.click();
	}
	
	public void Saisirplaque(String string) {
		ChampPlaque.sendKeys(string);
	}
	
	public void confirmer()  {
		ConfirmPlaque.click();
	}
		
	
	
	public void ConfirmDateAchat() {
		ConfirmDateAchat.click();
	}
	

	public void ConfirmDateContrat() {
		ConfirmContart.click();;
	}
	
	public String Verif () {
		
		String text = vehiculetouve.getText();
		
		return text;
		
	}
	
	
	

}
