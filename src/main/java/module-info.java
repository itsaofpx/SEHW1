module ku.cs.se {
    requires javafx.controls;
    requires javafx.fxml;


    opens ku.cs.se to javafx.fxml;
    exports ku.cs.se;
}