/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cdg;

import java.io.FileNotFoundException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author LENOVO
 */
public class ManipulaArquivoTest {
    
    
   
    
    

    @Test(expected = FileNotFoundException.class)
    public void testTryLeArquivo() throws Exception {
        
        String a= "src\\a\\Cdg\\vendas.txt";
       
        ManipulaArquivo ma = new ManipulaArquivo();
        
        
        ma.LeArquivo(a);
        
       
    }
    
}
