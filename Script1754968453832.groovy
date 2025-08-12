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

String SSName = 'REG_564'

WebUI.callTestCase(findTestCase('FrontEnd/Step Group (Reusable Group)/Login_FO'), [('corp') : 'corp', ('user') : 'user', ('pass') : 'pass'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/AccessMenu'), [('parentMenu') : 'Transfer Management'
        , ('menu') : 'International Transfer'], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'get.ScreenCapture.getEntirePage'(SSName, SSName)

WebUI.setText(findTestObject('FrontEnd/Negative International/account_txtbx'), findTestData('Negative International').getValue(
        'FromAccount', 20))

WebUI.click(findTestObject('FrontEnd/Negative International/currency'))

WebUI.selectOptionByValue(findTestObject('FrontEnd/Negative International/currency'), findTestData('Negative International').getValue(
        'Amount Curr', 20), false)

CustomKeywords.'keys.CheckorUncheck.CheckUsingCustomKeyword'(findTestObject('Object Repository/FrontEnd/TM_InternationalTransfer/ExchangeRate', 
        [('ExchangeRate') : '1']))

WebUI.setText(findTestObject('Object Repository/FrontEnd/TM_InternationalTransfer/TicketNumber'), findTestData('Negative International').getValue(
        'TicketNumber', 20), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/FrontEnd/TM_InternationalTransfer/Amount'), findTestData('Negative International').getValue(
        'Amount', 20), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('FrontEnd/TM_InternationalTransfer/remark1'), 'Remark1', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('FrontEnd/TM_InternationalTransfer/remark2'), 'Remark2', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('FrontEnd/TM_InternationalTransfer/remark3'), 'Remark3', FailureHandling.STOP_ON_FAILURE)

RandRemitterRefNo = CustomKeywords.'keys.randomString.generateRandomNum'('8', 'First', 6)

WebUI.setText(findTestObject('FrontEnd/TM_InternationalTransfer/textbox_RemittenceReffNo'), RandRemitterRefNo, FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Object Repository/FrontEnd/TM_InternationalTransfer/NE'))

RandUniqueName = CustomKeywords.'keys.randomString.generateRandomString'('Test', 'First', 5)

WebUI.setText(findTestObject('FrontEnd/TM_InternationalTransfer/UniqueNameFieldNewEntry'), RandUniqueName, FailureHandling.STOP_ON_FAILURE)

RandBeneNo = CustomKeywords.'keys.randomString.generateRandomNum'('802', 'First', 7)

WebUI.setText(findTestObject('FrontEnd/TM_InternationalTransfer/textbox_BeneAccNo'), RandBeneNo, FailureHandling.STOP_ON_FAILURE)

RandBeneName = CustomKeywords.'keys.randomString.generateRandomString'('Test', 'First', 5)

WebUI.setText(findTestObject('FrontEnd/TM_InternationalTransfer/textbox_BeneName'), RandBeneName, FailureHandling.STOP_ON_FAILURE)

RandBeneAddress1 = CustomKeywords.'keys.randomString.generateRandomString'('Address', 'First', 6)

WebUI.setText(findTestObject('FrontEnd/TM_InternationalTransfer/textbox_BeneAddress1'), RandBeneAddress1, FailureHandling.STOP_ON_FAILURE)

RandBeneAddress2 = CustomKeywords.'keys.randomString.generateRandomString'('Address', 'First', 6)

WebUI.setText(findTestObject('FrontEnd/TM_InternationalTransfer/textbox_BeneAddress2'), RandBeneAddress2, FailureHandling.STOP_ON_FAILURE)

RandBeneAddress3 = CustomKeywords.'keys.randomString.generateRandomString'('Address', 'First', 6)

WebUI.setText(findTestObject('FrontEnd/TM_InternationalTransfer/textbox_BeneAddress3'), RandBeneAddress3, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN, Keys.UP, Keys.UP))

WebUI.selectOptionByLabel(findTestObject('FrontEnd/TM_InternationalTransfer/OrgDirectory_Droplist'), 'FED1', false)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN, Keys.PAGE_DOWN))

CustomKeywords.'get.ScreenCapture.getEntirePage'(SSName, SSName)

WebUI.enhancedClick(findTestObject('FrontEnd/TM_InternationalTransfer/findBankCode'))

CustomKeywords.'utils.PopupAccountSelector.selectAccountFromPopup'('9496')

WebUI.setText(findTestObject('FrontEnd/TM_InternationalTransfer/textbox_CorespondentBank'), findTestData('Negative International').getValue(
        'Corespondent Bank', 11), FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'get.ScreenCapture.getEntirePage'(SSName, SSName)

WebUI.enhancedClick(findTestObject('Object Repository/FrontEnd/TM_InternationalTransfer/BenefLLDInformationTab'))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN, Keys.PAGE_DOWN))

WebUI.delay(2)

CustomKeywords.'get.ScreenCapture.getEntirePage'(SSName, SSName)

WebUI.enhancedClick(findTestObject('FrontEnd/TM_DomesticTransfer/button_InstructionMode'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.DOWN, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.DOWN, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.DOWN, Keys.DOWN))

WebUI.enhancedClick(findTestObject('Object Repository/FrontEnd/TM_InternationalTransfer/button_Confirm'), FailureHandling.STOP_ON_FAILURE)

WebUI.switchToFrame(findTestObject('FrontEnd/iFrame/iframe_Mainframe'), 50)

CustomKeywords.'get.ScreenCapture.getEntirePage'(SSName, SSName)

CustomKeywords.'utils.VerifyErrorMessage.verifyErrorMessageContains'(findTestData('Negative International').getValue('ErrorMessage', 
        20))

CustomKeywords.'get.PdfGenerator.toPdfFromFolder'(SSName, SSName + ' - Result')

WebUI.closeBrowser()

