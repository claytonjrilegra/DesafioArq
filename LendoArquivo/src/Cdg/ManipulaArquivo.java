/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cdg;

import java.io.*;
import java.util.*;

/**
 *
 * @author LENOVO
 */
public class ManipulaArquivo {
    
    public ManipulaArquivo(){
        
    }
    
    public void LeArquivo(String CaminhoArquivo) throws Exception{
        //CaminhoArquivo = "src\\Cdg\\vendas.txt";
        
        
        try {
            
             FileReader arquivo = new FileReader(CaminhoArquivo);
             BufferedReader le = new BufferedReader(arquivo);
             
             
             ArrayList<Vendedor> GuardaVend = new ArrayList();
             String [] temp = new String[3];
             
             String leLinha = le.readLine();
             
             while(leLinha != null){
            
                temp = leLinha.split(";");
                
                Vendedor ListaVendas = new Vendedor(temp[0], temp[1], Integer.parseInt(temp[2]));
                
                GuardaVend.add(ListaVendas);
                
                leLinha = le.readLine();
            
         }
            Map<String, Integer> map = new HashMap<String, Integer>();

            for (Vendedor vend: GuardaVend) {

                Integer aux = map.get(vend.getNome());

                if(aux == null){
                    map.put(vend.getNome(), vend.getValor());
                } else {
                    map.put(vend.getNome(), aux + vend.getValor());
                }
            }

        int maior = 0;
        String nome = null;
        for (Vendedor vend: GuardaVend) {


            if(map.get(vend.getNome()) > maior){
                maior = map.get(vend.getNome());
                nome = vend.getNome();
            }
        }

        System.out.println("O maior vendedor foi " +  nome + " com " + maior);


        le.close();
                
             
             
             
        } catch (Exception e) {
           System.out.println(e);
           throw e;
        }
        
    
        
    }
    
    
    

    
}
