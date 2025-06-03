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

'step 1: Step Group - accessMenuSinglePayment Step Group (Reusable Group)'
WebUI.callTestCase(findTestCase('FrontEnd/CU - Single Payment or Purchase/Step Group/Step Group - accessSinglePaymentSingleCorp'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

CustomKeywords.'get.ScreenCapture.getEntirePage'('C-51-002-P-Step1.png')

WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/label_SinglePayment'))

WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_newEntry'))

WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_openDraft'))

WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_help'))

'step 2: Click on droplist_Transfer_From_Domestic'
WebUI.click(findTestObject('FrontEnd/CU - Single Payment or Purchase/droplist_trfFrom'), FailureHandling.STOP_ON_FAILURE)

'step 3: Enter value 003571403611 in the Search_transferFrom field'
WebUI.setText(findTestObject('FrontEnd/CU - SingleBilling - GenerateBillingID_Reg/Search_transferFrom'), findTestData('FrontEnd/All Test Data/CU - Single Payment or Purchase/Test Data Single Payment').getValue(
        'transferFrom', 3), FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 3: Click on Transfer_From_1825736'
WebUI.click(findTestObject('FrontEnd/CU - Single Payment or Purchase/option_trfFrom'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/label_availableBlc'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_payeeList'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_newPayee'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_newPayee'))

'step 5: Click on tab_New_Beneficiary_Domestic_Clicked'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/checkboc_savePayee'), FailureHandling.STOP_ON_FAILURE)

'step 5: Click on tab_New_Beneficiary_Domestic_Clicked'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/textbox_payeeName'), FailureHandling.STOP_ON_FAILURE)

'step 5: Click on tab_New_Beneficiary_Domestic_Clicked'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/droplist_institutionCat'), FailureHandling.STOP_ON_FAILURE)

'step 5: Click on tab_New_Beneficiary_Domestic_Clicked'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/droplist_institution'), FailureHandling.STOP_ON_FAILURE)

'step 5: Click on tab_New_Beneficiary_Domestic_Clicked'
WebUI.click(findTestObject('FrontEnd/CU - Single Payment or Purchase/droplist_institutionCat'), FailureHandling.STOP_ON_FAILURE)

'step 3: Enter value 003571403611 in the Search_transferFrom field'
WebUI.setText(findTestObject('FrontEnd/CU - Single Payment or Purchase/search_institutCat'), findTestData('FrontEnd/All Test Data/CU - Single Payment or Purchase/Test Data Single Payment').getValue(
        'institutCat', 5), FailureHandling.STOP_ON_FAILURE)

'step 3: Click on Transfer_From_1825736'
WebUI.click(findTestObject('FrontEnd/CU - Single Payment or Purchase/option_instutiutCat'), FailureHandling.STOP_ON_FAILURE)

'step 5: Click on tab_New_Beneficiary_Domestic_Clicked'
WebUI.click(findTestObject('FrontEnd/CU - Single Payment or Purchase/droplist_institution'), FailureHandling.STOP_ON_FAILURE)

'step 3: Enter value 003571403611 in the Search_transferFrom field'
WebUI.setText(findTestObject('FrontEnd/CU - Single Payment or Purchase/search_institutCat'), findTestData('FrontEnd/All Test Data/CU - Single Payment or Purchase/Test Data Single Payment').getValue(
        'institut', 5), FailureHandling.STOP_ON_FAILURE)

'step 3: Click on Transfer_From_1825736'
WebUI.click(findTestObject('FrontEnd/CU - Single Payment or Purchase/option_instutiutCat'), FailureHandling.STOP_ON_FAILURE)

'step 3: Click on Transfer_From_1825736'
WebUI.scrollToElement(findTestObject('FrontEnd/CU - Single Payment or Purchase/textbox_idPel'), 0)

'step 3: Click on Transfer_From_1825736'
WebUI.verifyElementClickable(findTestObject('FrontEnd/CU - Single Payment or Purchase/textbox_idPel'), FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'keys.SetTextHandler.handleInput'(findTestObject('FrontEnd/CU - Single Payment or Purchase/textbox_idPel'), 
    findTestData('FrontEnd/All Test Data/CU - Single Billing G3/New Test Data').getValue('idPel', 5))

WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/textbox_accountDescPayee'))

'step 4: Enter value TestingInhouse in the textbox_FromAccount_Desc_Domestic field'
WebUI.setText(findTestObject('FrontEnd/CU - Single Payment or Purchase/textbox_accountDescPayee'), findTestData('FrontEnd/All Test Data/CU - Single Payment or Purchase/Test Data Single Payment').getValue(
        'accDesc', 1), FailureHandling.STOP_ON_FAILURE)

'verify 5 count 1: -checkbox_SaveToBeneList'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_immediate'), FailureHandling.STOP_ON_FAILURE)

'verify 5 count 1: -checkbox_SaveToBeneList'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_specificDate'), FailureHandling.STOP_ON_FAILURE)

'verify 5 count 1: -checkbox_SaveToBeneList'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_repeat'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_specificDate'), 0)

WebUI.delay(5)

CustomKeywords.'get.ScreenCapture.getEntirePage'('C-51-002-P-Step5.png')

WebUI.click(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_specificDate'))

'verify 5 count 1: -checkbox_SaveToBeneList'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/textbox_futureDate'), FailureHandling.STOP_ON_FAILURE)

'verify 5 count 1: -checkbox_SaveToBeneList'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/droplist_session'), FailureHandling.STOP_ON_FAILURE)

'verify 5 count 1: -checkbox_SaveToBeneList'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/datepicklist_expiredOnSpecificDate'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('FrontEnd/CU - Single Payment or Purchase/textbox_futureDate'))

CustomKeywords.'webCalendarDanamon.webCalendarDanamon.customizedNextDate'('5')

'verify 5 count 1: -checkbox_SaveToBeneList'
WebUI.click(findTestObject('FrontEnd/CU - Single Payment or Purchase/droplist_session'), FailureHandling.STOP_ON_FAILURE)

'verify 5 count 1: -checkbox_SaveToBeneList'
WebUI.click(findTestObject('FrontEnd/CU - Single Payment or Purchase/specificDate_session3'), FailureHandling.STOP_ON_FAILURE)

'verify 5 count 1: -checkbox_SaveToBeneList'
WebUI.click(findTestObject('FrontEnd/CU - Single Payment or Purchase/datepicklist_expiredOnSpecificDate'), FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'webCalendarDanamon.webCalendarDanamon.customizedNextDate'('7')

'step 45: Click on button_SaveToDraft_Domestic'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/checkbox_TnC'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('FrontEnd/CU - Single Payment or Purchase/checkbox_TnC'))

'verify 47 count 2: -button_Back_Domestic'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_saveAsDraft'), FailureHandling.STOP_ON_FAILURE)

'verify 47 count 1: -button_Submit_Domestic'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_continue'), FailureHandling.STOP_ON_FAILURE)

'verify 47 count 1: -button_Submit_Domestic'
WebUI.click(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_continue'), FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'get.ScreenCapture.getEntirePage'('C-51-002-P-Step37.png')

WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/droplist_chooseAmount'))

'step 3: Click on Transfer_From_1825736'
WebUI.click(findTestObject('FrontEnd/CU - Single Payment or Purchase/droplist_chooseAmount'), FailureHandling.STOP_ON_FAILURE)

'step 3: Enter value 003571403611 in the Search_transferFrom field'
WebUI.setText(findTestObject('FrontEnd/CU - Single Payment or Purchase/search_amount'), findTestData('FrontEnd/All Test Data/CU - Single Payment or Purchase/Test Data Single Payment').getValue(
        'amount', 1), FailureHandling.STOP_ON_FAILURE)

'step 3: Click on Transfer_From_1825736'
WebUI.click(findTestObject('FrontEnd/CU - Single Payment or Purchase/option_amount'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_confirm'), 0)

WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_back'))

WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_confirm'))

WebUI.click(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_confirm'))

WebUI.delay(5)

'generated step 11.0'
WebUI.scrollToElement(findTestObject('Object Repository/FrontEnd/Step Group (Reusable Group)/text_Response'), 0)

'generated step 11.0'
WebUI.waitForElementVisible(findTestObject('Object Repository/FrontEnd/Step Group (Reusable Group)/text_Response'), 0)

CustomKeywords.'webResponseCodeDanamon.webResponseCodeDanamon.responseNumberHandler'(['NUMPAD1', 'NUMPAD2', 'NUMPAD3', 'NUMPAD4'
        , 'NUMPAD5', 'NUMPAD6'], findTestObject('FrontEnd/Step Group (Reusable Group)/text_Response'))

WebUI.scrollToElement(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_back'), 0)

WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_back'))

'step 9: Click on button_SubmitConfirmation'
WebUI.click(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_submit'), FailureHandling.OPTIONAL)

'step 9: Click on button_SubmitConfirmation'
WebUI.click(findTestObject('FrontEnd/CU - Balance Transfer - Corp Single/button_popUpSubmit'), FailureHandling.OPTIONAL)

CustomKeywords.'get.ScreenCapture.getEntirePage'('C-4-001-P-Step49.png')

'step 40: Use custom keyword textProcessor.processText.removeText with input Reference No , object: label_ReferenceNo then assign into variable: refNo'
def refNo = CustomKeywords.'textProcessor.processText.removeText'('Reference No ', findTestObject('FrontEnd/CU-Single Transfer Domestic Single/label_ReferenceNo'))

WebUI.delay(5)

'verify 49 count 1: -button_Done_Domestic'
WebUI.scrollToElement(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_done'), 0)

'verify 49 count 1: -button_Done_Domestic'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_done'), FailureHandling.STOP_ON_FAILURE)

'verify 49 count 1: -button_Done_Domestic'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_downloadResult'), FailureHandling.STOP_ON_FAILURE)

'verify 49 count 1: -button_Done_Domestic'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_workflow'), FailureHandling.STOP_ON_FAILURE)

'verify 49 count 1: -button_Done_Domestic'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_printResult'), FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'get.ScreenCapture.getEntirePage'('C-4-001-P-Step49.png')

'verify 49 count 1: -button_Done_Domestic'
WebUI.click(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_done'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/label_SinglePayment'))

WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_newEntry'))

WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_openDraft'))

CustomKeywords.'get.ScreenCapture.getEntirePage'('C-4-001-P-Step50.png')

'step 42: Logout Step Group (Reusable Group)'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 52: LoginFO Step Group (Reusable Group) with test data: Test Data UserGlobal, corporateID: corp row: 5, username: user row: 5, password: pass row: 5'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/LoginFO'), [('corporateID') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserGlobal').getValue('corp', 20), ('username') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserGlobal').getValue('user', 20), ('password') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserGlobal').getValue('pass', 5)], FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 53: accessTransactionStatusCorpByRefNo Step Group (Reusable Group) with parameter refNo: refNo'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/accessTransactionStatusCorpByRefNo'), [
        ('refNo') : refNo], FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 54: Logout Step Group (Reusable Group)'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

'step 67: LoginFO Step Group (Reusable Group) with test data: Test Data UserGlobal, corporateID: corp row: 5, username: user row: 5, password: pass row: 5'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/LoginFO'), [('corporateID') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserGlobal').getValue('corp', 20), ('username') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserGlobal').getValue('user', 20), ('password') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserGlobal').getValue('pass', 5)], FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 68: accessCorporateFinancial Step Group (Reusable Group) with test data: Test Data MenuGlobal, menuName: Menu row: 4'
WebUI.callTestCase(findTestCase('FrontEnd/Step Group (Reusable Group)/accessCorporateFinancial'), [('activityBy') : 'Killua Zoldyck'
        , ('activityType') : 'create', ('menuName') : 'Single Payment / Purchase', ('product') : 'Purchase'], FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 69: Logout Step Group (Reusable Group)'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

'step 55: LoginBO Step Group (Reusable Group) with test data: Test Data UserBoGlobal, username: User row: 3, password: Pass row: 3'
not_run: WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/LoginBO'), [('username') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserBoGlobal').getValue('User', 3), ('password') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserBoGlobal').getValue('Pass', 3)], FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 56: accessTransactionStatusBoByRefNo Step Group (Reusable Group) with parameter refNo: refNo'
not_run: WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/accessTransactionStatusBoByRefNo'), 
    [('refNo') : refNo], FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 57: LogoutBo Step Group (Reusable Group)'
not_run: WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/LogoutBo'), [:], FailureHandling.STOP_ON_FAILURE)

