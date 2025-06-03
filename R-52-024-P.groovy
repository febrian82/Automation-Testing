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
WebUI.callTestCase(findTestCase('FrontEnd/Step Group (Reusable Group)/accessChequeBookRequest'), [('corp') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data CredentialGlobal').getValue('corp', 18), ('user') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data CredentialGlobal').getValue('user', 18), ('pass') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data CredentialGlobal').getValue('pass', 18)], FailureHandling.STOP_ON_FAILURE)

'step 1: Click on t-select-account-trigger'
WebUI.click(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-select-account-trigger'), 
    FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-024-P/Step1.png')

//No verification required
'step 2.0: Enter value with test data column: account_no row: 1 in the t-select-account field'
CustomKeywords.'keys.SetTextHandler.handleInput'(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-select-account'), 
    findTestData('FrontEnd/FO_CA_CU/Test Data Global/Test Data AccountGlobal').getValue('account_no', 1), FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-024-P/Step2.0.png')

'step 3.0: Use custom keyword handleWebTable.HTMLTableHelper_FO.selectItemonDropdown with input Test Data Request column: object_id row: 3, Test Data AccountGlobal column: nocurrencyname row: 1'
CustomKeywords.'handleWebTable.HTMLTableHelper_FO.selectItemonDropdown'(findTestData('Data Files/FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Test Data Request').getValue(
        'object_id', 3), findTestData('Data Files/FrontEnd/FO_CA_CU/Test Data Global/Test Data AccountGlobal').getValue(
        'no_name_currency', 16))

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-024-P/Step3.0.png')

//No verification required
'step 4.0: Click on t-radio-type-001'
WebUI.click(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-radio-type-001'), 
    FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-024-P/Step4.0.png')

//No verification required
'step 5.0: Enter value with test data column: quantity row: 1 in the t-inputQuantity field'
CustomKeywords.'keys.SetTextHandler.handleInput'(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-inputQuantity'), 
    findTestData('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Test Data Request').getValue(
        'quantity', 1), FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-024-P/Step5.0.png')

//No verification required
'step 6.0: Click on t-radio-deliveryMethod-0'
WebUI.click(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-radio-deliveryMethod-0'), 
    FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-024-P/Step6.0.png')

//No verification required
'step 7.0: Click on t-select-city-trigger'
WebUI.click(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-select-city-trigger'), 
    FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-024-P/Step7.0.png')

//No verification required
'step 8.0: Enter value with test data column: city row: 3 in the t-select-city field'
CustomKeywords.'keys.SetTextHandler.handleInput'(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-select-city'), 
    findTestData('FrontEnd/FO_CA_CU/Test Data Global/Test Data BranchGlobal').getValue('city', 3), FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-024-P/Step8.0.png')

//No verification required
'step 9.0: Use custom keyword handleWebTable.HTMLTableHelper_FO.selectItemonDropdown with input Test Data Request column: object_id row: 1, Test Data BranchGlobal column: city row: 3'
CustomKeywords.'handleWebTable.HTMLTableHelper_FO.selectItemonDropdown'(findTestData('Data Files/FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Test Data Request').getValue(
        'object_id', 1), findTestData('Data Files/FrontEnd/FO_CA_CU/Test Data Global/Test Data BranchGlobal').getValue('city', 
        3))

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-024-P/Step9.0.png')

'step 10.0: Click on t-select-branch-trigger'
WebUI.click(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-select-branch-trigger'), 
    FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-024-P/Step10.0.png')

'step 11.0: Enter value with test data column: branch row: 3 in the t-select-branch field'
CustomKeywords.'keys.SetTextHandler.handleInput'(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-select-branch'), 
    findTestData('FrontEnd/FO_CA_CU/Test Data Global/Test Data BranchGlobal').getValue('branch', 3), FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-024-P/Step11.0.png')

'step 12.0: Use custom keyword handleWebTable.HTMLTableHelper_FO.selectItemonDropdown with input Test Data Request column: object_id row: 2, Test Data BranchGlobal column: branch row: 3'
CustomKeywords.'handleWebTable.HTMLTableHelper_FO.selectItemonDropdown'(findTestData('Data Files/FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Test Data Request').getValue(
        'object_id', 2), findTestData('Data Files/FrontEnd/FO_CA_CU/Test Data Global/Test Data BranchGlobal').getValue('branch', 
        3))

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-024-P/Step12.0.png')

//No verification required
'step 13.0: Enter value with test data column: data row: 12 in the t-address-0 field'
CustomKeywords.'keys.SetTextHandler.handleInput'(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-address-0'), 
    findTestData('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Test Data Request').getValue(
        'data', 12), FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-024-P/Step13.0.png')

//No verification required
'step 14.0: Enter value with test data column: data row: 7 in the t-postalCode field'
CustomKeywords.'keys.SetTextHandler.handleInput'(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-postalCode'), 
    findTestData('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Test Data Request').getValue(
        'data', 7), FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-024-P/Step14.0.png')

//No verification required
'step 15.0: Click on t-WorkflowAction-confirm'
WebUI.click(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-WorkflowAction-confirm'), 
    FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-024-P/Step15.0.png')

'verify 15.0 count 1: -t-data-renderer-account-label : Test Data LabelGlobal, column: S_Label row: 14'
WebUI.verifyElementText(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-data-renderer-account-label'), 
    findTestData('Data Files/FrontEnd/Test Data Global/Test Data LabelGlobal').getValue('S_Label', 74))

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-024-P/Step15.0verify-15.0-count-1.png')

'verify 15.0 count 2: -t-data-renderer-type-label : Test Data LabelGlobal, column: T_Label row: 21'
WebUI.verifyElementText(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-data-renderer-type-label'), 
    findTestData('Data Files/FrontEnd/Test Data Global/Test Data LabelGlobal').getValue('T_Label', 21))

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-024-P/Step15.0verify-15.0-count-2.png')

'verify 15.0 count 3: -t-data-renderer-delivery_option-label : Test Data LabelGlobal, column: D_Label row: 45'
WebUI.verifyElementText(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-data-renderer-delivery_option-label'), 
    findTestData('Data Files/FrontEnd/Test Data Global/Test Data LabelGlobal').getValue('D_Label', 45))

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-024-P/Step15.0verify-15.0-count-3.png')

'verify 15.0 count 4: -t-data-renderer-city-label : Test Data LabelGlobal, column: C_Label row: 3'
WebUI.verifyElementText(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-data-renderer-city-label'), 
    findTestData('Data Files/FrontEnd/Test Data Global/Test Data LabelGlobal').getValue('C_Label', 3))

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-024-P/Step15.0verify-15.0-count-4.png')

'verify 15.0 count 5: -t-data-renderer-branch-label : Test Data LabelGlobal, column: B_Label row: 17'
WebUI.verifyElementText(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-data-renderer-branch-label'), 
    findTestData('Data Files/FrontEnd/Test Data Global/Test Data LabelGlobal').getValue('B_Label', 17))

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-024-P/Step15.0verify-15.0-count-5.png')

'verify 15.0 count 6: -t-data-renderer-address_1-label : Test Data LabelGlobal, column: A_Label row: 77'
WebUI.verifyElementText(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-data-renderer-address_1-label'), 
    findTestData('Data Files/FrontEnd/Test Data Global/Test Data LabelGlobal').getValue('A_Label', 77))

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-024-P/Step15.0verify-15.0-count-6.png')

'verify 15.0 count 7: -t-data-renderer-address_2-label : Test Data LabelGlobal, column: A_Label row: 78'
WebUI.verifyElementText(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-data-renderer-address_2-label'), 
    findTestData('Data Files/FrontEnd/Test Data Global/Test Data LabelGlobal').getValue('A_Label', 78))

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-024-P/Step15.0verify-15.0-count-7.png')

'verify 15.0 count 8: -t-data-renderer-address_3-label : Test Data LabelGlobal, column: A_Label row: 79'
WebUI.verifyElementText(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-data-renderer-address_3-label'), 
    findTestData('Data Files/FrontEnd/Test Data Global/Test Data LabelGlobal').getValue('A_Label', 79))

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-024-P/Step15.0verify-15.0-count-8.png')

'verify 15.0 count 9: -t-data-renderer-postalCode-label : Test Data LabelGlobal, column: P_Label row: 37'
WebUI.verifyElementText(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-data-renderer-postalCode-label'), 
    findTestData('Data Files/FrontEnd/Test Data Global/Test Data LabelGlobal').getValue('P_Label', 37))

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-024-P/Step15.0verify-15.0-count-9.png')

'verify 15.0 count 10: -t-data-renderer-requestFee-label : Test Data LabelGlobal, column: C_Label row: 105'
WebUI.verifyElementText(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-data-renderer-requestFee-label'), 
    findTestData('Data Files/FrontEnd/Test Data Global/Test Data LabelGlobal').getValue('C_Label', 105))

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-024-P/Step15.0verify-15.0-count-10.png')

'verify 15.0 count 11: -t-data-renderer-totalCharges-label : Test Data LabelGlobal, column: T_Label row: 22'
WebUI.verifyElementText(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-data-renderer-totalCharges-label'), 
    findTestData('Data Files/FrontEnd/Test Data Global/Test Data LabelGlobal').getValue('T_Label', 22))

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-024-P/Step15.0verify-15.0-count-11.png')

'verify 15.0 count 12: -t-data-renderer-totalDebitAmount-label : Test Data LabelGlobal, column: T_Label row: 71'
WebUI.verifyElementText(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-data-renderer-totalDebitAmount-label'), 
    findTestData('Data Files/FrontEnd/Test Data Global/Test Data LabelGlobal').getValue('T_Label', 71))

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-024-P/Step15.0verify-15.0-count-12.png')

'verify 15.0 count 13: -t-data-renderer-account-value : Test Data AccountGlobal, column: nocurrencyname row: 1'
WebUI.verifyElementText(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-data-renderer-account-value'), 
    findTestData('FrontEnd/Test Data Global/Test Data AccountGlobal').getValue('no_name_currency', 16))

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-024-P/Step15.0verify-15.0-count-13.png')

'verify 15.0 count 14: -t-data-renderer-type-value'
WebUI.verifyElementVisible(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-data-renderer-type-value'), 
    FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-024-P/Step15.0verify-15.0-count-14.png')

'verify 15.0 count 15: -t-data-renderer-delivery_type-value : Test Data LabelGlobal, column: C_Label row: 35'
WebUI.verifyElementText(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-data-renderer-delivery_type-value'), 
    findTestData('Data Files/FrontEnd/Test Data Global/Test Data LabelGlobal').getValue('C_Label', 35))

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-024-P/Step15.0verify-15.0-count-15.png')

'verify 15.0 count 16: -t-data-renderer-city-value : Test Data BranchGlobal, column: city row: 3'
WebUI.verifyElementText(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-data-renderer-city-value'), 
    findTestData('Data Files/FrontEnd/Test Data Global/Test Data BranchGlobal').getValue('city', 3))

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-024-P/Step15.0verify-15.0-count-16.png')

'verify 15.0 count 17: -t-data-renderer-branch-value : Test Data BranchGlobal, column: branch row: 3'
WebUI.verifyElementText(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-data-renderer-branch-value'), 
    findTestData('Data Files/FrontEnd/Test Data Global/Test Data BranchGlobal').getValue('branch', 3))

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-024-P/Step15.0verify-15.0-count-17.png')

'verify 15.0 count 18: -t-data-renderer-address_1-value : Test Data Request, column: data row: 12'
WebUI.verifyElementText(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-data-renderer-address_1-value'), 
    findTestData('Data Files/FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Test Data Request').getValue(
        'data', 12))

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-024-P/Step15.0verify-15.0-count-18.png')

'verify 15.0 count 19: -t-data-renderer-address_2-value'
WebUI.verifyElementVisible(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-data-renderer-address_2-value'), 
    FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-024-P/Step15.0verify-15.0-count-19.png')

'verify 15.0 count 20: -t-data-renderer-address_3-value'
WebUI.verifyElementVisible(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-data-renderer-address_3-value'), 
    FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-024-P/Step15.0verify-15.0-count-20.png')

'verify 15.0 count 21: -t-data-renderer-postal_code-value : Test Data Request, column: data row: 7'
WebUI.verifyElementText(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-data-renderer-postal_code-value'), 
    findTestData('Data Files/FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Test Data Request').getValue(
        'data', 7))

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-024-P/Step15.0verify-15.0-count-21.png')

'verify 15.0 count 22: -t-data-renderer-cheque_book_request_fee-value'
WebUI.verifyElementVisible(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-data-renderer-cheque_book_request_fee-value'), 
    FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-024-P/Step15.0verify-15.0-count-22.png')

'verify 15.0 count 23: -t-data-renderer-total_charges-value'
WebUI.verifyElementVisible(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-data-renderer-total_charges-value'), 
    FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-024-P/Step15.0verify-15.0-count-23.png')

'verify 15.0 count 24: -t-WorkflowAction-submit'
WebUI.verifyElementVisible(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-WorkflowAction-submit'), 
    FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-024-P/Step15.0verify-15.0-count-24.png')

'step 16.0: Logout_FO Step Group (Reusable Group)'
WebUI.callTestCase(findTestCase('FrontEnd/Step Group (Reusable Group)/Logout_FO'), [:], FailureHandling.STOP_ON_FAILURE)

