package org.patterns.structural.decorator;

public class Demo {
    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";

        CompressionDecorator encoded =
                new CompressionDecorator(
                        new EncryptionDecorator(
                                new FileDataSource("src/main/java/org/patterns/structural/decorator/OutputDemo.txt")
                        )
                );

        encoded.writeData(salaryRecords);

        DataSource plain = new FileDataSource("src/main/java/org/patterns/structural/decorator/OutputDemo.txt");
        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }

}
