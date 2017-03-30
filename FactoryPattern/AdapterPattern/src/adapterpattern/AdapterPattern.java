/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterpattern;

/**
 *
 * @author TIENIT
 */
public class AdapterPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        AceClass aceObject = new AceClass();
        aceObject.setName("Nguyen Tien");
        
        AceToAcmeAdapter adapter = new AceToAcmeAdapter(aceObject);
        
        System.out.println("Customer's first name: " + adapter.getFirstName());
        System.out.println("Customer's last name: " + adapter.getLastName());
         
    }
    
}
