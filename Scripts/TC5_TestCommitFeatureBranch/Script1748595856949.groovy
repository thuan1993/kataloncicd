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

WebUI.callTestCase(findTestCase('TC2_Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Object Repository/BuySomeThing/Page_Home Page/span_Men'))

WebUI.mouseOver(findTestObject('Object Repository/BuySomeThing/Page_Home Page/a_Tops'))

WebUI.click(findTestObject('Object Repository/BuySomeThing/Page_Home Page/a_Jackets'))

WebUI.click(findTestObject('Object Repository/BuySomeThing/Page_Jackets - Tops - Men/a_Proteus Fitness Jackshirt'))

WebUI.click(findTestObject('Object Repository/BuySomeThing/Page_Proteus Fitness Jackshirt/div_M'))

WebUI.click(findTestObject('Object Repository/BuySomeThing/Page_Proteus Fitness Jackshirt/div_Color_option-label-color-93-item-50'))

WebUI.click(findTestObject('Object Repository/BuySomeThing/Page_Proteus Fitness Jackshirt/span_Add to Cart'))

WebUI.verifyElementVisible(findTestObject('Object Repository/BuySomeThing/Page_Proteus Fitness Jackshirt/div_You added Proteus Fitness Jackshirt to _542899'))

WebUI.click(findTestObject('Object Repository/BuySomeThing/Page_Proteus Fitness Jackshirt/a_My Cart                    1             _241c1f'))

WebUI.click(findTestObject('Object Repository/BuySomeThing/Page_Proteus Fitness Jackshirt/button_Proceed to Checkout'))

WebUI.verifyElementVisible(findTestObject('Object Repository/BuySomeThing/Page_Checkout/span_Shipping'))

WebUI.closeBrowser()

