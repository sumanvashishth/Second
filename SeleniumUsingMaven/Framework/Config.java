import org.openqa.selenium.WebDriver;


public class Config {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		public static WebDriver driver;
		
		public void launchBrowser (){
			String driverpath= " ";
			String path = System.getProperty("user.dir"); 
			if(System.getProperty("os.name").contains("Windows")){
				
				driverpath = path + "\\Resources\\chromedriver.exe";   // return driver folder path 

				System.setProperty("webdriver.chrome.driver",driverpath );
				
			}
			else {
				driverpath = path + "\\Resources\\chromedriver";   // return driver folder path
				System.setProperty("webdriver.chrome.driver",driverpath );
			}
			
	        System.out.println(""+ driverpath);
	        System.setProperty("webdriver.chrome.driver", driverpath);
		}
			
	}

}
   /*         
public static WebDriver driver1;

    @BeforeSuite
    public void launchBrowser1() {        
        String chromePath = "";
        if (System.getProperty("os.name").contains("Windows")) {
            chromePath = System.getProperty("user.dir") + ConfigVar.seperator + "chromedriver.exe";
        } else {
            chromePath = "/usr/bin/chromedriver";
        }
        System.out.println(chromePath);
        System.setProperty("webdriver.chrome.driver", chromePath);
        String downloadFilepath = System.getProperty("user.dir") + ConfigVar.seperator + "Reports";
        System.out.println("Path=" + downloadFilepath);
        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
        chromePrefs.put("profile.default_content_settings.popups", 0);
        chromePrefs.put("download.default_directory", downloadFilepath);
        ChromeOptions options1 = new ChromeOptions();
        options1.setExperimentalOption("prefs", chromePrefs);
        DesiredCapabilities cap = DesiredCapabilities.chrome();
        cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        cap.setCapability(ChromeOptions.CAPABILITY, options1);
        driver1 = new ChromeDriver(cap);
        driver1.manage().window().setSize(new Dimension(1600, 900));
    }

*/