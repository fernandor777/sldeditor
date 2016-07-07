//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: [TEXT REMOVED by maven-replacer-plugin]
//


package com.sldeditor.common.xml.ui;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Defines how a group is configured
 *             
 * 
 * <p>Java class for XMLGroupConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XMLGroupConfig"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}XMLGroupConfigData"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="FieldConfigSymbolType" type="{}XMLFieldConfigSymbolType"/&gt;
 *         &lt;element name="FieldConfigDouble" type="{}XMLFieldConfigDouble"/&gt;
 *         &lt;element name="FieldConfigEnum" type="{}XMLFieldConfigEnum"/&gt;
 *         &lt;element name="FieldConfigString" type="{}XMLFieldConfigString"/&gt;
 *         &lt;element name="FieldConfigFunction" type="{}XMLFieldConfigFunction"/&gt;
 *         &lt;element name="FieldConfigSlider" type="{}XMLFieldConfigSlider"/&gt;
 *         &lt;element name="FieldConfigColour" type="{}XMLFieldConfigColour"/&gt;
 *         &lt;element name="FieldConfigFont" type="{}XMLFieldConfigFont"/&gt;
 *         &lt;element name="FieldConfigFontPreview" type="{}XMLFieldConfigFontPreview"/&gt;
 *         &lt;element name="FieldConfigBoolean" type="{}XMLFieldConfigBoolean"/&gt;
 *         &lt;element name="FieldConfigGeometry" type="{}XMLFieldConfigGeometry"/&gt;
 *         &lt;element name="FieldConfigColourMap" type="{}XMLFieldConfigColourMap"/&gt;
 *         &lt;element name="FieldConfigTransformation" type="{}XMLFieldConfigTransformation"/&gt;
 *         &lt;element name="FieldConfigInteger" type="{}XMLFieldConfigInteger"/&gt;
 *         &lt;element name="Group" type="{}XMLGroupConfig"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XMLGroupConfig", propOrder = {
    "fieldList"
})
public class XMLGroupConfig
    extends XMLGroupConfigData
{

    @XmlElements({
        @XmlElement(name = "FieldConfigSymbolType", type = XMLFieldConfigSymbolType.class),
        @XmlElement(name = "FieldConfigDouble", type = XMLFieldConfigDouble.class),
        @XmlElement(name = "FieldConfigEnum", type = XMLFieldConfigEnum.class),
        @XmlElement(name = "FieldConfigString", type = XMLFieldConfigString.class),
        @XmlElement(name = "FieldConfigFunction", type = XMLFieldConfigFunction.class),
        @XmlElement(name = "FieldConfigSlider", type = XMLFieldConfigSlider.class),
        @XmlElement(name = "FieldConfigColour", type = XMLFieldConfigColour.class),
        @XmlElement(name = "FieldConfigFont", type = XMLFieldConfigFont.class),
        @XmlElement(name = "FieldConfigFontPreview", type = XMLFieldConfigFontPreview.class),
        @XmlElement(name = "FieldConfigBoolean", type = XMLFieldConfigBoolean.class),
        @XmlElement(name = "FieldConfigGeometry", type = XMLFieldConfigGeometry.class),
        @XmlElement(name = "FieldConfigColourMap", type = XMLFieldConfigColourMap.class),
        @XmlElement(name = "FieldConfigTransformation", type = XMLFieldConfigTransformation.class),
        @XmlElement(name = "FieldConfigInteger", type = XMLFieldConfigInteger.class),
        @XmlElement(name = "Group", type = XMLGroupConfig.class)
    })
    protected List<Object> fieldList;

    /**
     * Gets the value of the fieldList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLFieldConfigSymbolType }
     * {@link XMLFieldConfigDouble }
     * {@link XMLFieldConfigEnum }
     * {@link XMLFieldConfigString }
     * {@link XMLFieldConfigFunction }
     * {@link XMLFieldConfigSlider }
     * {@link XMLFieldConfigColour }
     * {@link XMLFieldConfigFont }
     * {@link XMLFieldConfigFontPreview }
     * {@link XMLFieldConfigBoolean }
     * {@link XMLFieldConfigGeometry }
     * {@link XMLFieldConfigColourMap }
     * {@link XMLFieldConfigTransformation }
     * {@link XMLFieldConfigInteger }
     * {@link XMLGroupConfig }
     * 
     * 
     */
    public List<Object> getFieldList() {
        if (fieldList == null) {
            fieldList = new ArrayList<Object>();
        }
        return this.fieldList;
    }

}