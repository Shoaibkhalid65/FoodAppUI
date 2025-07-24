package com.example.foodappui.data

import androidx.annotation.DrawableRes
import com.example.foodappui.R

data class Food(
    val id: Int,
    val name: String,
    @DrawableRes
    val imageResourceId: Int,
    val quantity: String,
    val detailedName: String,
    val price: Float,
    val ingredients: String,
    val calories: Int
)

val foodList = listOf(
    Food(
        id = 1,
        name = "Tagliatelle",
        imageResourceId = R.drawable.ic_popular_food_6,
        quantity = "200 g",
        detailedName = "Truffle Infused Tagliatelle Pasta",
        price = 24.99f,
        ingredients = "Chicken eggs, flour, milk 3.2%, butter, water, dark chocolate 55%, white sugar, cocoa powder, salt, vanillin, olive oil, herbs, cream, garlic, onion, pepper, lemon zest, mushrooms, cheese.",
        calories = 480
    ),
    Food(
        id = 2,
        name = "Crème Brûlée",
        imageResourceId = R.drawable.ic_popular_food_5,
        quantity = "150 g",
        detailedName = "Classic French Crème Brûlée",
        price = 12.50f,
        ingredients = "Egg yolks, heavy cream, white sugar, vanilla bean, milk, butter, water, caramel, salt, corn syrup, dark chocolate, flour, lemon zest, cinnamon, nutmeg, cornstarch, cocoa powder.",
        calories = 420
    ),
    Food(
        id = 3,
        name = "Truffle Royale",
        imageResourceId = R.drawable.burger,
        quantity = "300 g",
        detailedName = "Truffle Royale Gourmet Burger",
        price = 18.75f,
        ingredients = "Beef patty, cheddar cheese, truffle oil, brioche bun, lettuce, tomato, mayonnaise, pickles, onions, butter, milk, eggs, dark chocolate 54%, salt, pepper, mustard, garlic powder.",
        calories = 690
    ),
    Food(
        id = 4,
        name = "Tournedos",
        imageResourceId = R.drawable.ic_popular_food_4,
        quantity = "180 g",
        detailedName = "Tournedos Rossini with Foie Gras",
        price = 32.00f,
        ingredients = "Beef tenderloin, foie gras, butter, truffle, red wine, chicken stock, salt, pepper, herbs, shallots, garlic, dark chocolate, milk, sugar, egg, flour, cream, thyme, olive oil.",
        calories = 550
    ),
    Food(
        id = 5,
        name = "Mango Tango",
        imageResourceId = R.drawable.icecream,
        quantity = "200 ml",
        detailedName = "Mango Tango Tropical Sorbet",
        price = 8.99f,
        ingredients = "Mango puree, sugar, lemon juice, water, coconut milk, glucose, stabilizer, salt, vanilla extract, milk, chocolate, eggs, flour, butter, cream, dark chocolate, banana, pineapple.",
        calories = 310
    ),
    Food(
        id = 6,
        name = "Caramel Shake",
        imageResourceId = R.drawable.mix_shake,
        quantity = "250 ml",
        detailedName = "Salted Caramel Cream Shake",
        price = 7.50f,
        ingredients = "Milk, caramel syrup, white sugar, whipped cream, vanilla extract, salt, dark chocolate, cream, butter, flour, eggs, water, cocoa powder, chocolate chips, brown sugar, milk powder.",
        calories = 470
    ),
    Food(
        id = 7,
        name = "Pizza",
        imageResourceId = R.drawable.pizza,
        quantity = "600 g",
        detailedName = "Margherita Pizza with Basil",
        price = 15.99f,
        ingredients = "Pizza dough, mozzarella cheese, tomato sauce, fresh basil, olive oil, salt, oregano, garlic, flour, water, yeast, milk 3.2%, butter, sugar, onion, parmesan cheese, black pepper.",
        calories = 800
    ),
    Food(
        id = 8,
        name = "Lobster",
        imageResourceId = R.drawable.ic_popular_food_3,
        quantity = "170 g",
        detailedName = "Lobster Thermidor in Creamy Sauce",
        price = 45.00f,
        ingredients = "Lobster meat, white wine, mustard, heavy cream, egg yolks, butter, salt, pepper, garlic, onion, parsley, cheese, flour, milk, lemon juice, cayenne pepper, paprika, water, herbs.",
        calories = 540
    ),
    Food(
        id = 9,
        name = "Taco",
        imageResourceId = R.drawable.taco,
        quantity = "220 g",
        detailedName = "Spicy Beef Taco Supreme",
        price = 9.25f,
        ingredients = "Taco shell, ground beef, cheddar cheese, lettuce, tomatoes, sour cream, onions, spices, chili powder, garlic, olive oil, salt, black beans, flour, paprika, cumin, jalapenos, cilantro.",
        calories = 590
    ),
    Food(
        id = 10,
        name = "Sunset Sizzler",
        imageResourceId = R.drawable.burger2,
        quantity = "350 g",
        detailedName = "Sunset Sizzler BBQ Burger",
        price = 19.50f,
        ingredients = "Beef patty, BBQ sauce, lettuce, tomato, cheese, burger bun, pickles, onion rings, mustard, garlic powder, olive oil, mayonnaise, paprika, salt, sugar, dark chocolate, egg, flour.",
        calories = 720
    ),
    Food(
        id = 11,
        name = "Salad",
        imageResourceId = R.drawable.salad,
        quantity = "180 g",
        detailedName = "Fresh Garden Caesar Salad",
        price = 10.99f,
        ingredients = "Romaine lettuce, parmesan cheese, croutons, Caesar dressing, lemon juice, olive oil, anchovies, garlic, egg yolk, mustard, salt, pepper, vinegar, herbs, milk, butter, flour, sugar.",
        calories = 330
    ),
    Food(
        id = 12,
        name = "Choco Shake",
        imageResourceId = R.drawable.choclate_shake,
        quantity = "200 ml",
        detailedName = "Rich Chocolate Bliss Shake",
        price = 7.75f,
        ingredients = "Milk, dark chocolate 55%, white sugar, cocoa powder, cream, vanilla extract, salt, eggs, butter, chocolate chips, flour, water, cinnamon, whipped cream, caramel syrup, milk powder.",
        calories = 510
    ),
    Food(
        id = 13,
        name = "Risotto",
        imageResourceId = R.drawable.ic_popular_food_1,
        quantity = "160 g",
        detailedName = "Saffron Risotto Milanese Delight",
        price = 22.00f,
        ingredients = "Arborio rice, saffron, white wine, chicken broth, onions, parmesan cheese, butter, olive oil, garlic, salt, pepper, milk, flour, herbs, mushrooms, cream, egg yolk, lemon zest.",
        calories = 470
    ),
    Food(
        id = 14,
        name = "Snowfall",
        imageResourceId = R.drawable.mc_icecream,
        quantity = "200 ml",
        detailedName = "Toasted Marshmallow Snowfall Dessert",
        price = 9.50f,
        ingredients = "Milk, sugar, toasted marshmallow, vanilla extract, cocoa butter, cream, egg yolk, chocolate chips, butter, flour, cinnamon, nutmeg, salt, honey, white chocolate, caramel, dark chocolate.",
        calories = 390
    ),
    Food(
        id = 15,
        name = "Bouillabaisse",
        imageResourceId = R.drawable.ic_popular_food_2,
        quantity = "220 g",
        detailedName = "Mediterranean Bouillabaisse Seafood Stew",
        price = 28.75f,
        ingredients = "Fish fillets, shrimp, mussels, tomatoes, garlic, onion, olive oil, saffron, fennel, bay leaf, white wine, lemon juice, herbs, salt, pepper, flour, milk, cream, butter, parsley.",
        calories = 510
    )
)

val cartList=listOf(
    Food(
        id = 6,
        name = "Caramel Shake",
        imageResourceId = R.drawable.mix_shake,
        quantity = "250 ml",
        detailedName = "Salted Caramel Cream Shake",
        price = 7.50f,
        ingredients = "Milk, caramel syrup, white sugar, whipped cream, vanilla extract, salt, dark chocolate, cream, butter, flour, eggs, water, cocoa powder, chocolate chips, brown sugar, milk powder.",
        calories = 470
    ),
    Food(
        id = 7,
        name = "Pizza",
        imageResourceId = R.drawable.pizza,
        quantity = "600 g",
        detailedName = "Margherita Pizza with Basil",
        price = 15.99f,
        ingredients = "Pizza dough, mozzarella cheese, tomato sauce, fresh basil, olive oil, salt, oregano, garlic, flour, water, yeast, milk 3.2%, butter, sugar, onion, parmesan cheese, black pepper.",
        calories = 800
    ),
    Food(
        id = 8,
        name = "Lobster",
        imageResourceId = R.drawable.ic_popular_food_3,
        quantity = "170 g",
        detailedName = "Lobster Thermidor in Creamy Sauce",
        price = 45.00f,
        ingredients = "Lobster meat, white wine, mustard, heavy cream, egg yolks, butter, salt, pepper, garlic, onion, parsley, cheese, flour, milk, lemon juice, cayenne pepper, paprika, water, herbs.",
        calories = 540
    ),
    Food(
        id = 9,
        name = "Taco",
        imageResourceId = R.drawable.taco,
        quantity = "220 g",
        detailedName = "Spicy Beef Taco Supreme",
        price = 9.25f,
        ingredients = "Taco shell, ground beef, cheddar cheese, lettuce, tomatoes, sour cream, onions, spices, chili powder, garlic, olive oil, salt, black beans, flour, paprika, cumin, jalapenos, cilantro.",
        calories = 590
    ),
    Food(
        id = 15,
        name = "Bouillabaisse",
        imageResourceId = R.drawable.ic_popular_food_2,
        quantity = "220 g",
        detailedName = "Mediterranean Bouillabaisse Seafood Stew",
        price = 28.75f,
        ingredients = "Fish fillets, shrimp, mussels, tomatoes, garlic, onion, olive oil, saffron, fennel, bay leaf, white wine, lemon juice, herbs, salt, pepper, flour, milk, cream, butter, parsley.",
        calories = 510
    )
)