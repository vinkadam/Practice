package com.example.practice;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;
import javax.xml.transform.stream.StreamSource;

public class Demo {

	public static void main(String[] args) throws Exception {
		XMLInputFactory xif = XMLInputFactory.newFactory();
		StreamSource xml = new StreamSource("StandardError.xml");
		XMLStreamReader xsr = xif.createXMLStreamReader(xml);

		List<StandardError1> responses1 = new ArrayList<StandardError1>();
		
		List<StandardError2> responses2 = new ArrayList<StandardError2>();

		while(xsr.hasNext()) {
			if(xsr.isStartElement() && xsr.getLocalName().equals("StandardError1")) {
				getStandardError1(xsr, responses1);
			}
			if(xsr.isStartElement() && xsr.getLocalName().equals("StandardError2")) {
				getStandardError2(xsr, responses2);
			}
			xsr.next();
		}

		for (StandardError1 standardError1 : responses1) {

			System.out.println(standardError1.toString()+"\n");
		}
		
		for (StandardError2 standardError2 : responses2) {

			System.out.println(standardError2.toString()+"\n");
		}

		xsr.close();
	}

	private static void getStandardError1(XMLStreamReader xsr, List<StandardError1> responses)
			throws JAXBException {
		JAXBContext jc = JAXBContext.newInstance(StandardError1.class);
		Unmarshaller unmarshaller = jc.createUnmarshaller();
		JAXBElement<StandardError1> jb = unmarshaller.unmarshal(xsr, StandardError1.class);

		responses.add(jb.getValue());


		/*Marshaller marshaller = jc.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(jb, System.out);*/
	}

	private static void getStandardError2(XMLStreamReader xsr, List<StandardError2> responses2)
			throws JAXBException {
		JAXBContext jc = JAXBContext.newInstance(StandardError2.class);
		Unmarshaller unmarshaller = jc.createUnmarshaller();
		JAXBElement<StandardError2> jb = unmarshaller.unmarshal(xsr, StandardError2.class);
		
		responses2.add(jb.getValue());

		/*Marshaller marshaller = jc.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(jb, System.out);*/
	}

}