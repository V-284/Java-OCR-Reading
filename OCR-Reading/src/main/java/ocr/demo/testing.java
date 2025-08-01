package ocr.demo;

import net.sourceforge.tess4j.TessAPI;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import org.springframework.stereotype.Component;

import java.io.File;
@Component
public class testing {

    String ocrReadin(){
            Tesseract tesseract = new Tesseract();
            try {
                tesseract.setDatapath("C:/Users/Vishnu Verma/Desktop/ocrtesseract/tesseract-ocr-tesseract-0995615/tessdata");

                // the path of your tess data folder
                // inside the extracted file
                String text
                        = tesseract.doOCR(new File("C:\\Users\\Vishnu Verma\\Desktop\\scc.jpg"));

                // path of your image file
                return text;
            }
            catch (TesseractException e) {
                e.printStackTrace();
                return null;

            }
        }

    }
