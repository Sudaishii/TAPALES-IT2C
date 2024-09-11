/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tapales.it2c;


import java.math.BigDecimal; 
import java.text.NumberFormat; 
import java.util.Currency;
import java.util.Locale;

public class Implement {
        
    
           Locale locale = new Locale("en", "PH");
           NumberFormat frm = NumberFormat.getCurrencyInstance(locale);
            
        
               
        int ID, c_score, m_income, exc;
        String name;
       
        
        
        public void addLoan(int ID, String name, int m_income, int c_score, int exc){
            
            this.ID = ID;
            this.name = name;
            this.m_income = m_income;
            this.c_score = c_score;
            this.exc = exc;
            
        }
    
          
        
        
        public void viewLoan(){
            
            String stat = "";
            
            if (this.m_income < 30000){
                stat = "Denied";
            }
            else if(this.c_score < 650){
                stat = "Denied";
            }
            else if(exc > 500000){
                stat = "Denied";
            }
            else{
                stat = "Approved";
            }
            
           String income = frm.format(this.m_income);
           String exist = frm.format(this.exc);
           
            
            System.out.printf("| %-10d | %-10s | %-15s | %-15d | %-15s | %-10s | \n", this.ID, this.name, income, this. c_score, exist,  stat);
            
        }
    
}
