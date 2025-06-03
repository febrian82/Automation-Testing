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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

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
'step 2.0: Enter value with test data column: no_name_currency row: 1 in the t-select-account field'
CustomKeywords.'keys.SetTextHandler.handleInput'(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-select-account'), 
    findTestData('FrontEnd/FO_CA_CU/Test Data Global/Test Data AccountGlobal').getValue('account_no', 1), FailureHandling.STOP_ON_FAILURE)

'step 3.0: Use custom keyword handleWebTable.HTMLTableHelper_FO.selectItemonDropdown with input Test Data Request column: object_id row: 3, Test Data AccountGlobal column: nocurrencyname row: 1'
CustomKeywords.'handleWebTable.HTMLTableHelper_FO.selectItemonDropdown'(findTestData('Data Files/FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Test Data Request').getValue(
        'object_id', 3), findTestData('Data Files/FrontEnd/FO_CA_CU/Test Data Global/Test Data AccountGlobal').getValue(
        'no_name_currency', 16))

'step 4.0: CLick on t-radio-type-002'
WebUI.click(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-radio-type-002'))

//No verification required
//failed to generate step 4.0
//No verification required
'step 5.0: Click on t-select-input_quantity-trigger'
WebUI.click(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-select-input_quantity-trigger'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-inputQuantity'), 
    findTestData('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Test Data Request').getValue(
        'quantity', 1))

//No verification required
'step 6.0: Use custom keyword handleWebTable.HTMLTableHelper_FO.selectItemonDropdown with input Test Data Request column: object_id row: 4, Test Data Request column: quantity row: 1'
CustomKeywords.'handleWebTable.HTMLTableHelper_FO.selectItemonDropdown'(findTestData('Data Files/FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Test Data Request').getValue(
        'object_id', 4), findTestData('Data Files/FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Test Data Request').getValue(
        'quantity', 1))

//No verification required
'step 7.0: Click on t-radio-deliveryMethod-1'
WebUI.click(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-radio-deliveryMethod-1'), 
    FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 8.0: Click on t-select-city-trigger'
WebUI.click(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-select-city-trigger'), 
    FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 9.0: Enter value with test data column: city row: 3 in the t-select-city field'
CustomKeywords.'keys.SetTextHandler.handleInput'(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-select-city'), 
    findTestData('FrontEnd/FO_CA_CU/Test Data Global/Test Data BranchGlobal').getValue('city', 3), FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 10.0: Use custom keyword handleWebTable.HTMLTableHelper_FO.selectItemonDropdown with input Test Data Request column: object_id row: 1, Test Data BranchGlobal column: city row: 1'
CustomKeywords.'handleWebTable.HTMLTableHelper_FO.selectItemonDropdown'(findTestData('Data Files/FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Test Data Request').getValue(
        'object_id', 1), findTestData('Data Files/FrontEnd/FO_CA_CU/Test Data Global/Test Data BranchGlobal').getValue('city', 
        3))

'step 11.0: Click on t-select-branch-trigger'
WebUI.click(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-select-branch-trigger'), 
    FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 12.0: Enter value with test data column: branch row: 3 in the t-select-brach field'
CustomKeywords.'keys.SetTextHandler.handleInput'(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-select-branch'), 
    findTestData('FrontEnd/FO_CA_CU/Test Data Global/Test Data BranchGlobal').getValue('branch', 3), FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 13.0: Use custom keyword handleWebTable.HTMLTableHelper_FO.selectItemonDropdown with input Test Data Request column: object_id row: 2, Test Data BranchGlobal column: branch row: 3'
CustomKeywords.'handleWebTable.HTMLTableHelper_FO.selectItemonDropdown'(findTestData('Data Files/FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Test Data Request').getValue(
        'object_id', 2), findTestData('Data Files/FrontEnd/FO_CA_CU/Test Data Global/Test Data BranchGlobal').getValue('branch', 
        3))

//No verification required
'step 14.0: Click on t-WorkflowAction-confirm'
WebUI.click(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-WorkflowAction-confirm'), 
    FailureHandling.STOP_ON_FAILURE)

'verify 14.0 count 1: -t-data-renderer-account-label : Test Data LabelGlobal, column: A_Label row: 23'
WebUI.verifyElementText(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-data-renderer-account-label'), 
    findTestData('Data Files/FrontEnd/Test Data Global/Test Data LabelGlobal').getValue('S_Label', 74))

'verify 14.0 count 2: -t-data-renderer-type-label : Test Data LabelGlobal, column: T_Label row: 21'
WebUI.verifyElementText(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-data-renderer-type-label'), 
    findTestData('Data Files/FrontEnd/Test Data Global/Test Data LabelGlobal').getValue('T_Label', 21))

'verify 14.0 count 3: -t-data-renderer-city-label : Test Data LabelGlobal, column: C_Label row: 22'
WebUI.verifyElementText(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-data-renderer-city-label'), 
    findTestData('Data Files/FrontEnd/Test Data Global/Test Data LabelGlobal').getValue('C_Label', 22))

'verify 14.0 count 4: -t-data-renderer-pickup_at_branch-label : Test Data LabelGlobal, column: P_Label row: 12'
WebUI.verifyElementText(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-data-renderer-delivery_option-value'), 
    findTestData('Data Files/FrontEnd/Test Data Global/Test Data LabelGlobal').getValue('P_Label', 12))

'verify 14.0 count 5: -t-data-renderer-cheque_book_request_fee-label : Test Data LabelGlobal, column: C_Label row: 29'
WebUI.verifyElementText(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-data-renderer-cheque_book_request_fee-label'), 
    findTestData('Data Files/FrontEnd/Test Data Global/Test Data LabelGlobal').getValue('C_Label', 105))

'verify 14.0 count 6: -t-data-renderer-total_charges-label : Test Data LabelGlobal, column: T_Label row: 22'
WebUI.verifyElementText(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-data-renderer-total_charges-label'), 
    findTestData('Data Files/FrontEnd/Test Data Global/Test Data LabelGlobal').getValue('T_Label', 22))

'verify 14.0 count 7: -t-data-renderer-account-value'
WebUI.verifyElementVisible(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-data-renderer-account-value'), 
    FailureHandling.STOP_ON_FAILURE)

'verify 14.0 count 8: -t-data-renderer-type-value'
WebUI.verifyElementVisible(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-data-renderer-type-value'), 
    FailureHandling.STOP_ON_FAILURE)

'verify 14.0 count 9: -t-data-renderer-city-value'
WebUI.verifyElementVisible(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-data-renderer-city-value'), 
    FailureHandling.STOP_ON_FAILURE)

'verify 14.0 count 10: -t-data-renderer-pickup_at_branch-value'
WebUI.verifyElementVisible(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-data-renderer-pickup_at_branch-value'), 
    FailureHandling.STOP_ON_FAILURE)

'verify 14.0 count 11: -t-data-renderer-cheque_book_request_fee-value'
WebUI.verifyElementVisible(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-data-renderer-cheque_book_request_fee-value'), 
    FailureHandling.STOP_ON_FAILURE)

'verify 14.0 count 12: -t-data-renderer-cheque_book_request_fee-value'
WebUI.verifyElementVisible(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-data-renderer-totalDebitAmount-label'), 
    FailureHandling.STOP_ON_FAILURE)

'verify 14.0 count 13: -t-data-renderer-total_charges-value'
WebUI.verifyElementVisible(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-data-renderer-total_charges-value'), 
    FailureHandling.STOP_ON_FAILURE)

'verify 14.0 count 14: -t-WorkflowAction-submit : Test Data LabelGlobal, column: S_Label row: 5'
WebUI.verifyElementText(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-WorkflowAction-submit'), 
    findTestData('Data Files/FrontEnd/Test Data Global/Test Data LabelGlobal').getValue('S_Label', 5))

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-027-P/Step14.0verify-14.0-count-14.png')

'step 15.0: Logout_FO Step Group (Reusable Group)'
WebUI.callTestCase(findTestCase('FrontEnd/Step Group (Reusable Group)/Logout_FO'), [:], FailureHandling.STOP_ON_FAILURE)

