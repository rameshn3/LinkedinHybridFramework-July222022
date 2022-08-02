package com.qa.linkedin.pages;
  
  public class NavigateToProfilePage extends BasePageWebActions{

	private Logger log=Logger.getLogger(NavigateToProfilePage.class);
	
	public NavigateToProfilePage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//a[@class='app-aware-link'][contains(.,'See all people results')]")
	private WebElement seeAllPeopleResultsLink;
    
  }
