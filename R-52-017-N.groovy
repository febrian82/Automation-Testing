import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

// updated step 1 Click on t-select-account-trigger
'precondition'
WebUI.callTestCase(findTestCase('FrontEnd/FO_CA_CU/Step Group (Reusable Group)/accessChequeBookRequest'), [('corp') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data CredentialGlobal').getValue('corp', 18), ('user') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data CredentialGlobal').getValue('user', 18), ('pass') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data CredentialGlobal').getValue('pass', 18)], FailureHandling.STOP_ON_FAILURE)

'step 1: Click on t-select-account-trigger'
WebUI.click(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-select-account-trigger'), 
    FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 2.0: Enter value with Test Data AccountGlobal column: account_no row: 1 in the t-select-account field'
CustomKeywords.'keys.SetTextHandler.handleInput'(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-select-account'), 
    findTestData('FrontEnd/FO_CA_CU/Test Data Global/Test Data AccountGlobal').getValue('account_no', 1), FailureHandling.STOP_ON_FAILURE)

'step 3.0: Use custom keyword handleWebTable.HTMLTableHelper_FO.selectItemonDropdown with input Test Data Request column: object_id row: 3, Test Data AccountGlobal column: nocurrencyname row: 1'
CustomKeywords.'handleWebTable.HTMLTableHelper_FO.selectItemonDropdown'(findTestData('Data Files/FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Test Data Request').getValue(
        'object_id', 3), findTestData('Data Files/FrontEnd/FO_CA_CU/Test Data Global/Test Data AccountGlobal').getValue(
        'no_name_currency', 16))

//No verification required
'step 4.0: Click on t-select-input_quantity-trigger'
WebUI.click(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-select-input_quantity-trigger'), 
    FailureHandling.STOP_ON_FAILURE)

'step 2.0: Enter value with Test Data AccountGlobal column: account_no row: 1 in the t-select-account field'
CustomKeywords.'keys.SetTextHandler.handleInput'(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-inputQuantity'), 
    findTestData('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Test Data Request').getValue(
        'quantity', 1), FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 6.0: Click on t-radio-deliveryMethod-0'
WebUI.click(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-radio-deliveryMethod-0'), 
    FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 7.0: Click on t-select-city-trigger'
WebUI.click(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-select-city-trigger'), 
    FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 8.0: Enter value with Test Data BranchGlobal column: city row: 3 in the t-select-city field'
CustomKeywords.'keys.SetTextHandler.handleInput'(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-select-city'), 
    findTestData('FrontEnd/FO_CA_CU/Test Data Global/Test Data BranchGlobal').getValue('city', 3), FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 9.0: Use custom keyword handleWebTable.HTMLTableHelper_FO.selectItemonDropdown with input Test Data Request column: object_id row: 1, Test Data BranchGlobal column: city row: 3'
CustomKeywords.'handleWebTable.HTMLTableHelper_FO.selectItemonDropdown'(findTestData('Data Files/FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Test Data Request').getValue(
        'object_id', 1), findTestData('Data Files/FrontEnd/FO_CA_CU/Test Data Global/Test Data BranchGlobal').getValue('city', 
        3))

//No verification required
'step 10.0: Enter value with Test Data Request column: data row: 6 in the t-address-0 field'
CustomKeywords.'keys.SetTextHandler.handleInput'(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-address-0'), 
    findTestData('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Test Data Request').getValue(
        'data', 6), FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 11.0: Enter value with Test Data Request column: data row: 3 in the t-postalCode field'
CustomKeywords.'keys.SetTextHandler.handleInput'(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-postalCode'), 
    findTestData('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Test Data Request').getValue(
        'data', 3), FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 12.0: Click on t-WorkflowAction-confirm'
WebUI.click(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-WorkflowAction-confirm'), 
    FailureHandling.STOP_ON_FAILURE)

'verify 12.0 count 1: -t-postal_code-error : Test Data MessageGlobal, column: Message row: 10'
WebUI.verifyElementText(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-postal_code-error'), 
    findTestData('Data Files/FrontEnd/Test Data Global/Test Data MessageGlobal').getValue('Message', 10))

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-017-N/Step12.0verify-12.0-count-1.png')

'step 13.0: Logout_FO Step Group (Reusable Group)'
WebUI.callTestCase(findTestCase('FrontEnd/Step Group (Reusable Group)/Logout_FO'), [:], FailureHandling.STOP_ON_FAILURE)

