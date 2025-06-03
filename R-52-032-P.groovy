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
'step 1: Step Group - CreateChequeBookRequestPickUp Step Group (Reusable Group) with test data: Test Data AccountGlobal, account_no: account_no row: 1, account_no_full: nocurrencyname row: 1, AND Test Data BranchGlobal, city: city row: 3, branch: branch row: 3; AND Test Data LabelGlobal type: C_Label row: 106; AND Test Data Request, quantity: quantity row: 2, object_account: object_id row: 3, object_city: object_id row: 1, object_branch: object_id row: 2'
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

'verify 1 count 1: -t-WorkflowAction-submit'
WebUI.verifyElementVisible(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-WorkflowAction-submit'), 
    FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-032-P/Step1verify-1-count-1.png')

'step 2.0: Click on t-WorkflowAction-submit'
WebUI.click(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-WorkflowAction-submit'), 
    FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-032-P/Step2.png')

//No verification required
'step 3.0: Click on t-hyperlink-this_user'
WebUI.click(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-transactionStatus-next-approver'), 
    FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-032-P/Step3.0verify-3.0-count-1.png')

'verify 3.0 count 1: -t-TransactionStatus-user-1'
WebUI.verifyElementVisible(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-TransactionStatus-user-1'), 
    FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-032-P/Step3.0verify-3.0-count-1.png')

'verify 3.0 count 2: -t-TransactionStatus-user-2'
WebUI.verifyElementVisible(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-TransactionStatus-user-2'), 
    FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-032-P/Step3.0verify-3.0-count-2.png')

'step 4.0: Logout_FO Step Group (Reusable Group)'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/Logout_FO'), [:], FailureHandling.STOP_ON_FAILURE)

