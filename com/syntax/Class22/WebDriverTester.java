package com.syntax.Class22;

public class WebDriverTester {

    public static void main(String[] args) {
//       Safari saf=new Safari() ;
//               saf.startBrowser();
//               saf.closeBrowser();


   Chrome chrome=new Chrome();
   FireFox fire=new FireFox();
   Safari saf=new Safari();
   WEbDriver web=new WEbDriver();

   //creating objects of all child class
   WEbDriver[] browsers={new Chrome(),new Safari(),new FireFox()};


    for(WEbDriver browser:browsers){
        browser.startBrowser();
        browser.closeBrowser();
        browser.test();
    }

    for(int i=0; i<browsers.length ;i++);









    }
}
