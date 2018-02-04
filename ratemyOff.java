import javax.swing.JOptionPane;
import java.util.ArrayList;
//up to date as of 2/3/18 8:25PM
public class ratemyOff
{
   public static void main(String[] args)
   {
      //variables for city mayors
      String phlMayor = " Jim Kenney", erieMayor = " Joseph Schember", allenMayor = " Ed Pawlowski", nycMayor = " Bill de Blasio";
      //variables for city mayors
      String rochMayor = " Lovely Warren", saraMayor = " Joanne Yepsen", okcMayor = " Mick Cornett", tulsMayor = " G. T. Bynum";
      //variables for city mayors and user rating inputs
      String bartMayor = " Dale Copeland", acctEnt, leadEnc, efficEnt;
      double acctRate, leadRate, efficRate; //double variables for rating values
      
      //ask user if they want to rate an official or look at the previous ratings for an official
      double mainChoi = JOptionPane.showConfirmDialog(null, "Would you like to rate an official? Select 'No' to view ratings.",
                                                   "Confirm", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
      if (mainChoi == JOptionPane.YES_OPTION) //if the user chooses yes
      {
         String[] userState = { "PA", "NY", "OK"}; //list of state choices for drop down menu
         String uState = (String)JOptionPane.showInputDialog(null, "Choose a state.", "Input", 
                                                            JOptionPane.INFORMATION_MESSAGE, null, userState, userState[0]);
         if (uState == "PA") //if the user chooses PA
            {  
               String[] userCity = { "Philadelphia", "Erie", "Allentown" }; //list of city choices for drop down menu
               String uCity = (String)JOptionPane.showInputDialog(null, "Choose a city", "Input", JOptionPane.INFORMATION_MESSAGE, null,
                                                                  userCity, userCity[0]);
               
               
               if (uCity == "Philadelphia") //if user chooses Philadelphia for city
               {
                  String[] userGov = {"Mayor", "City Council Members"}; //list of choices for drop down menu
                  String uGov = (String)JOptionPane.showInputDialog(null, "Choose what type of government official", "Input", 
                                                                     JOptionPane.INFORMATION_MESSAGE, null,userGov, userGov[0]);
                  if (uGov == "Mayor") //if the user chooses mayor
                  {
                    //user can enter in a rating for the mayor's accountability
                    acctEnt = JOptionPane.showInputDialog(null, String.format("Please enter your rating for" + phlMayor +
                                                                          "'s accountability. Your input must be a number."));
                    acctRate = Double.parseDouble(acctEnt); //user entry is converted to an double
                    
                    //user can enter in a rating for the mayor's leadership ability
                    leadEnc = JOptionPane.showInputDialog(null, String.format("Please enter your rating for" + phlMayor +
                                                                          "'s leadership. Your input must be a number."));
                    leadRate = Double.parseDouble(acctEnt); //user entry is converted to an double
                    
                    //user can enter in a rating for the mayor's efficiency
                    efficEnt = JOptionPane.showInputDialog(null, String.format("Please enter your rating for" + phlMayor +
                                                                          "'s efficiency. Your input must be a number."));
                    efficRate = Double.parseDouble(efficEnt); //user entry is converted to an double
                    
                    double rateAvg = calcAvg(acctRate, leadRate, efficRate);
                    JOptionPane.showMessageDialog(null, String.format("Average rating for" + phlMayor + " is %.2f out of 5",rateAvg));
                  }
                                                      
                  else if (uGov == "City Council Members") //if the user chooses city council members instead
                  {  //list of city council members
                     String[] councilMem = {"Mark Squilla", "Kenyatta Johnson", "Jannie Blackwell" , "Curtis J. Jones, Jr.", 
                                           "Darrell L. Clarke", "Bobby Henon", "Maria Quiñones-Sanchez", "Cindy Bass", 
                                          "Cherelle Parker", "Brian J. O'Neill", "Blondell Reynolds Brown", 
                                          "Bill Greenlee", "David Oh", "Allan Domb", "Derek S. Green", "Helen Gym", "Al Taubenberger" };
                     String memChoice = (String)JOptionPane.showInputDialog(null, "Choose a City Council Member",   
                                                                          "Input", JOptionPane.INFORMATION_MESSAGE, null,
                                                                           councilMem, councilMem[0]);
                     if (memChoice == "Mark Squilla") //if the user chooses Mark Squilla
                     {
                        //user can entry a rating for Mark's accountability
                        acctEnt = JOptionPane.showInputDialog(null, String.format("Please enter your rating for" + memChoice +
                                                                          "'s accountability. Your input must be a number."));
                       acctRate = Double.parseDouble(acctEnt); //user's entry is converted to a double
                       
                       //user can entry a rating for Mark's leadership ability
                       leadEnc = JOptionPane.showInputDialog(null, String.format("Please enter your rating for" + memChoice +
                                                                             "'s leadership. Your input must be a number."));
                       leadRate = Double.parseDouble(acctEnt); //user's entry is converted to a double
                       
                       //user can entry a rating for Mark's efficiency
                       efficEnt = JOptionPane.showInputDialog(null, String.format("Please enter your rating for" + memChoice +
                                                                             "'s efficiency. Your input must be a number."));
                       efficRate = Double.parseDouble(efficEnt); //user's entry is converted to a double
                       
                       //the rating average is calculated and returned from the method calcAvg
                       double rateAvg = calcAvg(acctRate, leadRate, efficRate); 
                       JOptionPane.showMessageDialog(null, String.format("Average rating for" + memChoice + " is %.2f out of 5",rateAvg));
                     }
                  }
              }//if close for Philadelphia
              else if (uCity == "Erie")  
              {
                  String[] userGov = { "Mayor", "City Council Members"};
                  String uGov = (String)JOptionPane.showInputDialog(null, "Choose what type of government official", "Input", 
                                                                     JOptionPane.INFORMATION_MESSAGE, null,userGov, userGov[0]);
                  
                  if (uGov == "Mayor")
                  {
   
                       acctEnt = JOptionPane.showInputDialog(null, String.format("Please enter your rating for" + erieMayor +
                                                                          "'s accountability. Your input must be a number."));
                       acctRate = Double.parseDouble(acctEnt);
                       leadEnc = JOptionPane.showInputDialog(null, String.format("Please enter your rating for" + erieMayor +
                                                                             "'s leadership. Your input must be a number."));
                       leadRate = Double.parseDouble(acctEnt);
                       efficEnt = JOptionPane.showInputDialog(null, String.format("Please enter your rating for" + erieMayor +
                                                                             "'s efficiency. Your input must be a number."));
                       efficRate = Double.parseDouble(efficEnt);
                       
                       double rateAvg = calcAvg(acctRate, leadRate, efficRate);
                       JOptionPane.showMessageDialog(null, String.format("Average rating for" + erieMayor + " is %.2f out of 5.",rateAvg));
                       
                  }
                  else if (uGov == "City Council Members")
                  {
                     String[] councilMem1 = {"Sonya Arrington", "Liz Allen", "Casimir J. Kwitowski", "Robert Merski", "Kathleen A. Schaaf",
                                           "James Winarski", "Melvin Witherspoon"};
                     String memChoice = (String)JOptionPane.showInputDialog(null, "Choose a City Council Member",   
                                                                          "Input", JOptionPane.INFORMATION_MESSAGE, null,
                                                                           councilMem1, councilMem1[0]);
                     if (memChoice == "Sonya Arrington")
                     {                        
                       acctEnt = JOptionPane.showInputDialog(null, String.format("Please enter your rating for" + memChoice +
                                                                          "'s accountability. Your input must be a number."));
                       acctRate = Double.parseDouble(acctEnt);
                       leadEnc = JOptionPane.showInputDialog(null, String.format("Please enter your rating for" + memChoice +
                                                                             "'s leadership. Your input must be a number."));
                       leadRate = Double.parseDouble(acctEnt);
                       efficEnt = JOptionPane.showInputDialog(null, String.format("Please enter your rating for" + memChoice +
                                                                             "'s efficiency. Your input must be a number."));
                       efficRate = Double.parseDouble(efficEnt);
                       
                       double rateAvg = calcAvg(acctRate, leadRate, efficRate);
                       JOptionPane.showMessageDialog(null, String.format("Average rating for" + memChoice + " is %.2f out of 5.", rateAvg));
                     }
   
                  }
                  }//if close for Erie
              else if (uCity == "Allentown")
              {
                  String[] userGov = { "Mayor", "City Council Members"};
                  String uGov = (String)JOptionPane.showInputDialog(null, "Choose what type of government official", "Input", 
                                                                     JOptionPane.INFORMATION_MESSAGE, null,userGov, userGov[0]);
                                                                     
                  if (uGov == "Mayor")
                  {
                  
                    acctEnt = JOptionPane.showInputDialog(null, String.format("Please enter your rating for" + allenMayor +
                                                                          "'s accountability. Your input must be a number."));
                    acctRate = Double.parseDouble(acctEnt);
                    
                    leadEnc = JOptionPane.showInputDialog(null, String.format("Please enter your rating for" + allenMayor +
                                                                          "'s leadership. Your input must be a number."));
                    leadRate = Double.parseDouble(acctEnt);
                    
                    efficEnt = JOptionPane.showInputDialog(null, String.format("Please enter your rating for" + allenMayor +
                                                                          "'s efficiency. Your input must be a number."));
                    efficRate = Double.parseDouble(efficEnt);
                    
                    double rateAvg = calcAvg(acctRate, leadRate, efficRate);
                    JOptionPane.showMessageDialog(null, String.format("Average rating for" + allenMayor + " is %.2f out of 5",rateAvg));
                  }
                  else if (uGov == "City Council Members")
                  {
                     String[] councilMem2 = {"Roger MacLean", "Candid Affa", "Daryl L. Hendricks", "Julio A. Guridy", "Cynthia Mota", 
                                           "Courtney Robinson", "Ed Zucal"};
                     String memChoice = (String)JOptionPane.showInputDialog(null, "Choose a City Council Member",   
                                                                          "Input", JOptionPane.INFORMATION_MESSAGE, null,
                                                                           councilMem2, councilMem2[0]);
                    if (memChoice == "Roger MacLean")
                     {
                       
                       acctEnt = JOptionPane.showInputDialog(null, String.format("Please enter your rating for" + memChoice +
                                                                          "'s accountability. Your input must be a number."));
                       acctRate = Double.parseDouble(acctEnt);
                       leadEnc = JOptionPane.showInputDialog(null, String.format("Please enter your rating for" + memChoice +
                                                                             "'s leadership. Your input must be a number."));
                       leadRate = Double.parseDouble(acctEnt);
                       efficEnt = JOptionPane.showInputDialog(null, String.format("Please enter your rating for" + memChoice +
                                                                             "'s efficiency. Your input must be a number."));
                       efficRate = Double.parseDouble(efficEnt);
                       
                       double rateAvg = calcAvg(acctRate, leadRate, efficRate);
                       JOptionPane.showMessageDialog(null, String.format("Average rating for" + memChoice + " is %.2f out of 5.",rateAvg));
                       
                     }
   
                  }
                } //if close for Allentown
             } //if close for PA
         else if (uState == "NY")
         {     
              String[] userCity1 = { "New York City", "Rochester", "Saratoga Springs" };
              String uCity1 = (String)JOptionPane.showInputDialog(null, "Choose a city", "Input", JOptionPane.INFORMATION_MESSAGE, null,
                                                                  userCity1, userCity1[0]);
              
              if (uCity1 == "New York City")
               {
                  String[] userGov = { "Mayor", "City Council Members" };
                  String uGov = (String)JOptionPane.showInputDialog(null, "Choose what type of government official", "Input", 
                                                                     JOptionPane.INFORMATION_MESSAGE, null,userGov, userGov[0]);
                                                                     
                  if (uGov == "Mayor")
                  {
                    acctEnt = JOptionPane.showInputDialog(null, String.format("Please enter your rating for" + nycMayor +
                                                                          "'s accountability. Your input must be a number."));
                    acctRate = Double.parseDouble(acctEnt);
                    
                    leadEnc = JOptionPane.showInputDialog(null, String.format("Please enter your rating for" + nycMayor +
                                                                          "'s leadership. Your input must be a number."));
                    leadRate = Double.parseDouble(acctEnt);
                    
                    efficEnt = JOptionPane.showInputDialog(null, String.format("Please enter your rating for" + nycMayor +
                                                                          "'s efficiency. Your input must be a number."));
                    efficRate = Double.parseDouble(efficEnt);
                    
                    double rateAvg = calcAvg(acctRate, leadRate, efficRate);
                    JOptionPane.showMessageDialog(null, String.format("Average rating for" + nycMayor + " is %.2f out of 5",rateAvg));

                                    }
                  else if (uGov == "City Council Members")
                  {
                     String[] councilMem3 = {"Margaret S. Chin", "Carlina Rivera", "Corey Johnson", "Keith Powers", "Ben Kallos",
                                             "Helen Rosenthal", "Mark Levine", "Diana Ayala", "Bill Perkins", "Ydanis Rodriguez",
                                             "Andrew Cohen", "Andy King", "Mark Gjonaj", "Fernando Cabrera", "Ritchie J. Torres", 
                                             "Vanessa L. Gibson", "Rafael Salamanca Jr.", "Ruben Diaz Sr.", "Paul Vallone", 
                                             "Peter Koo", "Francisco Moya", "Costa Constantinides", "Barry Grodenchik", 
                                             "Rory I. Lancman", "Daniel Dromm", "I. Daneek Miller", "Andrienne E. Adams", 
                                             "Karen Koslowitz", "Robert Holden", "Donovan J. Richards", "Eric A. Ulrich", 
                                             "Stephen T. Levin", "Antonio Reynoso", "Laurie A. Cumbo", "Robert E. Cornegy, Jr.", 
                                             "Rafel L. Espinal Jr.", "Carlos Menchaca", "Brad Lander", "Mathieu Eugene", 
                                             "Alicka Ampry-Samuel", "Inez Barron", "Justin Brannan", "Kalman Yeger", 
                                             "Jumaane D. Williams", "Alan N. Maisel", "Mark Treyger", "Chaim M. Deutsch", 
                                             "Deborah Rose", "Steven Matteo", "Joseph C. Borelli"};
                     String memChoice = (String)JOptionPane.showInputDialog(null, "Choose a City Council Member",   
                                                                          "Input", JOptionPane.INFORMATION_MESSAGE, null,
                                                                           councilMem3, councilMem3[0]);
                     if (memChoice == "Margaret S. Chin")
                     {
                        
                       acctEnt = JOptionPane.showInputDialog(null, String.format("Please enter your rating for" + memChoice +
                                                                          "'s accountability. Your input must be a number."));
                       acctRate = Double.parseDouble(acctEnt);
                       leadEnc = JOptionPane.showInputDialog(null, String.format("Please enter your rating for" + memChoice +
                                                                             "'s leadership. Your input must be a number."));
                       leadRate = Double.parseDouble(acctEnt);
                       efficEnt = JOptionPane.showInputDialog(null, String.format("Please enter your rating for" + memChoice +
                                                                             "'s efficiency. Your input must be a number."));
                       efficRate = Double.parseDouble(efficEnt);
                       
                       double rateAvg = calcAvg(acctRate, leadRate, efficRate);
                       JOptionPane.showMessageDialog(null, String.format("Average rating for" + memChoice + " is %.2f out of 5.",rateAvg));
                     }
   
                  }
              }
               
              else if (uCity1 == "Rochester")
              {
                  String[] userGov = { "Mayor", "City Council Members"};
                  String uGov = (String)JOptionPane.showInputDialog(null, "Choose what type of government official", "Input", 
                                                                     JOptionPane.INFORMATION_MESSAGE, null,userGov, userGov[0]);
                  
                  if (uGov == "Mayor")
                  {
                    acctEnt = JOptionPane.showInputDialog(null, String.format("Please enter your rating for" + rochMayor +
                                                                          "'s accountability. Your input must be a number."));
                    acctRate = Double.parseDouble(acctEnt);
                    
                    leadEnc = JOptionPane.showInputDialog(null, String.format("Please enter your rating for" + rochMayor +
                                                                          "'s leadership. Your input must be a number."));
                    leadRate = Double.parseDouble(acctEnt);
                    
                    efficEnt = JOptionPane.showInputDialog(null, String.format("Please enter your rating for" + rochMayor +
                                                                          "'s efficiency. Your input must be a number."));
                    efficRate = Double.parseDouble(efficEnt);
                    
                    double rateAvg = calcAvg(acctRate, leadRate, efficRate);
                    JOptionPane.showMessageDialog(null, String.format("Average rating for" + rochMayor + " is %.2f out of 5",rateAvg));

                 } //Mayor close
                  else if (uGov == "City Council Members")
                  {
                     String[] councilMem4 = {"Adam McFadden", "Molly Clifford", "Elaine M. Spaull", "Michael A. Patterson", 
                                             "Willie J. Lightfoot", "Mitchell D. Gruber", "Malik D. Evans", "Jacklyn Ortiz",
                                             "Loretta C. Scott"};
                     String memChoice = (String)JOptionPane.showInputDialog(null, "Choose a City Council Member",   
                                                                          "Input", JOptionPane.INFORMATION_MESSAGE, null,
                                                                           councilMem4, councilMem4[0]);
                     if (memChoice == "Adam McFadden")
                     {
                        
                       acctEnt = JOptionPane.showInputDialog(null, String.format("Please enter your rating for" + memChoice +
                                                                          "'s accountability. Your input must be a number."));
                       acctRate = Double.parseDouble(acctEnt);
                       leadEnc = JOptionPane.showInputDialog(null, String.format("Please enter your rating for" + memChoice +
                                                                             "'s leadership. Your input must be a number."));
                       leadRate = Double.parseDouble(acctEnt);
                       efficEnt = JOptionPane.showInputDialog(null, String.format("Please enter your rating for" + memChoice +
                                                                             "'s efficiency. Your input must be a number."));
                       efficRate = Double.parseDouble(efficEnt);
                       
                       double rateAvg = calcAvg(acctRate, leadRate, efficRate);
                       JOptionPane.showMessageDialog(null, String.format("Average rating for" + memChoice + " is %.2f out of 5.",rateAvg));
                     }
   
                  }//Council Member Close
              }//Rochester close
               
              else if (uCity1 == "Saratoga Springs")
               {
                  String[] userGov = { "Mayor", "City Council Members" };
                  String uGov = (String)JOptionPane.showInputDialog(null, "Choose what type of government official", "Input", 
                                                                     JOptionPane.INFORMATION_MESSAGE, null,userGov, userGov[0]);
                                                                     
                  if (uGov == "Mayor")
                  {
    
                    acctEnt = JOptionPane.showInputDialog(null, String.format("Please enter your rating for" + rochMayor +
                                                                          "'s accountability. Your input must be a number."));
                    acctRate = Double.parseDouble(acctEnt);
                    
                    leadEnc = JOptionPane.showInputDialog(null, String.format("Please enter your rating for" + rochMayor +
                                                                          "'s leadership. Your input must be a number."));
                    leadRate = Double.parseDouble(acctEnt);
                    
                    efficEnt = JOptionPane.showInputDialog(null, String.format("Please enter your rating for" + rochMayor +
                                                                          "'s efficiency. Your input must be a number."));
                    efficRate = Double.parseDouble(efficEnt);
                    
                    double rateAvg = calcAvg(acctRate, leadRate, efficRate);
                    JOptionPane.showMessageDialog(null, String.format("Average rating for" + rochMayor + " is %.2f out of 5",rateAvg));


                  }//Mayor close
                  else if (uGov == "City Council Members")
                  {
                     String[] councilMem5 = {"Michele Madigan", "Anthony 'Skip' Scirocco", "Christian Mathiesen", "John P. Franck"};
                     String memChoice = (String)JOptionPane.showInputDialog(null, "Choose a City Council Member",   
                                                                          "Input", JOptionPane.INFORMATION_MESSAGE, null,
                                                                           councilMem5, councilMem5[0]);
                     if (memChoice == "Michele Madigan")
                     {
                      
                       acctEnt = JOptionPane.showInputDialog(null, String.format("Please enter your rating for" + memChoice +
                                                                          "'s accountability. Your input must be a number."));
                       acctRate = Double.parseDouble(acctEnt);
                       leadEnc = JOptionPane.showInputDialog(null, String.format("Please enter your rating for" + memChoice +
                                                                             "'s leadership. Your input must be a number."));
                       leadRate = Double.parseDouble(acctEnt);
                       efficEnt = JOptionPane.showInputDialog(null, String.format("Please enter your rating for" + memChoice +
                                                                             "'s efficiency. Your input must be a number."));
                       efficRate = Double.parseDouble(efficEnt);
                       
                       double rateAvg = calcAvg(acctRate, leadRate, efficRate);
                       JOptionPane.showMessageDialog(null, String.format("Average rating for" + memChoice + " is %.2f out of 5.",rateAvg));
                     }
   
                  }
   
               } //if close for cities
               } //if close for NY
         else if (uState == "OK")
         {
            String[] userCity2 = { "Oklahoma City", "Tulsa", "Bartlesville" };
              String uCity2 = (String)JOptionPane.showInputDialog(null, "Choose a city", "Input", JOptionPane.INFORMATION_MESSAGE, null,
                                                                  userCity2, userCity2[0]);
              
              if (uCity2 == "Oklahoma City")
               {
                  String[] userGov = { "Mayor", "City Council Members" }; 
                  String uGov = (String)JOptionPane.showInputDialog(null, "Choose what type of government official", "Input", 
                                                                     JOptionPane.INFORMATION_MESSAGE, null,userGov, userGov[0]);
               
               if (uGov == "Mayor")
               {
                  acctEnt = JOptionPane.showInputDialog(null, String.format("Please enter your rating for" + okcMayor +
                                                                          "'s accountability. Your input must be a number."));
                    acctRate = Double.parseDouble(acctEnt);
                    
                    leadEnc = JOptionPane.showInputDialog(null, String.format("Please enter your rating for" + okcMayor +
                                                                          "'s leadership. Your input must be a number."));
                    leadRate = Double.parseDouble(acctEnt);
                    
                    efficEnt = JOptionPane.showInputDialog(null, String.format("Please enter your rating for" + okcMayor +
                                                                          "'s efficiency. Your input must be a number."));
                    efficRate = Double.parseDouble(efficEnt);
                    
                    double rateAvg = calcAvg(acctRate, leadRate, efficRate);
                    JOptionPane.showMessageDialog(null, String.format("Average rating for" + okcMayor + " is %.2f out of 5",rateAvg));

                  
               }//Mayor close
                  else if (uGov == "City Council Members")
                  {
                     String[] councilMem6 = {"James Greiner", "Ed Shadid", "Larry McAtee", "Todd Stone", "David Greenwell", 
                                             "Meg Salyer", "John A. Pettis, Jr.", "Mark J. Stonecipher"};
                     String memChoice = (String)JOptionPane.showInputDialog(null, "Choose a City Council Member",   
                                                                          "Input", JOptionPane.INFORMATION_MESSAGE, null,
                                                                           councilMem6, councilMem6[0]);
                     if (memChoice == "James Greiner")
                     {                        
                       acctEnt = JOptionPane.showInputDialog(null, String.format("Please enter your rating for" + memChoice +
                                                                          "'s accountability. Your input must be a number."));
                       acctRate = Double.parseDouble(acctEnt);
                       leadEnc = JOptionPane.showInputDialog(null, String.format("Please enter your rating for" + memChoice +
                                                                             "'s leadership. Your input must be a number."));
                       leadRate = Double.parseDouble(acctEnt);
                       efficEnt = JOptionPane.showInputDialog(null, String.format("Please enter your rating for" + memChoice +
                                                                             "'s efficiency. Your input must be a number."));
                       efficRate = Double.parseDouble(efficEnt);
                       
                       double rateAvg = calcAvg(acctRate, leadRate, efficRate);
                       JOptionPane.showMessageDialog(null, String.format("Average rating for" + memChoice + " is %.2f out of 5.",rateAvg));  
                     }
   
                  }
               }
               else if (uCity2 == "Tulsa")
               {
                  String[] userGov = { "Mayor", "City Council Members" };
                  String uGov = (String)JOptionPane.showInputDialog(null, "Choose what type of government official", "Input", 
                                                                     JOptionPane.INFORMATION_MESSAGE, null,userGov, userGov[0]);
                  if (uGov == "Mayor")
                  {
   
                    acctEnt = JOptionPane.showInputDialog(null, String.format("Please enter your rating for" + tulsMayor +
                                                                          "'s accountability. Your input must be a number."));
                    acctRate = Double.parseDouble(acctEnt);
                    
                    leadEnc = JOptionPane.showInputDialog(null, String.format("Please enter your rating for" + tulsMayor +
                                                                          "'s leadership. Your input must be a number."));
                    leadRate = Double.parseDouble(acctEnt);
                    
                    efficEnt = JOptionPane.showInputDialog(null, String.format("Please enter your rating for" + tulsMayor +
                                                                          "'s efficiency. Your input must be a number."));
                    efficRate = Double.parseDouble(efficEnt);
                    
                    double rateAvg = calcAvg(acctRate, leadRate, efficRate);
                    JOptionPane.showMessageDialog(null, String.format("Average rating for" + tulsMayor + " is %.2f out of 5",rateAvg));

                  
                  }
                  else if (uGov == "City Council Members")
                  {
                     String[] councilMem7 = {"Vanessa Hall-Harper", "Jeannie Cue", "David Patrick", "Blake Ewing", "Karen Gilbert",
                                             "Connie Dodson", "Anna America", "Phil Lakin Jr.", "Ben Kimbro"};
                     String memChoice = (String)JOptionPane.showInputDialog(null, "Choose a City Council Member",   
                                                                          "Input", JOptionPane.INFORMATION_MESSAGE, null,
                                                                           councilMem7, councilMem7[0]);
                     if (memChoice == "Vanessa Hall-Harper")
                     {
                        
                       acctEnt = JOptionPane.showInputDialog(null, String.format("Please enter your rating for" + memChoice +
                                                                          "'s accountability. Your input must be a number."));
                       acctRate = Double.parseDouble(acctEnt);
                       leadEnc = JOptionPane.showInputDialog(null, String.format("Please enter your rating for" + memChoice +
                                                                             "'s leadership. Your input must be a number."));
                       leadRate = Double.parseDouble(acctEnt);
                       efficEnt = JOptionPane.showInputDialog(null, String.format("Please enter your rating for" + memChoice +
                                                                             "'s efficiency. Your input must be a number."));
                       efficRate = Double.parseDouble(efficEnt);
                       
                       double rateAvg = calcAvg(acctRate, leadRate, efficRate);
                       JOptionPane.showMessageDialog(null, String.format("Average rating for" + memChoice + " is %.2f out of 5.",rateAvg));                     }
   
                  }
              }
              else if (uCity2 == "Bartlesville")
               {
                  String[] userGov = { "Mayor", "City Council Members" };
                  String uGov = (String)JOptionPane.showInputDialog(null, "Choose what type of government official", "Input", 
                                                                     JOptionPane.INFORMATION_MESSAGE, null,userGov, userGov[0]);
                  
                  if (uGov == "Mayor")
                  {
                    acctEnt = JOptionPane.showInputDialog(null, String.format("Please enter your rating for" + bartMayor +
                                                                          "'s accountability. Your input must be a number."));
                    acctRate = Double.parseDouble(acctEnt);
                    
                    leadEnc = JOptionPane.showInputDialog(null, String.format("Please enter your rating for" + bartMayor +
                                                                          "'s leadership. Your input must be a number."));
                    leadRate = Double.parseDouble(acctEnt);
                    
                    efficEnt = JOptionPane.showInputDialog(null, String.format("Please enter your rating for" + bartMayor +
                                                                          "'s efficiency. Your input must be a number."));
                    efficRate = Double.parseDouble(efficEnt);
                    
                    double rateAvg = calcAvg(acctRate, leadRate, efficRate);
                    JOptionPane.showMessageDialog(null, String.format("Average rating for" + bartMayor + " is %.2f out of 5",rateAvg));

                  }
                  else if (uGov == "City Council Members")
                  {
                     String[] councilMem8 = {"John Kane", "Jim Curd Jr.", "Alan Gentges"};
                     String memChoice = (String)JOptionPane.showInputDialog(null, "Choose a City Council Member",   
                                                                          "Input", JOptionPane.INFORMATION_MESSAGE, null,
                                                                           councilMem8, councilMem8[0]);
                     if (memChoice == "John Kane")
                     {
                        
                       acctEnt = JOptionPane.showInputDialog(null, String.format("Please enter your rating for" + memChoice +
                                                                          "'s accountability. Your input must be a number."));
                       acctRate = Double.parseDouble(acctEnt);
                       leadEnc = JOptionPane.showInputDialog(null, String.format("Please enter your rating for" + memChoice +
                                                                             "'s leadership. Your input must be a number."));
                       leadRate = Double.parseDouble(acctEnt);
                       efficEnt = JOptionPane.showInputDialog(null, String.format("Please enter your rating for" + memChoice +
                                                                             "'s efficiency. Your input must be a number."));
                       efficRate = Double.parseDouble(efficEnt);
                       
                       double rateAvg = calcAvg(acctRate, leadRate, efficRate);
                       JOptionPane.showMessageDialog(null, String.format("Average rating for" + memChoice + " is %.2f out of 5.",rateAvg));
                     }

                  }

               }
            }
      }
      else if (mainChoi == JOptionPane.NO_OPTION || mainChoi == JOptionPane.CLOSED_OPTION) 
      {
      
         float avgRate = 2;
         String[] userState = { "PA", "NY", "OK", "Search for an Offical" }; //list of state choices for drop down menu
         String uState = (String)JOptionPane.showInputDialog(null, "Choose a state.", "Input", 
                                                            JOptionPane.INFORMATION_MESSAGE, null, userState, userState[0]);
 
         if (uState == "PA") //if the user chooses PA
            {  
               String[] userCity = { "Philadelphia", "Erie", "Allentown" }; //list of city choices for drop down menu
               String uCity = (String)JOptionPane.showInputDialog(null, "Choose a city", "Input", JOptionPane.INFORMATION_MESSAGE, null,
                                                                  userCity, userCity[0]);
               
               
               if (uCity == "Philadelphia") //if user chooses Philadelphia as city
               {
                  String[] userGov = { "Mayor", "City Council Members"};
                  String uGov = (String)JOptionPane.showInputDialog(null, "Choose what type of government official", "Input", 
                                                                     JOptionPane.INFORMATION_MESSAGE, null,userGov, userGov[0]);
                  if (uGov == "Mayor")
                  {
                     double uChoice = JOptionPane.showConfirmDialog(null, "Your mayor is" + phlMayor + ". Their current rating is " + avgRate +
                                                               " out of 5." + "Would you like to see recent commentary on their performance?",
                                                               "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                     if (uChoice == JOptionPane.NO_OPTION || uChoice == JOptionPane.CLOSED_OPTION) 
                     {
                        JOptionPane.showMessageDialog(null, String.format("Thank you for using Rate my Officials!"));
                        System.exit(0);
                     } 
                     else if (uChoice == JOptionPane.YES_OPTION) 
                     {
                        System.out.print("Yes.");
                        //String userComment = //user comment method
                     }
                  }
                                                      
                  else if (uGov == "City Council Members")
                  {
                     String[] councilMem = {"Mark Squilla", "Kenyatta Johnson", "Jannie Blackwell" , "Curtis J. Jones, Jr.", 
                                           "Darrell L. Clarke", "Bobby Henon", "Maria Quiñones-Sanchez", "Cindy Bass", 
                                          "Cherelle Parker", "Brian J. O'Neill", "Blondell Reynolds Brown", 
                                          "Bill Greenlee", "David Oh", "Allan Domb", "Derek S. Green", "Helen Gym", "Al Taubenberger" };
                     String memChoice = (String)JOptionPane.showInputDialog(null, "Choose a City Council Member",   
                                                                          "Input", JOptionPane.INFORMATION_MESSAGE, null,
                                                                           councilMem, councilMem[0]);
                     if (memChoice == "Mark Squilla")
                     {//**fix so it's avg */5 for accountability,avg */5 for  leadership, and avg */5 for efficiency for a total of */5
                        double uChoice = JOptionPane.showConfirmDialog(null, memChoice + "currently has a rating of " + avgRate + 
                                                                    "out of 5. Would you like to see the community feedback for them?",
                                                                    "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                     if (uChoice == JOptionPane.NO_OPTION || uChoice == JOptionPane.CLOSED_OPTION) 
                     {
                        JOptionPane.showMessageDialog(null, String.format("Thank you for using Rate my Officials!"));
                        System.exit(0);
                     } 
                     else if (uChoice == JOptionPane.YES_OPTION) 
                     {
                        System.out.print("Yes.");
                        //String userComment = //user comment method
                     }
   
                     }
                  }
              }//if close for Philadelphia
              else if (uCity == "Erie")  
              {
                  String[] userGov = { "Mayor", "City Council Members"};
                  String uGov = (String)JOptionPane.showInputDialog(null, "Choose what type of government official", "Input", 
                                                                     JOptionPane.INFORMATION_MESSAGE, null,userGov, userGov[0]);
                  
                  if (uGov == "Mayor")
                  {
   
                     double uChoice = JOptionPane.showConfirmDialog(null, "Your mayor is" + erieMayor + ". Their current rating is " + avgRate +
                                                                 " out of 5." + "Would you like to see recent commentary on their performance?",
                                                                  "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                     if (uChoice == JOptionPane.NO_OPTION || uChoice == JOptionPane.CLOSED_OPTION) 
                     {
                        JOptionPane.showMessageDialog(null, String.format("Thank you for using Rate my Officials!"));
                        System.exit(0);
                     } 
                     else if (uChoice == JOptionPane.YES_OPTION) 
                     {
                        System.out.print("Yes.");
                        //String userComment = //user comment method
                     }
                  }
                  else if (uGov == "City Council Members")
                  {
                     String[] councilMem1 = {"Sonya Arrington", "Liz Allen", "Casimir J. Kwitowski", "Robert Merski", "Kathleen A. Schaaf",
                                           "James Winarski", "Melvin Witherspoon"};
                     String memChoice = (String)JOptionPane.showInputDialog(null, "Choose a City Council Member",   
                                                                          "Input", JOptionPane.INFORMATION_MESSAGE, null,
                                                                           councilMem1, councilMem1[0]);
                     if (memChoice == "Sonya Arrington")
                     {
                        double uChoice = JOptionPane.showConfirmDialog(null, memChoice + "currently has a rating of " + avgRate + 
                                                                    "out of 5. Would you like to see the community feedback for them?",
                                                               "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                     if (uChoice == JOptionPane.NO_OPTION || uChoice == JOptionPane.CLOSED_OPTION) 
                     {
                        JOptionPane.showMessageDialog(null, String.format("Thank you for using Rate my Officials!"));
                        System.exit(0);
                     } 
                     else if (uChoice == JOptionPane.YES_OPTION) 
                     {
                        System.out.print("Yes.");
                        //String userComment = //user comment method
                     }
   
                     }
   
                  }
                  }//if close for Erie
              else if (uCity == "Allentown")  
              {
                  String[] userGov = { "Mayor", "City Council Members"};
                  String uGov = (String)JOptionPane.showInputDialog(null, "Choose what type of government official", "Input", 
                                                                     JOptionPane.INFORMATION_MESSAGE, null,userGov, userGov[0]);
                                                                     
                  if (uGov == "Mayor")
                  {
                  
                  double uChoice = JOptionPane.showConfirmDialog(null, "Your mayor is" + allenMayor + ". Their current rating is " + avgRate +
                                                              " out of 5." + "Would you like to see recent commentary on their performance?",
                                                               "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                     if (uChoice == JOptionPane.NO_OPTION || uChoice == JOptionPane.CLOSED_OPTION) 
                     {
                        JOptionPane.showMessageDialog(null, String.format("Thank you for using Rate my Officials!"));
                        System.exit(0);
                     } 
                     else if (uChoice == JOptionPane.YES_OPTION) 
                     {
                        System.out.print("Yes.");
                        //String userComment = //user comment method
                     }
                  }
                  else if (uGov == "City Council Members")
                  {
                     String[] councilMem2 = {"Roger MacLean", "Candid Affa", "Daryl L. Hendricks", "Julio A. Guridy", "Cynthia Mota", 
                                           "Courtney Robinson", "Ed Zucal"};
                     String memChoice = (String)JOptionPane.showInputDialog(null, "Choose a City Council Member",   
                                                                          "Input", JOptionPane.INFORMATION_MESSAGE, null,
                                                                           councilMem2, councilMem2[0]);
                    if (memChoice == "Roger MacLean")
                     {//**fix so it's avg */5 for accountability,avg */5 for  leadership, and avg */5 for efficiency for a total of */5
                        double uChoice = JOptionPane.showConfirmDialog(null, memChoice + "currently has a rating of " + avgRate + 
                                                                    "out of 5. Would you like to see the community feedback for them?",
                                                               "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                     if (uChoice == JOptionPane.NO_OPTION || uChoice == JOptionPane.CLOSED_OPTION) 
                     {
                        JOptionPane.showMessageDialog(null, String.format("Thank you for using Rate my Officials!"));
                        System.exit(0);
                     } 
                     else if (uChoice == JOptionPane.YES_OPTION) 
                     {
                        System.out.print("Yes.");
                        //String userComment = //user comment method
                     }
   
                     }
   
                  }
                } //if close for Allentown
             } //if close for PA
         else if (uState == "NY")
         {     
              String[] userCity1 = { "New York City", "Rochester", "Saratoga Springs" };
              String uCity1 = (String)JOptionPane.showInputDialog(null, "Choose a city", "Input", JOptionPane.INFORMATION_MESSAGE, null,
                                                                  userCity1, userCity1[0]);
              
              if (uCity1 == "New York City")
               {
                  String[] userGov = { "Mayor", "City Council Members" };
                  String uGov = (String)JOptionPane.showInputDialog(null, "Choose what type of government official", "Input", 
                                                                     JOptionPane.INFORMATION_MESSAGE, null,userGov, userGov[0]);
                                                                     
                  if (uGov == "Mayor")
                  {

                  double uChoice = JOptionPane.showConfirmDialog(null, "Your mayor is" + nycMayor + ". Their current rating is " + avgRate +
                                                              " out of 5." + "Would you like to see recent commentary on their performance?",
                                                               "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                  if (uChoice == JOptionPane.NO_OPTION || uChoice == JOptionPane.CLOSED_OPTION) 
                  {
                     JOptionPane.showMessageDialog(null, String.format("Thank you for using Rate my Officials!"));
                     System.exit(0);
                  } 
                  else if (uChoice == JOptionPane.YES_OPTION) 
                  {
                     System.out.print("Yes.");
                     //String userComment = //user comment method
                  }
                  }
                  else if (uGov == "City Council Members")
                  {
                     String[] councilMem3 = {"Margaret S. Chin", "Carlina Rivera", "Corey Johnson", "Keith Powers", "Ben Kallos",
                                             "Helen Rosenthal", "Mark Levine", "Diana Ayala", "Bill Perkins", "Ydanis Rodriguez",
                                             "Andrew Cohen", "Andy King", "Mark Gjonaj", "Fernando Cabrera", "Ritchie J. Torres", 
                                             "Vanessa L. Gibson", "Rafael Salamanca Jr.", "Ruben Diaz Sr.", "Paul Vallone", 
                                             "Peter Koo", "Francisco Moya", "Costa Constantinides", "Barry Grodenchik", 
                                             "Rory I. Lancman", "Daniel Dromm", "I. Daneek Miller", "Andrienne E. Adams", 
                                             "Karen Koslowitz", "Robert Holden", "Donovan J. Richards", "Eric A. Ulrich", 
                                             "Stephen T. Levin", "Antonio Reynoso", "Laurie A. Cumbo", "Robert E. Cornegy, Jr.", 
                                             "Rafel L. Espinal Jr.", "Carlos Menchaca", "Brad Lander", "Mathieu Eugene", 
                                             "Alicka Ampry-Samuel", "Inez Barron", "Justin Brannan", "Kalman Yeger", 
                                             "Jumaane D. Williams", "Alan N. Maisel", "Mark Treyger", "Chaim M. Deutsch", 
                                             "Deborah Rose", "Steven Matteo", "Joseph C. Borelli"};
                     String memChoice = (String)JOptionPane.showInputDialog(null, "Choose a City Council Member",   
                                                                          "Input", JOptionPane.INFORMATION_MESSAGE, null,
                                                                           councilMem3, councilMem3[0]);
                     if (memChoice == "Margaret S. Chin")
                     {
                        double uChoice = JOptionPane.showConfirmDialog(null, memChoice + "currently has a rating of " + avgRate + 
                                                                    "out of 5. Would you like to see the community feedback for them?",
                                                               "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                     if (uChoice == JOptionPane.NO_OPTION || uChoice == JOptionPane.CLOSED_OPTION) 
                     {
                        JOptionPane.showMessageDialog(null, String.format("Thank you for using Rate my Officials!"));
                        System.exit(0);
                     } 
                     else if (uChoice == JOptionPane.YES_OPTION) 
                     {
                        System.out.print("Yes.");
                        //String userComment = //user comment method
                     }
   
                     }
   
                  }
              }
               
              else if (uCity1 == "Rochester")
              {
                  String[] userGov = { "Mayor", "City Council Members"};
                  String uGov = (String)JOptionPane.showInputDialog(null, "Choose what type of government official", "Input", 
                                                                     JOptionPane.INFORMATION_MESSAGE, null,userGov, userGov[0]);
                  
                  if (uGov == "Mayor")
                  {
   
                  double uChoice = JOptionPane.showConfirmDialog(null, "Your mayor is" + rochMayor + ". Their current rating is " + avgRate +
                                                              " out of 5." + "Would you like to see recent commentary on their performance?",
                                                               "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                  if (uChoice == JOptionPane.NO_OPTION || uChoice == JOptionPane.CLOSED_OPTION) 
                  {
                     JOptionPane.showMessageDialog(null, String.format("Thank you for using Rate my Officials!"));
                     System.exit(0);
                  } 
                  else if (uChoice == JOptionPane.YES_OPTION) 
                  {
                     System.out.print("Yes.");
                     //String userComment = //user comment method
                  }
                  } //Mayor close
                  else if (uGov == "City Council Members")
                  {
                     String[] councilMem4 = {"Adam McFadden", "Molly Clifford", "Elaine M. Spaull", "Michael A. Patterson", 
                                             "Willie J. Lightfoot", "Mitchell D. Gruber", "Malik D. Evans", "Jacklyn Ortiz",
                                             "Loretta C. Scott"};
                     String memChoice = (String)JOptionPane.showInputDialog(null, "Choose a City Council Member",   
                                                                          "Input", JOptionPane.INFORMATION_MESSAGE, null,
                                                                           councilMem4, councilMem4[0]);
                     if (memChoice == "Adam McFadden")
                     {//**fix so it's avg */5 for accountability,avg */5 for  leadership, and avg */5 for efficiency for a total of */5
                        double uChoice = JOptionPane.showConfirmDialog(null, memChoice + "currently has a rating of " + avgRate + 
                                                                    "out of 5. Would you like to see the community feedback for them?",
                                                               "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                     if (uChoice == JOptionPane.NO_OPTION || uChoice == JOptionPane.CLOSED_OPTION) 
                     {
                        JOptionPane.showMessageDialog(null, String.format("Thank you for using Rate my Officials!"));
                        System.exit(0);
                     } 
                     else if (uChoice == JOptionPane.YES_OPTION) 
                     {
                        System.out.print("Yes.");
                        //String userComment = //user comment method
                     }
   
                     }
   
                  }//Council Member Close
              }//Rochester close
               
              else if (uCity1 == "Saratoga Springs")
               {
                  String[] userGov = { "Mayor", "City Council Members" };
                  String uGov = (String)JOptionPane.showInputDialog(null, "Choose what type of government official", "Input", 
                                                                     JOptionPane.INFORMATION_MESSAGE, null,userGov, userGov[0]);
                                                                     
                  if (uGov == "Mayor")
                  {
    
                  double uChoice = JOptionPane.showConfirmDialog(null, "Your mayor is" + saraMayor + ". Their current rating is " 
                                                              + avgRate + " out of 5." + 
                                                              "Would you like to see recent commentary on their performance?",
                                                               "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                  if (uChoice == JOptionPane.NO_OPTION || uChoice == JOptionPane.CLOSED_OPTION) 
                  {
                     JOptionPane.showMessageDialog(null, String.format("Thank you for using Rate my Officials!"));
                     System.exit(0);
                  } 
                  else if (uChoice == JOptionPane.YES_OPTION) 
                  {
                     System.out.print("Yes.");
                     //String userComment = //user comment method
                  }
                  }//Mayor close
                  else if (uGov == "City Council Members")
                  {
                     String[] councilMem5 = {"Michele Madigan", "Anthony 'Skip' Scirocco", "Christian Mathiesen", "John P. Franck"};
                     String memChoice = (String)JOptionPane.showInputDialog(null, "Choose a City Council Member",   
                                                                          "Input", JOptionPane.INFORMATION_MESSAGE, null,
                                                                           councilMem5, councilMem5[0]);
                     if (memChoice == "Michele Madigan")
                     {//**fix so it's avg */5 for accountability,avg */5 for  leadership, and avg */5 for efficiency for a total of */5
                        double uChoice = JOptionPane.showConfirmDialog(null, memChoice + "currently has a rating of " + avgRate + 
                                                                    "out of 5. Would you like to see the community feedback for them?",
                                                               "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                     if (uChoice == JOptionPane.NO_OPTION || uChoice == JOptionPane.CLOSED_OPTION) 
                     {
                        JOptionPane.showMessageDialog(null, String.format("Thank you for using Rate my Officials!"));
                        System.exit(0);
                     } 
                     else if (uChoice == JOptionPane.YES_OPTION) 
                     {
                        System.out.print("Yes.");
                        //String userComment = //user comment method
                     }
   
                     }
   
                  }
   
               } //if close for cities
         } //if close for NY
         else if (uState == "OK")
         {
              String[] userCity2 = { "Oklahoma City", "Tulsa", "Bartlesville" };
              String uCity2 = (String)JOptionPane.showInputDialog(null, "Choose a city", "Input", JOptionPane.INFORMATION_MESSAGE, null,
                                                                  userCity2, userCity2[0]);
              
              if (uCity2 == "Oklahoma City")
               {
                  String[] userGov = { "Mayor", "City Council Members" }; 
                  String uGov = (String)JOptionPane.showInputDialog(null, "Choose what type of government official", "Input", 
                                                                     JOptionPane.INFORMATION_MESSAGE, null,userGov, userGov[0]);
               
               if (uGov == "Mayor")
               {
                  double uChoice = JOptionPane.showConfirmDialog(null, "Your mayor is Mick Cornett. Their current rating is " + avgRate +
                                                              " out of 5." + "Would you like to see recent commentary on their performance?",
                                                               "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                  if (uChoice == JOptionPane.NO_OPTION || uChoice == JOptionPane.CLOSED_OPTION) 
                  {
                     JOptionPane.showMessageDialog(null, String.format("Thank you for using Rate my Officials!"));
                     System.exit(0);
                  } 
                  else if (uChoice == JOptionPane.YES_OPTION) 
                  {
                     System.out.print("Yes.");
                     //String userComment = //user comment method
                  }
                  }//Mayor close
                  else if (uGov == "City Council Members")
                  {
                     String[] councilMem6 = {"James Greiner", "Ed Shadid", "Larry McAtee", "Todd Stone", "David Greenwell", 
                                             "Meg Salyer", "John A. Pettis, Jr.", "Mark J. Stonecipher"};
                     String memChoice = (String)JOptionPane.showInputDialog(null, "Choose a City Council Member",   
                                                                          "Input", JOptionPane.INFORMATION_MESSAGE, null,
                                                                           councilMem6, councilMem6[0]);
                     if (memChoice == "James Greiner")
                     {//**fix so it's avg */5 for accountability,avg */5 for  leadership, and avg */5 for efficiency for a total of */5
                        double uChoice = JOptionPane.showConfirmDialog(null, memChoice + "currently has a rating of " + avgRate + 
                                                                    "out of 5. Would you like to see the community feedback for them?",
                                                               "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                     if (uChoice == JOptionPane.NO_OPTION || uChoice == JOptionPane.CLOSED_OPTION) 
                     {
                        JOptionPane.showMessageDialog(null, String.format("Thank you for using Rate my Officials!"));
                        System.exit(0);
                     } 
                     else if (uChoice == JOptionPane.YES_OPTION) 
                     {
                        System.out.print("Yes.");
                        //String userComment = //user comment method
                     }
   
                     }
   
                  }
               }
               else if (uCity2 == "Tulsa")
               {
                  String[] userGov = { "Mayor", "City Council Members" };
                  String uGov = (String)JOptionPane.showInputDialog(null, "Choose what type of government official", "Input", 
                                                                     JOptionPane.INFORMATION_MESSAGE, null,userGov, userGov[0]);
                  if (uGov == "Mayor") //if user chooses mayor
                  {
   
                  double uChoice = JOptionPane.showConfirmDialog(null, "Your mayor is G. T. Bynum. Their current rating is " + avgRate +
                                                              " out of 5." + "Would you like to see recent commentary on their performance?",
                                                               "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                  if (uChoice == JOptionPane.NO_OPTION || uChoice == JOptionPane.CLOSED_OPTION) //if the user clicks no or the exit button
                  {
                     JOptionPane.showMessageDialog(null, String.format("Thank you for using Rate my Officials!"));
                     System.exit(0); //the system exits
                  } 
                  else if (uChoice == JOptionPane.YES_OPTION) //if the user chooses yes 
                  {
                     System.out.print("Yes.");
                     //String userComment = //user comment method
                  }
                  }
                  else if (uGov == "City Council Members")
                  {
                     String[] councilMem7 = {"Vanessa Hall-Harper", "Jeannie Cue", "David Patrick", "Blake Ewing", "Karen Gilbert",
                                             "Connie Dodson", "Anna America", "Phil Lakin Jr.", "Ben Kimbro"};
                     String memChoice = (String)JOptionPane.showInputDialog(null, "Choose a City Council Member",   
                                                                          "Input", JOptionPane.INFORMATION_MESSAGE, null,
                                                                           councilMem7, councilMem7[0]);
                     if (memChoice == "Vanessa Hall-Harper")
                     {//**fix so it's avg */5 for accountability,avg */5 for  leadership, and avg */5 for efficiency for a total of */5
                        double uChoice = JOptionPane.showConfirmDialog(null, memChoice + "currently has a rating of " + avgRate + 
                                                                    "out of 5. Would you like to see the community feedback for them?",
                                                               "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                     if (uChoice == JOptionPane.NO_OPTION || uChoice == JOptionPane.CLOSED_OPTION) 
                     {
                        JOptionPane.showMessageDialog(null, String.format("Thank you for using Rate my Officials!"));
                        System.exit(0);
                     } 
                     else if (uChoice == JOptionPane.YES_OPTION) 
                     {
                        System.out.print("Yes.");
                        //String userComment = //user comment method
                     }
   
                     }
   
                  }
              }
              else if (uCity2 == "Bartlesville")
              {
                  String[] userGov = { "Mayor", "City Council Members" };
                  String uGov = (String)JOptionPane.showInputDialog(null, "Choose what type of government official", "Input", 
                                                                     JOptionPane.INFORMATION_MESSAGE, null,userGov, userGov[0]);
                  
                  if (uGov == "Mayor")
                  {
                  double uChoice = JOptionPane.showConfirmDialog(null, "Your mayor is Dale Copeland. Their current rating is " + avgRate +
                                                              " out of 5." + "Would you like to see recent commentary on their performance?",
                                                               "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                  if (uChoice == JOptionPane.NO_OPTION || uChoice == JOptionPane.CLOSED_OPTION) 
                  {
                     JOptionPane.showMessageDialog(null, String.format("Thank you for using Rate my Officials!"));
                     System.exit(0);
                  } 
                  else if (uChoice == JOptionPane.YES_OPTION) 
                  {
                     System.out.print("Yes.");
                     //String userComment = //user comment method
                  }
                  }
                  else if (uGov == "City Council Members")
                  {
                     String[] councilMem8 = {"John Kane", "Jim Curd Jr.", "Alan Gentges"};
                     String memChoice = (String)JOptionPane.showInputDialog(null, "Choose a City Council Member",   
                                                                          "Input", JOptionPane.INFORMATION_MESSAGE, null,
                                                                           councilMem8, councilMem8[0]);
                     if (memChoice == "John Kane")
                     {//**fix so it's avg */5 for accountability,avg */5 for  leadership, and avg */5 for efficiency for a total of */5
                        double uChoice = JOptionPane.showConfirmDialog(null, memChoice + "currently has a rating of " + avgRate + 
                                                                    "out of 5. Would you like to see the community feedback for them?",
                                                               "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                        if (uChoice == JOptionPane.NO_OPTION || uChoice == JOptionPane.CLOSED_OPTION) 
                        {
                           JOptionPane.showMessageDialog(null, String.format("Thank you for using Rate my Officials!"));
                           System.exit(0);
                        } 
                        else if (uChoice == JOptionPane.YES_OPTION) 
                        {
                           System.out.print("Yes.");
                           //String userComment = //user comment method
                        }
                     }

                  }

               }
          }
      }
   } //main close
    public static double calcAvg(double accRate, double leadRate, double efficRate)
    {
         double rateAvg;
         
         rateAvg = (accRate + leadRate + efficRate)/3;
         return rateAvg;
    }
}//all close
      
/**
* Ask for State **DONE
* Ask for City ** DONE
* Ask for Mayor, City Council Members, or State Representative **DONE
* OR
* Search for government officials (not case sensitive)
* Create average for rating
   * Ask for zip code before allowed to rate/comment??
* Present rating for each member and list of comments

PA
 * Philadelphia
   * Mayor DONE
   * City Council Members DONE *must be connected*
      *Council Member Rating
 * Erie
   * Mayor DONE
   * City Council Members DONE *must be connected*
      *Council Member Rating
 * Allentown
   * Mayor DONE
   * City Council Members DONE *must be connected*
      *Council Member Rating
NY
 * NYC
   * Mayor DONE
   * City Council Members DONE *must be connected*
      *Council Member Rating
 * Rochester
   * Mayor DONE
   * City Council Members DONE *must be connected*
      *Council Member Rating
 * Saratoga Springs
   * Mayor DONE
   * City Council Members DONE *must be connected*
      *Council Member Rating
OK
 * OKC
   * Mayor DONE
   * City Council Members DONE *must be connected*
      *Council Member Rating
 * Tulsa
   * Mayor DONE
   * City Council Members DONE *must be connected*
      *Council Member Rating
 * Bartlesville
   * Mayor DONE
   * City Council Members DONE *must be connected*
      *Council Member Rating 
*/ 