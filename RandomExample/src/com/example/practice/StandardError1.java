package com.example.practice;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

//Compiled from StandardError.java (version 1.5 : 49.0, super bit)
@XmlRootElement
public class StandardError1 {

    // Field descriptor #15 J
	@XmlElement
	protected long code;

    // Field descriptor #17 Ljava/lang/String;
    @XmlElement
    protected String category;

    // Field descriptor #17 Ljava/lang/String;
    @XmlElement
    protected String severity;

    // Field descriptor #24 Ljava/util/List;
    // Signature: Ljava/util/List<Ljava/lang/String;>;
    @XmlElement
    protected List<String> description;

    // Field descriptor #17 Ljava/lang/String;
    @XmlElement
    protected String environment;

    // Field descriptor #17 Ljava/lang/String;
    @XmlElement
    protected String correlationId;

    @Override
	public String toString() {
		return "StandardError1 [code=" + code + ", category=" + category
				+ ", severity=" + severity + ", description=" + description.toString()
				+ ", environment=" + environment + ", correlationId="
				+ correlationId + "]";
	}
}