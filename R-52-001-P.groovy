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

// updated step 1 Click on menu-ChequeManagement
'precondition'
WebUI.callTestCase(findTestCase('FrontEnd/FO_CA_CU/Step Group (Reusable Group)/Login_FO'), [('corp') : findTestData('Data Files/FrontEnd/Test Data Global/Test Data CredentialGlobal').getValue(
            'corp', 18), ('user') : findTestData('Data Files/FrontEnd/Test Data Global/Test Data CredentialGlobal').getValue(
            'user', 18), ('pass') : findTestData('Data Files/FrontEnd/Test Data Global/Test Data CredentialGlobal').getValue(
            'pass', 18)], FailureHandling.STOP_ON_FAILURE)

'step 1: Click on menu-ChequeManagement'
WebUI.click(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/menu-ChequeManagement'), 
    FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 2.0: Click on menu-ChequeBookRequest'
WebUI.click(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/menu-ChequeBookRequest'), 
    FailureHandling.STOP_ON_FAILURE)

'verify 2.0 count 1: -t-PageTitle-main : Test Data LabelGlobal, column: C_Label row: 26'
WebUI.verifyElementText(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-PageTitle-main'), 
    findTestData('Data Files/FrontEnd/Test Data Global/Test Data LabelGlobal').getValue('C_Label', 26))

'verify 2.0 count 2: -t-PageTitle-sub : Test Data LabelGlobal, column: R_Label row: 16'
WebUI.verifyElementText(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-PageTitle-sub'), 
    findTestData('Data Files/FrontEnd/Test Data Global/Test Data LabelGlobal').getValue('R_Label', 16))

'verify 2.0 count 3: -t-account-label : Test Data LabelGlobal, column: A_Label row: 48'
WebUI.verifyElementText(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-account-label'), 
    findTestData('Data Files/FrontEnd/Test Data Global/Test Data LabelGlobal').getValue('A_Label', 48))

'verify 2.0 count 4: -t-select-account-trigger'
WebUI.verifyElementVisible(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-select-account-trigger'), 
    FailureHandling.STOP_ON_FAILURE)

'verify 2.0 count 5: -t-type-label : Test Data LabelGlobal, column: T_Label row: 20'
WebUI.verifyElementText(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-type-label'), 
    findTestData('Data Files/FrontEnd/Test Data Global/Test Data LabelGlobal').getValue('T_Label', 20))

'verify 2.0 count 6: -t-radio-type-001 will be present'
WebUI.verifyElementPresent(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-radio-type-001'), 
    0, FailureHandling.STOP_ON_FAILURE)

'verify 2.0 count 7: -t-radio-type-002 will be present'
WebUI.verifyElementPresent(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-radio-type-002'), 
    0, FailureHandling.STOP_ON_FAILURE)

//failed to generate verify 2.0 count 8
'verify 2.0 count 9: -t-inputQuantity'
WebUI.verifyElementVisible(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-inputQuantity'), 
    FailureHandling.STOP_ON_FAILURE)

//failed to generate verify 2.0 count 10
'verify 2.0 count 11: -t-radio-deliveryMethod-0 will be present'
WebUI.verifyElementPresent(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-radio-deliveryMethod-0'), 
    0, FailureHandling.STOP_ON_FAILURE)

'verify 2.0 count 12: -t-radio-deliveryMethod-1 will be present'
WebUI.verifyElementPresent(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-radio-deliveryMethod-1'), 
    0, FailureHandling.STOP_ON_FAILURE)

'verify 2.0 count 13: -t-city-label : Test Data LabelGlobal, column: C_Label row: 27'
WebUI.verifyElementText(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-city-label'), 
    findTestData('Data Files/FrontEnd/Test Data Global/Test Data LabelGlobal').getValue('C_Label', 27))

'verify 2.0 count 14: -t-select-city-trigger'
WebUI.verifyElementVisible(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-select-city-trigger'), 
    FailureHandling.STOP_ON_FAILURE)

//failed to generate verify 2.0 count 15
'verify 2.0 count 16: -t-select-branch-trigger'
WebUI.verifyElementVisible(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-select-branch-trigger'), 
    FailureHandling.STOP_ON_FAILURE)

//failed to generate verify 2.0 count 17
'verify 2.0 count 18: -t-address-0'
WebUI.verifyElementVisible(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-address-0'), 
    FailureHandling.STOP_ON_FAILURE)

'verify 2.0 count 19: -t-add-address'
WebUI.verifyElementVisible(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-add-address'), 
    FailureHandling.STOP_ON_FAILURE)

//failed to generate verify 2.0 count 20
'verify 2.0 count 21: -t-postalCode'
WebUI.verifyElementVisible(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-postalCode'), 
    FailureHandling.STOP_ON_FAILURE)

'verify 2.0 count 22: -t-WorkflowAction-confirm'
WebUI.verifyElementVisible(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-WorkflowAction-confirm'), 
    FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-001-P/Step2.0verify-2.0-count-22.png')

'step 3.0: Logout_FO Step Group (Reusable Group)'
WebUI.callTestCase(findTestCase('FrontEnd/Step Group (Reusable Group)/Logout_FO'), [:], FailureHandling.STOP_ON_FAILURE)

