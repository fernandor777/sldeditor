//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.2.11
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: [TEXT REMOVED by maven-replacer-plugin]
//

package com.sldeditor.common.xml.ui;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * Configuration for a string field
 *
 * <p>Java class for XMLFieldConfigString complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="XMLFieldConfigString"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}XMLFieldConfigData"&gt;
 *       &lt;attribute name="buttonText" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XMLFieldConfigString")
public class XMLFieldConfigString extends XMLFieldConfigData {

    @XmlAttribute(name = "buttonText")
    protected String buttonText;

    /**
     * Gets the value of the buttonText property.
     *
     * @return possible object is {@link String }
     */
    public String getButtonText() {
        return buttonText;
    }

    /**
     * Sets the value of the buttonText property.
     *
     * @param value allowed object is {@link String }
     */
    public void setButtonText(String value) {
        this.buttonText = value;
    }
}
