import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.openBrowser('')

WebUI.navigateToUrl('https://the-internet.herokuapp.com/')

WebUI.click(findTestObject('Object Repository/Page_Alerts/a_JavaScript Alerts'))

WebUI.click(findTestObject('Object Repository/Page_Alerts/button_Click for JS Alert'))

WebUI.acceptAlert()

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Alerts/p_You successfully clicked an alert'), 
    GlobalVariable.G_ShortTimeOut)

WebUI.click(findTestObject('Object Repository/Page_Alerts/button_Click for JS Confirm'))

WebUI.acceptAlert()

WebUI.verifyElementPresent(findTestObject('Page_Alerts/p_You clicked Ok'), GlobalVariable.G_ShortTimeOut)

WebUI.click(findTestObject('Object Repository/Page_Alerts/button_Click for JS Prompt'))

WebDriver driver = DriverFactory.getWebDriver()

'Passing the text in the text box in the Alert\r\n'
driver.switchTo().alert().sendKeys('imam')

WebUI.acceptAlert()

WebUI.verifyElementPresent(findTestObject('Page_Alerts/p_You entered imam'), GlobalVariable.G_ShortTimeOut)

WebUI.closeBrowser()

