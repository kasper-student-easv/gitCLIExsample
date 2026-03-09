module dk.easv.gitcli {
    requires javafx.controls;
    requires javafx.fxml;


    opens dk.easv.gitcli to javafx.fxml;
    exports dk.easv.gitcli;
}