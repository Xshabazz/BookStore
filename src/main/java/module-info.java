module com.example.bookstore {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml;
    requires java.sql;  // Add this line


    opens com.example.bookstore to javafx.fxml;
    exports com.example.bookstore;
}