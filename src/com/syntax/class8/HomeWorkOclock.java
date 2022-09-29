package com.syntax.class8;

public class HomeWorkOclock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	// Create a digatil clock using nested loop	
		
		for(int hourone=0; hourone<3; hourone ++){
			for(int hourtwo=0; hourtwo<=9; hourtwo++) {
				for(int minone=0; minone<=5;minone++) {
					for(int mintwo=0; mintwo<=9;mintwo++) {
						if(hourone<=1|| hourtwo<4)
						System.out.println((hourone)+""+(hourtwo)+ ":" +(minone)+(mintwo));
					}
					String time=null;

			        for (int h = 0; h <= 23; h++) {

			            for (int m = 0; m <= 59; m++) {

			                if(h<10 && m<10) {
			                    time="0"+h+":"+"0"+m;

			                } else if (h<10 && m>=10) {
			                    time="0"+h+":"+m;

			                } else if(h>=10 && m<10) {
			                    time=h+":"+"0"+m;

			                } else {
			                    time=h+":"+m;
			                }

			                System.out.println(time);
			            }
			            for (int h1 = 0; h < 24; h++) {

			                for (int m1 = 0; m1 <= 5; m1++) {

			                    for (int m2 = 0; m2 <= 9; m2++) {

			                        if (h < 10) {
			                            System.out.println("0" + h + ":" + m1 + m2);
			                        } else {
			                            System.out.println(h + ":" + m1 + m2);
			                        }
			                    }
			                }
			            }

			        }

			        }

			    }
			}

				}
				
			}
		
	


