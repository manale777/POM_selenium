package navegacion_Paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import clases_Comunes.Clase_Base;

public class Cart_page {
	public Cart_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	private WebElement add_cart;
	@FindBy(id="react-burger-menu-btn")
	private WebElement btn_menu;
	@FindBy(id="logout_sidebar_link")
	private WebElement btn_logout;	
	
	public void cart()
	{
		Clase_Base.click(add_cart);
		Clase_Base.click(btn_menu);
		Clase_Base.click(btn_logout);
	}
}