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

// updated step 1 Click on t-select-input_quantity-trigger
'precondition'
WebUI.callTestCase(findTestCase('FrontEnd/FO_CA_CU/Step Group (Reusable Group)/accessChequeBookRequest'), [('corp'):findTestData('Data Files/FrontEnd/Test Data Global/Test Data CredentialGlobal').getValue('corp',18),('user'):findTestData('Data Files/FrontEnd/Test Data Global/Test Data CredentialGlobal').getValue('user',18),('pass'):findTestData('Data Files/FrontEnd/Test Data Global/Test Data CredentialGlobal').getValue('pass',18)], FailureHandling.STOP_ON_FAILURE)

'step 1: Click on t-select-input_quantity-trigger'
WebUI.click(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-select-input_quantity-trigger'), FailureHandling.STOP_ON_FAILURE)
'verify 1 count 1: -t-input_quantity-option-1 : Test Data Request, column: quantity row: 1'
WebUI.verifyElementText(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-input_quantity-option-1'), findTestData('Data Files/FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Test Data Request').getValue('quantity', 1))
'verify 1 count 2: -t-input_quantity-option-2 : Test Data Request, column: quantity row: 2'
WebUI.verifyElementText(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-input_quantity-option-2'), findTestData('Data Files/FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Test Data Request').getValue('quantity', 2))
'verify 1 count 3: -t-input_quantity-option-3 : Test Data Request, column: quantity row: 3'
WebUI.verifyElementText(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-input_quantity-option-3'), findTestData('Data Files/FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Test Data Request').getValue('quantity', 3))
'verify 1 count 4: -t-input_quantity-option-4 : Test Data Request, column: quantity row: 4'
WebUI.verifyElementText(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-input_quantity-option-4'), findTestData('Data Files/FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Test Data Request').getValue('quantity', 4))
'verify 1 count 5: -t-input_quantity-option-5 : Test Data Request, column: quantity row: 5'
WebUI.verifyElementText(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-input_quantity-option-5'), findTestData('Data Files/FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Test Data Request').getValue('quantity', 5))
'verify 1 count 6: -t-input_quantity-option-6 : Test Data Request, column: quantity row: 6'
WebUI.verifyElementText(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-input_quantity-option-6'), findTestData('Data Files/FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Test Data Request').getValue('quantity', 6))
'verify 1 count 7: -t-input_quantity-option-7 : Test Data Request, column: quantity row: 7'
WebUI.verifyElementText(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-input_quantity-option-7'), findTestData('Data Files/FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Test Data Request').getValue('quantity', 7))
'verify 1 count 8: -t-input_quantity-option-8 : Test Data Request, column: quantity row: 8'
WebUI.verifyElementText(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-input_quantity-option-8'), findTestData('Data Files/FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Test Data Request').getValue('quantity', 8))
'verify 1 count 9: -t-input_quantity-option-9 : Test Data Request, column: quantity row: 9'
WebUI.verifyElementText(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-input_quantity-option-9'), findTestData('Data Files/FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Test Data Request').getValue('quantity', 9))
'verify 1 count 10: -t-input_quantity-option-10 : Test Data Request, column: quantity row: 10'
WebUI.verifyElementText(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-input_quantity-option-10'), findTestData('Data Files/FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Test Data Request').getValue('quantity', 10))
'verify 1 count 11: -t-input_quantity-option-11 : Test Data Request, column: quantity row: 11'
WebUI.verifyElementText(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-input_quantity-option-11'), findTestData('Data Files/FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Test Data Request').getValue('quantity', 11))
'verify 1 count 12: -t-input_quantity-option-12 : Test Data Request, column: quantity row: 12'
WebUI.verifyElementText(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-input_quantity-option-12'), findTestData('Data Files/FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Test Data Request').getValue('quantity', 12))
'verify 1 count 13: -t-input_quantity-option-13 : Test Data Request, column: quantity row: 13'
WebUI.verifyElementText(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-input_quantity-option-13'), findTestData('Data Files/FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Test Data Request').getValue('quantity', 13))
'verify 1 count 14: -t-input_quantity-option-14 : Test Data Request, column: quantity row: 14'
WebUI.verifyElementText(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-input_quantity-option-14'), findTestData('Data Files/FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Test Data Request').getValue('quantity', 14))
'verify 1 count 15: -t-input_quantity-option-15 : Test Data Request, column: quantity row: 15'
WebUI.verifyElementText(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-input_quantity-option-15'), findTestData('Data Files/FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Test Data Request').getValue('quantity', 15))
'verify 1 count 16: -t-input_quantity-option-16 : Test Data Request, column: quantity row: 16'
WebUI.verifyElementText(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-input_quantity-option-16'), findTestData('Data Files/FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Test Data Request').getValue('quantity', 16))
'verify 1 count 17: -t-input_quantity-option-17 : Test Data Request, column: quantity row: 17'
WebUI.verifyElementText(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-input_quantity-option-17'), findTestData('Data Files/FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Test Data Request').getValue('quantity', 17))
'verify 1 count 18: -t-input_quantity-option-18 : Test Data Request, column: quantity row: 18'
WebUI.verifyElementText(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-input_quantity-option-18'), findTestData('Data Files/FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Test Data Request').getValue('quantity', 18))
'verify 1 count 19: -t-input_quantity-option-19 : Test Data Request, column: quantity row: 19'
WebUI.verifyElementText(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-input_quantity-option-19'), findTestData('Data Files/FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Test Data Request').getValue('quantity', 19))
'verify 1 count 20: -t-input_quantity-option-20 : Test Data Request, column: quantity row: 20'
WebUI.verifyElementText(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-input_quantity-option-20'), findTestData('Data Files/FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Test Data Request').getValue('quantity', 20))
CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-005-P/Step1verify-1-count-20.png')

'step 2.0: Use custom keyword handleWebTable.HTMLTableHelper_FO.selectItemonDropdown with input Test Data Request column: object_id row: 4, Test Data Request column: quantity row: 1'
CustomKeywords.'handleWebTable.HTMLTableHelper_FO.selectItemonDropdown'(findTestData('Data Files/FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Test Data Request').getValue('object_id', 4),findTestData('Data Files/FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Test Data Request').getValue('quantity', 1))
'verify 2.0 count 1: -t-select-input_quantity-trigger : Test Data Request, column: quantity row: 1'
WebUI.verifyElementText(findTestObject('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/t-select-input_quantity-trigger'), findTestData('Data Files/FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/Test Data Request').getValue('quantity', 1))
CustomKeywords.'get.ScreenCapture.getEntirePage'('FrontEnd/FO_CA_CU/TC-Primecash-Corporate User Module-Cheque Book Request/R-52-005-P/Step2.0verify-2.0-count-1.png')

'step 3.0: Logout_FO Step Group (Reusable Group)'
WebUI.callTestCase(findTestCase('FrontEnd/Step Group (Reusable Group)/Logout_FO'), [:], FailureHandling.STOP_ON_FAILURE)

//No verification required

