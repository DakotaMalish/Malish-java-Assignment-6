/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package malishjavaassignment6;
import java.util.Scanner;
/**
 *
 * @author RedPanda's LapTop
 */
public class MalishJavaAssignment6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner selection = new Scanner(System.in);
        int startPoint = 0;
        int endPoint = 0;
        
 //sets up and builds the 2 d array       
        String[][] city;
        city = new String[][]
        {

            {
                "Killeen Killeen", "Killeen Dallas", "Killeen Houston", "Killeen El Paso", "Killeen Sherman", "Killeen Taylor", 
                "Killeen Tyler", "Killeen Dime Box", "Killeen Bigfoot", "Killeen Frio Town", "Dallas Killeen", "Dallas Dallas", 
                "Dallas Houston", "Dallas El Paso", "Dallas Sherman", "Dallas Taylor", "Dallas Tyler", "Dallas Dime Box", 
                "Dallas Bigfoot", "Dallas Frio Town", "Houston Killeen", "Houston Dallas", "Houston Houston", "Houston El Paso", 
                "Houston Sherman", "Houston Taylor", "Houston Tyler", "Houston Dime Box", "Houston Bigfoot", "Houston Frio Town", 
                "El Paso Killeen", "El Paso Dallas", "El Paso Houston", "El Paso El Paso", "El Paso Sherman", "El Paso Taylor", 
                "El Paso Tyler", "El Paso Dime Box", "El Paso Bigfoot", "El Paso Frio Town", "Sherman Killeen", "Sherman Dallas", 
                "Sherman Houston", "Sherman El Paso", "Sherman Sherman", "Sherman Taylor", "Sherman Tyler", "Sherman Dime Box", 
                "Sherman Bigfoot", "Sherman Frio Town", "Taylor Killeen", "Taylor Dallas", "Taylor Houston", "Taylor El Paso", 
                "Taylor Sherman", "Taylor Taylor", "Taylor Tyler", "Taylor Dime Box", "Taylor Bigfoot", "Taylor Frio Town",
                "Tyler Killeen", "Tyler Dallas", "Tyler Houston", "Tyler El Paso", "Tyler Sherman", "Tyler Taylor","Tyler Tyler", 
                "Tyler Dime Box", "Tyler Bigfoot", "Tyler Frio Town", "Dime Box Killeen", "Dime Box Dallas", "Dime Box Houston", 
                "Dime Box El Paso", "Dime Box Sherman", "Dime Box Taylor", "Dime Box Tyler", "Dime Box Dime Box", "Dime Box Bigfoot", 
                "Dime Box Frio Town", "Bigfoot Killeen", "Bigfoot Dallas", "Bigfoot Houston", "Bigfoot El Paso", "Bigfoot Sherman", 
                "Bigfoot Taylor", "Bigfoot Tyler", "Bigfoot Dime Box", "Bigfoot Big Foot", "Bigfoot Frio Town", "Frio Town Killeen", 
                "Frio Town Dallas", "Frio Town Houston", "Frio Town El Paso", "Frio Town Sherman", "Frio Town Taylor", "Frio Town Tyler", 
                "Frio Town Dime Box", "Frio Town Bigfoot", "Frio Town Frio Town"
                 
            },{
                "0.0", "152.7", "188.4", "571.3", "216.4", "56.8", "186.5", "98.4", "185.0", "208.6", "152.7", "0.0", 
                "239.0", "634.7", "65.0", "167.3", "97.7", "191.4", "328.6", "352.2", "188.4", "239.0", "0.0", "744.7", 
                "301.6", "154.2", "198.2", "106.1", "233.9", "254.4", "571.3", "634.7", "744.7", "0.0", "692.9", "607.3", 
                "732.5", "641.8", "570.4", "540.5","216.4", "65.0", "301.6", "692.9", "0.0", "232.0", "127.2", "257.4", 
                "377.3", "400.9", "56.8", "167.3", "154.2", "607.3", "127.2", "0.0", "189.7", "45.9", "163.7", "187.3",
                "186.5", "97.7", "198.2", "732.5", "127.2", "189.7", "0.0", "183.0", "346.5", "370.2","98.4", "191.4", 
                "106.1", "641.8", "257.4", "45.9", "183.0", "0.0", "177.0", "197.5", "185.0", "328.6", "233.9", "570.4", 
                "377.3", "163.7", "0.0", "177.0", "0.0", "30.2", "208.6", "352.2", "254.4", "540.5", "400.9", "187.3", 
                "370.2", "197.5", "30.2", "0.0"
            }
/*offers the choice of where to start.. im going to stop here cuz what i did
                in this code kinda defeats the point in having an array at all and after making 
                it i relised that what i did was hard code it with extra steps...
                but i didnt restart since i did call every single one using the 
                array but from this point on i used cases to select the locations and then return 
                a distance in hign sight i would have probably done somethin a bit easyer
                but to be honest i cant think of a better way to use it in this case.
                

*/
        };
                System.out.println("Please select a start between 1 and 10 or 11 to end.");                
                System.out.println("1: Killeen");               
                System.out.println("2: Dallas");               
                System.out.println("3: Housten");               
                System.out.println("4: El Paso");               
                System.out.println("5: Sherman");                
                System.out.println("6: Taylor");                
                System.out.println("7: Tyler");               
                System.out.println("8: Dime Box");
                System.out.println("9: Big Foot");
                System.out.println("10: Frio Town");
                System.out.println("11: End");
                startPoint = selection.nextInt();
                
                while(startPoint <=0 || startPoint >11){
                System.out.println("Please select a start between 1 and 10 or 11 to end.");                
                System.out.println("1: Killeen");               
                System.out.println("2: Dallas");               
                System.out.println("3: Housten");               
                System.out.println("4: El Paso");               
                System.out.println("5: Sherman");                
                System.out.println("6: Taylor");                
                System.out.println("7: Tyler");               
                System.out.println("8: Dime Box");
                System.out.println("9: Big Foot");
                System.out.println("10: Frio Town");
                System.out.println("11: End");
                startPoint = selection.nextInt();                      
                }  
                
        switch (startPoint){
            
            case 1:
            
                System.out.println("Please select a destination between 1 and 10 or 11 for new start location");                
                System.out.println("1: Killeen");               
                System.out.println("2: Dallas");               
                System.out.println("3: Housten");               
                System.out.println("4: El Paso");               
                System.out.println("5: Sherman");                
                System.out.println("6: Taylor");                
                System.out.println("7: Tyler");               
                System.out.println("8: Dime Box");
                System.out.println("9: Big Foot");
                System.out.println("10: Frio Town\n11: close");
                endPoint = selection.nextInt();
                
                while(endPoint <=0 || endPoint >11){
                
                System.out.println("Please select a destination between 1 and 10 or 11 for new start location");                
                System.out.println("1: Killeen");               
                System.out.println("2: Dallas");               
                System.out.println("3: Housten");               
                System.out.println("4: El Paso");               
                System.out.println("5: Sherman");                
                System.out.println("6: Taylor");                
                System.out.println("7: Tyler");               
                System.out.println("8: Dime Box");
                System.out.println("9: Big Foot");
                System.out.println("10: Frio Town\n11: close");
                endPoint = selection.nextInt();                      
                }
              
                switch (endPoint){
                    case 1:
                    System.out.println("the distance frome " + city[0][0] + " is");
                    System.out.println( city[1][0] + " Miles");
                    endPoint = 0; 
                        break;
                    case 2:
                    System.out.println("the distance frome " + city[0][1] + " is");
                    System.out.println( city[1][1] + " Miles");
                    endPoint = 0;    
                        break;
                    case 3:
                    System.out.println("the distance frome " + city[0][2] + " is");
                    System.out.println( city[1][2] + " Miles");
                    endPoint = 0;    
                    break;
                    case 4:
                    System.out.println("the distance frome " + city[0][3] + " is");
                    System.out.println( city[1][3] + " Miles");
                    endPoint = 0;
                    break;
                    case 5:
                    System.out.println("the distance frome " + city[0][4] + " is");
                    System.out.println( city[1][4] + " Miles");
                    endPoint = 0;
                    break;
                    case 6:
                    System.out.println("the distance frome " + city[0][5] + " is");
                    System.out.println( city[1][5] + " Miles");
                    endPoint = 0;
                    break;
                    case 7:
                    System.out.println("the distance frome " + city[0][6] + " is");
                    System.out.println( city[1][06] + " Miles");
                    endPoint = 0;
                    break;
                    case 8:
                    System.out.println("the distance frome " + city[0][7] + " is");
                    System.out.println( city[1][7] + " Miles");
                    endPoint = 0;
                    break;
                    case 9:
                    System.out.println("the distance frome " + city[0][8] + " is");
                    System.out.println( city[1][8] + " Miles");
                    endPoint = 0;
                    break;
                    case 10:
                    System.out.println("the distance frome " + city[0][9] + " is");
                    System.out.println( city[1][9] + " Miles");
                    endPoint = 0;
                    break;
                    case 11:
                        endPoint = 0;
                        System.exit(0);
                    break;
                }
            case 2:
            
                System.out.println("Please select a destination between 1 and 10 or 11 for new start location");                
                System.out.println("1: Killeen");               
                System.out.println("2: Dallas");               
                System.out.println("3: Housten");               
                System.out.println("4: El Paso");               
                System.out.println("5: Sherman");                
                System.out.println("6: Taylor");                
                System.out.println("7: Tyler");               
                System.out.println("8: Dime Box");
                System.out.println("9: Big Foot");
                System.out.println("10: Frio Town\n 11: Close");
                
                endPoint = selection.nextInt();
                
                while(endPoint <=0 || endPoint >11){
                System.out.println("Please select a destination between 1 and 10 or 11 for new start location");                
                System.out.println("1: Killeen");               
                System.out.println("2: Dallas");               
                System.out.println("3: Housten");               
                System.out.println("4: El Paso");               
                System.out.println("5: Sherman");                
                System.out.println("6: Taylor");                
                System.out.println("7: Tyler");               
                System.out.println("8: Dime Box");
                System.out.println("9: Big Foot");
                System.out.println("10: Frio Town \n11:Close");
                endPoint = selection.nextInt();                      
                }

                switch (endPoint){
                    case 1:
                    System.out.println("the distance frome " + city[0][10] + " is");
                    System.out.println( city[1][10] + " Miles");
                    endPoint = 0;    
                        break;
                    case 2:
                    System.out.println("the distance frome " + city[0][11] + " is");
                    System.out.println( city[1][11] + " Miles");
                    endPoint = 0;
                    break;
                    case 3:
                    System.out.println("the distance frome " + city[0][12] + " is");
                    System.out.println( city[1][12] + " Miles");
                    endPoint = 0;
                    break;
                    case 4:
                    System.out.println("the distance frome " + city[0][13] + " is");
                    System.out.println( city[1][13] + " Miles");
                    endPoint = 0;
                    break;
                    case 5:
                    System.out.println("the distance frome " + city[0][14] + " is");
                    System.out.println( city[1][14] + " Miles");
                    endPoint = 0;
                    break;
                    case 6:
                    System.out.println("the distance frome " + city[0][15] + " is");
                    System.out.println( city[1][15] + " Miles");
                    endPoint = 0;
                    break;
                    case 7:
                    System.out.println("the distance frome " + city[0][16] + " is");
                    System.out.println( city[1][16] + " Miles");
                    endPoint = 0;
                    break;
                    case 8:
                    System.out.println("the distance frome " + city[0][17] + " is");
                    System.out.println( city[1][17] + " Miles");
                    endPoint = 0;
                    break;
                    case 9:
                    System.out.println("the distance frome " + city[0][18] + " is");
                    System.out.println( city[1][18] + " Miles");
                    endPoint = 0;
                    break;
                    case 10:
                    System.out.println("the distance frome " + city[0][19] + " is");
                    System.out.println( city[1][19] + " Miles");
                    endPoint = 0;
                    break;
                    case 11:
                        endPoint = 0;
                        System.exit(0);
                    break;
                }
                
            case 3:
            
                System.out.println("Please select a destination between 1 and 10 or 11 for new start location");                
                System.out.println("1: Killeen");               
                System.out.println("2: Dallas");               
                System.out.println("3: Housten");               
                System.out.println("4: El Paso");               
                System.out.println("5: Sherman");                
                System.out.println("6: Taylor");                
                System.out.println("7: Tyler");               
                System.out.println("8: Dime Box");
                System.out.println("9: Big Foot");
                System.out.println("10: Frio Town\n 11:close");
                endPoint = selection.nextInt();
                
                while(endPoint <=0 || endPoint >11){
                System.out.println("Please select a destination between 1 and 10 or 11 for new start location");                
                System.out.println("1: Killeen");               
                System.out.println("2: Dallas");               
                System.out.println("3: Housten");               
                System.out.println("4: El Paso");               
                System.out.println("5: Sherman");                
                System.out.println("6: Taylor");                
                System.out.println("7: Tyler");               
                System.out.println("8: Dime Box");
                System.out.println("9: Big Foot");
                System.out.println("10: Frio Town\n 11:close");
                endPoint = selection.nextInt();                      
                }

                switch (endPoint){
                    case 1:
                    System.out.println("the distance frome " + city[0][20] + " is");
                    System.out.println( city[1][20] + " Miles");
                    endPoint = 0;        
                    break;
                    case 2:
                    System.out.println("the distance frome " + city[0][21] + " is");
                    System.out.println( city[1][21] + " Miles");
                    endPoint = 0;    
                    break;
                    case 3:
                    System.out.println("the distance frome " + city[0][22] + " is");
                    System.out.println( city[1][22] + " Miles");
                    endPoint = 0;
                    break;
                    case 4:
                    System.out.println("the distance frome " + city[0][23] + " is");
                    System.out.println( city[1][23] + " Miles");
                    endPoint = 0;
                    break;
                    case 5:
                    System.out.println("the distance frome " + city[0][24] + " is");
                    System.out.println( city[1][24] + " Miles");
                    endPoint = 0;    
                    break;
                    case 6:
                    System.out.println("the distance frome " + city[0][25] + " is");
                    System.out.println( city[1][25] + " Miles");
                    endPoint = 0;
                    break;
                    case 7:
                    System.out.println("the distance frome " + city[0][26] + " is");
                    System.out.println( city[1][26] + " Miles");
                    endPoint = 0;
                    break;
                    case 8:
                    System.out.println("the distance frome " + city[0][27] + " is");
                    System.out.println( city[1][27] + " Miles");
                    endPoint = 0;
                    break;
                    case 9:
                    System.out.println("the distance frome " + city[0][28] + " is");
                    System.out.println( city[1][28] + " Miles");
                    endPoint = 0;
                    break;
                    case 10:
                    System.out.println("the distance frome " + city[0][29] + " is");
                    System.out.println( city[1][29] + " Miles");
                    endPoint = 0;
                    break;
                    case 11:
                        endPoint = 0;
                        System.exit(0);
                        break;
                }
            case 4:
            
                System.out.println("Please select a destination between 1 and 10 or 11 for new start location");                
                System.out.println("1: Killeen");               
                System.out.println("2: Dallas");               
                System.out.println("3: Housten");               
                System.out.println("4: El Paso");               
                System.out.println("5: Sherman");                
                System.out.println("6: Taylor");                
                System.out.println("7: Tyler");               
                System.out.println("8: Dime Box");
                System.out.println("9: Big Foot");
                System.out.println("10: Frio Town\n 11: Close");
                endPoint = selection.nextInt();
                
                while(endPoint <=0 || endPoint >11){
                System.out.println("Please select a destination between 1 and 10 or 11 for new start location");                
                System.out.println("1: Killeen");               
                System.out.println("2: Dallas");               
                System.out.println("3: Housten");               
                System.out.println("4: El Paso");               
                System.out.println("5: Sherman");                
                System.out.println("6: Taylor");                
                System.out.println("7: Tyler");               
                System.out.println("8: Dime Box");
                System.out.println("9: Big Foot");
                System.out.println("10: Frio Town\n11: Close");
                endPoint = selection.nextInt();                      
                }

                switch (endPoint){
                    case 1:
                    System.out.println("the distance frome " + city[0][30] + " is");
                    System.out.println( city[1][30] + " Miles");
                    endPoint = 0;    
                        break;
                    case 2:
                    System.out.println("the distance frome " + city[0][31] + " is");
                    System.out.println( city[1][31] + " Miles");
                    endPoint = 0;
                    break;
                    case 3:
                    System.out.println("the distance frome " + city[0][32] + " is");
                    System.out.println( city[1][32] + " Miles");
                    endPoint = 0;
                    break;
                    case 4:
                    System.out.println("the distance frome " + city[0][33] + " is");
                    System.out.println( city[1][33] + " Miles");
                    endPoint = 0;
                    break;
                    case 5:
                    System.out.println("the distance frome " + city[0][34] + " is");
                    System.out.println( city[1][34] + " Miles");
                    endPoint = 0;
                    break;
                    case 6:
                    System.out.println("the distance frome " + city[0][35] + " is");
                    System.out.println( city[1][35] + " Miles");
                    endPoint = 0;
                    break;
                    case 7:
                    System.out.println("the distance frome " + city[0][36] + " is");
                    System.out.println( city[1][36] + " Miles");
                    endPoint = 0;
                    break;
                    case 8:
                    System.out.println("the distance frome " + city[0][37] + " is");
                    System.out.println( city[1][37] + " Miles");
                    endPoint = 0;
                    break;
                    case 9:
                    System.out.println("the distance frome " + city[0][38] + " is");
                    System.out.println( city[1][38] + " Miles");
                    endPoint = 0;
                    break;
                    case 10:
                    System.out.println("the distance frome " + city[0][39] + " is");
                    System.out.println( city[1][39] + " Miles");
                    endPoint = 0;
                    break;
                    case 11:
                        endPoint = 0;
                        System.exit(0);
                        
                }
            case 5:
            
                System.out.println("Please select a destination between 1 and 10 or 11 for new start location");                
                System.out.println("1: Killeen");               
                System.out.println("2: Dallas");               
                System.out.println("3: Housten");               
                System.out.println("4: El Paso");               
                System.out.println("5: Sherman");                
                System.out.println("6: Taylor");                
                System.out.println("7: Tyler");               
                System.out.println("8: Dime Box");
                System.out.println("9: Big Foot");
                System.out.println("10: Frio Town\n close");
                endPoint = selection.nextInt();
                
                while(endPoint <=0 || endPoint >11){
                System.out.println("Please select a destination between 1 and 10 or 11 for new start location");                
                System.out.println("1: Killeen");               
                System.out.println("2: Dallas");               
                System.out.println("3: Housten");               
                System.out.println("4: El Paso");               
                System.out.println("5: Sherman");                
                System.out.println("6: Taylor");                
                System.out.println("7: Tyler");               
                System.out.println("8: Dime Box");
                System.out.println("9: Big Foot");
                System.out.println("10: Frio Town\n close");
                endPoint = selection.nextInt();                      
                }

                switch (endPoint){
                    case 1:
                    System.out.println("the distance frome " + city[0][40] + " is");
                    System.out.println( city[1][40] + " Miles");
                    endPoint = 0;    
                        break;
                    case 2:
                    System.out.println("the distance frome " + city[0][41] + " is");
                    System.out.println( city[1][41] + " Miles");
                    endPoint = 0;
                    break;
                    case 3:
                    System.out.println("the distance frome " + city[0][42] + " is");
                    System.out.println( city[1][42] + " Miles");
                    endPoint = 0;
                    break;
                    case 4:
                    System.out.println("the distance frome " + city[0][43] + " is");
                    System.out.println( city[1][43] + " Miles");
                    endPoint = 0;
                    break;
                    case 5:
                    System.out.println("the distance frome " + city[0][44] + " is");
                    System.out.println( city[1][44] + " Miles");
                    endPoint = 0;
                    break;
                    case 6:
                    System.out.println("the distance frome " + city[0][45] + " is");
                    System.out.println( city[1][45] + " Miles");
                    endPoint = 0;
                    break;
                    case 7:
                    System.out.println("the distance frome " + city[0][46] + " is");
                    System.out.println( city[1][46] + " Miles");
                    endPoint = 0;
                    break;
                    case 8:
                    System.out.println("the distance frome " + city[0][47] + " is");
                    System.out.println( city[1][47] + " Miles");
                    endPoint = 0;
                    break;
                    case 9:
                    System.out.println("the distance frome " + city[0][48] + " is");
                    System.out.println( city[1][48] + " Miles");
                    endPoint = 0;
                    break;
                    case 10:
                    System.out.println("the distance frome " + city[0][49] + " is");
                    System.out.println( city[1][49] + " Miles");
                    endPoint = 0;
                    break;
                    case 11:
                    endPoint = 0;
                    System.exit(0);
                }
            case 6:
            
                System.out.println("Please select a destination between 1 and 10 or 11 for new start location");                
                System.out.println("1: Killeen");               
                System.out.println("2: Dallas");               
                System.out.println("3: Housten");               
                System.out.println("4: El Paso");               
                System.out.println("5: Sherman");                
                System.out.println("6: Taylor");                
                System.out.println("7: Tyler");               
                System.out.println("8: Dime Box");
                System.out.println("9: Big Foot");
                System.out.println("10: Frio Town\n11: Close");
                endPoint = selection.nextInt();
                
                while(endPoint <=0 || endPoint >11){
                System.out.println("Please select a destination between 1 and 10 or 11 for new start location");                
                System.out.println("1: Killeen");               
                System.out.println("2: Dallas");               
                System.out.println("3: Housten");               
                System.out.println("4: El Paso");               
                System.out.println("5: Sherman");                
                System.out.println("6: Taylor");                
                System.out.println("7: Tyler");               
                System.out.println("8: Dime Box");
                System.out.println("9: Big Foot");
                System.out.println("10: Frio Town\n11: Close");
                endPoint = selection.nextInt();                      
                }

                switch (endPoint){
                    case 1:
                    System.out.println("the distance frome " + city[0][50] + " is");
                    System.out.println( city[1][50] + " Miles");
                    endPoint = 0;    
                        break;
                    case 2:
                    System.out.println("the distance frome " + city[0][51] + " is");
                    System.out.println( city[1][51] + " Miles");
                    endPoint = 0;
                    break;
                    case 3:
                    System.out.println("the distance frome " + city[0][52] + " is");
                    System.out.println( city[1][52] + " Miles");
                    endPoint = 0;
                    break;
                    case 4:
                    System.out.println("the distance frome " + city[0][53] + " is");
                    System.out.println( city[1][53] + " Miles");
                    endPoint = 0;
                    break;
                    case 5:
                    System.out.println("the distance frome " + city[0][54] + " is");
                    System.out.println( city[1][54] + " Miles");
                    endPoint = 0;
                    break;
                    case 6:
                    System.out.println("the distance frome " + city[0][55] + " is");
                    System.out.println( city[1][55] + " Miles");
                    endPoint = 0;
                    break;
                    case 7:
                    System.out.println("the distance frome " + city[0][56] + " is");
                    System.out.println( city[1][56] + " Miles");
                    endPoint = 0;
                    break;
                    case 8:
                    System.out.println("the distance frome " + city[0][57] + " is");
                    System.out.println( city[1][57] + " Miles");
                    endPoint = 0;
                    break;
                    case 9:
                    System.out.println("the distance frome " + city[0][58] + " is");
                    System.out.println( city[1][58] + " Miles");
                    endPoint = 0;
                    break;
                    case 10:
                    System.out.println("the distance frome " + city[0][59] + " is");
                    System.out.println( city[1][59] + " Miles");
                    endPoint = 0;
                    break;
                    case 11:
                        endPoint = 0;
                        System.exit(0);
                        break;
                }
            case 7:
            
                System.out.println("Please select a destination between 1 and 10 or 11 for new start location");                
                System.out.println("1: Killeen");               
                System.out.println("2: Dallas");               
                System.out.println("3: Housten");               
                System.out.println("4: El Paso");               
                System.out.println("5: Sherman");                
                System.out.println("6: Taylor");                
                System.out.println("7: Tyler");               
                System.out.println("8: Dime Box");
                System.out.println("9: Big Foot");
                System.out.println("10: Frio Town\n 11: Close");
                endPoint = selection.nextInt();
                
                while(endPoint <=0 || endPoint >11){
                System.out.println("Please select a destination between 1 and 10 or 11 for new start location");                
                System.out.println("1: Killeen");               
                System.out.println("2: Dallas");               
                System.out.println("3: Housten");               
                System.out.println("4: El Paso");               
                System.out.println("5: Sherman");                
                System.out.println("6: Taylor");                
                System.out.println("7: Tyler");               
                System.out.println("8: Dime Box");
                System.out.println("9: Big Foot");
                System.out.println("10: Frio Town\n11: Close");
                endPoint = selection.nextInt();                      
                }

                switch (endPoint){
                    case 1:
                    System.out.println("the distance frome " + city[0][60] + " is");
                    System.out.println( city[1][60] + " Miles");
                    endPoint = 0;
                        break;
                    case 2:
                    System.out.println("the distance frome " + city[0][61] + " is");
                    System.out.println( city[1][61] + " Miles");
                    endPoint = 0;   
                    break;
                    case 3:
                    System.out.println("the distance frome " + city[0][62] + " is");
                    System.out.println( city[1][62] + " Miles");
                    endPoint = 0;
                    break;
                    case 4:
                    System.out.println("the distance frome " + city[0][63] + " is");
                    System.out.println( city[1][63] + " Miles");
                    endPoint = 0;
                    break;
                    case 5:
                    System.out.println("the distance frome " + city[0][64] + " is");
                    System.out.println( city[1][64] + " Miles");
                    endPoint = 0;
                    break;
                    case 6:
                    System.out.println("the distance frome " + city[0][65] + " is");
                    System.out.println( city[1][65] + " Miles");
                    endPoint = 0;
                    break;
                    case 7:
                    System.out.println("the distance frome " + city[0][66] + " is");
                    System.out.println( city[1][66] + " Miles");
                    endPoint = 0;
                    break;
                    case 8:
                    System.out.println("the distance frome " + city[0][67] + " is");
                    System.out.println( city[1][67] + " Miles");
                    endPoint = 0;
                    break;
                    case 9:
                    System.out.println("the distance frome " + city[0][68] + " is");
                    System.out.println( city[1][68] + " Miles");
                    endPoint = 0;
                    break;
                    case 10:
                    System.out.println("the distance frome " + city[0][69] + " is");
                    System.out.println( city[1][69] + " Miles");
                    endPoint = 0;
                    break;
                    case 11:
                        endPoint = 0;
                        System.exit(0);
                }
            case 8:
            
                System.out.println("Please select a destination between 1 and 10 or 11 for new start location");                
                System.out.println("1: Killeen");               
                System.out.println("2: Dallas");               
                System.out.println("3: Housten");               
                System.out.println("4: El Paso");               
                System.out.println("5: Sherman");                
                System.out.println("6: Taylor");                
                System.out.println("7: Tyler");               
                System.out.println("8: Dime Box");
                System.out.println("9: Big Foot");
                System.out.println("10: Frio Town\n 11 Close");
                endPoint = selection.nextInt();
                
                while(endPoint <=0 || endPoint >11){
                System.out.println("Please select a destination between 1 and 10 or 11 for new start location");                
                System.out.println("1: Killeen");               
                System.out.println("2: Dallas");               
                System.out.println("3: Housten");               
                System.out.println("4: El Paso");               
                System.out.println("5: Sherman");                
                System.out.println("6: Taylor");                
                System.out.println("7: Tyler");               
                System.out.println("8: Dime Box");
                System.out.println("9: Big Foot");
                System.out.println("10: Frio Town\n11: close");
                endPoint = selection.nextInt();                      
                }

                switch (endPoint){
                    case 1:
                    System.out.println("the distance frome " + city[0][70] + " is");
                    System.out.println( city[1][70] + " Miles");
                    endPoint = 0;   
                        break;
                    case 2:
                    System.out.println("the distance frome " + city[0][71] + " is");
                    System.out.println( city[1][71] + " Miles");
                    endPoint = 0;
                    break;
                    case 3:
                    System.out.println("the distance frome " + city[0][72] + " is");
                    System.out.println( city[1][72] + " Miles");
                    endPoint = 0;
                    break;
                    case 4:
                    System.out.println("the distance frome " + city[0][73] + " is");
                    System.out.println( city[1][73] + " Miles");
                    endPoint = 0;
                    break;
                    case 5:
                    System.out.println("the distance frome " + city[0][74] + " is");
                    System.out.println( city[1][74] + " Miles");
                    endPoint = 0;
                    break;
                    case 6:
                    System.out.println("the distance frome " + city[0][75] + " is");
                    System.out.println( city[1][75] + " Miles");
                    endPoint = 0;
                    break;
                    case 7:
                    System.out.println("the distance frome " + city[0][76] + " is");
                    System.out.println( city[1][76] + " Miles");
                    endPoint = 0;
                    break;
                    case 8:
                    System.out.println("the distance frome " + city[0][77] + " is");
                    System.out.println( city[1][77] + " Miles");
                    endPoint = 0;
                    break;
                    case 9:
                    System.out.println("the distance frome " + city[0][78] + " is");
                    System.out.println( city[1][78] + " Miles");
                    endPoint = 0;
                    break;
                    case 10:
                    System.out.println("the distance frome " + city[0][79] + " is");
                    System.out.println( city[1][79] + " Miles");
                    endPoint = 0;
                    break;
                    case 11: 
                        System.exit(0);
                }
            case 9:
            
                System.out.println("Please select a destination between 1 and 10 or 11 for new start location");                
                System.out.println("1: Killeen");               
                System.out.println("2: Dallas");               
                System.out.println("3: Housten");               
                System.out.println("4: El Paso");               
                System.out.println("5: Sherman");                
                System.out.println("6: Taylor");                
                System.out.println("7: Tyler");               
                System.out.println("8: Dime Box");
                System.out.println("9: Big Foot");
                System.out.println("10: Frio Town\n11: close");
                endPoint = selection.nextInt();
                
                while(endPoint <=0 || endPoint >11){
                System.out.println("Please select a destination between 1 and 10 or 11 for new start location");                
                System.out.println("1: Killeen");               
                System.out.println("2: Dallas");               
                System.out.println("3: Housten");               
                System.out.println("4: El Paso");               
                System.out.println("5: Sherman");                
                System.out.println("6: Taylor");                
                System.out.println("7: Tyler");               
                System.out.println("8: Dime Box");
                System.out.println("9: Big Foot");
                System.out.println("10: Frio Town\n11: close");
                endPoint = selection.nextInt();                      
                }

                switch (endPoint){
                    case 1:
                    System.out.println("the distance frome " + city[0][80] + " is");
                    System.out.println( city[1][80] + " Miles");
                    endPoint = 0;    
                        break;
                    case 2:
                    System.out.println("the distance frome " + city[0][81] + " is");
                    System.out.println( city[1][81] + " Miles");
                    endPoint = 0;    
                    break;
                    case 3:
                    System.out.println("the distance frome " + city[0][82] + " is");
                    System.out.println( city[1][82] + " Miles");
                    endPoint = 0;
                    break;
                    case 4:
                    System.out.println("the distance frome " + city[0][83] + " is");
                    System.out.println( city[1][83] + " Miles");
                    endPoint = 0;
                    break;
                    case 5:
                    System.out.println("the distance frome " + city[0][84] + " is");
                    System.out.println( city[1][84] + " Miles");
                    endPoint = 0;
                    break;
                    case 6:
                    System.out.println("the distance frome " + city[0][85] + " is");
                    System.out.println( city[1][85] + " Miles");
                    endPoint = 0;
                    break;
                    case 7:
                    System.out.println("the distance frome " + city[0][86] + " is");
                    System.out.println( city[1][86] + " Miles");
                    endPoint = 0;
                    break;
                    case 8:
                    System.out.println("the distance frome " + city[0][87] + " is");
                    System.out.println( city[1][87] + " Miles");
                    endPoint = 0;
                    break;
                    case 9:
                    System.out.println("the distance frome " + city[0][88] + " is");
                    System.out.println( city[1][88] + " Miles");
                    endPoint = 0;
                    break;
                    case 10:
                    System.out.println("the distance frome " + city[0][89] + " is");
                    System.out.println( city[1][89] + " Miles");
                    endPoint = 0;
                    break;
                    case 11:
                        System.exit(0);
                }
            case 10:
            
                System.out.println("Please select a destination between 1 and 10 or 11 for new start location");                
                System.out.println("1: Killeen");               
                System.out.println("2: Dallas");               
                System.out.println("3: Housten");               
                System.out.println("4: El Paso");               
                System.out.println("5: Sherman");                
                System.out.println("6: Taylor");                
                System.out.println("7: Tyler");               
                System.out.println("8: Dime Box");
                System.out.println("9: Big Foot");
                System.out.println("10: Frio Town\n11: close");
                endPoint = selection.nextInt();
                
                while(endPoint <=0 || endPoint >11){
                System.out.println("Please select a destination between 1 and 10 or 11 for new start location");                
                System.out.println("1: Killeen");               
                System.out.println("2: Dallas");               
                System.out.println("3: Housten");               
                System.out.println("4: El Paso");               
                System.out.println("5: Sherman");                
                System.out.println("6: Taylor");                
                System.out.println("7: Tyler");               
                System.out.println("8: Dime Box");
                System.out.println("9: Big Foot");
                System.out.println("10: Frio Town\n11: close");
                endPoint = selection.nextInt();                      
                }

                switch (endPoint){
                    case 1:
                    System.out.println("the distance frome " + city[0][90] + " is");
                    System.out.println( city[1][90] + " Miles");
                        endPoint = 0;
                        break;
                    case 2:
                    System.out.println("the distance frome " + city[0][91] + " is");
                    System.out.println( city[1][91] + " Miles");
                    endPoint = 0;
                    break;
                    case 3:
                    System.out.println("the distance frome " + city[0][92] + " is");
                    System.out.println( city[1][92] + " Miles");
                    endPoint = 0;
                    break;
                    case 4:
                    System.out.println("the distance frome " + city[0][93] + " is");
                    System.out.println( city[1][93] + " Miles");
                    endPoint = 0;
                    break;
                    case 5:
                    System.out.println("the distance frome " + city[0][94] + " is");
                    System.out.println( city[1][94] + " Miles");
                    endPoint = 0;
                    break;
                    case 6:
                    System.out.println("the distance frome " + city[0][95] + " is");
                    System.out.println( city[1][95] + " Miles");
                    endPoint = 0;
                    break;
                    case 7:
                    System.out.println("the distance frome " + city[0][96] + " is");
                    System.out.println( city[1][96] + " Miles");
                    endPoint = 0;
                    break;
                    case 8:
                    System.out.println("the distance frome " + city[0][97] + " is");
                    System.out.println( city[1][97] + " Miles");
                    endPoint = 0;
                    break;
                    case 9:
                    System.out.println("the distance frome " + city[0][98] + " is");
                    System.out.println( city[1][98] + " Miles");
                    endPoint = 0;
                    break;
                    case 10:
                    System.out.println("the distance frome " + city[0][99] + " is");
                    System.out.println( city[1][99] + " Miles");
                    endPoint = 0;
                    break;
                    case 11:
                        System.exit(0);
                        
                }
          
                
        
                
              
            }
        
        
        
        
        
    }
    
}
