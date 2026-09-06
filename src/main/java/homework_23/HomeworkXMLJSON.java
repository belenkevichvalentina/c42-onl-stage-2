package homework_23;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

public class HomeworkXMLJSON {
    public static void main(String[] args) throws ParserConfigurationException {
        /*Задача 1:
    Написать программу для парсинга xml документа. Необходимо распарсить xml документ и
    содержимое тегов line записать в другой документ. Название файла для записи должно
    состоять из значений тегов и имеет вид: <firstName>_<lastName>_<title>.txt
    Xml документ:
    <?xml version="1.0"?>
    <sonnet type="Shakespearean">
    <author>
    <lastName>Shakespeare</lastName>
    <firstName>William</firstName>
    <nationality>British</nationality>
    <yearOfBirth>1564</yearOfBirth>
    <yearOfDeath>1616</yearOfDeath>
    </author>
    <title>Sonnet_130</title>
    <lines>
    <line>My mistress' eyes are nothing like the sun,</line>

Задача *:
Дополнительно реализовать следующий функционал: если с консоли введено значение 1
- распарсить документ с помощью SAX, если с консоли введено значение 2 - распарсить
документ с помощью DOM*/
        parseSonnet();
    }
public static void parseSonnet() throws ParserConfigurationException {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse("sonnet_130.xml");
            document.getDocumentElement().normalize();

            NodeList firstNameNodeList = document.getElementsByTagName("firstName");
            Node firstName = firstNameNodeList.item(0);
            String sFirstName = firstName.getTextContent();
            System.out.println("Имя - " + sFirstName);

            NodeList lastNameNodeList = document.getElementsByTagName("lastName");
            Node lastName = lastNameNodeList.item(0);
            String sLastName = lastName.getTextContent();
            System.out.println("Фамилия - " + sLastName);

            NodeList titleNodeList = document.getElementsByTagName("title");
            Node title = titleNodeList.item(0);
            String sTitle = title.getTextContent();
            System.out.println("Название - " + sTitle);

            NodeList lineNodeList = document.getElementsByTagName("line");
            ArrayList<String> sLine = new ArrayList<>();
            for (int i = 0; i < lineNodeList.getLength(); i++) {
                String oneLine = lineNodeList.item(i).getTextContent();
                sLine.add(oneLine);
            }
            System.out.println("Число строк " + lineNodeList.getLength());

            String fileName = sFirstName + "_" + sLastName + "_" + sTitle + ".txt";
            System.out.println("Название файла - " + fileName);
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))){
                for (int i = 0; i < sLine.size(); i++) {
                    writer.write(sLine.get(i));
                    writer.newLine();
                }
            }
            System.out.println("Файл создан " + fileName);


        } catch (Exception e) {
            System.out.println("Ошибка парсинга - " + e.getMessage());
            e.printStackTrace();
        }

}

}
