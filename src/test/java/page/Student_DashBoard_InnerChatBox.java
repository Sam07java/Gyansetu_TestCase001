package page;

import io.cucumber.java.ja.且つ;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.security.PublicKey;
import java.util.List;

public class Student_DashBoard_InnerChatBox extends BasePage{

    public Student_DashBoard_InnerChatBox(WebDriver driver) {
        super(driver);
    }

    public void enter_Your_FullName(String fullName)
    {// (1)
        WebElement full=driver.findElement(By.xpath("//input[@placeholder='Type your answer and press enter']"));
        full.sendKeys(fullName);
        full.sendKeys(Keys.ENTER);
    }

    public void select_Your_DOB(String date)
    {
        driver.findElement(By.xpath("//button[@class='chat_search_btn']//*[name()='svg']")).sendKeys(date);
    }

    public void dateClick()
    {
        driver.findElement(By.xpath("//button[@class='chat_search_btn']//*[name()='svg']")).click();
    }

    public void datepicker()
    {//(2)
        driver.findElement(By.xpath("//button[@aria-label='Choose date']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='9']")).click();
        driver.findElement(By.xpath("//button[@class='chat_search_btn']")).click();
    }

    public void enter_main_learning_goal(String goal)
    {//(3)
       WebElement lgoal=driver.findElement(By.xpath("//input[@placeholder='Type your answer and press enter']"));
               lgoal.sendKeys(goal);
               lgoal.sendKeys(Keys.ENTER);
    }

    public void select_Gender(String gender)
    {   //(4)
        //Male or Female
        WebElement gen= driver.findElement(By.xpath("//div[@class='css-19bb58m']"));
        gen.click();
        WebElement male =  driver.findElement(By.xpath("//div[@id='react-select-2-listbox']/div[2]"));
         male.click();
    }

    public void enter_Mother_Name(String motherName)
    {   //(5)
    WebElement Mname=driver.findElement(By.xpath("//input[@placeholder='Type your answer and press enter']"));
    Mname.sendKeys(motherName);
    Mname.sendKeys(Keys.ENTER);
    }

    public void enter_Father_Name(String fatherName)
    {   //(6)
        WebElement Fname=driver.findElement(By.xpath("//input[@placeholder='Type your answer and press enter']"));
               Fname.sendKeys(fatherName);
               Fname.sendKeys(Keys.ENTER);
    }

    public void enter_Quardian_Name(String quardianName)
    {   //(7)
        WebElement Qname=driver.findElement(By.xpath("//input[@placeholder='Type your answer and press enter']"));
                Qname.sendKeys(quardianName);
                Qname.sendKeys(Keys.ENTER);
    }

    public void Upload_Profile_Picture(String path)
    {   //(8)
        driver.findElement(By.xpath("//input[@type='file']")).sendKeys(path);
    }

    public void select_institute_type()
    {
        //school or collage
        driver.findElement(By.className("css-hlgwow")).click();
        WebElement schoolElement=driver.findElement(By.id("react-select-3-option-0"));
        schoolElement.click();
      /* if (schoolElement.getText().equalsIgnoreCase(institute))
       {
           WebElement collageElement=driver.findElement(By.id("react-select-3-option-1"));
       }
       else
       {
        collageElement.click();
       }*/
    }

    public void select_your_board()
    {// CBSE or ICSE or State Board
        driver.findElement(By.className("css-19bb58m")).click();
        WebElement cbseElement=driver.findElement(By.id("react-select-3-option-0"));
        cbseElement.click();
    }

    public void select_your_class()
    {//Select class 1 to 12
        WebElement clickDropDown=driver.findElement(By.className("css-19bb58m"));
        clickDropDown.click();
        driver.findElement(By.id("react-select-3-option-10")).click();
    }

    public void choose_your_hobbies()
    {
        WebElement choosinessHobbies=driver.findElement(By.className("css-19bb58m"));
        choosinessHobbies.click();
        driver.findElement(By.id("react-select-3-option-5")).click();
    }

    public void select_known_language()
    {
        WebElement chooseLang=driver.findElement(By.className("css-19bb58m"));
        chooseLang.click();
        driver.findElement(By.id("react-select-3-option-2")).click();
    }

    public void select_proficiency() {
        WebElement chooseProficiency=driver.findElement(By.className("css-19bb58m"));
        chooseProficiency.click();
        driver.findElement(By.id("react-select-3-option-2")).click();
    }

    public void select_your_mobile_number_country_code()
    {
        driver.findElement(By.className("selected-flag")).click();
        WebElement chooseIndia=driver.findElement(By.xpath("//li[@data-flag-key='flag_no_0']"));
        chooseIndia.click();
    }

    public void What_is_your_mobile_number(String phnNo)
    {
        WebElement mobileNO=driver.findElement(By.className("form-control"));
        mobileNO.sendKeys(phnNo);
        mobileNO.sendKeys(Keys.ENTER);
    }

    public void What_is_your_WhatsApp_number(String wtzpNo)
    {
       WebElement watzup= driver.findElement(By.className("form-control"));
       watzup.sendKeys(wtzpNo);
       watzup.sendKeys(Keys.ENTER);
    }

    public void Select_your_subject_name()
    {
        driver.findElement(By.className("css-1xc3v61-indicatorContainer")).click();
        driver.findElement(By.xpath("//div[text()='Science']")).click();

    }

    public void What_is_your_preference(String preference)
    {
        WebElement pref=driver.findElement(By.className("form-control"));
        pref.sendKeys(preference);
        pref.sendKeys(Keys.ENTER);
    }

    public void Add_your_score_in_percentage(String percentage)
    {
        WebElement prec=driver.findElement(By.className("form-control"));
        prec.sendKeys(percentage);
        prec.sendKeys(Keys.ENTER);
    }

    public void select_your_current_country_of_residence(String country)
    {
        WebElement ele=driver.findElement(By.xpath("//div[@class='css-19bb58m']"));
        ele.click();
        List<WebElement> countryW=driver.findElements(By.xpath("//div[@class='css-10wo9uf-option']"));
        for (WebElement countryEle:countryW)
        {
            if(countryEle.getText().equalsIgnoreCase(country))
            {
                countryEle.click();
                break;
            }
        }
    }

    public void which_state_do_you_currently_reside_in(String state)
    {
        driver.findElement(By.xpath("//div[@class='css-19bb58m']")).click();
        List<WebElement>stateElements= driver.findElements(By.xpath("//div[@class='css-10wo9uf-option']"));
     for(WebElement stateWebEl:stateElements)
     {
         if(stateWebEl.getText().equalsIgnoreCase(state))
         {
             stateWebEl.click();
             break;
         }
     }
    }

    public void which_district(String district1)
    {
       WebElement district= driver.findElement(By.xpath("//input[@placeholder='Type your answer and press enter']"));
       district.sendKeys(district1);
       district.sendKeys(Keys.ENTER);
    }

    public void which_city(String city)
    {
        WebElement ci=driver.findElement(By.xpath("//input[@placeholder='Type your answer and press enter']"));
        ci.sendKeys(city);
        ci.sendKeys(Keys.ENTER);
    }

    public void enter_pin_Code(String pincode)
    {
        WebElement pin=driver.findElement(By.xpath("//input[@placeholder='Type your answer and press enter']"));
        pin.sendKeys(pincode);
        pin.sendKeys(Keys.ENTER);
    }

    public void enter_first_address(String firstAddress)
    {
        WebElement fadd=driver.findElement(By.xpath("//input[@placeholder='Type your answer and press enter']"));
        fadd.sendKeys(firstAddress);
        fadd.sendKeys(Keys.ENTER);
    }

   public void what_is_your_second_address(String secondAddress)
   {
       WebElement sAdd=driver.findElement(By.xpath("//input[@placeholder='Type your answer and press enter']"));
       sAdd.sendKeys(secondAddress);
       sAdd.sendKeys(Keys.ENTER);
   }

   public void validateInnerChatBox()
   {
       WebElement text=driver.findElement(By.xpath("//div[@class='chatinput-body']"));
       if (text.isDisplayed())
       {
           Assert.assertTrue(true);
           text.click();
       }
       else
       {
           System.out.println("Inner chatBox isn't completed ");
           Assert.fail();
       }
   }



}