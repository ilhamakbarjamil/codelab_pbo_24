package com.myapp;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LoginView {
    public void start(Stage stage) {
        // Membuat layout grid
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);
        grid.setHgap(10);

        // Menambahkan judul
        Text sceneTitle = new Text("Halaman Login");
        sceneTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        GridPane.setConstraints(sceneTitle, 0, 0, 2, 1);
        grid.getChildren().add(sceneTitle);

        // Label dan text field untuk username
        Label usernameLabel = new Label("User Name:");
        GridPane.setConstraints(usernameLabel, 0, 1);
        TextField usernameInput = new TextField();
        GridPane.setConstraints(usernameInput, 1, 1);

        // Label dan text field untuk password
        Label passwordLabel = new Label("Password:");
        GridPane.setConstraints(passwordLabel, 0, 2);
        PasswordField passwordInput = new PasswordField();
        GridPane.setConstraints(passwordInput, 1, 2);

        // Tombol login
        Button loginButton = new Button("Sign in");
        GridPane.setConstraints(loginButton, 1, 3);

        // Pesan status login
        Label loginStatus = new Label();
        loginStatus.setStyle("-fx-text-fill: red;");
        GridPane.setConstraints(loginStatus, 1, 4);

        // Menambahkan semua elemen ke grid
        grid.getChildren().addAll(usernameLabel, usernameInput, passwordLabel, passwordInput, loginButton, loginStatus);

        // Action pada tombol login
        loginButton.setOnAction(e -> {
            LoginModel model = new LoginModel();
            boolean isValidLogin = model.authenticate(usernameInput.getText(), passwordInput.getText());
            if (isValidLogin) {
                showHomePage(stage, usernameInput.getText());
            } else {
                loginStatus.setText("Password Atau Username Salah");
            }
        });

        // Menampilkan stage
        Scene scene = new Scene(grid, 300, 200);
        stage.setTitle("Form Login");
        stage.setScene(scene);
        stage.show();
    }

    private void showHomePage(Stage stage, String username) {
        // Membuat halaman baru setelah login sukses
        VBox homeLayout = new VBox(10);
        homeLayout.setAlignment(Pos.CENTER);
        homeLayout.setPadding(new Insets(10, 10, 10, 10));

        Label welcomeLabel = new Label("Halo " + username);
        Button logoutButton = new Button("Keluar");
        logoutButton.setOnAction(e -> stage.close());

        homeLayout.getChildren().addAll(welcomeLabel, logoutButton);

        Scene homeScene = new Scene(homeLayout, 300, 200);
        stage.setScene(homeScene);
        stage.setTitle("Form 2");
        stage.show();
    }
}
