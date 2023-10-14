module com.example.advjavaanimeassignment01 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.advjavaanimeassignment01 to javafx.fxml;
    exports com.example.advjavaanimeassignment01;
}