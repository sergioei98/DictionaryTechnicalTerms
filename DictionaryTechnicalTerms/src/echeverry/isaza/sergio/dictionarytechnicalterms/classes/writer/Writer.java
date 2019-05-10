/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package echeverry.isaza.sergio.dictionarytechnicalterms.classes.writer;

import echeverry.isaza.sergio.dictionarytechnicalterms.classes.technicalterms.TechnicalTerm;
import java.io.IOException;

/**
 * It represents the dictionary's writer.
 * @author Sergio Echeverry
 * @author Kevin Guerrero
 * @version 20190509
 * @since 1.0.0
 */
public interface Writer 
{
    /**
     * It allows to save a technical term.
     * @param technicalTerm the technical term.
     * @param fileName the file name which the technical term will be saved.
     * @throws java.io.IOException
     * @since 1.0.0
     */
    public void write(TechnicalTerm technicalTerm, String fileName) throws IOException;
}