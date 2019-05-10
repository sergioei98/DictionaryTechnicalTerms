/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package echeverry.isaza.sergio.dictionarytechnicalterms.classes.technicalterms;

import echeverry.isaza.sergio.dictionarytechnicalterms.classes.categories.Category;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * It represents a technical term of the dictionary.
 * @author Sergio Echeverry
 * @author Kevin Guerrero
 * @version 20190508
 * @since 1.0.0
 */
public class TechnicalTerm implements Serializable
{
    /**
     * It represents the technical term's word.
     * @since 1.0.0
     */
    private String expression;
    
    /**
     * It represents the meanings that the technical term has.
     * @since 1.0.0
     */
    private ArrayList<String> meanings;
    
    /**
     * It represents the categories that the technical term has.
     * @since 1.0.0
     */
    private ArrayList<Category> categories;

    /**
     * It creates a new technical term.
     * @param expression the technical term's word.
     * @since 1.0.0
     */
    public TechnicalTerm(String expression) 
    {
        this.setExpression(expression);
        this.meanings = new ArrayList<String>();
        this.categories = new ArrayList<Category>();
    }
    
    /**
     * It gets the technical term's word.
     * @return the technical term's word.
     * @since 1.0.0
     */
    public String getExpression() 
    {
        return this.expression;
    }

    /**
     * It defines or changes the technical term's word.
     * @param expression the technical term's word.
     */
    public void setExpression(String expression) 
    {
        this.expression = expression;
    }
    
    /**
     * It adds a new meaning to the technical term.
     * @param meaning the new meaning.
     */
    public void addMeaning(String meaning)
    {
        this.meanings.add(meaning);
    }
    
    /**
     * It removes a meaning from the technical term.
     * @param meaning the meaning.
     * @return true: the meaning has been removed.
     *         false: the meaning has not been removed.
     * @since 1.0.0
     */
    public boolean removeMeaning(String meaning)
    {
        boolean removed = false;
        
        if(this.meanings.contains(meaning))
        {
            this.meanings.remove(meaning);
            removed = true;
        }
        
        return removed;
    }

    /**
     * It gets the technical term's meanings.
     * @return the technical term's meanings.
     * @since 1.0.0
     */
    public ArrayList<String> getMeanings() 
    {
        return this.meanings;
    }

    /**
     * It adds a new category to the technical term.
     * @param category the new category.
     * @since 1.0.0
     */
    public void addCategory(Category category)
    {
        this.categories.add(category);
    }
    
    /**
     * It searchs a category in the technical term's categories list.
     * @param subject the category's subject.
     * @return the category.
     * @since 1.0.0
     */
    public Category searchCategory(String subject)
    {
        Category category = null;
        
        for(int i=0; i<this.categories.size(); i++)
        {
            if(subject.equals(this.categories.get(i).getSubject()))
            {
                category = this.categories.get(i);
                break;
            }
        }
        
        return category;
    }
    
    /**
     * It removes a category from the technical term's categories list.
     * @param subject the category's subject.
     * @return true: the category has been removed.
     *         false: the category has not been removed.
     * @since 1.0.0
     */
    public boolean removeCategory(String subject)
    {
        boolean removed = false;
        
        Category category = this.searchCategory(subject);
        
        if(category != null)
        {
            this.categories.remove(category);
            removed = true;
        }
        
        return removed;
    }
    
    /**
     * It gets the technical term's categories.
     * @return the technical term's categories.
     * @since 1.0.0
     */
    public ArrayList<Category> getCategories() 
    {
        return this.categories;
    }
}