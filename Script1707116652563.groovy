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

CustomKeywords.'get.ScreenCapture.getEntirePage'('C-51-006-P-Step1.png')

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

'step 3: Enter value  in the Search_transferFrom field'
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

'step 5: Click on btn_newPayee'
WebUI.click(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_newPayee'))

'verify 5 count 1: checkbox_newPayee'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/checkboc_savePayee'), FailureHandling.STOP_ON_FAILURE)

'verify 5 count 2: textbox_payeeName'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/textbox_payeeName'), FailureHandling.STOP_ON_FAILURE)

'verify 5 count 3: droplist_institution_category'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/droplist_institutionCat'), FailureHandling.STOP_ON_FAILURE)

'verify 5 count 4: droplist_institution'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/droplist_institution'), FailureHandling.STOP_ON_FAILURE)

'step 6: Click on droplist_institution_category'
WebUI.click(findTestObject('FrontEnd/CU - Single Payment or Purchase/droplist_institutionCat'), FailureHandling.STOP_ON_FAILURE)

'step 7: Enter value  in the search_institution_category field'
WebUI.setText(findTestObject('FrontEnd/CU - Single Payment or Purchase/search_institutCat'), findTestData('FrontEnd/All Test Data/CU - Single Payment or Purchase/Test Data Single Payment').getValue(
        'institutCat', 3), FailureHandling.STOP_ON_FAILURE)

'step 8: Click on droplist_institution_category option'
WebUI.click(findTestObject('FrontEnd/CU - Single Payment or Purchase/option_instutiutCat'), FailureHandling.STOP_ON_FAILURE)

'step 9: Click on droplist_institution'
WebUI.click(findTestObject('FrontEnd/CU - Single Payment or Purchase/droplist_institution'), FailureHandling.STOP_ON_FAILURE)

'step 10: Enter value  in the Search_droplist_institution field'
WebUI.setText(findTestObject('FrontEnd/CU - Single Payment or Purchase/search_institutCat'), findTestData('FrontEnd/All Test Data/CU - Single Payment or Purchase/Test Data Single Payment').getValue(
        'institut', 3), FailureHandling.STOP_ON_FAILURE)

'step 11: Click on droplist_institution option'
WebUI.click(findTestObject('FrontEnd/CU - Single Payment or Purchase/option_instutiutCat'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('FrontEnd/CU - Single Payment or Purchase/textbox_idPel'), 0)

'verify 11 count 1: textbox_idPel'
WebUI.verifyElementClickable(findTestObject('FrontEnd/CU - Single Payment or Purchase/textbox_idPel'), FailureHandling.STOP_ON_FAILURE)

'step 11: Enter value  in the extbox_idPel field'
CustomKeywords.'keys.SetTextHandler.handleInput'(findTestObject('FrontEnd/CU - Single Payment or Purchase/textbox_idPel'), 
    findTestData('FrontEnd/All Test Data/CU - Single Billing G3/New Test Data').getValue('idPel', 3))

WebUI.scrollToElement(findTestObject('FrontEnd/CU - Single Payment or Purchase/textbox_periodeBPJS'), 0)

'verify 11 count 1: PeriodeBPJS'
WebUI.verifyElementClickable(findTestObject('FrontEnd/CU - Single Payment or Purchase/textbox_periodeBPJS'), FailureHandling.STOP_ON_FAILURE)

'step 12: Enter value  in the PeriodeBPJS field'
CustomKeywords.'keys.SetTextHandler.handleInput'(findTestObject('FrontEnd/CU - Single Payment or Purchase/textbox_periodeBPJS'), 
    findTestData('FrontEnd/All Test Data/CU - Single Billing G3/New Test Data').getValue('tahunPajak', 1))

'verify 12 count 1: textbox_accountDescPayee'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/textbox_accountDescPayee'))

'step 13: Enter value in the ttextbox_accountDescPayee field'
WebUI.setText(findTestObject('FrontEnd/CU - Single Payment or Purchase/textbox_accountDescPayee'), findTestData('FrontEnd/All Test Data/CU - Single Payment or Purchase/Test Data Single Payment').getValue(
        'accDesc', 1), FailureHandling.STOP_ON_FAILURE)

'verify 13 count 1: -btn_immediate'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_immediate'), FailureHandling.STOP_ON_FAILURE)

'verify 13 count 2: -btn_specificDate'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_specificDate'), FailureHandling.STOP_ON_FAILURE)

'verify 13 count 3: -btn_repeat'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_repeat'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_specificDate'), 0)

'step 14: Click on btn_specificDate'
WebUI.click(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_specificDate'))

'verify 14 count 1: -textbox_futureDate'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/textbox_futureDate'), FailureHandling.STOP_ON_FAILURE)

'verify 14 count 2: -droplist_session'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/droplist_session'), FailureHandling.STOP_ON_FAILURE)

'verify 14 count 3: -datepicklist_expiredOnSpecificDate'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/datepicklist_expiredOnSpecificDate'), 
    FailureHandling.STOP_ON_FAILURE)

'step 15: Click on textbox_futureDate'
WebUI.click(findTestObject('FrontEnd/CU - Single Payment or Purchase/textbox_futureDate'))

CustomKeywords.'webCalendarDanamon.webCalendarDanamon.customizedNextDate'('5')

'step 16: Click on droplist_session'
WebUI.click(findTestObject('FrontEnd/CU - Single Payment or Purchase/droplist_session'), FailureHandling.STOP_ON_FAILURE)

'step 17: Click in specificDate_session3'
WebUI.click(findTestObject('FrontEnd/CU - Single Payment or Purchase/specificDate_session3'), FailureHandling.STOP_ON_FAILURE)

'step 18: Click on datepicklist_expiredOnSpecificDate'
WebUI.click(findTestObject('FrontEnd/CU - Single Payment or Purchase/datepicklist_expiredOnSpecificDate'), FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'webCalendarDanamon.webCalendarDanamon.customizedNextDate'('7')

'verify 18 count 1: checkboc_TnC'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/checkbox_TnC'), FailureHandling.STOP_ON_FAILURE)

'step 19: Click on checkboc_TnC'
WebUI.click(findTestObject('FrontEnd/CU - Single Payment or Purchase/checkbox_TnC'))

'verify 19 count 1: -button_saveAsDraft'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_saveAsDraft'), FailureHandling.STOP_ON_FAILURE)

'verify 19 count 2: -button_Scontinue'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_continue'), FailureHandling.STOP_ON_FAILURE)

'step 20: Click on -button_continue'
WebUI.click(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_continue'), FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'get.ScreenCapture.getEntirePage'('C-51-006-P-Step20.png')

'verify 20 count 1: -droplist_executionOption'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/droplist_executionOption'))

'step 21: Click on textbox_maxAllowBill'
WebUI.click(findTestObject('FrontEnd/CU - Single Payment or Purchase/textbox_maxAllowBill'))

'step 22: Enter value in the textbox_maxAllowBill field'
WebUI.setText(findTestObject('FrontEnd/CU - Single Payment or Purchase/textbox_maxAllowBill'), findTestData('FrontEnd/All Test Data/CU - Single Payment or Purchase/Test Data Single Payment').getValue(
        'amount', 3))

WebUI.scrollToElement(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_confirm'), 0)

'verify 22 count 1: -btn_back'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_back'))

'verify 22 count 2: -btn_confirm'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_confirm'))

'step 23: Click on btn_confirm'
WebUI.click(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_confirm'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Object Repository/FrontEnd/Step Group (Reusable Group)/text_Response'), 0)

WebUI.waitForElementVisible(findTestObject('Object Repository/FrontEnd/Step Group (Reusable Group)/text_Response'), 0)

CustomKeywords.'webResponseCodeDanamon.webResponseCodeDanamon.responseNumberHandler'(['NUMPAD1', 'NUMPAD2', 'NUMPAD3', 'NUMPAD4'
        , 'NUMPAD5', 'NUMPAD6'], findTestObject('FrontEnd/Step Group (Reusable Group)/text_Response'))

WebUI.scrollToElement(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_back'), 0)

'verify 23 count 1: -btn_back'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_back'))

'step 24: Click on button_SubmitConfirmation'
WebUI.click(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_submit'), FailureHandling.OPTIONAL)

'step 25: Click on button_SubmitConfirmation popup'
WebUI.click(findTestObject('FrontEnd/CU - Balance Transfer - Corp Single/button_popUpSubmit'), FailureHandling.OPTIONAL)

CustomKeywords.'get.ScreenCapture.getEntirePage'('C-51-006-P-Step25.png')

'step 26: Use custom keyword textProcessor.processText.removeText with input Reference No , object: label_ReferenceNo then assign into variable: refNo'
def refNo = CustomKeywords.'textProcessor.processText.removeText'('Reference No ', findTestObject('FrontEnd/CU-Single Transfer Domestic Single/label_ReferenceNo'))

CustomKeywords.'get.ScreenCapture.getEntirePage'('C-51-006-P-Step26.png')

'step 27: Logout Step Group (Reusable Group)'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 28: LoginFO Step Group (Reusable Group) with test data: Test Data UserGlobal, corporateID: corp row: 5, username: user row: 5, password: pass row: 5'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/LoginFO'), [('corporateID') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserGlobal').getValue('corp', 20), ('username') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserGlobal').getValue('user', 20), ('password') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserGlobal').getValue('pass', 5)], FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 29: accessTransactionStatusCorpByRefNo Step Group (Reusable Group) with parameter refNo: refNo'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/accessTransactionStatusCorpByRefNo'), [
        ('refNo') : refNo], FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 30: Logout Step Group (Reusable Group)'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

'step 31: LoginFO Step Group (Reusable Group) with test data: Test Data UserGlobal, corporateID: corp row: 5, username: user row: 5, password: pass row: 5'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/LoginFO'), [('corporateID') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserGlobal').getValue('corp', 20), ('username') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserGlobal').getValue('user', 20), ('password') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserGlobal').getValue('pass', 5)], FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 32: accessCorporateFinancial Step Group (Reusable Group) with test data: Test Data MenuGlobal, menuName: Menu row: 4'
WebUI.callTestCase(findTestCase('FrontEnd/Step Group (Reusable Group)/accessCorporateFinancial'), [('activityBy') : 'Killua Zoldyck'
        , ('activityType') : 'create', ('menuName') : 'Single Payment / Purchase', ('product') : 'Bill Payment'], FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 33: Logout Step Group (Reusable Group)'
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

