package byrage.extractor;

import byrage.extractor.service.DataSetExtractor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {

        DataSetExtractor extractor = new DataSetExtractor();

        boolean isSuccess = extractor.run();
        if (isSuccess) {
            log.info("XmlDataSet file is created.");
        }
    }
}
