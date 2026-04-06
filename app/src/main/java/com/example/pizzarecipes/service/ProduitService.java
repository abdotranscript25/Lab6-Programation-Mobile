package com.example.pizzarecipes.service;

import com.example.pizzarecipes.classes.Produit;
import com.example.pizzarecipes.dao.IDao;
import com.example.pizzarecipes.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ProduitService implements IDao<Produit> {

    // ========== SINGLETON ==========
    // Une seule instance partagée dans toute l'application
    private static ProduitService instanceUnique;
    private final List<Produit> listePizzas = new ArrayList<>();

    /**
     * Constructeur privé (empêche de créer des instances en dehors de la classe)
     */
    private ProduitService() {
        remplirListe(); // Remplit la liste avec les pizzas
    }

    public static ProduitService getInstance() {
        if (instanceUnique == null) {
            instanceUnique = new ProduitService();
        }
        return instanceUnique;
    }

    // ========== REMPLISSAGE DES DONNÉES ==========

    /**
     * Remplit la liste avec les 10 pizzas
     */
    private void remplirListe() {

        // Pizza 1 : BARBECUED CHICKEN PIZZA
        listePizzas.add(new Produit("BARBECUED CHICKEN PIZZA", 3.0,
                R.mipmap.pizza1, "35 min",
                "- 2 boneless skinless chicken breast halves (6 ounces each)\n- 1/4 teaspoon pepper\n- 1 cup barbecue sauce, divided\n- 1 tube (13.8 ounces) refrigerated pizza crust\n- 2 teaspoons olive oil\n- 2 cups shredded Gouda cheese\n- 1 small red onion, halved and thinly sliced\n- 1/4 cup minced fresh cilantro",
                "So fast and so easy with refrigerated pizza crust, these saucy, smoky pizzas make quick fans with their hot-off-the-grill, rustic flavor. They're perfect for spur-of-the-moment cookouts and summer dinners on the patio.",
                "STEP 1: Sprinkle chicken with pepper; place on an oiled grill rack over medium heat. Grill, covered, until a thermometer reads 165°, 5-7 minutes per side, basting frequently with 1/2 cup barbecue sauce during the last 4 minutes. Cool slightly. Cut into cubes.\n\nSTEP 2: Divide dough in half. On a well-greased large sheet of heavy-duty foil, press each portion of dough into a 10x8-in. rectangle; brush lightly with oil. Invert dough onto grill rack; peel off foil. Grill, covered, over medium heat until bottom is lightly browned, 1-2 minutes.\n\nSTEP 3: Remove from grill. Spread grilled sides with remaining barbecue sauce. Top with cheese, chicken and onion. Grill, covered, until bottom is lightly browned and cheese is melted, 2-3 minutes. Sprinkle with cilantro."));

        // Pizza 2 : BRUSCHETTA PIZZA
        listePizzas.add(new Produit("BRUSCHETTA PIZZA", 5.0,
                R.mipmap.pizza2, "35 min",
                "- 1/2 pound reduced-fat bulk pork sausage\n- 1 prebaked 12-inch pizza crust\n- 1 package (6 ounces) sliced turkey pepperoni\n- 2 cups shredded part-skim mozzarella cheese\n- 1-1/2 cups chopped plum tomatoes\n- 1/2 cup fresh basil leaves, thinly sliced\n- 1 tablespoon olive oil\n- 2 garlic cloves, minced\n- 1/2 teaspoon minced fresh thyme\n- 1/2 teaspoon balsamic vinegar\n- 1/4 teaspoon salt\n- 1/8 teaspoon pepper",
                "You might need a knife and fork for this hearty pizza! Loaded with Italian flavor and plenty of fresh tomatoes, it's bound to become a family favorite. It's even better with a homemade, whole wheat crust!",
                "STEP 1: In a small skillet, cook sausage over medium heat until no longer pink; drain. Place crust on an ungreased baking sheet. Top with pepperoni, sausage and cheese. Bake at 450° for 10-12 minutes or until cheese is melted.\n\nSTEP 2: In a small bowl, combine the tomatoes, sliced basil, oil, garlic, thyme, vinegar, salt and pepper. Spoon over pizza. Garnish with additional basil if desired."));

        // Pizza 3 : SPINACH PIZZA
        listePizzas.add(new Produit("SPINACH PIZZA", 2.0,
                R.mipmap.pizza3, "25 min",
                "- 1 package (6-1/2 ounces) pizza crust mix\n- 1/2 cup Alfredo sauce\n- 2 medium tomatoes\n- 4 cups chopped fresh spinach\n- 2 cups shredded Italian cheese blend",
                "This tasty pizza is so easy to prepare. My family, including my young daughter, loves it. What an easy way to make a delicious, veggie-filled meal!",
                "STEP 1: Prepare pizza dough according to package directions. With floured hands, press dough onto a greased 12-in. pizza pan.\n\nSTEP 2: Spread Alfredo sauce over dough to within 1 in. of edges. Thinly slice or chop tomatoes; top pizza with spinach, tomatoes and cheese.\n\nSTEP 3: Bake at 450° for 10-15 minutes or until cheese is melted and crust is golden brown."));

        // Pizza 4 : DEEP-DISH SAUSAGE PIZZA
        listePizzas.add(new Produit("DEEP-DISH SAUSAGE PIZZA", 8.0,
                R.mipmap.pizza4, "45 min",
                "- 1 package (1/4 ounce) active dry yeast\n- 2/3 cup warm water (110° to 115°)\n- 1-3/4 to 2 cups all-purpose flour\n- 1/4 cup vegetable oil\n- 1 teaspoon each dried oregano, basil and marjoram\n- 1/2 teaspoon garlic salt\n- 1/2 teaspoon onion salt",
                "My Grandma made the tastiest snacks for us when we stayed the night at her farm. Her wonderful pizza, hot from the oven, was covered with cheese and had fragrant herbs in the crust.",
                "STEP 1: In a mixing bowl, dissolve yeast in water. Add 1 cup flour, oil and seasonings; beat until smooth. Add enough remaining flour to form a soft dough. Turn onto a floured surface; knead until smooth and elastic, 6-8 minutes.\n\nSTEP 2: In another skillet, saute onion, green peppers and seasonings in oil until tender; drain. Layer half of the mixture over crust.\n\nSTEP 3: Bake for 400° for 20 minutes. Sprinkle with pepperoni and remaining mozzarella. Bake 10-15 minutes longer or until crust is browned."));

        // Pizza 5 : HOMEMADE PIZZA
        listePizzas.add(new Produit("HOMEMADE PIZZA", 4.0,
                R.mipmap.pizza5, "50 min",
                "- 1 package (1/4 ounce) active dry yeast\n- 1 teaspoon sugar\n- 1-1/4 cups warm water (110° to 115°)\n- 1/4 cup canola oil\n- 1 teaspoon salt\n- 3-1/2 cups all-purpose flour\n- 1/2 pound ground beef\n- 1 small onion, chopped\n- 1 can (15 ounces) tomato sauce\n- 1 teaspoon dried basil\n- 1 medium green pepper, diced\n- 2 cups shredded part-skim mozzarella cheese",
                "This recipe is a hearty, zesty main dish with a crisp, golden crust. Feel free to use whatever toppings your family enjoys on these homemade pizzas.",
                "STEP 1: In large bowl, dissolve yeast and sugar in water; let stand for 5 minutes. Add oil and salt. Stir in flour, a cup at a time, until a soft dough forms.\n\nSTEP 2: Turn onto floured surface; knead until smooth and elastic, about 2-3 minutes. Cover and let rise.\n\nSTEP 3: Punch down dough; divide in half. Press each into a greased 12-in. pizza pan. Combine tomato sauce, oregano and basil; spread over each crust.\n\nSTEP 4: Bake at 400° for 25-30 minutes or until crust is lightly browned."));

        // Pizza 6 : PESTO CHICKEN PIZZA
        listePizzas.add(new Produit("PESTO CHICKEN PIZZA", 3.0,
                R.mipmap.pizza6, "50 min",
                "- 2 teaspoons active dry yeast\n- 1 cup warm water (110° to 115°)\n- 2-3/4 cups bread flour\n- 1 tablespoon plus 2 teaspoons olive oil, divided\n- 1 tablespoon sugar\n- 1-1/2 teaspoons salt, divided\n- 1/2 pound boneless skinless chicken breasts\n- 1 small onion\n- 1/2 cup sliced fresh mushrooms\n- 3 tablespoons prepared pesto\n- 1-1/2 cups shredded part-skim mozzarella cheese",
                "This is the only pizza I make now. We love it! Keeping the spices simple helps the flavors of the chicken and vegetables come through.",
                "STEP 1: In a large bowl, dissolve yeast in warm water. Beat in 1 cup flour, 1 tablespoon oil, sugar and 1 teaspoon salt.\n\nSTEP 2: Turn onto a lightly floured surface; knead until smooth and elastic, about 6-8 minutes.\n\nSTEP 3: In a large nonstick skillet over medium heat, cook the chicken, onion, peppers and mushrooms.\n\nSTEP 4: Punch dough down; roll into a 15-in. circle. Spread with pesto. Top with chicken mixture and cheese.\n\nSTEP 5: Bake at 400° for 18-20 minutes."));

        // Pizza 7 : LOADED MEXICAN PIZZA
        listePizzas.add(new Produit("LOADED MEXICAN PIZZA", 3.0,
                R.mipmap.pizza7, "30 min",
                "- 1 can (15 ounces) black beans, rinsed and drained\n- 1 medium red onion, chopped\n- 1 small sweet yellow pepper, chopped\n- 3 teaspoons chili powder\n- 3/4 teaspoon ground cumin\n- 3 medium tomatoes, chopped\n- 1 jalapeno pepper, seeded and finely chopped\n- 1 garlic clove, minced\n- 1 prebaked 12-inch thin pizza crust\n- 2 cups chopped fresh spinach\n- 1/2 cup shredded reduced-fat cheddar cheese\n- 1/2 cup shredded pepper jack cheese",
                "My husband is a picky eater, but this healthy pizza has lots of flavor, and he actually looks forward to it. Leftovers are no problem, because this meal tastes better the next day.",
                "STEP 1: In a small bowl, mash black beans. Stir in the onion, yellow pepper, chili powder and cumin.\n\nSTEP 2: Place crust on an ungreased 12-in. pizza pan; spread with bean mixture. Top with tomato mixture and spinach.\n\nSTEP 3: Bake at 400° for 12-15 minutes or until cheese is melted."));

        // Pizza 8 : BACON CHEESEBURGER PIZZA
        listePizzas.add(new Produit("BACON CHEESEBURGER PIZZA", 2.0,
                R.mipmap.pizza8, "20 min",
                "- 1/2 pound ground beef\n- 1 small onion, chopped\n- 1 prebaked Italian bread shell crust\n- 1 can (8 ounces) pizza sauce\n- 6 bacon strips, cooked and crumbled\n- 20 dill pickle coin slices\n- 2 cups shredded mozzarella cheese\n- 2 cups shredded cheddar cheese\n- 1 teaspoon pizza seasoning",
                "Kids of all ages love pizza and cheeseburgers, and this recipe combines them both. My grandchildren usually request pizza for supper when they visit me.",
                "STEP 1: In a skillet, cook beef and onion over medium heat until meat is no longer pink; drain and set aside.\n\nSTEP 2: Place crust on an ungreased 12-in. pizza pan. Spread with pizza sauce. Top with beef mixture, bacon, pickles and cheeses.\n\nSTEP 3: Bake at 450° for 8-10 minutes or until cheese is melted."));

        // Pizza 9 : PIZZA MARGHERITA
        listePizzas.add(new Produit("PIZZA MARGHERITA", 1.0,
                R.mipmap.pizza9, "30 min",
                "- 3 teaspoons active dry yeast\n- 1 cup warm water (110° to 115°)\n- 2 tablespoons olive oil\n- 1 teaspoon sugar\n- 1 teaspoon salt\n- 3 cups bread flour",
                "A classic Pizza Margherita, named for Queen Margherita of Italy, shows off the colors of the Italian flag with red tomatoes, white mozzarella and fresh green basil.",
                "STEP 1: In a large mixing bowl, dissolve yeast in warm water. Add the oil, sugar, salt and 1 cup flour. Beat until smooth.\n\nSTEP 2: Turn onto a floured surface; knead until smooth and elastic, about 6-8 minutes.\n\nSTEP 3: Punch dough down; divide in half. Roll each portion into a 13-in. circle.\n\nSTEP 4: Spoon tomatoes over crusts. Top with basil, cheese and oregano. Bake at 450° for 15-20 minutes."));

        // Pizza 10 : PEPPERONI-SAUSAGE STUFFED PIZZA
        listePizzas.add(new Produit("PEPPERONI-SAUSAGE STUFFED PIZZA", 5.0,
                R.mipmap.pizza10, "45 min",
                "- 1 package (1/4 ounce) active dry yeast\n- 1-1/4 cups warm water (110° to 115°)\n- 2 tablespoons olive oil\n- 1-1/2 teaspoons salt\n- 1 teaspoon sugar\n- 3-1/2 to 4 cups all-purpose flour",
                "For 30 years, friends have been telling me to open a pizzeria using this recipe. It even freezes well.",
                "STEP 1: In a small bowl, dissolve yeast in warm water. In a large bowl, combine oil, salt, sugar, yeast mixture and 1 cup flour; beat on medium speed until smooth.\n\nSTEP 2: Turn dough onto a floured surface; knead until smooth and elastic, about 6-8 minutes.\n\nSTEP 3: Preheat oven to 425°. Punch down dough; divide into three portions.\n\nSTEP 4: Roll out remaining dough into a 13x9-in. rectangle. Place dough over filling, crimping edges to seal.\n\nSTEP 5: Reduce oven setting to 375°. Bake 30-35 minutes longer or until edges are lightly browned."));
    }

    // ========== MÉTHODES CRUD (implémentation de IDao) ==========

    @Override
    public Produit creer(Produit produit) {
        listePizzas.add(produit);
        return produit;
    }

    @Override
    public Produit modifier(Produit produit) {
        for (int i = 0; i < listePizzas.size(); i++) {
            if (listePizzas.get(i).getId() == produit.getId()) {
                listePizzas.set(i, produit);
                return produit;
            }
        }
        return null;
    }

    @Override
    public boolean supprimer(long id) {
        return listePizzas.removeIf(produit -> produit.getId() == id);
    }

    @Override
    public Produit trouverParId(long id) {
        for (Produit produit : listePizzas) {
            if (produit.getId() == id) {
                return produit;
            }
        }
        return null;
    }

    @Override
    public List<Produit> trouverTous() {
        return Collections.unmodifiableList(listePizzas);
    }
}