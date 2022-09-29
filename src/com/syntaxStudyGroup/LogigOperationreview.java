package com.syntaxStudyGroup;

public class LogigOperationreview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean programmer=true;
		boolean manualTester=true;
		boolean knowFrameWork=true;
		if(programmer &&manualTester&& knowFrameWork) {
			System.out.println("You can be an automation engineer");
		}else {
			System.out.println("You must know a programming language and manual testing" + " to be an automation engineer");
		}
		System.out.println("--------------");
		
		boolean programmer1=true;
        boolean manualTester2=true;
        boolean knowFramework=true;

        if(programmer) {
            if(manualTester) {

                if(knowFramework) {
                    System.out.print("You can be an automation engineer");
                }else {
                    System.out.println("You need to know a framework as well ");
                }
                }else {
                    System.out.println("You need to know Manual testing as well");
                }
            }else {
                System.out.println("You need to be a programmer as well");
            }


    }
		
		
		
	}


