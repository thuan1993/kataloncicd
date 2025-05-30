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

String testEmail = GlobalVariable.G_email

String password = GlobalVariable.G_password

String firstName = GlobalVariable.G_firstName

String lastName = GlobalVariable.G_lastName

WebUI.openBrowser('')

WebUI.navigateToUrl('https://magento.softwaretestingboard.com/')

WebUI.click(findTestObject('Object Repository/LoginPage/Page_Home Page/a_Sign In'))

WebUI.setText(findTestObject('Object Repository/LoginPage/Page_Customer Login/input_Email_loginusername'), testEmail)

WebUI.setEncryptedText(findTestObject('Object Repository/LoginPage/Page_Customer Login/input_Password_loginpassword'), password)

WebUI.click(findTestObject('Object Repository/LoginPage/Page_Customer Login/span_Sign In'))

WebUI.verifyElementVisible(findTestObject('LoginPage/Page_Home Page/span_Welcome, Thuan Dinh', [('firstName') : firstName
            , ('lastName') : lastName]))

WebUI.closeBrowser()

