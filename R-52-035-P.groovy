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

'step 1: accessChequeBookRequest Step Group (Reusable Group) with test data: Test Data CredentialGlobal, corp: corp row: 6, user: user row: 6, pass: pass row: 6'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/accessChequeBookRequest'), [('corp') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data CredentialGlobal').getValue('corp', 18), ('user') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data CredentialGlobal').getValue('user', 18), ('pass') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data CredentialGlobal').getValue('pass', 18)], FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 2.0: Step Group - CreateChequeBookRequestCourier Step Group (Reusable Group) with test data: Test Data AccountGlobal, account_no: no_name_currency row: 1, AND Test Data BranchGlobal city: city row: 1; AND Test Data LabelGlobal type: C_Label row 28; AND Test Data Request quantity: quantity row: 2, address: data row: 12, postcode: data row: 7, object_account: object_id row: 3, object_city: object_id row: 1'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Step Group/Step Group - CreateChequeBookRequestCourier'), 
    [('account_no') : findTestData('FrontEnd/FO_CA_CU/Test Data Global/Test Data AccountGlobal').getValue('account_no', 
            1), ('city') : findTestData('FrontEnd/Test Data Global/Test Data BranchGlobal').getValue('city', 3), ('type') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data LabelGlobal').getValue('C_Label', 106), ('object_quantity') : findTestData(
            'Data Files/FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Test Data Request').getValue(
            'object_id', 4), ('quantity') : findTestData('Data Files/FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Test Data Request').getValue(
            'quantity', 2), ('address') : findTestData('Data Files/FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Test Data Request').getValue(
            'data', 12), ('postcode') : findTestData('Data Files/FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Test Data Request').getValue(
            'data', 7), ('object_account') : findTestData('Data Files/FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Test Data Request').getValue(
            'object_id', 3), ('object_city') : findTestData('Data Files/FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Test Data Request').getValue(
            'object_id', 1), ('object_branch') : findTestData('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Test Data Request').getValue(
            'object_id', 2), ('branch') : findTestData('FrontEnd/Test Data Global/Test Data BranchGlobal').getValue('branch', 
            3), ('account_no_full') : findTestData('FrontEnd/Test Data Global/Test Data AccountGlobal').getValue('no_name_currency', 
            16)], FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 3.0: Click on t-WorkflowAction-submit'
WebUI.click(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-WorkflowAction-submit'), 
    FailureHandling.STOP_ON_FAILURE)

'step 4.0: Get text from t-data-renderer-transaction_id-value field then assign into variable: trxId'
def trxId = WebUI.getText(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-data-renderer-transaction_id-value'), 
    FailureHandling.STOP_ON_FAILURE)

'step 5.0: Logout_FO Step Group (Reusable Group)'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/Logout_FO'), [:], FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 6.0: TransactionStatusDetailCU Step Group (Reusable Group) with test data: Test Data CredentialGlobal, corp: corp row: 17, user: user row: 17, pass: pass row: 17; AND Test Data LabelGlobal status: P_Label row: 16; AND with parameter trxId: trxId'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/TransactionStatusDetailCU'), [('corp') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data CredentialGlobal').getValue('corp', 18), ('user') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data CredentialGlobal').getValue('user', 18), ('pass') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data CredentialGlobal').getValue('pass', 18), ('status') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data LabelGlobal').getValue('P_Label', 16), ('trxId') : trxId], FailureHandling.STOP_ON_FAILURE)

'step 7.0: Logout_FO Step Group (Reusable Group)'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/Logout_FO'), [:], FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 8.0: CompanyFinanciaDetail Step Group (Reusable Group) with test data: Test Data CredentialGlobal, corp: corp row: 17, user: user row: 17, pass: pass row: 17, activityBy: user row: 17; AND Test Data MenuProductGlobal column: Menu row: 52; AND Test Data LabelGlobal status: P_Label row: 16; AND with parameter trxId: trxId, with parameter activityType: GlobalVariable.Create'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/CompanyFinancialDetail'), [('corp') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data CredentialGlobal').getValue('corp', 18), ('user') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data CredentialGlobal').getValue('user', 18), ('pass') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data CredentialGlobal').getValue('pass', 18), ('userName') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data CredentialGlobal').getValue('user', 18), ('menuName') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data MenuProductGlobal').getValue('Menu', 52), ('status') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data LabelGlobal').getValue('P_Label', 16), ('trxId') : trxId, ('activityType') : GlobalVariable.Create], 
    FailureHandling.STOP_ON_FAILURE)

'step 9.0: Logout_FO Step Group (Reusable Group)'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/Logout_FO'), [:], FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 10.0: PendingTaskCUApproveListing Step Group (Reusable Group) with test data: Test Data CredentialGlobal, user: user row: 22, pass: pass row: 22; AND with parameter: trxId: trxId'
WebUI.callTestCase(findTestCase('FrontEnd/Step Group (Reusable Group)/PendingTaskCUApproveDetail'), [('corp') : findTestData(
            'FrontEnd/All Test Data/Test Data Global/Test Data CredentialGlobal').getValue('corp', 22), ('user') : findTestData(
            'FrontEnd/All Test Data/Test Data Global/Test Data CredentialGlobal').getValue('user', 22), ('pass') : findTestData(
            'FrontEnd/All Test Data/Test Data Global/Test Data CredentialGlobal').getValue('pass', 22), ('trxId') : trxId], 
    FailureHandling.STOP_ON_FAILURE)

'step 11.0: Logout_FO Step Group (Reusable Group)'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/Logout_FO'), [:], FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 12.0: TransactionStatusDetailCU Step Group (Reusable Group) with test data: Test Data CredentialGlobal, corp: corp row: 17, user: user row: 17, pass: pass row: 17; AND Test Data LabelGlobal status: P_Label row: 16; AND with parameter trxId: trxId'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/TransactionStatusDetailCU'), [('corp') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data CredentialGlobal').getValue('corp', 17), ('user') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data CredentialGlobal').getValue('user', 17), ('pass') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data CredentialGlobal').getValue('pass', 17), ('status') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data LabelGlobal').getValue('P_Label', 16), ('trxId') : trxId], FailureHandling.STOP_ON_FAILURE)

'step 13.0: Logout_FO Step Group (Reusable Group)'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/Logout_FO'), [:], FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 14.0: CompanyFinanciaDetail Step Group (Reusable Group) with test data: Test Data CredentialGlobal, corp: corp row: 17, user: user row: 17, pass: pass row: 17, activityBy: user row: 22; AND Test Data MenuProductGlobal column: Menu row: 52; AND Test Data LabelGlobal status: P_Label row: 16; AND with parameter trxId: trxId, with parameter activityType: GlobalVariable.Create'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/CompanyFinancialDetail'), [('corp') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data CredentialGlobal').getValue('corp', 18), ('user') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data CredentialGlobal').getValue('user', 18), ('pass') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data CredentialGlobal').getValue('pass', 18), ('userName') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data CredentialGlobal').getValue('user', 18), ('menuName') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data MenuProductGlobal').getValue('Menu', 52), ('status') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data LabelGlobal').getValue('P_Label', 16), ('trxId') : trxId, ('activityType') : GlobalVariable.Create], 
    FailureHandling.STOP_ON_FAILURE)

'step 15.0: Logout_FO Step Group (Reusable Group)'
WebUI.callTestCase(findTestCase('Test Cases/FrontEnd/Step Group (Reusable Group)/Logout_FO'), [:], FailureHandling.STOP_ON_FAILURE)

