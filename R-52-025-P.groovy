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
'step 2.0: Enter value with test data column: no_name_currency row: 1 in the t-select-account field'
CustomKeywords.'keys.SetTextHandler.handleInput'(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-select-account'), 
    findTestData('FrontEnd/FO_CA_CU/Test Data Global/Test Data AccountGlobal').getValue('account_no', 1), FailureHandling.STOP_ON_FAILURE)

'step 3.0: Use custom keyword handleWebTable.HTMLTableHelper_FO.selectItemonDropdown with input Test Data Request column: object_id row: 3, Test Data AccountGlobal column: nocurrencyname row: 1'
CustomKeywords.'handleWebTable.HTMLTableHelper_FO.selectItemonDropdown'(findTestData('Data Files/FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Test Data Request').getValue(
        'object_id', 3), findTestData('Data Files/FrontEnd/FO_CA_CU/Test Data Global/Test Data AccountGlobal').getValue(
        'no_name_currency', 16))

'step 5.0: Click on t-select-input_quantity-trigger'
WebUI.click(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-radio-type-001'), 
    FailureHandling.STOP_ON_FAILURE)

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
'step 7.0: Click on t-radio-delivery_type-PICK_UP_AT_BRANCH'
WebUI.click(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-radio-deliveryMethod-1'), 
    FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-023-P/Step1verify-1-count-0.png')

//No verification required
'step 8.0: Click on t-select-city-trigger'
WebUI.click(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-select-city-trigger'), 
    FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 9.0: Enter value with test data column: city row: 3 in the t-select-city field'
CustomKeywords.'keys.SetTextHandler.handleInput'(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-select-city'), 
    findTestData('FrontEnd/FO_CA_CU/Test Data Global/Test Data BranchGlobal').getValue('city', 3), FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 10.0: Use custom keyword handleWebTable.HTMLTableHelper_FO.selectItemonDropdown with input Test Data Request column: object_id row: 1, Test Data BranchGlobal column: city row: 3'
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

'verify 14.0 count 1: -t-data-renderer-account-label'
WebUI.verifyElementVisible(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-data-renderer-account-label'), 
    FailureHandling.STOP_ON_FAILURE)

'verify 14.0 count 2: -t-data-renderer-type-label'
WebUI.verifyElementVisible(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-data-renderer-type-label'), 
    FailureHandling.STOP_ON_FAILURE)

'verify 14.0 count 3: -t-data-renderer-delivery_option-label'
WebUI.verifyElementVisible(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-data-renderer-delivery_option-label'), 
    FailureHandling.STOP_ON_FAILURE)

'verify 14.0 count 4: -t-data-renderer-city-label'
WebUI.verifyElementVisible(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-data-renderer-city-label'), 
    FailureHandling.STOP_ON_FAILURE)

'verify 14.0 count 5: -t-data-renderer-pickup_at_branch-label'
WebUI.verifyElementVisible(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-data-renderer-pickup_at_branch-label'), 
    FailureHandling.STOP_ON_FAILURE)

'verify 14.0 count 6: -t-data-renderer-cheque_book_request_fee-label'
WebUI.verifyElementVisible(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-data-renderer-cheque_book_request_fee-label'), 
    FailureHandling.STOP_ON_FAILURE)

'verify 14.0 count 7: -t-data-renderer-total_charges-label'
WebUI.verifyElementVisible(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-data-renderer-total_charges-label'), 
    FailureHandling.STOP_ON_FAILURE)

'verify 14.0 count 8: -t-data-renderer-account-value'
WebUI.verifyElementVisible(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-data-renderer-account-value'), 
    FailureHandling.STOP_ON_FAILURE)

'verify 14.0 count 9: -t-data-renderer-type-value'
WebUI.verifyElementVisible(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-data-renderer-type-value'), 
    FailureHandling.STOP_ON_FAILURE)

'verify 14.0 count 10: -t-data-renderer-delivery_option-value'
WebUI.verifyElementVisible(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-data-renderer-delivery_option-value'), 
    FailureHandling.STOP_ON_FAILURE)

'verify 14.0 count 11: -t-data-renderer-city-value'
WebUI.verifyElementVisible(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-data-renderer-city-value'), 
    FailureHandling.STOP_ON_FAILURE)

'verify 14.0 count 12: -t-data-renderer-pickup_at_branch-value'
WebUI.verifyElementVisible(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-data-renderer-pickup_at_branch-value'), 
    FailureHandling.STOP_ON_FAILURE)

'verify 14.0 count 13: -t-data-renderer-cheque_book_request_fee-value'
WebUI.verifyElementVisible(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-data-renderer-cheque_book_request_fee-value'), 
    FailureHandling.STOP_ON_FAILURE)

'verify 14.0 count 14: -t-data-renderer-total_charges-value'
WebUI.verifyElementVisible(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-data-renderer-total_charges-value'), 
    FailureHandling.STOP_ON_FAILURE)

'verify 14.0 count 15: -t-WorkflowAction-submit'
WebUI.verifyElementVisible(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-WorkflowAction-submit'), 
    FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-025-P/Step14.0verify-14.0-count-15.png')

'step 15.0: Logout_FO Step Group (Reusable Group)'
WebUI.callTestCase(findTestCase('FrontEnd/Step Group (Reusable Group)/Logout_FO'), [:], FailureHandling.STOP_ON_FAILURE)

