
package com.unitn.local_database;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.unitn.local_database package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.unitn.local_database
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UserData }
     * 
     */
    public UserData createUserData() {
        return new UserData();
    }

    /**
     * Create an instance of {@link MeasureData }
     * 
     */
    public MeasureData createMeasureData() {
        return new MeasureData();
    }

}
