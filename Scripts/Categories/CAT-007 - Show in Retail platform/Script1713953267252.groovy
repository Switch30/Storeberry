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

WebUI.callTestCase(findTestCase('Login/LOG-001 - Access Storeberry'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Categories/span_Categories'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Categories/text_All Categories'), 20)

catName = 'All red'

WebUI.setText(findTestObject('Object Repository/Categories/input_search'), catName)

WebUI.sendKeys(findTestObject('Object Repository/Categories/input_search'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Categories/button_Select All'))

WebUI.click(findTestObject('Object Repository/Categories/button_Action'))

WebUI.click(findTestObject('Object Repository/Categories/option_Show in retail plaform'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Categories/green_Status'), 20)

WebUI.click(findTestObject('Categories/button_Select All'))

WebUI.click(findTestObject('Object Repository/Categories/button_Action'))

WebUI.click(findTestObject('Object Repository/Categories/option_Hide in retail plaform'))