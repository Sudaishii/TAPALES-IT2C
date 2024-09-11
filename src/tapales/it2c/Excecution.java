/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tapales.it2c;

import java.util.*;


public class Excecution {
                
                
    
            public static void LoanEntry(){
                
               
                Implement[] imp = new Implement[100];
                Scanner sr = new Scanner (System.in);
               
                
                System.out.print("Enter Number of Applicants: ");
                int num = sr.nextInt();
                
                
                for (int i = 0; i < num; i++) {
                    
                    System.out.println("\nEnter details of Application "+(i+1)+": ");
                    
                    System.out.print("ID: ");
                    int ID = sr.nextInt();
                    
                    System.out.print("Name: ");
                    String name = sr.next();
                    
                    System.out.print("Monthly Income: ");
                    int m_income = sr.nextInt();
                    
                    System.out.print("Credit Score: ");
                    int c_score = sr.nextInt();
                    
                    System.out.print("Existing Loans: ");
                    int e_loan = sr.nextInt();
                    
                    System.out.println("");
                    
                    imp[i] = new Implement();
                    imp[i].addLoan(ID, name, m_income, c_score, e_loan);
                    
                }
                
                
                System.out.printf("| %-10s | %-10s | %-15s | %-15s | %-15s | %-10s | \n", "ID", "NAME", "MONTHLY INCOME", "CREDIT SCORE", "EXISTING LOAN", "STATUS");
                   
                for (int i = 0; i < num; i++) {
                        
                    imp[i].viewLoan();
                    
                }
            }

    
}
