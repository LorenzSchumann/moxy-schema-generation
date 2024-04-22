package pojos;

import javax.xml.bind.annotation.XmlElement;

public class Parent {
    @XmlElement
    private FirstChild firstChild;
    @XmlElement
    private SecondChild secondChild;
    @XmlElement
    private ThirdChild thirdChild;
}
