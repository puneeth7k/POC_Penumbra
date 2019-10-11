package tests;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import utils.excelutils.ExcelUtil;
import utils.listeners.TestListener;


//In order to eliminate attachment problem for Allure, you should add @Listener line.
//link: https://github.com/allure-framework/allure1/issues/730
@Listeners({ TestListener.class })
@Epic("Regression Tests")
@Feature("Login Tests")

public class sampleread extends ExcelUtil
{
    
	ExcelUtil ex = new ExcelUtil();
	public int columncount;
	
	@BeforeTest
    public void setupTestData () {
        //Set Test Data Excel and Sheet
        System.out.println("************Mytest**********");
        ex.setExcelFileSheet("WorkFlow");
    }
	
	@org.testng.annotations.Test
	public void exceloperations()
	{
		int cvalue;
		int cinc = 0;
		
		/*System.out.println("Excel data");
		System.out.println(ex.getCellData(4,1));
		System.out.println(ex.getCellData(4,17));
		System.out.println(ex.getCellData(4,18));
		System.out.println(ex.getCellData(4,19));
		System.out.println(ex.getCellData(5,17));
		System.out.println(ex.getCellData(7,17));*/
			
			ex.setRowNumber(2);
			ex.setColumnNumber(columncount);
			System.out.println("column number is :-"+ columncount);
			int rnum = ex.getRowNumber();
			int cnum = ex.getColumnNumber();
			System.out.println(ex.getCellData(rnum,cnum));
			System.out.println("==================================");
		
			String sub = ex.getCellData(4,16);
			cvalue = Integer.valueOf(sub);
			if(cvalue==1)
			{
				cnum++;
				System.out.println(ex.getCellData(4,cnum));
				System.out.println("------------------");
			   
			}
	}
	  	  
}

