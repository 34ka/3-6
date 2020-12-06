package tests.files;

import com.codeborne.xlstest.XLS;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static utils.FileUtils.readXlsxFromFile;


public class XlsAndXlsxTests {

    @Test
    void verifyContentInXlsAndXlsxTest() {
//Класс, который помогает считывать в файле информацию вспомогательный класс для считывания FileUtils.java
        String actualFilePath = "src/test/resources/html/1.xlsx"; //работает и с рашрирением xls и xlsx, просто поменять расширение файла в этом пути. Этот вариант Солнцева
        String expectedFileText = "Пока";

        File actualFile = new File(actualFilePath);
        XLS xls = new XLS(actualFile);

        assertThat(xls, XLS.containsText(expectedFileText));
    }

    @Test
    void verifyContentInXlsxTest() {
//Класс, который помогает считывать в файле информацию вспомогательный класс для считывания FileUtils.java
        String actualFilePath = "src/test/resources/html/1.xlsx"; //работает и с рашрирением xlsx. Этот Вариант Стаса
        String expectedFileText = "Пока";

        String actualFileText = readXlsxFromFile(actualFilePath);
        System.out.println(actualFileText);

        assertTrue(actualFileText.contains(expectedFileText));
    }
}