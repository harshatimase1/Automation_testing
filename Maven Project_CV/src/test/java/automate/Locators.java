package automate;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.amazon.in/");
		
		//driver.findElement(By.cssSelector("input#search_status")).click();
		
		//Locator by id--amazon
		driver.findElement(By.id("nav-iss-attach"));
		driver.findElement(By.id("nav-cover"));
		driver.findElement(By.id("esktop-grid-4"));
		
		//Class  locator--amazon
		
		driver.findElement(By.className("google-site-verification"));
		
		//Name locator --facebook
		driver.findElement(By.name("login_source"));
		
		//Link text-amazon
		
		driver.findElement(By.linkText("Today's Deals"));
		
		//Partial linktext--amazon
		driver.findElement(By.partialLinkText("Today's"));
		
		//If we tant to find multiple webelement if we have multiple tagname then we need to take (findelements)
		//tagname 
		
		driver.findElements(By.tagName("a"));
		
		//css selector-cascading style sheet
		
		//1)--tagname and id value :
		//tagname#idvalue
		
		driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
		
		//2)--tagname and class value 
		//tagname.classvalue(space asel tr remove karaychi and dot(.) dyaycha classvalue mdhye)
		
		driver.findElement(By.cssSelector("div.nav-search-scope.nav-sprite"));
		
		//3)--tagname and attribute
		//tagname[attribute="attribute value"]
		driver.findElement(By.cssSelector(" form[class=\"nav-searchbar nav-progressive-attribute\"]"));
		
		//4)--tagname and multiple attribute
		
		//tagname[attribute1="valueofattribute1"][attribute2="value of attribute2"]
		
		driver.findElement(By.cssSelector("div[id=\"nav-main\"][class=\"nav-sprite\"]"));
		
		//5)--contains(* means contains)
		//tagname[attribute*="value of attribute"]
		
		driver.findElement(By.cssSelector("div[class*=\"navLeftFooter nav-sprite-v1\"]"));
		
		//6)--startswith(starting che letters of attribute value)
		//tagname[attribute^="attributevalue"]
		
		driver.findElement(By.cssSelector("label[id^=\"search\"]"));
		
		//7)--endswith(ending che letters of attribute value)
		//tagname[attribute$="attributevalue"]
		
		driver.findElement(By.cssSelector("label[id$=\"tion\"]"));
		
		//8)--pseudoclass
		//first child
		//tagname[attribute="attributevalue"] :first-child
		
		driver.findElement(By.cssSelector("select[aria-describedby=\"searchDropdownDescription\"] :first-child"));
		
		//last child
		//tagname[attribute="attributevalue"] :last-child
		driver.findElement(By.cssSelector("select[aria-describedby=\"searchDropdownDescription\"] :last-child"));
		
		//nth child
		//tagname[attribute="attributevalue"] :nth child(n)
		
		driver.findElement(By.cssSelector("select[aria-describedby=\"searchDropdownDescription\"] :nth-child(9)"));
		
		//nth last child
	//tagname[attribute="attributevalue"] :nth-last-child(n)
		
		driver.findElement(By.cssSelector("select[aria-describedby=\"searchDropdownDescription\"] :nth-last-child(4)"));
		
		//xpath
		//absolute xpath/full xpath/we do not prefer this xpath
		//(starts from html or root tag,,,,  To find xpath we need to inspect webelement --right click on dom highlighted part--copy--copy full xpath))

		
         driver.findElement(By.xpath("/html/body/div[1]/header/div/div[4]/div[2]/div[2]/div/a[5]"));
         
        //relative xpath---double forward slash//tagname[@attribute="attributevalue"]
         //xpath
         //tagname and attribute
         driver.findElement(By.xpath("//div[@id='pageContent']"));
         
         //tagname and multiple attribute
         //syntax:   //tagname[@attribute1='attribute value'][@attribute='attribute value']
         
         driver.findElement(By.xpath("//div[@id='pageContent'][@class='a-section a-spacing-none']"));
         
		
		//AND operator
         //syntax::   //tagname[@attribute1='attribute value' and @attribute='attribute value']

         driver.findElement(By.xpath("//div[@id='pageContent' and @class='a-section a-spacing-none']"));
         
         //OR operator
         //syntax::   //tagname[@attribute1='attribute value' or  @attribute='attribute value']
         
         driver.findElement(By.xpath("//div[@id='pageContent' or @class='a-secti']"));
         
         //contains
        // syntax:: //tagname[contains(@attribute,'attribute value')]
         driver.findElement(By.xpath("//div[contains(@id,'iss-attach')]"));
         
         //startswith
         //syntax:://tagname[starts-with(@attribute,'attribute value')]
         
         driver.findElement(By.xpath("//div[starts-with(@id,'nav-ba')]"));
         
         //Xpath using text
         //syntax::://tagname[text()='text present after any link"]
         
         driver.findElement(By.xpath("//a[text()='Best Sellers']"));
         
        // Xpath using text with index
         
         //syntax:::(//tagname[text()='text present after any link"])(indexvalue)
         
        //   (//a[text()='Best Sellers'])[1]

         
        //parent and child relationship for xpath
         //syntax:  //parenttagname[@parentattribute='parentattribute value]//childtagname[@childattribute='childattributevalu']
         
       driver.findElement(By.xpath("//select[@id='searchDropdownBox']//option[@value='search-alias=videogames']"));
		
		//select current mode
       //syntax::  //tagname[@attribute=attributevalue]//self::currenttagname
       
       //eg.: //
		
		//select parent of current element/node
       
		
		
		
		
		
		
	}

}
