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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

String SSName = 'REG_292'

WebUI.callTestCase(findTestCase('FrontEnd/Step Group (Reusable Group)/Login_FO'), [('corp') : 'corp', ('user') : 'user', ('pass') : 'pass'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/AccessMenu'), [('parentMenu') : 'Transfer Management'
        , ('menu') : 'In-House'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('FrontEnd/TM_InHouseTransfer/button_MultiCurr'), FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'get.ScreenCapture.getEntirePage'(SSName, SSName)

WebUI.setText(findTestObject('FrontEnd/Negative Inhouse/account_txtbx'), findTestData('Negative Inhouse').getValue('AccountNo', 
        26), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('FrontEnd/TM_InHouseTransfer/trxamount'), findTestData('Negative Inhouse').getValue('Amount', 
        26), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('FrontEnd/Negative Inhouse/trx_purpose'))

WebUI.selectOptionByValue(findTestObject('FrontEnd/Negative Inhouse/trx_purpose'), '02', false)

WebUI.setText(findTestObject('FrontEnd/TM_InHouseTransfer/remark1'), 'Remark1', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('FrontEnd/TM_InHouseTransfer/remark2'), 'Remark2', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('FrontEnd/TM_InHouseTransfer/remark3'), 'Remark3', FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.DOWN, Keys.DOWN, Keys.DOWN))

RandRefNo = CustomKeywords.'keys.randomString.generateRandomNum'('9', 'last', 4)

WebUI.click(findTestObject('FrontEnd/TM_InHouseTransfer/orderPartyRefNo'))

WebUI.setText(findTestObject('FrontEnd/TM_InHouseTransfer/orderPartyRefNo'), RandRefNo, FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.DOWN, Keys.DOWN, Keys.DOWN))

WebUI.click(findTestObject('FrontEnd/TM_InHouseTransfer/finalizeFlag'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('FrontEnd/TM_InHouseTransfer/button_SearchBenefi'), FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'utils.PopupAccountSelector.selectAccountFromPopup'('224199294')

CustomKeywords.'get.ScreenCapture.getEntirePage'(SSName, SSName)

WebUI.enhancedClick(findTestObject('FrontEnd/TM_InHouseTransfer/button_InstructionMode'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.DOWN, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.DOWN, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.DOWN, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.DOWN, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.DOWN, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.DOWN, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.DOWN, Keys.DOWN))

WebUI.click(findTestObject('FrontEnd/TM_DomesticTransfer/button_CalendarRecurring'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.DOWN, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.DOWN, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.DOWN, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.DOWN, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.DOWN, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.DOWN, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.DOWN, Keys.DOWN))

CustomKeywords.'webCalendar.webCalendar.customizedNextDate'(findTestData('Negative Inhouse').getValue('NextDateRecurring', 
        26))

WebUI.switchToDefaultContent()

WebUI.enhancedClick(findTestObject('FrontEnd/TM_InHouseTransfer/button_Confirm'))

CustomKeywords.'get.ScreenCapture.getEntirePage'(SSName, SSName)

WebUI.enhancedClick(findTestObject('FrontEnd/TM_DomesticTransfer/button_Submit'), FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

WebUI.switchToDefaultContent()

def refNo = CustomKeywords.'textProcessor.processText.removeText'(': ', findTestObject('FrontEnd/TM_InHouseTransfer/refNo'))

CustomKeywords.'get.ScreenCapture.getEntirePage'(SSName, SSName)

WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/Logout_FO'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FrontEnd/Step Group (Reusable Group)/Login_Aprel_FO'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FrontEnd/Step Group (Reusable Group)/AccessMenu'), [('parentMenu') : 'My Task', ('menu') : 'Pending Task'], 
    FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'keys.CheckorUncheck.CheckUsingCustomKeyword'(findTestObject('FrontEnd/Step Group (Reusable Group)/radiobutton_refNumber'))

CustomKeywords.'get.ScreenCapture.getEntirePage'(SSName, SSName)

WebUI.setText(findTestObject('FrontEnd/Step Group (Reusable Group)/textbox_refNumber'), refNo, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.enhancedClick(findTestObject('FrontEnd/Step Group (Reusable Group)/button_Search'), FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'get.ScreenCapture.getEntirePage'(SSName, SSName)

WebUI.delay(1)

WebUI.enhancedClick(findTestObject('FrontEnd/Step Group (Reusable Group)/hyperlink_Service'), FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'get.ScreenCapture.getEntirePage'(SSName, SSName)

WebUI.enhancedClick(findTestObject('FrontEnd/Negative Inhouse/reject_btn'), FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

CustomKeywords.'get.ScreenCapture.getEntirePage'(SSName, SSName)

CustomKeywords.'utils.VerifyResultMessage.verifyErrorMessageContains'(findTestData('Negative Inhouse').getValue('ErrorMessage', 
        26))

CustomKeywords.'get.PdfGenerator.toPdfFromFolder'(SSName, SSName + ' - Result')

WebUI.closeBrowser()

