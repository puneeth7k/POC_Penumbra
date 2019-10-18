package info.methods;

import info.stepdefinitions.PredefinedStepDefinitions;

public interface BaseTest
{
	MiscMethods miscmethodObj = new MiscMethods();
	NavigateMethods navigationObj = new NavigateMethods();
	AssertionMethods assertionObj = new AssertionMethods();
	ClickElementsMethods clickObj = new ClickElementsMethods();
	ConfigurationMethods configObj = new ConfigurationMethods();
	InputMethods inputObj = new InputMethods();
	ProgressMethods progressObj = new ProgressMethods();
	JavascriptHandlingMethods javascriptObj = new JavascriptHandlingMethods();
	ScreenShotMethods screenshotObj = new ScreenShotMethods();
	xpaths xpath = new xpaths();
	getRandomNumberInRange ran = new getRandomNumberInRange();
	PredefinedStepDefinitions predef = new PredefinedStepDefinitions();
}
