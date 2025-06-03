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

'precondition'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/accessChequeBookRequest'), [('corp') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data CredentialGlobal').getValue('corp', 18), ('user') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data CredentialGlobal').getValue('user', 18), ('pass') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data CredentialGlobal').getValue('pass', 18)], FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 1: Step Group - CreateChequeBookRequestPickUp Step Group (Reusable Group) with test data: Test Data AccountGlobal, account_no: account_no row: 1, account_no_full: nocurrencyname row: 1, AND Test Data BranchGlobal, city: city row: 3, branch: branch row: 3; AND Test Data LabelGlobal type: C_Label row 106; AND Test Data Request, quantity: quantity row: 2, object_account: object_id row: 3, object_city: object_id row: 1, object_branch: object_id row: 2'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Step Group/Step Group - CreateChequeBookRequestPickUp'), 
    [('account_no') : findTestData('FrontEnd/Test Data Global/Test Data AccountGlobal').getValue('account_no', 1), ('account_no_full') : findTestData(
            'FrontEnd/Test Data Global/Test Data AccountGlobal').getValue('no_name_currency', 16), ('city') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data BranchGlobal').getValue('city', 3), ('branch') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data BranchGlobal').getValue('branch', 3), ('type') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data LabelGlobal').getValue('C_Label', 106), ('quantity') : findTestData(
            'Data Files/FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Test Data Request').getValue(
            'quantity', 2), ('object_account') : findTestData('Data Files/FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Test Data Request').getValue(
            'object_id', 3), ('object_city') : findTestData('Data Files/FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Test Data Request').getValue(
            'object_id', 1), ('object_branch') : findTestData('Data Files/FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Test Data Request').getValue(
            'object_id', 2), ('object_quantity') : findTestData('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Test Data Request').getValue(
            'object_id', 4)], FailureHandling.STOP_ON_FAILURE)

'verify 1 count 1: -t-WorkflowAction-back'
WebUI.verifyElementVisible(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-WorkflowAction-back'), 
    FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-030-P/Step1verify-1-count-1.png')

'step 2: Click on t-WorkflowAction-back'
WebUI.click(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-WorkflowAction-back'), 
    FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-030-P/Step2.png')

'verify 2 count 1: -PageTitle : Test Data LabelGlobal, column: C_Label row: 25'
WebUI.verifyElementText(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-PageTitle-main'), 
    findTestData('Data Files/FrontEnd/Test Data Global/Test Data LabelGlobal').getValue('C_Label', 26))

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-030-P/Step2verify-2-count-1.png')

'verify 2 count 2: -Page-subTitle : Test Data LabelGlobal, column: R_Label row: 26'
WebUI.verifyElementText(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-PageTitle-sub'), 
    findTestData('Data Files/FrontEnd/Test Data Global/Test Data LabelGlobal').getValue('R_Label', 16))

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-030-P/Step2verify-2-count-2.png')

'verify 2 count 3: -t-select-account-trigger'
WebUI.verifyElementVisible(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-select-account-trigger'), 
    FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-030-P/Step2verify-2-count-3.png')

'verify 2 count 4: -t-type-label : Test Data LabelGlobal, column: T_Label row: 20'
WebUI.verifyElementText(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-type-label'), 
    findTestData('Data Files/FrontEnd/Test Data Global/Test Data LabelGlobal').getValue('T_Label', 20))

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-030-P/Step2verify-2-count-4.png')

'verify 2 count 5: -t-radio-type-001'
WebUI.verifyElementPresent(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-radio-type-001'), 
    0)

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-030-P/Step2verify-2-count-5.png')

'verify 2 count 6: -t-radio-type-002'
WebUI.verifyElementPresent(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-radio-type-002'), 
    0)

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-030-P/Step2verify-2-count-6.png')

'verify 2 count 7: -t-select-input_quantity-trigger'
WebUI.verifyElementVisible(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-select-input_quantity-trigger'), 
    FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-030-P/Step2verify-2-count-7.png')

'verify 2 count 8: -t-select-city-trigger'
WebUI.verifyElementVisible(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-select-city-trigger'), 
    FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-030-P/Step2verify-2-count-8.png')

'verify 2 count 9: -t-WorkflowAction-confirm'
WebUI.verifyElementVisible(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-WorkflowAction-confirm'), 
    FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-030-P/Step2verify-2-count-9.png')

'step 3.0: Logout_FO Step Group (Reusable Group)'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/Logout_FO'), [:], FailureHandling.STOP_ON_FAILURE)

