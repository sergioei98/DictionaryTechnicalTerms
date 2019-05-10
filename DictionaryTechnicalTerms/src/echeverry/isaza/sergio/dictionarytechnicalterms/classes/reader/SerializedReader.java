/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package echeverry.isaza.sergio.dictionarytechnicalterms.classes.reader;

import echeverry.isaza.sergio.dictionarytechnicalterms.classes.technicalterms.TechnicalTerm;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * It represents the dictionary's serialized reader.
 * @author Sergio Echeverry
 * @author Kevin Guerrero
 * @version 20190509
 * @since 1.0.0
 */
public class SerializedReader implements Reader
{
    /**
     * It loads a technical term.
     * @param fileName the file name which the technical term is located.
     * @return the loaded technical term.
     * @throws java.io.IOException
     * @throws java.lang.ClassNotFoundException
     * @since 1.0.0
     */
    @Override
    public TechnicalTerm read(String fileName) throws IOException, ClassNotFoundException
    {
        FileInputStream fis = new FileInputStream(fileName);
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        TechnicalTerm technicalTerm = (TechnicalTerm) ois.readObject();
        
        return technicalTerm;
    }
}