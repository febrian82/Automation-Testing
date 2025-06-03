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
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

'precondition'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/accessChequeBookRequest'), [('corp') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data CredentialGlobal').getValue('corp', 18), ('user') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data CredentialGlobal').getValue('user', 18), ('pass') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data CredentialGlobal').getValue('pass', 18)], FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 1: Step Group - CreateChequeBookRequestCourier Step Group (Reusable Group) with test data: Test Data AccountGlobal, account_no: account_no row: 1, account_no_full: nocurrencyname row: 1, AND Test Data BranchGlobal, city: city row: 3, branch: branch row: 3; AND Test Data LabelGlobal type: C_Label row: 106; AND Test Data Request, quantity: quantity row: 2, object_account: object_id row: 3, object_city: object_id row: 1, object_branch: object_id row: 2, address: data row: 6, postcode: data row: 7'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Step Group/Step Group - CreateChequeBookRequestCourier'), 
    [('account_no') : findTestData('FrontEnd/Test Data Global/Test Data AccountGlobal').getValue('account_no', 1), ('object_quantity') : findTestData(
            'FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Test Data Request').getValue('object_id', 
            4), ('account_no_full') : findTestData('FrontEnd/Test Data Global/Test Data AccountGlobal').getValue('no_name_currency', 
            16), ('city') : findTestData('Data Files/FrontEnd/Test Data Global/Test Data BranchGlobal').getValue('city', 
            3), ('branch') : findTestData('Data Files/FrontEnd/Test Data Global/Test Data BranchGlobal').getValue('branch', 
            3), ('type') : findTestData('Data Files/FrontEnd/Test Data Global/Test Data LabelGlobal').getValue('C_Label', 
            106), ('quantity') : findTestData('Data Files/FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Test Data Request').getValue(
            'quantity', 2), ('object_account') : findTestData('Data Files/FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Test Data Request').getValue(
            'object_id', 3), ('object_city') : findTestData('Data Files/FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Test Data Request').getValue(
            'object_id', 1), ('object_branch') : findTestData('Data Files/FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Test Data Request').getValue(
            'object_id', 2), ('address') : findTestData('Data Files/FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Test Data Request').getValue(
            'data', 6), ('postcode') : findTestData('Data Files/FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Test Data Request').getValue(
            'data', 7)], FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 2.0: Click on t-WorkflowAction-submit'
WebUI.click(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-WorkflowAction-submit'), 
    FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-034-P/Step2.0.png')

//No verification required
'step 3.0: Get text from t-data-renderer-transaction_id-value field then assign into variable: trxId'
trxId = WebUI.getText(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-data-renderer-transaction_id-value'), 
    FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-034-P/Step3.0.png')

'verify 3.0 count 1: -t-hyperlink-check_transaction_status with timeout 5 second'
WebUI.verifyElementPresent(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-hyperlink-check_transaction_status'), 
    5)

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-034-P/Step3.0verify-3.0-count-1.png')

'step 4.0: Get text from t-data-renderer-documentNumber-value field then assign into variable: docNo'
docNo = WebUI.getText(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-data-renderer-documentNumber-value'), 
    FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-034-P/Step4.0.png')

//No verification required
'step 5.0: Click on t-hyperlink-check_transaction_status'
WebUI.click(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-hyperlink-check_transaction_status'), 
    FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-034-P/Step5.0.png')

'verify 5.0 count 1: Use custom keyword handleWebTable.HTMLTableHelper.verifyListOnTableContainsSpecificValue with input [docNo; Test Data CredentialGlobal column: user row: 18; Test Data LabelGlobal column: S_Label row: 72; Test Data LabelGlobal column: P_Label row: 16]'
CustomKeywords.'handleWebTable.HTMLTableHelper_FO.verifyListOnTableContainsSpecificValue'([docNo, findTestData('FrontEnd/Test Data Global/Test Data CredentialGlobal').getValue(
            'user', 18), findTestData('FrontEnd/Test Data Global/Test Data LabelGlobal').getValue('S_Label', 72), findTestData(
            'FrontEnd/Test Data Global/Test Data LabelGlobal').getValue('P_Label', 16)])

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-034-P/Step5.0verify-5.0-count-1.png')

'step 6.0: Logout_FO Step Group (Reusable Group)'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/Logout_FO'), [:], FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 7.0: CompanyFinancialDetail Step Group (Reusable Group) with test data: Test Data CredentialGlobal, corp: corp row: 18, user: user row: 18, pass: pass row: 18, activityBy: user row: 18; AND Test Data MenuProductGlobal menuName: Menu row: 52, with parameter activityType: GlobalVariable.Create, with parameter trxId: trxId'
WebUI.callTestCase(findTestCase('FrontEnd/Step Group (Reusable Group)/CompanyFinancialDetail'), [('corp') : findTestData(
            'FrontEnd/Test Data Global/Test Data CredentialGlobal').getValue('corp', 18), ('user') : findTestData('FrontEnd/Test Data Global/Test Data CredentialGlobal').getValue(
            'user', 18), ('pass') : findTestData('FrontEnd/Test Data Global/Test Data CredentialGlobal').getValue('pass', 
            18), ('userMaker') : findTestData('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Test Data Request').getValue(
            'user_maker', 1), ('menuName') : findTestData('FrontEnd/Test Data Global/Test Data MenuProductGlobal').getValue(
            'Menu', 52), ('activityType') : findTestData('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Test Data Request').getValue(
            'type', 1), ('trxId') : trxId, ('userName') : findTestData('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Test Data Request').getValue(
            'user_maker', 2)], FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 8.0: Logout_FO Step Group (Reusable Group)'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/Logout_FO'), [:], FailureHandling.STOP_ON_FAILURE)

'step 9.0: PendingTaskCUApproveListing Step Group (Reusable Group) with test data: Test Data CredentialGlobal, user: user row: 22, pass: pass row: 22, with parameter: trxId: trxId'
WebUI.callTestCase(findTestCase('FrontEnd/Step Group (Reusable Group)/PendingTaskCUApproveListing'), [('corp') : findTestData(
            'FrontEnd/Test Data Global/Test Data CredentialGlobal').getValue('corp', 22), ('user') : findTestData('FrontEnd/Test Data Global/Test Data CredentialGlobal').getValue(
            'user', 22), ('pass') : findTestData('FrontEnd/Test Data Global/Test Data CredentialGlobal').getValue('pass', 
            22), ('trxId') : trxId], FailureHandling.STOP_ON_FAILURE)

'verify 9.0 count 1: Use custom keyword handleWebTable.HTMLTableHelper_FO.verifyListOnTableContainsSpecificValue with input [trxId; Test Data MessageGlobal column: Message row: 175]'
CustomKeywords.'handleWebTable.HTMLTableHelper_FO.verifyListOnTableContainsSpecificValue'([trxId, findTestData('FrontEnd/Test Data Global/Test Data MessageGlobal').getValue(
            'Message', 8)])

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-034-P/Step9.0verify-9.0-count-1.png')

'step 10.0: Logout_FO Step Group (Reusable Group)'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/Logout_FO'), [:], FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 11.0: TransactionStatusDetailCU Step Group (Reusable Group) with test data: Test Data CredentialGlobal, corp: corp row: 17, user: user row: 17, pass: pass row: 17, with parameter trxId: trxId'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/TransactionStatusDetailCU'), [('corp') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data CredentialGlobal').getValue('corp', 18), ('user') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data CredentialGlobal').getValue('user', 18), ('pass') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data CredentialGlobal').getValue('pass', 18), ('trxId') : trxId], 
    FailureHandling.STOP_ON_FAILURE)

'verify 11.0 count 1: Use custom keyword handleWebTable.HTMLTableHelper.verifyListOnTableContainsSpecificValue with input [docNo; Test Data CredentialGlobal column: user row: 22; Test Data LabelGlobal column: S_Label row: 72; Test Data LabelGlobal column: P_Label row: 18]'
CustomKeywords.'handleWebTable.HTMLTableHelper_FO.verifyListOnTableContainsSpecificValue'([docNo, findTestData('FrontEnd/Test Data Global/Test Data CredentialGlobal').getValue(
            'user', 22), findTestData('FrontEnd/Test Data Global/Test Data LabelGlobal').getValue('S_Label', 72), findTestData(
            'FrontEnd/Test Data Global/Test Data LabelGlobal').getValue('P_Label', 18)])

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-034-P/Step11.0verify-11.0-count-1.png')

'step 12.0: Logout_FO Step Group (Reusable Group)'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/Logout_FO'), [:], FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 13.0: CompanyFinanciaDetail Step Group (Reusable Group) with test data: Test Data CredentialGlobal, corp: corp row: 18, user: user row: 18, pass: pass row: 18, activityBy: user row: 22; AND Test Data MenuProductGlobal column: Menu row: 52, with parameter activityType: GlobalVariable.Approve, with parameter trxId: trxId'
WebUI.callTestCase(findTestCase('FrontEnd/Step Group (Reusable Group)/CompanyFinancialDetail'), [('corp') : findTestData(
            'FrontEnd/Test Data Global/Test Data CredentialGlobal').getValue('corp', 18), ('user') : findTestData('FrontEnd/Test Data Global/Test Data CredentialGlobal').getValue(
            'user', 18), ('pass') : findTestData('FrontEnd/Test Data Global/Test Data CredentialGlobal').getValue('pass', 
            18), ('userName') : findTestData('FrontEnd/Test Data Global/Test Data CredentialGlobal').getValue('user', 22)
        , ('menuName') : findTestData('FrontEnd/Test Data Global/Test Data MenuProductGlobal').getValue('Menu', 52), ('activityType') : GlobalVariable.Approve
        , ('trxId') : trxId], FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 14.0: Logout_FO Step Group (Reusable Group)'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/Logout_FO'), [:], FailureHandling.STOP_ON_FAILURE)

