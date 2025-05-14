package Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class Dboard {

    @FXML
    private Button avis_reclamation;

    @FXML
    private Circle circle;

    @FXML
    private Button edit;

    @FXML
    private Button eya;

    @FXML
    private Button hassan;

    @FXML
    private Button historique;

    @FXML
    private Button home;

    @FXML
    private AnchorPane home_page;

    @FXML
    private Label label_totale_utilisateur;

    @FXML
    private Label label_totale_velos;

    @FXML
    private AnchorPane navbar;

    @FXML
    private Button salma;

    @FXML
    private Button soulayma;

    @FXML
    private AnchorPane totale_produits;

    @FXML
    private AnchorPane totale_stations;

    @FXML
    private AnchorPane totale_users;

    @FXML
    private AnchorPane totale_velos;

    @FXML
    private Label userr;

    @FXML
    void btnAvisReclamation(ActionEvent event) {
        try {
            // Charger la page d'accueil qui contient les modules avis et réclamations
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/views/home_page.fxml"));
            Parent root = loader.load();

            // Obtenir la scène actuelle et la remplacer par home_page.fxml
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

            System.out.println("Navigation vers la page Avis et Réclamations réussie!");
        } catch (IOException e) {
            e.printStackTrace();
            // Afficher une alerte en cas d'erreur
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erreur de navigation");
            alert.setHeaderText(null);
            alert.setContentText("Impossible de charger la page Avis et Réclamations: " + e.getMessage());
            alert.showAndWait();
        }

    }

    @FXML
    void btnpaiement(ActionEvent event) {
        try {
            // Charger le nouveau FXML
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/MenuPrincipal.fxml"));

            // Récupérer la scène actuelle
            Scene scene = ((Node) event.getSource()).getScene();

            // Changer la racine de la scène
            scene.setRoot(root);
        } catch (IOException e) {
            e.printStackTrace();
            // Gérer l'erreur (afficher un message à l'utilisateur)
            System.err.println("Erreur lors du chargement de Menuprincipal.fxml");
        }

    }

    @FXML
    void btnreservation(ActionEvent event) {
        try {
            // Charger le nouveau FXML
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/ListeReservations.fxml"));

            // Récupérer la scène actuelle
            Scene scene = ((Node) event.getSource()).getScene();

            // Changer la racine de la scène
            scene.setRoot(root);
        } catch (IOException e) {
            e.printStackTrace();
            // Gérer l'erreur (afficher un message à l'utilisateur)
            System.err.println("Erreur lors du chargement de MenuPrincipal.fxml");
        }

    }

    @FXML
    void btntarjet(ActionEvent event) {
        try {
            // Charger le nouveau FXML
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/principal.fxml"));

            // Récupérer la scène actuelle
            Scene scene = ((Node) event.getSource()).getScene();

            // Changer la racine de la scène
            scene.setRoot(root);
        } catch (IOException e) {
            e.printStackTrace();
            // Gérer l'erreur (afficher un message à l'utilisateur)
            System.err.println("Erreur lors du chargement de MenuPrincipal.fxml");
        }

    }

    @FXML
    void btnvoit(ActionEvent event) {
        try {
            // Charger le nouveau FXML
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/fxmlfile.fxml"));

            // Récupérer la scène actuelle
            Scene scene = ((Node) event.getSource()).getScene();

            // Changer la racine de la scène
            scene.setRoot(root);
        } catch (IOException e) {
            e.printStackTrace();
            // Gérer l'erreur (afficher un message à l'utilisateur)
            System.err.println("Erreur lors du chargement de MenuPrincipal.fxml");
        }

    }

    @FXML
    void changePage(ActionEvent event) {


    }

    @FXML
    void exit(ActionEvent event) {
        System.exit(0);

    }
    private double x = 0;
    private double y = 0;

    @FXML
    void logoutAccount(ActionEvent event) {
        // Cache la fenêtre actuelle (associée à l'élément 'historique')
        historique.getScene().getWindow().hide();

        try {
            // Chargement du fichier FXML de la page de login
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/hello-view.fxml"));

            // Création de la nouvelle scène
            Scene scene = new Scene(root);

            // Création de la nouvelle fenêtre
            Stage stage = new Stage();

            // Gestion du mouvement de la fenêtre
            root.setOnMousePressed((MouseEvent mouseEvent) -> {
                x = mouseEvent.getSceneX();
                y = mouseEvent.getSceneY();
            });

            root.setOnMouseDragged((MouseEvent mouseEvent) -> {
                // Permet de déplacer la fenêtre en traînant avec la souris
                stage.setX(mouseEvent.getScreenX() - x);
                stage.setY(mouseEvent.getScreenY() - y);

                // Change l'opacité lors du déplacement de la fenêtre pour un effet visuel
                stage.setOpacity(0.8);
            });

            root.setOnMouseReleased((MouseEvent mouseEvent) -> {
                // Restaure l'opacité après avoir relâché la souris
                stage.setOpacity(1);
            });

            // Initialisation de la fenêtre sans bordure (transparent)
            stage.initStyle(StageStyle.TRANSPARENT);
            stage.setScene(scene);
            stage.show(); // Affiche la nouvelle fenêtre

        } catch (Exception e) {
            e.printStackTrace(); // Toujours utile pour vérifier les erreurs
        }
    }


}
