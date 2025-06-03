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

CustomKeywords.'get.ScreenCapture.getEntirePage'('C-51-002-P-Step1.png')

'verify 1 count 1: -HaderSinglePayment'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/label_SinglePayment'))

'verify 1 count 2: -btn_newEntry'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_newEntry'))

'verify 1 count 3: -btn_openDraft'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_openDraft'))

'verify 1 count 4: -btn_help'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_help'))

'verify 1 count 5: -droplist_trfFrom'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/droplist_trfFrom'))

'step 2: Click on droplist_Transfer_From'
WebUI.click(findTestObject('FrontEnd/CU - Single Payment or Purchase/droplist_trfFrom'), FailureHandling.STOP_ON_FAILURE)

'step 3: Enter value in the Search_transferFrom field'
WebUI.setText(findTestObject('FrontEnd/CU - SingleBilling - GenerateBillingID_Reg/Search_transferFrom'), findTestData('FrontEnd/All Test Data/CU - Single Payment or Purchase/Test Data Single Payment').getValue(
        'transferFrom', 3), FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 4: Click on Transfer_From_option'
WebUI.click(findTestObject('FrontEnd/CU - Single Payment or Purchase/option_trfFrom'), FailureHandling.STOP_ON_FAILURE)

'verify 4 count 1: -label_availableBalance'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/label_availableBlc'), FailureHandling.STOP_ON_FAILURE)

'verify 4 count 2: -btn_payeeList'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_payeeList'), FailureHandling.STOP_ON_FAILURE)

'verify 4 count 3: -btn_newPayee'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_newPayee'), FailureHandling.STOP_ON_FAILURE)

'verify 4 count 4: -droplist_payee'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/droplist_payee'), FailureHandling.STOP_ON_FAILURE)

'step 5: Click om btn_newPayee'
WebUI.click(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_newPayee'))

'verify 5 count 1: Checkbox_savePayee'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/checkboc_savePayee'), FailureHandling.STOP_ON_FAILURE)

'verify 5 count 2: textbox_payeeName'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/textbox_payeeName'), FailureHandling.STOP_ON_FAILURE)

'verify 5 count 3: droplist_institution_category'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/droplist_institutionCat'), FailureHandling.STOP_ON_FAILURE)

'verify 5 count 4: droplist_institution'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/droplist_institution'), FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 6: Click on droplist_institution_category'
WebUI.click(findTestObject('FrontEnd/CU - Single Payment or Purchase/droplist_institutionCat'), FailureHandling.STOP_ON_FAILURE)

'step 7: Enter value in the droplist_institution_category field'
WebUI.setText(findTestObject('FrontEnd/CU - Single Payment or Purchase/search_institutCat'), findTestData('FrontEnd/All Test Data/CU - Single Payment or Purchase/Test Data Single Payment').getValue(
        'institutCat', 1), FailureHandling.STOP_ON_FAILURE)

'step 8: Click on  droplist_institution_category_option'
WebUI.click(findTestObject('FrontEnd/CU - Single Payment or Purchase/option_instutiutCat'), FailureHandling.STOP_ON_FAILURE)

'step 9: Click on droplist_institution'
WebUI.click(findTestObject('FrontEnd/CU - Single Payment or Purchase/droplist_institution'), FailureHandling.STOP_ON_FAILURE)

'step 10: Enter value  in the droplist_institution field'
WebUI.setText(findTestObject('FrontEnd/CU - Single Payment or Purchase/search_institutCat'), findTestData('FrontEnd/All Test Data/CU - Single Payment or Purchase/Test Data Single Payment').getValue(
        'institut', 1), FailureHandling.STOP_ON_FAILURE)

'step 11: Click on droplist_institution_option'
WebUI.click(findTestObject('FrontEnd/CU - Single Payment or Purchase/option_instutiutCat'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('FrontEnd/CU - Single Payment or Purchase/textbox_idPel'), 0)

'verify 11 count 1: textbox_IDPelanggan'
WebUI.verifyElementClickable(findTestObject('FrontEnd/CU - Single Payment or Purchase/textbox_idPel'), FailureHandling.STOP_ON_FAILURE)

'step 12: enter value in the textbox_IDPelanggan'
CustomKeywords.'keys.SetTextHandler.handleInput'(findTestObject('FrontEnd/CU - Single Payment or Purchase/textbox_idPel'), 
    findTestData('FrontEnd/All Test Data/CU - Single Billing G3/New Test Data').getValue('idPel', 1))

'step 5: Click on tab_New_Beneficiary_Domestic_Clicked'
WebUI.setText(findTestObject('FrontEnd/CU - Single Payment or Purchase/textbox_idPel'), findTestData('FrontEnd/All Test Data/CU - Single Payment or Purchase/Test Data Single Payment').getValue(
        'idPel', 1))

WebUI.scrollToElement(findTestObject('FrontEnd/CU - Single Payment or Purchase/textbox_accountDescPayee'), 0)

'step 5: Click on tab_New_Beneficiary_Domestic_Clicked'
WebUI.click(findTestObject('FrontEnd/CU - Single Payment or Purchase/textbox_accountDescPayee'), FailureHandling.STOP_ON_FAILURE)

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

WebUI.click(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_specificDate'))

'verify 5 count 1: -checkbox_SaveToBeneList'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/textbox_futureDate'), FailureHandling.STOP_ON_FAILURE)

'verify 5 count 1: -checkbox_SaveToBeneList'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/droplist_session'), FailureHandling.STOP_ON_FAILURE)

'verify 5 count 1: -checkbox_SaveToBeneList'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/datepicklist_expiredOnSpecificDate'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('FrontEnd/CU - Single Payment or Purchase/textbox_futureDate'))

CustomKeywords.'webCalendarDanamon.webCalendarDanamon.customizedNextDate'('3')

'verify 5 count 1: -checkbox_SaveToBeneList'
WebUI.click(findTestObject('FrontEnd/CU - Single Payment or Purchase/droplist_session'), FailureHandling.STOP_ON_FAILURE)

'verify 5 count 1: -checkbox_SaveToBeneList'
WebUI.click(findTestObject('FrontEnd/CU - Single Payment or Purchase/specificDate_session3'), FailureHandling.STOP_ON_FAILURE)

'verify 5 count 1: -checkbox_SaveToBeneList'
WebUI.click(findTestObject('FrontEnd/CU - Single Payment or Purchase/datepicklist_expiredOnSpecificDate'), FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'webCalendarDanamon.webCalendarDanamon.customizedNextDate'('10')

'step 45: Click on button_SaveToDraft_Domestic'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/checkbox_TnC'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('FrontEnd/CU - Single Payment or Purchase/checkbox_TnC'))

'verify 47 count 2: -button_Back_Domestic'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_saveAsDraft'), FailureHandling.STOP_ON_FAILURE)

'verify 47 count 1: -button_Submit_Domestic'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_continue'), FailureHandling.STOP_ON_FAILURE)

'verify 47 count 1: -button_Submit_Domestic'
WebUI.click(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_continue'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

CustomKeywords.'get.ScreenCapture.getEntirePage'('C-51-002-P-Step47.png')

WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/droplist_executionOption'))

WebUI.click(findTestObject('FrontEnd/CU - Single Payment or Purchase/textbox_maxAllowBill'))

WebUI.setText(findTestObject('FrontEnd/CU - Single Payment or Purchase/textbox_maxAllowBill'), findTestData('FrontEnd/All Test Data/CU - Single Payment or Purchase/Test Data Single Payment').getValue(
        'amount', 2))

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
        , ('activityType') : 'create', ('menuName') : 'Single Payment / Purchase', ('product') : 'Bill Payment'], FailureHandling.STOP_ON_FAILURE)

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

