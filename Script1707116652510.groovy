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
WebUI.callTestCase(findTestCase('FrontEnd/CU - Single Payment or Purchase/Step Group/Step Group - accessSinglePaymentOrPurchase'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

CustomKeywords.'get.ScreenCapture.getEntirePage'('C-51-001-P-Step1.png')

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

'step 4: Enter value Test Data'
WebUI.setText(findTestObject('FrontEnd/CU - SingleBilling - GenerateBillingID_Reg/Search_transferFrom'), findTestData('FrontEnd/All Test Data/CU - Single Payment or Purchase/Test Data Single Payment').getValue(
        'transferFrom', 3), FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 5: Click on Transfer_From_Option'
WebUI.click(findTestObject('FrontEnd/CU - Single Payment or Purchase/option_trfFrom'), FailureHandling.STOP_ON_FAILURE)

'verify 5 count 1: -label_availableBalance'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/label_availableBlc'), FailureHandling.STOP_ON_FAILURE)

'verify 5 count 2: -btn_payeeList'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_payeeList'), FailureHandling.STOP_ON_FAILURE)

'verify 5 count 3: -btn_newPayee'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_newPayee'), FailureHandling.STOP_ON_FAILURE)

'verify 5 count 4: -droplist_payee'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/droplist_payee'), FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 6 : Click -droplist_payee'
WebUI.click(findTestObject('FrontEnd/CU - Single Payment or Purchase/droplist_payee'), FailureHandling.STOP_ON_FAILURE)

'step 7: Enter value in the payee field'
WebUI.setText(findTestObject('FrontEnd/CU - Single Payment or Purchase/search_payee'), findTestData('FrontEnd/All Test Data/CU - Single Billing G3/New Test Data').getValue(
        'payee', 2), FailureHandling.STOP_ON_FAILURE)

'step 8: Click on optin_payee'
WebUI.click(findTestObject('FrontEnd/CU - Single Payment or Purchase/option_payee'), FailureHandling.STOP_ON_FAILURE)

'verify 8 count 1: -Textbox_accountDescPayee'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/textbox_accountDescPayee'))

'step 9: Click -Textbox_accountDescPayee'
WebUI.click(findTestObject('FrontEnd/CU - Single Payment or Purchase/textbox_accountDescPayee'))

//No verification required
'step 10: Enter value in the Textbox_accountDescPayee field'
WebUI.setText(findTestObject('FrontEnd/CU - Single Payment or Purchase/textbox_accountDescPayee'), findTestData('FrontEnd/All Test Data/CU - Single Payment or Purchase/Test Data Single Payment').getValue(
        'accDesc', 1), FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'get.ScreenCapture.getEntirePage'('C-51-001-P-Step10.png')

'verify 10 count 1: -btn_immediate'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_immediate'), FailureHandling.STOP_ON_FAILURE)

'verify 10 count 2: -btn_ispecificDate'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_specificDate'), FailureHandling.STOP_ON_FAILURE)

'verify 10 count 3: -btn_repeat'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_repeat'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('FrontEnd/CU - Single Payment or Purchase/datepicklist_ExpiredOn'), 0)

'step 11: Click - datepicklist_expiredOn'
WebUI.click(findTestObject('FrontEnd/CU - Single Payment or Purchase/datepicklist_ExpiredOn'))

CustomKeywords.'webCalendarDanamon.webCalendarDanamon.customizedNextDate'('5')

WebUI.scrollToElement(findTestObject('FrontEnd/CU - Single Payment or Purchase/datepicklist_ExpiredOn'), 0)

'step 12: Click - checkbox_TnC'
WebUI.click(findTestObject('FrontEnd/CU - Single Payment or Purchase/checkbox_TnC'))

CustomKeywords.'get.ScreenCapture.getEntirePage'('C-51-001-P-Step12.png')

'verify 12 count 1: -btn_saveAsDraft'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_saveAsDraft'), FailureHandling.STOP_ON_FAILURE)

'verify 12 count 2: -btn_continue'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_continue'), FailureHandling.STOP_ON_FAILURE)

'step 13: Click on button_continue'
WebUI.click(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_continue'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

CustomKeywords.'get.ScreenCapture.getEntirePage'('C-51-001-P-Step13.png')

'verify 13 count 1: -droplist_executionOption'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/droplist_executionOption'))

'step 14: Click -textbox_maxAllowBill'
WebUI.click(findTestObject('FrontEnd/CU - Single Payment or Purchase/textbox_maxAllowBill'))

'step 15: Enter value in the maxAllowBill field'
WebUI.setText(findTestObject('FrontEnd/CU - Single Payment or Purchase/textbox_maxAllowBill'), findTestData('FrontEnd/All Test Data/CU - Single Payment or Purchase/Test Data Single Payment').getValue(
        'amount', 2))

WebUI.scrollToElement(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_confirm'), 0)

'verify 15 count 1: -btn_back'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_back'))

'verify 15 count 2: -btn_confirm'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_confirm'))

'step 16: Click -btn_confirm'
WebUI.click(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_confirm'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_back'), 0)

'verify 16 count 1: -btn_back'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_back'))

CustomKeywords.'get.ScreenCapture.getEntirePage'('C-51-001-P-Step16.png')

'step 17: Click on button_SubmitConfirmation'
WebUI.click(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_submit'), FailureHandling.OPTIONAL)

'step 18: Click on button_SubmitConfirmation'
WebUI.click(findTestObject('FrontEnd/CU - Balance Transfer - Corp Single/button_popUpSubmit'), FailureHandling.OPTIONAL)

'step 19: Use custom keyword textProcessor.processText.removeText with input Reference No , object: label_ReferenceNo then assign into variable: refNo'
def refNo = CustomKeywords.'textProcessor.processText.removeText'('Reference No ', findTestObject('FrontEnd/CU-Single Transfer Domestic Single/label_ReferenceNo'))

WebUI.delay(5)

CustomKeywords.'get.ScreenCapture.getEntirePage'('C-51-001-P-Step19.png')

WebUI.scrollToElement(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_done'), 0)

'verify 19 count 1: -button_Done'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_done'), FailureHandling.STOP_ON_FAILURE)

'verify 19 count 2: -button_Download'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_downloadResult'), FailureHandling.STOP_ON_FAILURE)

'verify 19 count 3: -button_workflow'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_workflow'), FailureHandling.STOP_ON_FAILURE)

'verify 19 count 4: -button_print'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_printResult'), FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'get.ScreenCapture.getEntirePage'('C-51-001-P-Step19.1.png')

'step 20: Click -button_Done'
WebUI.click(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_done'), FailureHandling.STOP_ON_FAILURE)

'verify 20 count 1: -HaderSinglePayment'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/label_SinglePayment'))

'verify 21 count 2: -btn_newEntry'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_newEntry'))

'verify 22 count 3: -btn_openDraft'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_openDraft'))

CustomKeywords.'get.ScreenCapture.getEntirePage'('C-51-001-P-Step22.png')

'step 23: Logout Step Group (Reusable Group)'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 24: LoginFO Step Group (Reusable Group) with test data: Test Data UserGlobal, corporateID: corp row: 5, username: user row: 5, password: pass row: 5'
not_run: WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/LoginFO'), [('corporateID') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserGlobal').getValue('corp', 5), ('username') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserGlobal').getValue('user', 5), ('password') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserGlobal').getValue('pass', 5)], FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 25: accessTransactionStatusCorpByRefNo Step Group (Reusable Group) with parameter refNo: refNo'
not_run: WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/accessTransactionStatusCorpByRefNo'), 
    [('refNo') : refNo], FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 26: Logout Step Group (Reusable Group)'
not_run: WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

'step 27: LoginBO Step Group (Reusable Group) with test data: Test Data UserBoGlobal, username: User row: 3, password: Pass row: 3'
not_run: WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/LoginBO'), [('username') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserBoGlobal').getValue('User', 3), ('password') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserBoGlobal').getValue('Pass', 3)], FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 28: accessTransactionStatusBoByRefNo Step Group (Reusable Group) with parameter refNo: refNo'
not_run: WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/accessTransactionStatusBoByRefNo'), 
    [('refNo') : refNo], FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 29: LogoutBo Step Group (Reusable Group)'
not_run: WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/LogoutBo'), [:], FailureHandling.STOP_ON_FAILURE)

'step 30: LoginFO Step Group (Reusable Group) with test data: Test Data UserGlobal, corporateID: corp row: 7, username: user row: 7, password: pass row: 7'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/LoginFO'), [('corporateID') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserGlobal').getValue('corp', 7), ('username') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserGlobal').getValue('user', 8), ('password') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserGlobal').getValue('pass', 7)], FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 31: accessPendingTaskCorporateListing Step Group (Reusable Group) with test data: Test Data UserGlobal, corp: corp row: 7, user: user row: 7, pass: pass row: 7, with parameter refNo: refNo'
WebUI.callTestCase(findTestCase('FrontEnd/Step Group (Reusable Group)/accessPendingTaskCorporateListingRefNo'), [('refNo') : refNo], 
    FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 32: Logout Step Group (Reusable Group)'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

'step 33: LoginFO Step Group (Reusable Group) with test data: Test Data UserGlobal, corporateID: corp row: 7, username: user row: 7, password: pass row: 7'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/LoginFO'), [('corporateID') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserGlobal').getValue('corp', 7), ('username') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserGlobal').getValue('user', 8), ('password') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserGlobal').getValue('pass', 7)], FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 34: accessPendingTaskCorporateListing Step Group (Reusable Group) with test data: Test Data UserGlobal, corp: corp row: 7, user: user row: 7, pass: pass row: 7, with parameter refNo: refNo'
WebUI.callTestCase(findTestCase('FrontEnd/Step Group (Reusable Group)/accessPendingTaskCorporateListingRefNo'), [('refNo') : refNo], 
    FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 35: Logout Step Group (Reusable Group)'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 36: LoginFO Step Group (Reusable Group) with test data: Test Data UserGlobal, corporateID: corp row: 5, username: user row: 5, password: pass row: 5'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/LoginFO'), [('corporateID') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserGlobal').getValue('corp', 5), ('username') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserGlobal').getValue('user', 6), ('password') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserGlobal').getValue('pass', 5)], FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 37: accessTransactionStatusCorpByRefNo Step Group (Reusable Group) with parameter refNo: refNo'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/accessTransactionStatusCorpByRefNo'), [
        ('refNo') : refNo], FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 38: Logout Step Group (Reusable Group)'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 39: LoginBO Step Group (Reusable Group) with test data: Test Data UserBoGlobal, username: User row: 3, password: Pass row: 3'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/LoginBO'), [('username') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserBoGlobal').getValue('User', 5), ('password') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserBoGlobal').getValue('Pass', 9)], FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 40: accessTransactionStatusBoByRefNo Step Group (Reusable Group) with parameter refNo: refNo'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/accessTransactionStatusBoByRefNo'), [('refNo') : refNo], 
    FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 41: LogoutBo Step Group (Reusable Group)'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/LogoutBo'), [:], FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 42: LoginFO Step Group (Reusable Group) with test data: Test Data UserGlobal, corporateID: corp row: 8, username: user row: 8, password: pass row: 8'
not_run: WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/LoginFO'), [('corporateID') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserGlobal').getValue('corp', 8), ('username') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserGlobal').getValue('user', 8), ('password') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserGlobal').getValue('pass', 8)], FailureHandling.STOP_ON_FAILURE)

'step 43: accessPendingTaskCorporateListing Step Group (Reusable Group) with test data: Test Data UserGlobal, corp: corp row: 7, user: user row: 7, pass: pass row: 7, with parameter refNo: refNo'
not_run: WebUI.callTestCase(findTestCase('FrontEnd/Step Group (Reusable Group)/accessPendingTaskCorporateListingRefNo'), 
    [('refNo') : refNo], FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 44: Logout Step Group (Reusable Group)'
not_run: WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 45: LoginFO Step Group (Reusable Group) with test data: Test Data UserGlobal, corporateID: corp row: 5, username: user row: 5, password: pass row: 5'
not_run: WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/LoginFO'), [('corporateID') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserGlobal').getValue('corp', 5), ('username') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserGlobal').getValue('user', 5), ('password') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserGlobal').getValue('pass', 5)], FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 46: accessTransactionStatusCorpByRefNo Step Group (Reusable Group) with parameter refNo: refNo'
not_run: WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/accessTransactionStatusCorpByRefNo'), 
    [('refNo') : refNo], FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 47: Logout Step Group (Reusable Group)'
not_run: WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 48: LoginBO Step Group (Reusable Group) with test data: Test Data UserBoGlobal, username: User row: 3, password: Pass row: 3'
not_run: WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/LoginBO'), [('username') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserBoGlobal').getValue('User', 3), ('password') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserBoGlobal').getValue('Pass', 3)], FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 49: accessTransactionStatusBoByRefNo Step Group (Reusable Group) with parameter refNo: refNo'
not_run: WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/accessTransactionStatusBoByRefNo'), 
    [('refNo') : refNo], FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 50: LogoutBo Step Group (Reusable Group)'
not_run: WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/LogoutBo'), [:], FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 51: LoginFO Step Group (Reusable Group) with test data: Test Data UserGlobal, corporateID: corp row: 5, username: user row: 5, password: pass row: 5'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/LoginFO'), [('corporateID') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserGlobal').getValue('corp', 5), ('username') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserGlobal').getValue('user', 6), ('password') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserGlobal').getValue('pass', 5)], FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 52: accessCorporateFinancial Step Group (Reusable Group) with test data: Test Data MenuGlobal, menuName: Menu row: 4'
WebUI.callTestCase(findTestCase('FrontEnd/Step Group (Reusable Group)/accessCorporateFinancial'), [('activityBy') : 'silk05'
        , ('activityType') : 'Release', ('menuName') : 'Single Payment / Purchase', ('product') : 'Bill Payment'], FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 53: Logout Step Group (Reusable Group)'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 54: LoginBO Step Group (Reusable Group) with test data: Test Data UserBoGlobal, username: User row: 3, password: Pass row: 3'
not_run: WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/LoginBO'), [('username') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserBoGlobal').getValue('User', 3), ('password') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserBoGlobal').getValue('Pass', 3)], FailureHandling.STOP_ON_FAILURE)

'step 55: Step Group - accessMenuCorpFinBo Step Group (Reusable Group)'
not_run: WebUI.callTestCase(findTestCase('FrontEnd/CU-Single Transfer Domestic Regular/Step Group/Step Group - accessCorporateFinancialDomesticTrf_BO'), 
    [('corporateName') : 'PCMSILK001', ('activityBy') : 'silk05', ('activityType') : 'Release', ('product') : 'SKN/LLG', ('menuName') : 'Single Transfer'], 
    FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 56: LogoutBo Step Group (Reusable Group)'
not_run: WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/LogoutBo'), [:], FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 57: LoginFO Step Group (Reusable Group) with test data: Test Data UserGlobal, corporateID: corp row: 5, username: user row: 5, password: pass row: 5'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/LoginFO'), [('corporateID') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserGlobal').getValue('corp', 5), ('username') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserGlobal').getValue('user', 6), ('password') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserGlobal').getValue('pass', 5)], FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 58: accessTransactionInquery Step Group (Reusable Group) with test data: Test Data MenuGlobal, menuName: Menu row: 4'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/accessTransactionInquery'), [('menuName') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data MenuGlobal').getValue('Menu', 53)], FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 59: Logout Step Group (Reusable Group)'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

