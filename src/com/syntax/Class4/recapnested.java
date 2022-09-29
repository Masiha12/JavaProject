package com.syntax.Class4;

public class recapnested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
         * Nested if-conditions are conditions which are dependent on each other if outer condition is
         * not true inner-condition is never checked inner-condition is only checked when 
         * outer-condition is passed 
         */

        int money=12;

        if(money>10) {  //outer conditions

            System.out.println("Lets buy some eggs");
            int noOfEggs=2;

            if(noOfEggs>0) {
                System.out.println("lets boil the eggs");
                
                
                
                
                boolean studyHard = true;

                if (studyHard)
                {
                    System.out.println(" we ge the job in first few weeks");
                    boolean goodCommunicationSkills = true;

                    if (goodCommunicationSkills)
                    {
                        System.out.println(" might get a job in Apple Amazon, etc. ");
                    } 
                    else
                    {
                        System.out.println(" we need to work on our communication skills");
                    }

                } else 
                {

                    System.out.println("it might take a little longer to get the job");
                }

            }
                
                
                
            }

        }

		
		
		
		
		
		
		
		
	}


