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
	
	public String Eprocedure = "//*[@id=\"ctl00_NavigationMenu_NavigationMenu\"]/ul/li/a[text()='eDHR']";
	public String picklist = "//*[@id=\"ctl00_NavigationMenu_NavigationMenu\"]/ul/li[3]/div[2]/ul/li[3]/a";
	public String Containerinput = "//*[@id=\"ctl00_WebPartManager_ContainerStatus_WP_ContainerStatus_ContainerName_Edit\"]";
	public String containerdropdown ="//*[@id=\"ctl00_WebPartManager_ContainerStatus_WP_ContainerStatus_ContainerName_Imbt\"]";
	public String containersearch = "//*[@id=\"ctl00_WebPartManager_ContainerStatus_WP_ContainerStatus_ContainerName_Panl_Filter_Fltc\"]";
	public String Settings = "//*[@id=\"ctl00_Header\"]/div/ul[1]/li[10]/a";
	public String operation = "//*[@id=\"ctl00_WebPartManager_LineAssignmentWP_Control_Operation_Imbt\"]";
	public String selectoperation = "//*[@id=\"ctl00_WebPartManager_LineAssignmentWP_Control_Operation_Panl\"]/div[3]/ul/li[@title='WO Dispatch']";
	public String setbutton = "//*[@id=\"ctl00_WebPartManager_ButtonsBar_SetAssignment\"]"; 
	public String Menu = "//*[@id=\"ctl00_NavigationMenu_NavigationMenu\"]/ul/li/a";
			
			
	//Tasks Assign packlot
	public String workorderdispatch ="//*[@id=\"ctl00_NavigationMenu_NavigationMenu\"]/ul/li[4]/a[text()='WorkOrder Dispatch']";
	public String Assignpacklot = "//*[@id=\"ctl00_NavigationMenu_NavigationMenu\"]/ul/li[4]/div[2]/ul/li/a[text()='Assign Packlot']";
	public String selectworkbenchtype = "//*[@id=\"ctl00_NavigationMenu_NavigationMenu\"]/ul/li[4]/div[2]/ul/li/a";
	public String packlottype ="//*[@id=\"ctl00_WebPartManager_penAssignPackLotWP_penAssignPackLot_penPackLotType_Imbt\"]";
	public String selectpacklotype = "//*[@id=\"ctl00_WebPartManager_penAssignPackLotWP_penAssignPackLot_penPackLotType_Panl\"]/div[3]/ul/li[contains(@title,'G')]";
	public String Packlotcheckbox = "//*[@id=\"ctl00_WebPartManager_penAssignPackLotWP_penAssignPackLot_penCreateNewPackLot_ctl00\"]";
	public String selectpacklotdropdown = "//*[@id=\"ctl00_WebPartManager_penAssignPackLotWP_PackLotSelector_Imbt\"]";
	public String selectpacklot = "//*[@id=\"ctl00_WebPartManager_penAssignPackLotWP_PackLotSelector_Panl\"]/div[3]/ul/li";
	public String checkassignedcontainers = "//*[@id=\"jqg_ctl00_WebPartManager_penAssignPackLotWP_penAssignPackLot_penAssignedContainers_000000\"]"; 
	public String Executebutton = "//*[@id=\"ctl00_WebPartManager_ButtonsBar_SubmitAction\"]";
	public String OperationalViewWO = "//*[@id=\"ctl00_NavigationMenu_NavigationMenu\"]/ul/li[4]/div[2]/ul/li/a[text()='Operational View WO']";
	public String containerinput2 = "//*[@id=\"ctl00_WebPartManager_ContainerStatusWP_ContainerStatus_ContainerName_Edit\"]"; 
	public String Moveimmediatebutton = "//*[@id=\"ctl00_WebPartManager_ActionsControl_MoveImmediateAction\"]"; 
	public String forwardcontainerlist ="//*[@id=\"next_ctl00_WebPartManager_penAssignPackLotWP_penAssignPackLot_penAvailableContainers_pager\"]/span"; 
	
	//Container search
	public String rowcount = "//*[@id=\"ctl00_WebPartManager_penAssignPackLotWP_penAssignPackLot_penAvailableContainers\"]/tbody/tr\r\n"; 
	public String containername = "//*[@id=\"ctl00_WebPartManager_penAssignPackLotWP_penAssignPackLot_penAvailableContainers\"]/tbody/tr[count]/td[@title='F169676']";
	public String clickoption = "//*[@id=\"ctl00_WebPartManager_penAssignPackLotWP_penAssignPackLot_penAvailableContainers_pager_left\"]/table[1]/tbody/tr/td[4]/select";
	public String optionvalues = "//*[@id=\"ctl00_WebPartManager_penAssignPackLotWP_penAssignPackLot_penAvailableContainers_pager_left\"]/table[1]/tbody/tr/td[4]/select/option";
	public String containerslist = "//*[@id=\"ctl00_WebPartManager_penAssignPackLotWP_penAssignPackLot_penAvailableContainers\"]/tbody/tr/td[3]";
	public String checkbox = "//*[@id=\"jqg_ctl00_WebPartManager_penAssignPackLotWP_penAssignPackLot_penAvailableContainers_000220\"]";
	
}
