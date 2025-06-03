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

CustomKeywords.'get.ScreenCapture.getEntirePage'('C-51-003-P-Step1.png')

'verify 1 count 1: -HaderSinglePayment'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/label_SinglePayment'), FailureHandling.STOP_ON_FAILURE)

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

//No verification required
'step 5: Click on droplist_payee'
WebUI.click(findTestObject('FrontEnd/CU - Single Payment or Purchase/droplist_payee'), FailureHandling.STOP_ON_FAILURE)

'step 6: Enter value in the Search_payee field'
WebUI.setText(findTestObject('FrontEnd/CU - Single Payment or Purchase/search_payee'), findTestData('FrontEnd/All Test Data/CU - Single Billing G3/New Test Data').getValue(
        'payee', 3), FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 7: Click on option_payee'
WebUI.click(findTestObject('FrontEnd/CU - Single Payment or Purchase/option_payee'), FailureHandling.STOP_ON_FAILURE)

'verify 7 count 1: -textbox_accountDescPaye'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/textbox_accountDescPayee'))

'step 8: Click on textbox_accountDescPayee'
WebUI.click(findTestObject('FrontEnd/CU - Single Payment or Purchase/textbox_accountDescPayee'))

//No verification required
'step 9: Enter value  in the textbox_accountDescPayee field'
WebUI.setText(findTestObject('FrontEnd/CU - Single Payment or Purchase/textbox_accountDescPayee'), findTestData('FrontEnd/All Test Data/CU - Single Payment or Purchase/Test Data Single Payment').getValue(
        'accDesc', 1), FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'get.ScreenCapture.getEntirePage'('C-51-003-P-Step9.png')

'verify 9 count 1: -btn_immediate'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_immediate'), FailureHandling.STOP_ON_FAILURE)

'verify 9 count 2: -btn_specificDate'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_specificDate'), FailureHandling.STOP_ON_FAILURE)

'verify 9 count 3: -btn_repeat'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_repeat'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('FrontEnd/CU - Single Payment or Purchase/datepicklist_ExpiredOn'), 0)

'step 10: Click on datepickliat_expiredOn'
WebUI.click(findTestObject('FrontEnd/CU - Single Payment or Purchase/datepicklist_ExpiredOn'))

CustomKeywords.'webCalendarDanamon.webCalendarDanamon.customizedNextDate'('5')

WebUI.scrollToElement(findTestObject('FrontEnd/CU - Single Payment or Purchase/datepicklist_ExpiredOn'), 0)

'step 11: Click on checkbox_TnC'
WebUI.click(findTestObject('FrontEnd/CU - Single Payment or Purchase/checkbox_TnC'))

CustomKeywords.'get.ScreenCapture.getEntirePage'('C-51-003-P-Step11.png')

'verify 11 count 1: -buttonsaveAsDraft'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_saveAsDraft'), FailureHandling.STOP_ON_FAILURE)

'verify 11 count 2: -button_continue'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_continue'), FailureHandling.STOP_ON_FAILURE)

'step 12: Click on button_continue'
WebUI.click(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_continue'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

CustomKeywords.'get.ScreenCapture.getEntirePage'('C-51-003-P-Step12.png')

'verify 12 count 1: -droplist_executionOption'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/droplist_executionOption'))

'step 13: Click on textbox_maxAllowBill'
WebUI.click(findTestObject('FrontEnd/CU - Single Payment or Purchase/textbox_maxAllowBill'))

'step 14: Enter value  in the textbox_maxAllowBill field'
WebUI.setText(findTestObject('FrontEnd/CU - Single Payment or Purchase/textbox_maxAllowBill'), findTestData('FrontEnd/All Test Data/CU - Single Payment or Purchase/Test Data Single Payment').getValue(
        'amount', 1))

WebUI.scrollToElement(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_confirm'), 0)

'verify 14 count 1: -btn_back'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_back'))

'verify 14 count 2: -btn_confitm'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_confirm'))

'step 15: Click on btn_confirm'
WebUI.click(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_confirm'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_back'), 0)

'verify 15 socunt 1: -btn_back'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_back'))

CustomKeywords.'get.ScreenCapture.getEntirePage'('C-51-003-P-Step15.png')

'step 16: Click on button_SubmitConfirmation'
WebUI.click(findTestObject('FrontEnd/CU - Single Payment or Purchase/btn_submit'), FailureHandling.OPTIONAL)

'step 17: Click on button_SubmitConfirmation popup'
WebUI.click(findTestObject('FrontEnd/CU - Balance Transfer - Corp Single/button_popUpSubmit'), FailureHandling.OPTIONAL)

'step 18: Use custom keyword textProcessor.processText.removeText with input Reference No , object: label_ReferenceNo then assign into variable: refNo'
def refNo = CustomKeywords.'textProcessor.processText.removeText'('Reference No ', findTestObject('FrontEnd/CU-Single Transfer Domestic Single/label_ReferenceNo'))

CustomKeywords.'get.ScreenCapture.getEntirePage'('C-51-003-P-Step18.png')

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

'step 19: Logout Step Group (Reusable Group)'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

'step 20: LoginFO Step Group (Reusable Group) with test data: Test Data UserGlobal, corporateID: corp row: 7, username: user row: 7, password: pass row: 7'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/LoginFO'), [('corporateID') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserGlobal').getValue('corp', 7), ('username') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserGlobal').getValue('user', 8), ('password') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserGlobal').getValue('pass', 7)], FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 21: accessPendingTaskCorporateListing Step Group (Reusable Group) with test data: Test Data UserGlobal, corp: corp row: 7, user: user row: 7, pass: pass row: 7, with parameter refNo: refNo'
WebUI.callTestCase(findTestCase('FrontEnd/Step Group (Reusable Group)/accessPendingTaskCorporateListingRefNo'), [('refNo') : refNo], 
    FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 22: Logout Step Group (Reusable Group)'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

'step 23: LoginFO Step Group (Reusable Group) with test data: Test Data UserGlobal, corporateID: corp row: 7, username: user row: 7, password: pass row: 7'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/LoginFO'), [('corporateID') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserGlobal').getValue('corp', 7), ('username') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserGlobal').getValue('user', 8), ('password') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserGlobal').getValue('pass', 7)], FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 24: accessPendingTaskCorporateListing Step Group (Reusable Group) with test data: Test Data UserGlobal, corp: corp row: 7, user: user row: 7, pass: pass row: 7, with parameter refNo: refNo'
WebUI.callTestCase(findTestCase('FrontEnd/Step Group (Reusable Group)/accessPendingTaskCorporateListingRefNo'), [('refNo') : refNo], 
    FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 25: Logout Step Group (Reusable Group)'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 26: LoginFO Step Group (Reusable Group) with test data: Test Data UserGlobal, corporateID: corp row: 5, username: user row: 5, password: pass row: 5'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/LoginFO'), [('corporateID') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserGlobal').getValue('corp', 5), ('username') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserGlobal').getValue('user', 6), ('password') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserGlobal').getValue('pass', 5)], FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 27: accessTransactionStatusCorpByRefNo Step Group (Reusable Group) with parameter refNo: refNo'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/accessTransactionStatusCorpByRefNo'), [
        ('refNo') : refNo], FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 28: Logout Step Group (Reusable Group)'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

'step 29: LoginFO Step Group (Reusable Group) with test data: Test Data UserGlobal, corporateID: corp row: 5, username: user row: 5, password: pass row: 5'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/LoginFO'), [('corporateID') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserGlobal').getValue('corp', 5), ('username') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserGlobal').getValue('user', 6), ('password') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserGlobal').getValue('pass', 5)], FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 30: accessCorporateFinancial Step Group (Reusable Group) with test data: Test Data MenuGlobal, menuName: Menu row: 4'
WebUI.callTestCase(findTestCase('FrontEnd/Step Group (Reusable Group)/accessCorporateFinancial'), [('activityBy') : 'silk05'
        , ('activityType') : 'Release', ('menuName') : 'Single Payment / Purchase', ('product') : 'Purchase'], FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 31: Logout Step Group (Reusable Group)'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

'step 32: LoginFO Step Group (Reusable Group) with test data: Test Data UserGlobal, corporateID: corp row: 5, username: user row: 5, password: pass row: 5'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/LoginFO'), [('corporateID') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserGlobal').getValue('corp', 5), ('username') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserGlobal').getValue('user', 6), ('password') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserGlobal').getValue('pass', 5)], FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 33: accessTransactionInquery Step Group (Reusable Group) with test data: Test Data MenuGlobal, menuName: Menu row: 4'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/accessTransactionInquery'), [('menuName') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data MenuGlobal').getValue('Menu', 4)], FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 34: Logout Step Group (Reusable Group)'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

'step 39: LoginBO Step Group (Reusable Group) with test data: Test Data UserBoGlobal, username: User row: 3, password: Pass row: 3'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/LoginBO'), [('username') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserBoGlobal').getValue('User', 4), ('password') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserBoGlobal').getValue('Pass', 10)], FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 40: accessTransactionStatusBoByRefNo Step Group (Reusable Group) with parameter refNo: refNo'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/accessTransactionStatusBoByRefNo'), [('refNo') : refNo], 
    FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 41: LogoutBo Step Group (Reusable Group)'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/LogoutBo'), [:], FailureHandling.STOP_ON_FAILURE)

