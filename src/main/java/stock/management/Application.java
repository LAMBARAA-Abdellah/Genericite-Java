package stock.management;

import java.util.Scanner;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        MetierProduitImpl metier = new MetierProduitImpl();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu :");
            System.out.println("1. Afficher la liste des produits");
            System.out.println("2. Rechercher un produit par son id");
            System.out.println("3. Ajouter un nouveau produit dans la liste");
            System.out.println("4. Supprimer un produit par id");
            System.out.println("5. Quitter ce programme");
            System.out.print("Votre choix : ");

            int choix = scanner.nextInt();
            scanner.nextLine(); // Consommer la nouvelle ligne

            switch (choix) {
                case 1:
                    List<Produit> produits = metier.getAll();
                    if (produits.isEmpty()) {
                        System.out.println("Aucun produit disponible.");
                    } else {
                        produits.forEach(System.out::println);
                    }
                    break;
                case 2:
                    System.out.print("Entrez l'id du produit : ");
                    long idRecherche = scanner.nextLong();
                    Produit produit = metier.findById(idRecherche);
                    if (produit == null) {
                        System.out.println("Produit introuvable.");
                    } else {
                        System.out.println(produit);
                    }
                    break;
                case 3:
                    System.out.print("Entrez l'id : ");
                    long id = scanner.nextLong();
                    scanner.nextLine();
                    System.out.print("Entrez le nom : ");
                    String nom = scanner.nextLine();
                    System.out.print("Entrez la marque : ");
                    String marque = scanner.nextLine();
                    System.out.print("Entrez le prix : ");
                    double prix = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Entrez la description : ");
                    String description = scanner.nextLine();
                    System.out.print("Entrez le nombre en stock : ");
                    int stock = scanner.nextInt();

                    Produit nouveauProduit = new Produit(id, nom, marque, prix, description, stock);
                    metier.add(nouveauProduit);
                    System.out.println("Produit ajouté avec succès.");
                    break;
                case 4:
                    System.out.print("Entrez l'id du produit à supprimer : ");
                    long idSupprimer = scanner.nextLong();
                    Produit deltedProduit = metier.findById(idSupprimer);
                    if (deltedProduit == null) {
                        System.out.println("Produit introuvable.");
                    } else {
                        metier.delete(idSupprimer);
                        System.out.println("Produit supprimé avec succès.");
                    }
                    break;
                case 5:
                    System.out.println("Au revoir!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Choix invalide, veuillez réessayer.");
            }
        }
    }
}
