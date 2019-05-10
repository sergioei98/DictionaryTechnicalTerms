/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package echeverry.isaza.sergio.dictionarytechnicalterms.classes.categories;

/**
 * It represents a category of a technical term.
 * @author Sergio Echeverry
 * @author Kevin Guerrero
 * @version 20190508
 * @since 1.0.0
 */
public class Category 
{
    /**
     * It represents the category's identifier.
     * @since 1.0.0
     */
    private String identifier;
    
    /**
     * It represents the category's subject.
     * @since 1.0.0
     */
    private String subject;

    /**
     * It creates a new category
     * @param subject the new category's subject
     * @since 1.0.0
     */
    public Category(String subject) 
    {
        this.setSubject(subject);
        
        switch(subject)
        {
            case "Sistemas Distribuidos":
                this.setIdentifier("1");
            break;
            
            case "Sistemas Embebidos":
                this.setIdentifier("2");
            break;
            
            case "Bases de Datos":
                this.setIdentifier("3");
            break;
            
            case "Redes":
                this.setIdentifier("4");
            break;
            
            case "Programación Orientada a Objetos":
                this.setIdentifier("5");
            break;
            
            case "Programación Móvil":
                this.setIdentifier("6");
            break;
            
            case "Programación Web":
                this.setIdentifier("7");
            break;
            
            default:
                this.setIdentifier("");
            break;
        }
    }

    /**
     * It gets the category's identifier.
     * @return the category's identifier.
     * @since 1.0.0
     */
    public String getIdentifier() 
    {
        return this.identifier;
    }

    /**
     * It defines or changes the category's identifier.
     * @param identifier the category's identifier.
     * @since 1.0.0
     */
    public void setIdentifier(String identifier) 
    {
        this.identifier = identifier;
    }

    /**
     * It gets the category's subject.
     * @return the category's subject.
     * @since 1.0.0
     */
    public String getSubject() 
    {
        return this.subject;
    }

    /**
     * It defines or changes the category's subject.
     * @param subject the category's subject.
     */
    public void setSubject(String subject) 
    {
        this.subject = subject;
    }
}