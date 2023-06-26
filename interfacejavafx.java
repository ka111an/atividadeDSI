[quinta-feira 22:42] KAUAN OLIVEIRA MENDES

import javafx.application.Application;

import javafx.geometry.Insets;

import javafx.scene.Scene;

import javafx.scene.control.Button;

import javafx.scene.control.Label;

import javafx.scene.layout.VBox;

import javafx.stage.Stage;

 

public class BackupManagementApp extends Application {

 

    private BackupManager backupManager;

 

    public static void main(String[] args) {

        launch(args);

    }

 

    @Override

    public void start(Stage primaryStage) {

        backupManager = new BackupManager();

 

        primaryStage.setTitle("Backup Management");

 

        VBox root = new VBox();

        root.setSpacing(10);

        root.setPadding(new Insets(10));

 

        Label titleLabel = new Label("Backup Management");

        titleLabel.setStyle("-fx-font-size: 18px; -fx-font-weight: bold;");

        Button backupButton = new Button("Create Backup");

        Button restoreButton = new Button("Restore Backup");

        Button deleteButton = new Button("Delete Backup");

 

        backupButton.setOnAction(e -> {

            backupManager.createBackup();

            System.out.println("Backup created.");

        });

 

        restoreButton.setOnAction(e -> {

            backupManager.restoreBackup();

            System.out.println("Backup restored.");

        });

 

        deleteButton.setOnAction(e -> {

            backupManager.deleteBackup();

            System.out.println("Backup deleted.");

        });

 

        root.getChildren().addAll(titleLabel, backupButton, restoreButton, deleteButton);

 

        Scene scene = new Scene(root, 300, 200);

        primaryStage.setScene(scene);

        primaryStage.show();

    }

 

    private static class BackupManager {

        public void createBackup() {

            // Lógica para criar um backup

            System.out.println("Creating backup...");

        }

 

        public void restoreBackup() {

            // Lógica para restaurar um backup

            System.out.println("Restoring backup...");

        }

 

        public void deleteBackup() {

            // Lógica para deletar um backup

            System.out.println("Deleting backup...");

        }

    }

}
