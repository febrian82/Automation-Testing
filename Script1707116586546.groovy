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

'step 1: Step Group - accessMenuSingleBilling Step Group (Reusable Group)'
WebUI.callTestCase(findTestCase('FrontEnd/CU - Single Billing G3/Step Group/Step Group - accessSingleBillingG3'), [:], FailureHandling.STOP_ON_FAILURE)

'verify 1 count 2: -Tab_GenerateBillingId'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Billing G3/btn_generateBillingID'), FailureHandling.STOP_ON_FAILURE)

'verify 1 count 1: -Tab_PaymentBillingId'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Billing G3/btn_paymentBillingID'), FailureHandling.STOP_ON_FAILURE)

'verify 1 count 3: -ddl_TransferFrom'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Billing G3/droplist_trfFrom'), FailureHandling.STOP_ON_FAILURE)

'verify 1 count 4: -btn_TaxList'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Billing G3/btn_taxList'), FailureHandling.STOP_ON_FAILURE)

'verify 1 count 4: -btn_TaxList'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Billing G3/btn_newEntry'), FailureHandling.STOP_ON_FAILURE)

'verify 1 count 5: -ddl_TaxList'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Billing G3/droplist_taxList'), FailureHandling.STOP_ON_FAILURE)

'verify 1 count 6: -ddl_TaxAccountCode'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Billing G3/droplist_taxAkunCode'), FailureHandling.STOP_ON_FAILURE)

'verify 1 count 7: -ddl_DepositType'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Billing G3/droplist_depositType'), FailureHandling.STOP_ON_FAILURE)

'verify 1 count 7: -ddl_DepositType'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Billing G3/textbox_noUrut'), FailureHandling.STOP_ON_FAILURE)

'verify 1 count 7: -ddl_DepositType'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Billing G3/textbox_SKP'), FailureHandling.STOP_ON_FAILURE)

'verify 1 count 7: -ddl_DepositType'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Billing G3/textbox_tahunPajak'), FailureHandling.STOP_ON_FAILURE)

'verify 1 count 7: -ddl_DepositType'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Billing G3/textbox_kodeKPP'), FailureHandling.STOP_ON_FAILURE)

'verify 1 count 7: -ddl_DepositType'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Billing G3/textbox_tahunTerbit'), FailureHandling.STOP_ON_FAILURE)

'verify 1 count 7: -ddl_DepositType'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Billing G3/droplist_currency'), FailureHandling.STOP_ON_FAILURE)

'verify 1 count 8: -txtbox_Amount'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Billing G3/textbox_amount'), FailureHandling.STOP_ON_FAILURE)

'verify 1 count 8: -txtbox_Amount'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Billing G3/btn_addMoreBilling'), FailureHandling.STOP_ON_FAILURE)

'verify 1 count 9: -btn_Immediate'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Billing G3/btn_immedate'), FailureHandling.STOP_ON_FAILURE)

'verify 1 count 10: -btn_SpecificDate'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Billing G3/btn_specificDate'), FailureHandling.STOP_ON_FAILURE)

'verify 1 count 11: -btn_Confirm'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Billing G3/btn_confirm'), FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'get.ScreenCapture.getEntirePage'('C-41-001-P-Step1.png')

'step 2: Step Group - AddSingleBilling Step Group (Reusable Group)'
WebUI.callTestCase(findTestCase('FrontEnd/CU - Single Billing G3/Step Group/Step Group - addSingleBillingNewTax'), [:], 
    FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 3: Click on btn_Immediate'
not_run: WebUI.click(findTestObject('FrontEnd/CU - SingleBilling - GenerateBillingID_Reg/btn_Immediate'), FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 4: Click on btn_Confirm'
WebUI.click(findTestObject('FrontEnd/CU - SingleBilling - GenerateBillingID_Reg/btn_Confirm'), FailureHandling.STOP_ON_FAILURE)

'verify 4 count 3: -btn_Submit'
WebUI.scrollToElement(findTestObject('FrontEnd/CU - SingleBilling - GenerateBillingID_Reg/btn_Submit'), 0)

'verify 4 count 2: -btn_Back'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - SingleBilling - GenerateBillingID_Reg/btn_Back'), FailureHandling.STOP_ON_FAILURE)

'verify 4 count 3: -btn_Submit'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - SingleBilling - GenerateBillingID_Reg/btn_Submit'), FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'get.ScreenCapture.getEntirePage'('C-41-001-P-Step4.png')

//No verification required
'step 6: Click on btn_Submit'
WebUI.click(findTestObject('FrontEnd/CU - SingleBilling - GenerateBillingID_Reg/btn_Submit'), FailureHandling.STOP_ON_FAILURE)

'verify 6 count 1: -btn_Yes'
not_run: WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - Single Billing G3/btn_ok'), FailureHandling.STOP_ON_FAILURE)

'step 7: Click on btn_Yes'
WebUI.click(findTestObject('FrontEnd/CU - Single Billing G3/btn_ok'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

'step 7: Click on btn_Yes'
not_run: WebUI.click(findTestObject('FrontEnd/CU - SingleBilling - GenerateBillingID_Reg/btnContinueGenerate'), FailureHandling.OPTIONAL)

'step 7: Click on btn_Yes'
not_run: WebUI.click(findTestObject('FrontEnd/CU - SingleBilling - GenerateBillingID_Reg/btn_Yes'), FailureHandling.OPTIONAL)

'verify 7 count 2: -RefNo'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - SingleBilling - GenerateBillingID_Reg/RefNo'), FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'get.ScreenCapture.getEntirePage'('C-41-001-P-Step6.png')

'step 8: Use custom keyword textProcessor.processText.removeText with input Reference No , object: refNo then assign into variable: refNo'
def refNo = CustomKeywords.'textProcessor.processText.removeText'('Reference No : ', findTestObject('FrontEnd/CU - SingleBilling - GenerateBillingID_Reg/refNo'))

'verify 7 count 6: -btn_Done'
WebUI.scrollToElement(findTestObject('FrontEnd/CU - SingleBilling - GenerateBillingID_Reg/btn_Done'), 0)

'verify 7 count 3: -btn_WorkFlowList'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - SingleBilling - GenerateBillingID_Reg/btn_WorkFlowList'), FailureHandling.STOP_ON_FAILURE)

'verify 7 count 4: -btn_Print'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - SingleBilling - GenerateBillingID_Reg/btn_Print'), FailureHandling.STOP_ON_FAILURE)

'verify 7 count 5: -btn_Download'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - SingleBilling - GenerateBillingID_Reg/btn_Download'), FailureHandling.STOP_ON_FAILURE)

'verify 7 count 6: -btn_Done'
WebUI.verifyElementVisible(findTestObject('FrontEnd/CU - SingleBilling - GenerateBillingID_Reg/btn_Done'), FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'get.ScreenCapture.getEntirePage'('C-41-001-P-Step7.png')

//No verification required
'step 9: Click on btn_Done'
WebUI.click(findTestObject('FrontEnd/CU - SingleBilling - GenerateBillingID_Reg/btn_Done'), FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 10: Logout Step Group (Reusable Group)'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

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
not_run: WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/LoginFO'), [('corporateID') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserGlobal').getValue('corp', 7), ('username') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserGlobal').getValue('user', 8), ('password') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserGlobal').getValue('pass', 7)], FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 34: accessPendingTaskCorporateListing Step Group (Reusable Group) with test data: Test Data UserGlobal, corp: corp row: 7, user: user row: 7, pass: pass row: 7, with parameter refNo: refNo'
not_run: WebUI.callTestCase(findTestCase('FrontEnd/Step Group (Reusable Group)/accessPendingTaskCorporateListingRefNo'), 
    [('refNo') : refNo], FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 35: Logout Step Group (Reusable Group)'
not_run: WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 11: LoginFO Step Group (Reusable Group) with test data: Test Data UserGlobal, corporateID: corp row: 20, username: user row: 20, password: pass row: 20'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/LoginFO'), [('corporateID') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserGlobal').getValue('corp', 5), ('username') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserGlobal').getValue('user', 6), ('password') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserGlobal').getValue('pass', 5)], FailureHandling.STOP_ON_FAILURE)

'step 12: accessTransactionStatusCorpByRefNo Step Group (Reusable Group)'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/accessTransactionStatusCorpByRefNo'), [
        ('refNo') : refNo], FailureHandling.STOP_ON_FAILURE)

'verify 12 count 1: -label_TrxStatusFO : Transaction Status'
not_run: WebUI.verifyElementText(findTestObject('FrontEnd/CU - SingleBilling - GenerateBillingID_Reg/label_TrxStatusFO'), 
    'Transaction Status', FailureHandling.OPTIONAL)

CustomKeywords.'get.ScreenCapture.getEntirePage'('C-41-001-P-Step12.png')

'step 13: Logout Step Group (Reusable Group)'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

'step 67: LoginFO Step Group (Reusable Group) with test data: Test Data UserGlobal, corporateID: corp row: 5, username: user row: 5, password: pass row: 5'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/LoginFO'), [('corporateID') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserGlobal').getValue('corp', 5), ('username') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserGlobal').getValue('user', 6), ('password') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserGlobal').getValue('pass', 5)], FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 68: accessCorporateFinancial Step Group (Reusable Group) with test data: Test Data MenuGlobal, menuName: Menu row: 4'
WebUI.callTestCase(findTestCase('FrontEnd/Step Group (Reusable Group)/accessCorporateFinancial'), [('activityBy') : 'silk 02'
        , ('activityType') : 'create', ('menuName') : 'Single Billing G3', ('product') : 'SSP Payment Generate'], FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 69: Logout Step Group (Reusable Group)'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

'step 67: LoginFO Step Group (Reusable Group) with test data: Test Data UserGlobal, corporateID: corp row: 5, username: user row: 5, password: pass row: 5'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/LoginFO'), [('corporateID') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserGlobal').getValue('corp', 5), ('username') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserGlobal').getValue('user', 6), ('password') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserGlobal').getValue('pass', 5)], FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 68: accessCorporateFinancial Step Group (Reusable Group) with test data: Test Data MenuGlobal, menuName: Menu row: 4'
WebUI.callTestCase(findTestCase('FrontEnd/Step Group (Reusable Group)/accessCorporateFinancial'), [('activityBy') : 'silk05'
        , ('activityType') : 'Approve', ('menuName') : 'Single Billing G3', ('product') : 'SSP Payment Generate'], FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 69: Logout Step Group (Reusable Group)'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

'step 11: LoginFO Step Group (Reusable Group) with test data: Test Data UserGlobal, corporateID: corp row: 20, username: user row: 20, password: pass row: 20'
not_run: WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/LoginFO'), [('corporateID') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserGlobal').getValue('corp', 5), ('username') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserGlobal').getValue('user', 5), ('password') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data UserGlobal').getValue('pass', 5)], FailureHandling.STOP_ON_FAILURE)

'step 24: searchTransactionInquiry Step Group (Reusable Group)'
not_run: WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/searchTransactionInquiry'), [('accountNumber') : '000001468362'
        , ('transactionType') : findTestData('FrontEnd/Test Data Global/Test Data TransactionTypeGlobal').getValue(1, 1)], 
    FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 38: Logout Step Group (Reusable Group)'
not_run: WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

