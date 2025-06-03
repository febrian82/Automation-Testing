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

// updated step 1 Click on t-radio-delivery-method-COURIER
'precondition'
WebUI.callTestCase(findTestCase('FrontEnd/FO_CA_CU/Step Group (Reusable Group)/accessChequeBookRequest'), [('corp') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data CredentialGlobal').getValue('corp', 18), ('user') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data CredentialGlobal').getValue('user', 18), ('pass') : findTestData(
            'Data Files/FrontEnd/Test Data Global/Test Data CredentialGlobal').getValue('pass', 18)], FailureHandling.STOP_ON_FAILURE)

'step 1: Click on t-radio-deliveryMethod-0'
WebUI.click(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-radio-deliveryMethod-0'), 
    FailureHandling.STOP_ON_FAILURE)

//No verification required
'step 2: Click on t-add-address'
WebUI.click(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-add-address'), FailureHandling.STOP_ON_FAILURE)

'verify 2 count 1: t-address-0 will be displayed'
WebUI.verifyElementVisible(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-address-0'), 
    FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-015-N/Step2verify-2-count-0.png')

'step 3: Click on t-add-address'
WebUI.click(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-add-address'), FailureHandling.STOP_ON_FAILURE)

'verify 3 count 1: t-address-1 will be displayed'
WebUI.verifyElementVisible(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-address-2'), 
    FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-015-N/Step3verify-3-count-0.png')

'step 4: Enter value with test data column: data row: 10 in the t-address-0 field'
CustomKeywords.'keys.SetTextHandler.handleInput'(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-address-0'), 
    findTestData('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Test Data Request').getValue(
        'data', 10), FailureHandling.STOP_ON_FAILURE)

'verify 4 count 1: t-address-0 will have attribute value with test data Test Data Request, equals column: data row: 10'
WebUI.verifyElementAttributeValue(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-address-0'), 
    'value', findTestData('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Test Data Request').getValue(
        'data', 10), 0)

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-015-N/Step4verify-4-count-0.png')

'step 5: Enter value with test data column: data row: 10 in the t-address-1 field'
CustomKeywords.'keys.SetTextHandler.handleInput'(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-address-1'), 
    findTestData('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Test Data Request').getValue(
        'data', 10), FailureHandling.STOP_ON_FAILURE)

'verify 5 count 1: t-address-1 will have attribute value with test data Test Data Request, equals column: data row: 10'
WebUI.verifyElementAttributeValue(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-address-1'), 
    'value', findTestData('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Test Data Request').getValue(
        'data', 10), 0)

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-015-N/Step5verify-5-count-0.png')

'step 6: Enter value with test data column: data row: 10 in the t-address-2 field'
CustomKeywords.'keys.SetTextHandler.handleInput'(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-address-2'), 
    findTestData('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Test Data Request').getValue(
        'data', 10), FailureHandling.STOP_ON_FAILURE)

'verify 6 count 1: t-address-2 will have attribute value with test data Test Data Request, equals column: data row: 10'
WebUI.verifyElementAttributeValue(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-address-2'), 
    'value', findTestData('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Test Data Request').getValue(
        'data', 10), 0)

CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-015-N/Step6verify-6-count-0.png')

'step 7.0: Logout_FO Step Group (Reusable Group)'
WebUI.callTestCase(findTestCase('FrontEnd/Step Group (Reusable Group)/Logout_FO'), [:], FailureHandling.STOP_ON_FAILURE)

