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
 * Configuration to compare the double value of a field
 *
 * <p>Java class for XMLFieldLiteralDouble complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="XMLFieldLiteralDouble"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}XMLFieldLiteralBase"&gt;
 *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XMLFieldLiteralDouble")
public class XMLFieldLiteralDouble extends XMLFieldLiteralBase {

    @XmlAttribute(name = "value")
    protected Double value;

    /**
     * Gets the value of the value property.
     *
     * @return possible object is {@link Double }
     */
    public Double getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     *
     * @param value allowed object is {@link Double }
     */
    public void setValue(Double value) {
        this.value = value;
    }
}
