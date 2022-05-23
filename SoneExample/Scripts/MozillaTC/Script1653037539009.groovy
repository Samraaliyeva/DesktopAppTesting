import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.Cookie as Cookie
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

Windows.startApplicationWithTitle('C:\\Program Files\\Mozilla Firefox\\firefox.exe', '')

Windows.click(findWindowsObject('Object Repository/Mozilla/amazon'))

Windows.click(findWindowsObject('Object Repository/Mozilla/amazonBasics'))

Windows.click(findWindowsObject('Mozilla/accessoriPerComputer'))

Windows.click(findWindowsObject('Mozilla/cercaBTN'))

Windows.setText(findWindowsObject('Mozilla/CercaTutto'), 'apple')

Windows.sendKeys(findWindowsObject('Object Repository/Mozilla/CercaTutto'), Keys.chord(Keys.ENTER))

Windows.delay(2)

Windows.comment('open new tab')

Windows.click(findWindowsObject('Object Repository/Mozilla/openNewTab'))

Windows.click(findWindowsObject('Mozilla/searchInstagram'))

Windows.setText(findWindowsObject('Object Repository/Mozilla/setInstagram'), 'instagram')

Windows.sendKeys(findWindowsObject('Mozilla/searchInstagram'), Keys.chord(Keys.ENTER))

Windows.switchToApplication(FailureHandling.STOP_ON_FAILURE)

