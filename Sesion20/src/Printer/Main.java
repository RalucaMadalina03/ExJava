package Printer;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Printer> printers = Arrays.asList(
                new DocumentPrinter(),
                new PhotoPrinter()
        );


        boolean hasDocumentPrinter = printers.stream()
                .anyMatch(printer -> printer instanceof DocumentPrinter);


        if (hasDocumentPrinter) {
            System.out.println("The list contains an instance of DocumentPrinter.");
        } else {
            System.out.println("The list does not contain any instance of DocumentPrinter.");
        }
    }
}


