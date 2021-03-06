/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solemne3_katherinenussbaum.repositorio;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import solemne3_katherinenussbaum.clases.Notebook;


/**
 *
 * @author knussbaum
 */
public class NotebookHashMap {
   
    static HashMap<Integer, Notebook> listaNotebook;
    
    Notebook n1 = new Notebook(1,"2 GB","Intel Celeron","500 GB", 159990,"14 pulgadas", 1750);
    Notebook n2 = new Notebook(2,"4 GB","Intel Celeron N3050","500 GB", 199990,"14 pulgadas", 1800);
    Notebook n3 = new Notebook(3,"4 GB","Intel Core i3","500 GB", 2999990,"14 pulgadas", 1730);
    Notebook n4 = new Notebook(4,"4 GB","Intel Core I3","1 TB", 399990,"15,6 pulgadas", 1900);

    public NotebookHashMap() {
        listaNotebook = new HashMap<Integer, Notebook>();
        listaNotebook.put(1, n1);
        listaNotebook.put(2, n2);
        listaNotebook.put(3, n3);
        listaNotebook.put(4, n4);
    }
    
    public void agregarNotebook(Integer num, Notebook notebook){
        listaNotebook.put(num, notebook);
    }
    
    public void listarNotebooks()
    {
        for (Integer key : listaNotebook.keySet()) {
            System.out.println(listaNotebook.get(key));
        }
    }
}
