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

// updated step 1 Click on t-radio-delivery_type-PICK_UP_AT_BRANCH
'precondition'
WebUI.callTestCase(findTestCase('FrontEnd/FO_CA_CU/Step Group (Reusable Group)/accessChequeBookRequest'), [('corp') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data CredentialGlobal').getValue('corp', 18), ('user') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data CredentialGlobal').getValue('user', 18), ('pass') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data CredentialGlobal').getValue('pass', 18)], FailureHandling.STOP_ON_FAILURE)

'step 1: Click on t-radio-deliveryMethod-1'
WebUI.click(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-radio-deliveryMethod-1'), 
    FailureHandling.STOP_ON_FAILURE)

'verify 1 count 1: t-radio-deliveryMethod1 will be checked'
WebUI.verifyElementChecked(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-radio-deliveryMethod-1'), 
    0)

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-019-P/Step1verify-1-count-0.png')

'step 2.0: Click on t-select-city-trigger'
WebUI.click(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-select-city-trigger'), 
    FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 3.0: Enter value with Test Data Request column: data row: 4 in the t-select-city field'
CustomKeywords.'keys.SetTextHandler.handleInput'(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-select-city'), 
    findTestData('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Test Data Request').getValue(
        'data', 4), FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-019-P/Step3.0verify-3.0-count-1.png')

'step 4.0: Use custom keyword handleWebTable.HTMLTableHelper_FO.selectItemonDropdown with input Test Data Request column: object_id row: 1, Test Data BranchGlobal column: city row: 4'
CustomKeywords.'handleWebTable.HTMLTableHelper_FO.selectItemonDropdown'(findTestData('Data Files/FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Test Data Request').getValue(
        'object_id', 1), findTestData('Data Files/FrontEnd/FO_CA_CU/Test Data Global/Test Data BranchGlobal').getValue('city', 
        3))

'verify 4.0 count 1: -t-select-city-trigger : Test Data BranchGlobal, column: city row: 4'
WebUI.verifyElementText(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-select-city-trigger'), 
    findTestData('Data Files/FrontEnd/Test Data Global/Test Data BranchGlobal').getValue('city', 3))

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-019-P/Step4.0verify-4.0-count-1.png')

'step 5.0: Logout_FO Step Group (Reusable Group)'
WebUI.callTestCase(findTestCase('FrontEnd/Step Group (Reusable Group)/Logout_FO'), [:], FailureHandling.STOP_ON_FAILURE)

