/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gishan-mac
 */
public class PythogorusMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int i[]=new int[100];
        int j[]=new int[100];
        int k[]=new int[100];
        
        for (int l = 0; l < i.length; l++) {
             i[l]=(l+1)*(l+1);
             for (int m = 0; m <l; m++) {
                 j[m]=(m+1)*(m+1);
                 for (int n = 0; n < m; n++) {
                     k[n]=(n+1)*(n+1);
                     if(i[l]==j[m]+k[n]){
                         System.out.println("i = "+(l+1)+"\t\tj = "+(m+1)+"\t\tk = "+(n+1));
                         System.out.println("i2 = "+i[l]+"\t\tj2 = "+j[m]+"\t\tk2 = "+k[n]);
                         System.out.println();break;
                         
                     }
                     
                 }
                
            }
            
        }
        
        
    }
    
}
