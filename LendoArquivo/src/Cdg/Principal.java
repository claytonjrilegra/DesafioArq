/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cdg;

/**
 *
 * @author ClaytonJr
 */
public class Principal {
    
    public static void main(String[]args) throws Exception{
        
        String caminho = "src\\Cdg\\vendas.txt";
        ManipulaArquivo c = new ManipulaArquivo();
        
        c.LeArquivo(caminho);
                
    }
    
    
}
