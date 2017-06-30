/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solemne3_katherinenussbaum;

import solemne3_katherinenussbaum.repositorio.*;

/**
 *
 * @author knussbaum
 */
public class Solemne3_KatherineNussbaum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("===== HashSet =====");
        NotebookSet notebookSet = new NotebookSet();
        notebookSet.listarNotebooks();
        
        System.out.println("===== ArrayList =====");
        NotebookList notebookList = new NotebookList();
        notebookList.listarNotebooks();
        
        System.out.println("===== TreeMap =====");
        NotebookTree notebookTree = new NotebookTree();
        notebookTree.listarNotebooks();
        
        System.out.println("===== HashMap =====");
        NotebookHashMap notebookHashMap = new NotebookHashMap();
        notebookHashMap.listarNotebooks();
    }
    
}