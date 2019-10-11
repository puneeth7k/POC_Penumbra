package info.methods;



public class xpaths 
{
	public String search = "(//form//div//input[@id=\"js-site-search-input\"])[1]";
	public String searchbtn="(//span[@class='serach-btn'])[1]";
	public String cart= "(//div[@class='mini-cart-icon']//img[@title='my cart' and @alt='cart'])[2]";
	
	public String menu="(//*[@id=\"primary-menu\"]//span[text()=\"Tutorial\"])";	
	public String menus="(//*[@class=\"navigation\"]//*[@id=\"primary-menu\"]/child::li[2])";
	public String menuitems = "(//*[@id=\"primary-menu\"]/li[2]/ul/li[1]/a/span[@class=\"menu-text\"]/span)";
	public String men = "(//ul[@id=\\\"menu-header-menu\\\"]/li/a)";
	
	
	//Penumbre login details
	public String username = "//*[@id=\"UsernameTextbox\"]";
	public String password = "//*[@id=\"PasswordTextbox\"]";
	public String domain = "//*[@id=\"DomainDropDown\"]";
	public String Login = "//*[@id=\"LoginButton\"]";
	
	public String edhr = "//*[@id=\"ctl00_NavigationMenu_NavigationMenu\"]/ul/li[3]";
	public String Eprocedure = "//*[@id=\"ctl00_NavigationMenu_NavigationMenu\"]/ul/li[3]/div[2]/ul/li[1]/a";
	public String containerdropdown ="//*[@id=\"ctl00_WebPartManager_ContainerStatus_WP_ContainerStatus_ContainerName_Imbt\"]";
	public String containersearch = "//*[@id=\"ctl00_WebPartManager_ContainerStatus_WP_ContainerStatus_ContainerName_Panl_Filter_Fltc\"]";
	
	
	//Tasks items
	public String task1 = "//*[@id=\"ctl00_WebPartManager_TaskMenuWP_TaskMenu_ScrollableMenu_TaskItem_0\"]";
	public String resourcedropdown = "//div//div[@class='cs-picklist']//*[@id=\"ctl00_WebPartManager_MoveInWebPart_MoveIn_Resource_Imbt\"]";
	public String selectResource = "//*[@id=\"ctl00_WebPartManager_MoveInWebPart_MoveIn_Resource_Imbt\"]";
	public String Movein = "//*[@id=\"ctl00_WebPartManager_ButtonsBar_SubmitMoveIn\"]";
	
}
