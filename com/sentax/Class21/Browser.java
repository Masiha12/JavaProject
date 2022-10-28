package com.sentax.Class21;

public class Browser {



    void openBrowser(){
        System.out.println("opening a Browser");
    }
    void navigate(){
        System.out.println("opening the url");
    }
    void test(){
        System.out.println("testing the webpage");
    }
    void closeBrowser(){
        System.out.println("closing the browser");
    }
}
class Chrome extends Browser{
    void openBrowser(){
        System.out.println(" opening the browser in 1 less sec");
    }

}
class FireFox extends Browser{
    void openBrowser (){
        System.out.println(" opening the browser in less 2 sec");
    }
}
 class BrowseTest{
    public static void main(String[] args) {
        Chrome chrom=new Chrome();
        chrom.openBrowser();
        chrom.closeBrowser();

    }
}