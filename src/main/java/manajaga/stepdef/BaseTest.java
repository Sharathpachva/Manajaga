package manajaga.stepdef;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Properties;

import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Store;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.CapabilityType;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import manajaga.utils.Configurations;

public class BaseTest {

	public static WebDriver driver;
	private static String osName = System.getProperty("os.name").toLowerCase();
	private static boolean initialSetup = true;

	@Before("@ie")
	public void ie() throws Throwable {
		if (initialSetup) {
			System.setProperty("webdriver.ie.driver", loadIeDriver());
			// DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
			// capabilities.setCapability(CapabilityType.BROWSER_NAME, "IE");
			// capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
			// true);
			// capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			// capabilities.setJavascriptEnabled(true);
			InternetExplorerOptions options = new InternetExplorerOptions();
			options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			InternetExplorerDriver driver = new InternetExplorerDriver(options);
			driver.manage().window().maximize();
			driver.get(Configurations.getConfigData("URL"));
			BaseTest.waitUntilPageLoad();
		}
	}

	@Before("@chrome")
	public void Chrome() throws Throwable {
		System.setProperty("webdriver.chrome.driver", loadChromeDriver());
		ChromeOptions options = new ChromeOptions();
		if (osName.contains("linux")) {
			options.addArguments("--window-size=1920,1080");
			options.addArguments("--headless");
		} else if (osName.contains("Windows")) {
			driver.manage().window().maximize();
		}
		options.addArguments("--disable-notifications");
		options.addArguments("--disable-gpu");
		options.addArguments("--disable-extensions");
		options.setExperimentalOption("useAutomationExtension", false);
		options.addArguments("--proxy-server='direct://'");
		options.addArguments("--proxy-bypass-list=*");
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		driver.get(Configurations.getConfigData("URL"));
		BaseTest.waitUntilPageLoad();
	}
	
	@Before("@chromeincognito")
	public void chromeincognito() throws Throwable {
		System.setProperty("webdriver.chrome.driver", loadChromeDriver());
		ChromeOptions options = new ChromeOptions();
		if (osName.contains("linux")) {
			options.addArguments("--window-size=1920,1080");
			options.addArguments("--headless");
		} else if (osName.contains("Windows")) {
			driver.manage().window().maximize();
		}
		options.addArguments("--disable-gpu");
		options.addArguments("--incognito");
		options.addArguments("--disable-extensions");
		options.setExperimentalOption("useAutomationExtension", false);
		options.addArguments("--proxy-server='direct://'");
		options.addArguments("--proxy-bypass-list=*");
		options.addArguments("--start-maximized");
		//.addArguments("--headless");
		driver = new ChromeDriver(options);
		driver.get(Configurations.getConfigData("URL"));
		BaseTest.waitUntilPageLoad();
	}
	

	@Before("@firefox")
	public void firefox() throws Throwable {
		if (initialSetup) {
			System.setProperty("webdriver.gecko.driver", loadFirefoxDriver());
			initialSetup = false;
		}
		FirefoxBinary firefoxBinary = new FirefoxBinary();
		if (osName.contains("linux")) {
			firefoxBinary.addCommandLineOptions("--headless");
		}
		FirefoxOptions firefoxOptions = new FirefoxOptions();
		firefoxOptions.setBinary(firefoxBinary);
		System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE, "true");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
		driver = new FirefoxDriver(firefoxOptions);
		driver.manage().window().maximize();
		driver.get(Configurations.getConfigData("URL"));
		BaseTest.waitUntilPageLoad();
	}

	@Before("@fire")
	public void firefox1() throws Throwable {
		if (initialSetup) {
			System.setProperty("webdriver.gecko.driver", loadFirefoxDriver());
			initialSetup = false;
		}
		FirefoxBinary firefoxBinary = new FirefoxBinary();
		if (osName.contains("linux")) {
			firefoxBinary.addCommandLineOptions("--headless");
		}
		FirefoxOptions firefoxOptions = new FirefoxOptions();
		firefoxOptions.setBinary(firefoxBinary);
		System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE, "true");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
		driver = new FirefoxDriver(firefoxOptions);
		driver.manage().window().maximize();
		driver.get(Configurations.getConfigData("URL"));
		BaseTest.waitUntilPageLoad();
	}

	@After
	public static void teardown(Scenario scenario) throws IOException {
		if (scenario.isFailed()) {
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			try {
				Calendar calendar = Calendar.getInstance();
				SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
				FileUtils.copyFile(scrFile, new File(
						"target\\screenshots\\" + scenario.getName() + formater.format(calendar.getTime()) + ".jpg"));
			} catch (IOException ex) {
			}
		}

		// driver.quit();
	}

	public static void waitUntilPageLoad() throws Throwable {
	 		JavascriptExecutor js = (JavascriptExecutor)driver;
			if(js.executeScript("return document.readyState").toString().equals("complete")) {
				return;
				}
			}

	private String loadFirefoxDriver() {
		String firefoxDriver = null;
		if (osName.contains("windows")) {
			firefoxDriver = "src/test/resources/drivers/geckodriver_win_v0_21_0.exe";
		} else if (osName.contains("mac")) {
			firefoxDriver = "src/test/resources/drivers/geckodriver_mac_v0_21_0";
		} else if (osName.contains("linux")) {
			firefoxDriver = "src/test/resources/drivers/geckodriver_linux_v0_21_0";
		}
		File file = new File(firefoxDriver);
		file.setExecutable(true, false);
		return firefoxDriver;
	}

	private String loadChromeDriver() {
		String chromeDriver = null;
		if (osName.contains("windows")) {
			chromeDriver = "src/test/resources/drivers/chromedriver.exe";
		} else if (osName.contains("mac")) {
			chromeDriver = "src/test/resources/drivers/chromedriver_mac";
		} else if (osName.contains("linux")) {
			chromeDriver = "src/test/resources/drivers/chromedriver_linux";
		}
		File file = new File(chromeDriver);
		file.setExecutable(true, false);
		return chromeDriver;
	}

	private String loadIeDriver() {
		String ieDriver = null;
		ieDriver = "src/test/resources/drivers/IEDriverServer.exe";
		return ieDriver;
	}

	public static void takescreenshot() {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			Calendar calendar = Calendar.getInstance();
			SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
			FileUtils.copyFile(scrFile,
					new File("target\\screenshots\\" + formater.format(calendar.getTime()) + ".jpg"));
		} catch (IOException ex) {
		}
	}
}