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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Username_username'), username)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_OrangeHRM/input_Password_password'), password)


//WebUI.verifyElementNotPresent(findTestObject('Object Repository/Page_OrangeHRM/p_Invalid credentials'), 0)



//if (WebUI.verifyElementNotPresent(findTestObject('Object Repository/Page_OrangeHRM/div_Invalid credentials'),0, FailureHandling.OPTIONAL)) {
//	a = false
//}
//if (WebUI.verifyElementNotVisible(findTestObject('Object Repository/Page_OrangeHRM/div_Invalid credentials'))) {
//    def a = true
//}

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Login'))

notShow=  WebUI.verifyElementText(findTestObject('Object Repository/Page_OrangeHRM/div_Invalid credentials'), 'Invalid credentials',FailureHandling.OPTIONAL)
if (notShow == false) {
    WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/span_manda user'))

    WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_Logout'))

    WebUI.closeBrowser()
} else {
    WebUI.verifyElementVisible(findTestObject('Object Repository/Page_OrangeHRM/div_Invalid credentials'))
	WebUI.verifyElementText(findTestObject('Object Repository/Page_OrangeHRM/div_Invalid credentials'), 'Invalid credentials')

    WebUI.closeBrowser()
}



