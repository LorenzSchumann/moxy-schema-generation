import org.eclipse.persistence.jaxb.JAXBContextFactory;
import org.eclipse.persistence.jaxb.JAXBContextProperties;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.SchemaOutputResolver;
import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;
import java.util.Map;

public class XsdGeneratorWithVersion2_7_13 {

    public static void main(String[] args) throws Exception {
        System.setProperty(JAXBContext.JAXB_CONTEXT_FACTORY, JAXBContextFactory.class.getName());
        Map<String, Object> props = Map.of(
                JAXBContextProperties.BEAN_VALIDATION_FACETS, true
        );
        JAXBContext jc = JAXBContext.newInstance(new Class[]{pojos.Parent.class}, props);
        jc.generateSchema(new SchemaOutputResolver() {
            @Override
            public Result createOutput(String namespaceURI, String suggestedFileName) {
                return new StreamResult("version_2.7.13.xsd");
            }
        });
    }
}
