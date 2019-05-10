/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package echeverry.isaza.sergio.dictionarytechnicalterms.classes.dictionary;

import echeverry.isaza.sergio.dictionarytechnicalterms.classes.categories.Category;
import echeverry.isaza.sergio.dictionarytechnicalterms.classes.reader.Reader;
import echeverry.isaza.sergio.dictionarytechnicalterms.classes.reader.SerializedReader;
import echeverry.isaza.sergio.dictionarytechnicalterms.classes.technicalterms.TechnicalTerm;
import echeverry.isaza.sergio.dictionarytechnicalterms.classes.writer.SerializedWriter;
import echeverry.isaza.sergio.dictionarytechnicalterms.classes.writer.Writer;
import java.io.IOException;
import java.util.ArrayList;

/**
 * It represents the dictionary of technical terms.
 * @author Sergio Echeverry
 * @author Kevin Guerrero
 * @version 20190509
 * @since 1.0.0
 */
public class Dictionary 
{
    /**
     * It represents the technical terms that the dictionary has.
     * @since 1.0.0
     */
    private ArrayList<TechnicalTerm> technicalTerms;
    
    /**
     * It represents the dictionary's reader.
     * @since 1.0.0
     */
    private Reader reader;
    
    /**
     * It represents the dictionary's writer.
     * @since 1.0.0
     */
    private Writer writer;

    /**
     * It creates a new dictionary.
     * @since 1.0.0
     */
    public Dictionary() 
    {
        this.technicalTerms = new ArrayList<TechnicalTerm>();
        this.reader = new SerializedReader();
        this.writer = new SerializedWriter();
    }
    
    /**
     * It adds a technical term to the dictionary.
     * @param technicalTerm the technical term
     * @since 1.0.0
     */
    public void addTechnicalTerm(TechnicalTerm technicalTerm)
    {
        this.technicalTerms.add(technicalTerm);
    }
    
    /**
     * It searches for a technical term in the dictionary.
     * @param expression the technical term's word.
     * @return the technical term.
     * @since 1.0.0
     */
    public TechnicalTerm searchTechnicalTerm(String expression)
    {
        TechnicalTerm technicalTerm = null;
        
        for(int i=0; i<this.technicalTerms.size(); i++)
        {
            if(expression.equals(this.technicalTerms.get(i).getExpression()))
            {
                technicalTerm = this.technicalTerms.get(i);
                break;
            }
        }
        
        return technicalTerm;
    }
    
    /**
     * It removes a technical term from the dictionary.
     * @param expression the technical term's word
     * @return true: the technical term has been removed
     *         false: the technical term has not been removed
     * @since 1.0.0
     */
    public boolean removeTechnicalTerm(String expression)
    {
        boolean removed = false;
        
        TechnicalTerm technicalTerm = this.searchTechnicalTerm(expression);
        
        if(technicalTerm != null)
        {
            removed = this.technicalTerms.remove(technicalTerm);
        }
        
        return removed;
    }

    /**
     * It gets the dictionary's technical terms.
     * @return the dictionary's technical terms.
     * @since 1.0.0
     */
    public ArrayList<TechnicalTerm> getTechnicalTerms() 
    {
        return this.technicalTerms;
    }
    
    /**
     * It adds a meaning to a technical term.
     * @param expression the technical term's word
     * @param meaning the new meaning.
     * @return true: the meaning has been added
     *         false: the meaning has not been added
     * @since 1.0.0
     */
    public boolean addMeaning(String expression, String meaning)
    {
        boolean added = false;
        
        TechnicalTerm technicalTerm = this.searchTechnicalTerm(expression);
        
        if(technicalTerm != null)
        {
            technicalTerm.addMeaning(meaning);
            added = true;
        }
        
        return added;
    }
    
    /**
     * It removes a meaning from a technical term.
     * @param expression the technical term's word
     * @param meaning the meaning
     * @return true: the meaning has been removed
     *         false: the meaning has not been removed
     */
    public boolean removeMeaning(String expression, String meaning)
    {
        boolean removed = false;
        
        TechnicalTerm technicalTerm = this.searchTechnicalTerm(expression);
        
        if(technicalTerm != null)
        {
            removed = technicalTerm.removeMeaning(meaning);
        }
        
        return removed;
    }
    
    /**
     * It adds a new category to a technical term.
     * @param expression the technical term's word
     * @param category the new category
     * @return true: the category has been added
     *         false: the category has not been added
     * @since 1.0.0
     */
    public boolean addCategory(String expression, Category category)
    {
        boolean added = false;
        
        TechnicalTerm technicalTerm = this.searchTechnicalTerm(expression);
        
        if(technicalTerm != null)
        {
            technicalTerm.addCategory(category);
            added = true;
        }
        
        return added;
    }
    
    /**
     * It searches a category of a technical term.
     * @param expression the technical term's word
     * @param subject the category's subject
     * @return the category
     * @since 1.0.0
     */
    public Category searchCategory(String expression, String subject)
    {
        Category category = null;
        
        TechnicalTerm technicalTerm = this.searchTechnicalTerm(expression);
        
        if(technicalTerm != null)
        {
            category = technicalTerm.searchCategory(subject);
        }
        
        return category;
    }
    
    /**
     * It removes a category from a technical term.
     * @param expression the technical term's word
     * @param subject the category's subject
     * @return true: the category has been removed
     *         false: the category has not been removed
     * @since 1.0.0
     */
    public boolean removeCategory(String expression, String subject)
    {
        boolean removed = false;
        
        TechnicalTerm technicalTerm = this.searchTechnicalTerm(expression);
        
        if(technicalTerm != null)
        {
            removed = technicalTerm.removeCategory(subject);
        }
        
        return removed;
    }
    
    /**
     * It allows to save a technical term.
     * @param technicalTerm the technical term.
     * @param fileName the file name which the technical term will be saved.
     * @throws java.io.IOException
     * @since 1.0.0
     */
    public void write(TechnicalTerm technicalTerm, String fileName) throws IOException
    {
        if(this.writer != null)
        {
            this.writer.write(technicalTerm, fileName);
        }
    }
    
    /**
     * It loads a technical term.
     * @param fileName the file name which the technical term is located.
     * @return the loaded technical term.
     * @throws java.io.IOException
     * @throws java.lang.ClassNotFoundException
     * @since 1.0.0
     */
    public TechnicalTerm read(String fileName) throws IOException, ClassNotFoundException
    {
        TechnicalTerm technicalTerm = null;
        
        if(this.reader != null)
        {
            technicalTerm = this.reader.read(fileName);
        }
        
        return technicalTerm;
    }
}