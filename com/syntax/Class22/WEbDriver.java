package com.syntax.Class22;

import com.sentax.Class21.WHDegree;

public class WEbDriver {



    public void startBrowser(){
        System.out.println("Start the browser");
    }
    public void test(){
        System.out.println("perform the test");
    }
    public void closeBrowser(){
        System.out.println("closing the browser");
    }
}
class Chrome extends WEbDriver{
    public void startBrowser(){
        System.out.println("Start the Google Chrome");
    }
    public void test(){
        System.out.println("perform the Google Chrome");
    }
    public void closeBrowser(){
        System.out.println("closing the Google Chrome");
    }
}

class FireFox extends WEbDriver{

   public   void startBrowser(){
        System.out.println("Start the FireFox");
    }
   public   void test(){
        System.out.println("perform the FireFox");
    }
    public void closeBrowser(){
        System.out.println("closing the FireFox");
    }

}
class Safari extends WEbDriver{

  public    void startBrowser(){
        System.out.println("Start the Safari");
    }
    public void test(){
        System.out.println("perform the Safari");
    }
    public void closeBrowser(){
        System.out.println("closing the Safari");
    }

}