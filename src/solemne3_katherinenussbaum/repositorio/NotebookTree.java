/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solemne3_katherinenussbaum.repositorio;
import java.util.Iterator;
import java.util.TreeSet;
import solemne3_katherinenussbaum.clases.Notebook;
/**
 *
 * @author knussbaum
 */
public class NotebookTree {
    
    Notebook n1 = new Notebook(1,"2 GB","Intel Celeron","500 GB", 159990,"14 pulgadas", 1750);
    Notebook n2 = new Notebook(2,"4 GB","Intel Celeron N3050","500 GB", 199990,"14 pulgadas", 1800);
    Notebook n3 = new Notebook(3,"4 GB","Intel Core i3","500 GB", 2999990,"14 pulgadas", 1730);
    Notebook n4 = new Notebook(4,"4 GB","Intel Core I3","1 TB", 399990,"15,6 pulgadas", 1900);
    
    TreeSet<Notebook> listaNotebook;
        
    private NotebookTree()
    {
        this.listaNotebook = new TreeSet();
        listaNotebook.add(n1);
        listaNotebook.add(n2);
        listaNotebook.add(n3);
        listaNotebook.add(n4);
    }
             
    public void agregarNotebook(Notebook notebook){
        listaNotebook.add(notebook);
    }
    
    public void listarNotebooks(){
        Iterator i = listaNotebook.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
