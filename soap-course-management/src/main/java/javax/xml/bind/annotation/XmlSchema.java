package javax.xml.bind.annotation;

import jakarta.xml.bind.annotation.XmlNsForm;

public @interface XmlSchema {

	XmlNsForm elementFormDefault();

	String namespace();

}
