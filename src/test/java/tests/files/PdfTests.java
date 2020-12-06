package tests.files;

import com.codeborne.pdftest.PDF;
import org.junit.jupiter.api.Test;
import utils.ZipUtils;

import java.io.File;
import java.io.IOException;

import static com.codeborne.selenide.Selenide.sleep;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static utils.FileUtils.readStringFromFile;


public class PdfTests {

    @Test
    void verifyContentInPdfTest() throws IOException {
//Класс, который помогает считывать в файле информацию вспомогательный класс для считывания FileUtils.java
        String actualFilePath = "src/test/resources/html/1.pdf";
        String expectedFileText = "Центральная тема";

        File actualFile = new File(actualFilePath);
        PDF pdf = new PDF(actualFile);

        assertThat(pdf, PDF.containsText(expectedFileText));

    }
}