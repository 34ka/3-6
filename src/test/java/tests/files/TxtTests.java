package tests.files;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.File;


import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static utils.FileUtils.readStringFromFile;

public class TxtTests {

    @Test
    @Disabled(" // to do inspect download files")
    void verifyContentInTxtDownloadTest() {

        File file = new File("src/test/resources/html/index.html");
        String filePath = file.getAbsolutePath();
        file.getAbsolutePath();

        open(filePath);
        assertTrue(title().equals("QA.GURU examples"));

        //$("#zip").download();// to do inspect download files. Не работает скачивание из локале
    }

    @Test
    void verifyContentInTxtTest() {
//Класс, который помогает считывать в файле информацию вспомогательный класс для считывания FileUtils.java
        String expectedFileText = "hello from qa.guru";

        String actualFileText = readStringFromFile("src/test/resources/html/1.txt");
        System.out.println(actualFileText);

        assertTrue(actualFileText.contains(expectedFileText));
    }
}