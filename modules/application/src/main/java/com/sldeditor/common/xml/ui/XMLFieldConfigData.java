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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 * Common field configuration
 *
 * <p>Java class for XMLFieldConfigData complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="XMLFieldConfigData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="id" use="required" type="{}FieldIdEnum" /&gt;
 *       &lt;attribute name="label" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="valueOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="default" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="multipleValues" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="suppressUpdateOnSet" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XMLFieldConfigData")
@XmlSeeAlso({
    XMLFieldConfigEnum.class,
    XMLFieldConfigSymbolType.class,
    XMLFieldConfigSortBy.class,
    XMLFieldConfigDSProperties.class,
    XMLFieldConfigDouble.class,
    XMLFieldConfigColourMap.class,
    XMLFieldConfigTransformation.class,
    XMLFieldConfigInlineFeature.class,
    XMLFieldConfigFeatureTypeConstraint.class,
    XMLFieldConfigMapUnit.class,
    XMLFieldConfigString.class,
    XMLFieldConfigGeometryField.class,
    XMLFieldConfigFont.class,
    XMLFieldConfigFontPreview.class,
    XMLFieldConfigGeometry.class,
    XMLFieldConfigSlider.class,
    XMLFieldConfigColour.class,
    XMLFieldConfigBoolean.class,
    XMLFieldConfigInteger.class
})
public class XMLFieldConfigData {

    @XmlAttribute(name = "id", required = true)
    protected FieldIdEnum id;

    @XmlAttribute(name = "label")
    protected String label;

    @XmlAttribute(name = "valueOnly")
    protected Boolean valueOnly;

    @XmlAttribute(name = "default")
    protected String _default;

    @XmlAttribute(name = "multipleValues")
    protected Boolean multipleValues;

    @XmlAttribute(name = "suppressUpdateOnSet")
    protected Boolean suppressUpdateOnSet;

    /**
     * Gets the value of the id property.
     *
     * @return possible object is {@link FieldIdEnum }
     */
    public FieldIdEnum getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value allowed object is {@link FieldIdEnum }
     */
    public void setId(FieldIdEnum value) {
        this.id = value;
    }

    /**
     * Gets the value of the label property.
     *
     * @return possible object is {@link String }
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     *
     * @param value allowed object is {@link String }
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the valueOnly property. This getter has been renamed from isValueOnly() to
     * getValueOnly() by cxf-xjc-boolean plugin.
     *
     * @return possible object is {@link Boolean }
     */
    public boolean getValueOnly() {
        if (valueOnly == null) {
            return false;
        } else {
            return valueOnly;
        }
    }

    /**
     * Sets the value of the valueOnly property.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setValueOnly(Boolean value) {
        this.valueOnly = value;
    }

    /**
     * Gets the value of the default property.
     *
     * @return possible object is {@link String }
     */
    public String getDefault() {
        return _default;
    }

    /**
     * Sets the value of the default property.
     *
     * @param value allowed object is {@link String }
     */
    public void setDefault(String value) {
        this._default = value;
    }

    /**
     * Gets the value of the multipleValues property. This getter has been renamed from
     * isMultipleValues() to getMultipleValues() by cxf-xjc-boolean plugin.
     *
     * @return possible object is {@link Boolean }
     */
    public boolean getMultipleValues() {
        if (multipleValues == null) {
            return false;
        } else {
            return multipleValues;
        }
    }

    /**
     * Sets the value of the multipleValues property.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setMultipleValues(Boolean value) {
        this.multipleValues = value;
    }

    /**
     * Gets the value of the suppressUpdateOnSet property. This getter has been renamed from
     * isSuppressUpdateOnSet() to getSuppressUpdateOnSet() by cxf-xjc-boolean plugin.
     *
     * @return possible object is {@link Boolean }
     */
    public boolean getSuppressUpdateOnSet() {
        if (suppressUpdateOnSet == null) {
            return false;
        } else {
            return suppressUpdateOnSet;
        }
    }

    /**
     * Sets the value of the suppressUpdateOnSet property.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setSuppressUpdateOnSet(Boolean value) {
        this.suppressUpdateOnSet = value;
    }
}
