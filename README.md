# Genericite-Java

A Java project demonstrating the use of generics in managing a collection of `Produit` objects. This project includes an implementation of a generic interface `IMetier` for managing entities, and a user-friendly console application for interacting with the system.

## Features

- **Add a Product**: Add new products with attributes such as ID, name, brand, price, description, and stock quantity.
- **List All Products**: View a list of all products in the inventory.
- **Find Product by ID**: Search for a specific product using its unique ID.
- **Delete Product by ID**: Remove a product from the inventory using its ID.
- **Interactive Console Menu**: A user-friendly menu for managing the product collection.

## Project Structure

```
Genericite-Java
├── src
│   ├── main
│   │   ├── java
│   │   │   └── stock
│   │   │       ├── management
│   │   │       │   ├── IMetier.java
│   │   │       │   ├── MetierProduitImpl.java
│   │   │       │   ├── Produit.java
│   │   │       │   └── Application.java
├── README.md
```

## Classes Overview

### `Produit`
Represents a product with the following attributes:
- `id`: Unique identifier for the product.
- `nom`: Name of the product.
- `marque`: Brand of the product.
- `prix`: Price of the product.
- `description`: Description of the product.
- `nombreEnStock`: Stock quantity available.

### `IMetier<T>`
A generic interface for managing entities:
- `void add(T o)`: Add an object to the list.
- `List<T> getAll()`: Retrieve all objects as a list.
- `T findById(long id)`: Find an object by its ID.
- `void delete(long id)`: Delete an object by its ID.

### `MetierProduitImpl`
Implements `IMetier<Produit>` to manage a collection of `Produit` objects.

### `Application`
The main class with an interactive console menu for managing the product collection.

## How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/LAMBARAA-Abdellah/Genericite-Java.git
   ```

2. Open the project in your preferred Java IDE (e.g., IntelliJ IDEA, Eclipse).

3. Run the `Application.java` file.

4. Use the menu to interact with the program:
   ```
   Menu:
   1. Afficher la liste des produits
   2. Rechercher un produit par son id
   3. Ajouter un nouveau produit dans la liste
   4. Supprimer un produit par id
   5. Quitter ce programme
   ```

## Example Usage

### Adding a Product
Input:
```
3
Entrez l'id : 1
Entrez le nom : Laptop
Entrez la marque : Dell
Entrez le prix : 1200.5
Entrez la description : High-performance laptop
Entrez le nombre en stock : 10
```
Output:
```
Produit ajouté avec succès.
```

### Listing All Products
Input:
```
1
```
Output:
```
Produit {id=1, nom='Laptop', marque='Dell', prix=1200.5, description='High-performance laptop', nombreEnStock=10}
```

## Technologies Used

- **Java**: Core programming language.
- **Maven**: Project management and build tool (if applicable).
- **Console Input/Output**: Interactive user interface.

## License

This project is licensed under the [MIT License](LICENSE).

---

**Author:** [LAMBARAA Abdellah](https://github.com/LAMBARAA-Abdellah)
