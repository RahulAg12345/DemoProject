package Testing_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Testing_Base.Testing_Base;

public class Elements_Page extends Testing_Base {
	
	@FindBy (xpath = "//*[text()='Elements']")
	public WebElement Elements;
	
	@FindBy (xpath = "//*[text()='Text Box']")
	public WebElement TextBox;
	
	@FindBy (xpath = "//input[@id='userName']")
	public WebElement userName;
	
	@FindBy (xpath = "//input[@id='userEmail']")
	public WebElement userEmail;
	
	@FindBy (xpath = "//textarea[@id='currentAddress']")
	public WebElement currentAddress;
	
	@FindBy (xpath = "//textarea[@id='permanentAddress']")
	public WebElement permanentAddress;
	
	@FindBy (xpath = "//button[@id='submit']")
	public WebElement Submit;
	
//check box
	
	@FindBy (xpath = "//*[text()='Check Box']")
	public WebElement CheckBox;
	
	@FindBy (xpath = "//button[@title='Toggle']")
	public WebElement dropdown;
	
	@FindBy (xpath = "//label[@for='tree-node-home']")
	public WebElement checkboxclick;
	
	//submit web tables
	
	@FindBy (xpath = "//*[text()='Web Tables']")
	public WebElement WebTables;
	
	@FindBy (xpath = "//*[text()='Add']")
	public WebElement clickAdd;
	
	@FindBy (xpath = "//input[@id='firstName']")
	public WebElement firstname;
	
	@FindBy (xpath = "//input[@id='lastName']")
	public WebElement lastName;
	
	@FindBy (xpath = "//input[@id='userEmail']")
	public WebElement webuserEmail;
	
	@FindBy (xpath = "//input[@id='age']")
	public WebElement age;
	
	@FindBy (xpath = "//input[@id='salary']")
	public WebElement salary;
	
	@FindBy (xpath = "//input[@id='department']")
	public WebElement department;
	
	@FindBy (xpath = "//button[@id='submit']")
	public WebElement webFormsubmit;
	
//upload file
	
	@FindBy (xpath = "(//*[text()='Upload and Download'])[1]")
	public WebElement uploadFiletab;
	
	@FindBy (xpath = "//input[@id='uploadFile']")
	public WebElement uploadFile;
	
//Forms Pages
	
	@FindBy (xpath = "//*[text()='Forms']")
	public WebElement Formstab;
	
	@FindBy (xpath = "(//*[text()='Practice Form'])[1]")
	public WebElement Practicform;
	
	@FindBy (xpath = "//input[@id='firstName']")
	public WebElement Firstname;
	
	@FindBy (xpath = "//input[@id='lastName']")
	public WebElement Lasttname;
	
	@FindBy (xpath = "//input[@id='userEmail']")
	public WebElement FormuserEmail;
	
	@FindBy (xpath = "//*[text()='Male']")
	public WebElement Gender;
	
	@FindBy (xpath = "//input[@id='userNumber']")
	public WebElement userNumber;
	
	@FindBy (xpath = "//input[@id='dateOfBirthInput']")
	public WebElement dateOfBirthInput;
	
	@FindBy (xpath = "//*[text()='Sports']")
	public WebElement Sports;
	
	@FindBy (xpath = "//*[text()='Reading']")
	public WebElement Reading;
	
	@FindBy (xpath = "//*[text()='Music']")
	public WebElement Music;
	
	@FindBy (xpath = "//input[@id='uploadPicture']")
	public WebElement uploadPicture;
	
	@FindBy (xpath = "//textarea[@id='currentAddress']")
	public WebElement FormcurrentAddress;
	
	@FindBy (xpath = "//*[text()='Select State']")
	public WebElement SelectState;
	
	@FindBy (xpath = "//*[text()='Select City']")
	public WebElement SelectCity;
	
	@FindBy (xpath = "//button[@id='submit']")
	public WebElement FormSubmit;
	
	@FindBy (xpath = "//div[@id='subjectsContainer']")
	public WebElement subjectsContainer;
	
	
	// Frame Page
	
	@FindBy (xpath = "//*[text()='Alerts, Frame & Windows']")
	public WebElement FrameAlertTab;
	
	@FindBy (xpath = "//*[text()='Frames']")
	public WebElement FrameTab;
	
	@FindBy (xpath = "//iframe[@id='frame1']")
	public WebElement frame1;
	
	@FindBy (xpath = "//iframe[@id='frame2']")
	public WebElement frame2;
	
	// Alert Tab
	
	@FindBy (xpath = "//*[text()='Alerts']")
	public WebElement AlertsTab;
	
	@FindBy (xpath = "//button[@id='alertButton']")
	public WebElement alertButton;
	
//Buttons 
	
	@FindBy (xpath = "//*[text()='Buttons']")
	public WebElement ButtonsTab;
	
	@FindBy (xpath = "//button[@id='doubleClickBtn']")
	public WebElement doubleClickBtn;
	
	@FindBy (xpath = "//button[@id='rightClickBtn']")
	public WebElement rightClickBtn;
	
	@FindBy (xpath = "//button[@id='SbQdB']")
	public WebElement ClickBtn;
	
//Drag and Drop
	
	@FindBy (xpath = "//*[text()='Interactions']")
	public WebElement InteractionsTab;
	
	@FindBy (xpath = "//*[text()='Droppable']")
	public WebElement DroppableTab;
	
	@FindBy (xpath = "//div[@id='draggable']")
	public WebElement draggable;
	
	@FindBy (xpath = "//div[@id='droppable']")
	public WebElement droppable;
	
//Resizable
	
	@FindBy (xpath = "//*[text()='Resizable']")
	public WebElement ResizableTab;
	
	@FindBy (xpath = "//span[@class='react-resizable-handle react-resizable-handle-se']")
	public WebElement ResizableButton;
	
//Handle windows
	
	@FindBy (xpath = "//*[text()='Browser Windows']")
	public WebElement BrowserTab;
	
	@FindBy (xpath = "//button[@id='tabButton']")
	public WebElement NewTab;
	
	@FindBy (xpath = "//h1[@id='sampleHeading']")
	public WebElement Heading;
	
	
	
	
	
	public Elements_Page() {
		
		PageFactory.initElements(driver, this);
	}

}
