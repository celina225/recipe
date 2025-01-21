/*
 * Copyright 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.jetsnack.model

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Immutable
import com.example.jetsnack.R
import kotlin.random.Random

@Immutable
data class Snack(
    val id: Long,
    val name: String,
    @DrawableRes
    val imageRes: Int,
    val price: Long,
    val tagline: String = "",
    val detail: String,
    val tags: Set<String> = emptySet()
)

/**
 * Static data
 */

val snacks = listOf(
    Snack(
        id = 1L,
        name = "Cupcake",
        tagline = "Recipe",
        detail = "VANILLA CUPCAKES\n" +
                "2 1/2 cups (325g) all purpose flour\n" +
                "2 cups (414g) sugar\n" +
                "3 tsp baking powder (NOT baking soda)\n" +
                "1 tsp salt\n" +
                "1 cup (240ml) milk\n" +
                "1/2 cup (120ml) vegetable oil\n" +
                "1 tbsp vanilla extract\n" +
                "2 large eggs\n" +
                "1 cup (240ml) water*\n" +
                "VANILLA FROSTING\n" +
                "1 cup (224g) unsalted butter, room temperature\n" +
                "4 cups (460g) powdered sugar\n" +
                "1 1/2 tsp vanilla extract\n" +
                "2–3 tbsp (30-45ml) water or milk\n" +
                "pinch of salt\n" +
                "Instructions:\n" +
                "1. Preheat oven to 350°F (176°C) and prepare a cupcake pan with liners.\n" +
                "2. Add the flour, sugar, baking powder and salt to a large mixer bowl and combine. Set aside.\n" +
                "3. Add the milk, vegetable oil, vanilla extract and eggs to a medium sized bowl and combine.\n" +
                "4. Add the wet ingredients to the dry ingredients and beat until well combined.\n" +
                "5. Slowly add the water to the batter and mix on low speed until well combined. Scrape down the sides of the bowl as needed to make sure everything is well combined. Please note that the batter will be very thin.\n" +
                "6. Fill the cupcake liners about half way and bake for 15-17 minutes, or until a toothpick comes out with a few moist crumbs.\n" +
                "7. Remove the cupcakes from oven and allow to cool for 2 minutes, then remove to a cooling rack to finish cooling.\n" +
                "8. To make the frosting, beat the butter in a large mixer bowl until smooth.\n" +
                "9. Add 2 cups of powdered sugar and mix until smooth.\n" +
                "10. Add the vanilla extract and 1 tablespoon of water or milk and mix until smooth.\n" +
                "11. Add remaining powdered sugar and mix until smooth.\n" +
                "12. Add remaining water or milk, as needed, and salt and mix until smooth.",
        imageRes = R.drawable.cupcake,
        price = 299
    ),
    Snack(
        id = Random.nextLong(),
        name = "Donut",
        tagline = "Recipe",
        detail = "Soft and sweet\n" +
                "Flavored with a little nutmeg\n" +
                "Completely from scratch\n" +
                "Ready in about 2.5 hours (most of this is rise time!)\n" +
                "A fun and delicious weekend project\n" +
                "Perfect for sharing",
        imageRes = R.drawable.donut,
        price = 299
    ),
    Snack(
        id = Random.nextLong(),
        name = "Eclair",
        tagline = "Recipe",
        detail = "1 cup water\n" +
                "½ cup butter\n" +
                "1 cup all-purpose flour\n" +
                "¼ teaspoon salt\n" +
                "4 large eggs\n",
        imageRes = R.drawable.eclair,
        price = 299
    ),
    Snack(
        id = Random.nextLong(),
        name = "Froyo",
        tagline = "Recipe",
        detail = "Use whole milk Greek yogurt and add cream if you like. Not only do I love the rich and tangy flavor of Greek yogurt, but it is also far thicker in consistency. Greek yogurt is known as concentrated or strained yogurt where whey and other liquids have been eliminated, which makes a better, creamier base for fro-yo. You also have the option to add a little heavy creamy. And if you really want the thickest, creamiest result, you might even swap the Greek yogurt. ",
        imageRes = R.drawable.froyo,
        price = 299
    ),
    Snack(
        id = Random.nextLong(),
        name = "Gingerbread",
        tagline = "Recipe",
        detail = "225g plain flour as well as a small quantity for dusting\n" +
                "1/2 tsp salt\n" +
                "2 tsp bicarbonate of soda\n" +
                "1 heaped tsp ground ginger\n" +
                "1/2 tsp cinnamon\n" +
                "50g unsalted butter\n" +
                "100g soft brown sugar\n" +
                "100g golden syrup\n" +
                "Decorations – sweets, coloured icing, sprinkles, chocolate chips",
        imageRes = R.drawable.gingerbread,
        price = 499
    ),
    Snack(
        id = Random.nextLong(),
        name = "Honeycomb",
        tagline = "Recipe",
        detail = "A large pot – Since the sugar base will foam and become triple in size, you need to use a large pot that will hold the mixture at its highest volume. Otherwise, the mixture will overflow and even cause burns. Corn syrup – This is also an invert sugar, but will not add the same flavor as golden syrup.\n" +
                "Honey – Honey is also an invert sugar, and will add flavor to the candy as well. But it’ll still be different from golden syrup. Honey is the best substitute to make this candy in the absence of golden syrup.",
        imageRes = R.drawable.honeycomb,
        price = 299
    ),
    Snack(
        id = Random.nextLong(),
        name = "Ice Cream Sandwich",
        tagline = "Recipe",
        detail = "vegetable oil cooking spray\n" +
                "½ cup all-purpose flour\n" +
                "1 tablespoon all-purpose flour\n" +
                "¼ teaspoon kosher salt\n" +
                "¼ teaspoon baking soda\n" +
                "⅓ cup sifted Dutch-process cocoa powder\n" +
                "3 tablespoons unsalted butter, softened\n" +
                "¼ cup white sugar\n" +
                "2 tablespoons light brown sugar\n" +
                "½ teaspoon pure vanilla extract\n" +
                "⅓ cup whole milk, at room temperature\n" +
                "6 scoops vanilla ice cream",
        imageRes = R.drawable.ice_cream_sandwich,
        price = 1299
    ),
    Snack(
        id = Random.nextLong(),
        name = "Jellybean",
        tagline = "Recipe",
        detail = "1 packet 500g (17.64 ounces) or 4 cups and 3 Tbsp cornflour (cornstarch)\n" +
                "A shallow baking tray\n" +
                "108g (3.81 ounces) or 1/2 cup sugar\n" +
                "40millilitres (1.35 fluid ounces) or 3 Tbsp water\n" +
                "20g (0.71 ounces) or 1 Tbsp corn syrup (glucose syrup)\n" +
                "1 tsp cornflour (cornstarch)",
        imageRes = R.drawable.jelly_bean,
        price = 299
    ),
    Snack(
        id = Random.nextLong(),
        name = "KitKat",
        tagline = "Recipe",
        detail = "200g vegan dark chocolate, chopped into pieces\n" +
                "75g soft brown sugar\n" +
                "100g sugar\n" +
                "1 tbsp cocoa powder\n" +
                "175g self raising flour\n" +
                "225ml plant based milk alternative\n" +
                "5 tbsp sunflower oil\n" +
                "1 tsp vanilla extract\n" +
                "3 x KitKat® V, chopped into pieces",
        imageRes = R.drawable.kitkat,
        price = 549
    ),
    Snack(
        id = Random.nextLong(),
        name = "Lollipop",
        tagline = "Recipe",
        detail = "1 cup granulated sugar\n" +
                "1/2 cup water\n" +
                "1/4 cup Karo light corn syrup\n" +
                "1/2 bottle LorAnn Oils flavor of you choice I like to use a half of a bottle of this flavoring per batch. The size is .125 fl oz.\n" +
                "1-2 drops food coloring (gels work fine, too)",
        imageRes = R.drawable.lollipop,
        price = 299
    ),
    Snack(
        id = Random.nextLong(),
        name = "Marshmallow",
        tagline = "Recipe",
        detail = "Graham Crackers: You can’t go wrong with a classic, and it doesn’t get more classic s’mores than graham crackers. If you want to go crazy, you can go for chocolate or cinnamon graham crackers, but I prefer the OG.\n" +
                "Marshmallows: If you’re an overachiever, you can make homemade marshmallows, but honestly…why would you? Grab the store-bought stuff; there’s a reason why it’s a go-to choice. Depending on how much of a marshmallow lover you are, you can go for the regular or jumbo.\n" +
                "Chocolate: Hershey’s is a classic choice for s’mores, and is what I personally turn to again and again. That being said, don’t feel like you can’t get creative! Your favorite piece of chocolate that will get melty and delicious will most likely work great here.",
        imageRes = R.drawable.marshmallow,
        price = 299
    ),
    Snack(
        id = Random.nextLong(),
        name = "Nougat",
        tagline = "Recipe",
        detail = "Corn syrup: White corn syrup is essential for creating the fluffy, billowy texture of the nougat. Do not use dark corn syrup!\n" +
                "Egg whites: The recipe calls for 1/4 to 1/2 cup of egg whites. I ended up using 3 large egg whites, which came out to just under 1/2 cup. The first time I made the recipe, I wasn’t sure how long to beat the egg whites before adding the first batch of sugar syrup. I beat them for about one minute the first time and three minutes the second time, but the results were similar for both. So I think you have some leeway on the speed and duration for beating the egg whites!\n" +
                "Flour: I use gluten-free flour to keep this recipe gluten-free. All-purpose wheat flour will also work for this nougat recipe.\n" +
                "Peanuts: The original nougat recipe doesn’t call for nuts, but I thought it was a delicious addition! Feel free to add almonds, cashews, or other mix-ins, if you’d like.\n" +
                "Butter: I like to use room temperature, salted butter for this recipe. The mixture quickly becomes very difficult to stir after adding the butter and flour, so I like to cut the butter into very small cubes to make sure it incorporates properly.",
        imageRes = R.drawable.nougat,
        price = 299
    ),
    Snack(
        id = Random.nextLong(),
        name = "Oreo",
        tagline = "Recipe",
        detail = "4 ounces unsalted butter (about 8 tablespoons; 115g), creamy and soft, about 68°F (20°C)\n" +
                "3 1/2 ounces sugar (about 1/2 cup; 100g)\n" +
                "2 ounces golden syrup (about 3 tablespoons; 55g), such as Lyle’s\n" +
                "1/2 teaspoon baking soda\n" +
                "1/4 teaspoon (1g) Diamond Crystal kosher salt; for table salt, use about half as much by volume or the same weight\n" +
                "1/4 teaspoon coconut extract (optional)\n" +
                "5 3/4 ounces bleached all-purpose flour (about 1 1/4 cups, spooned; 165g), such as Gold Medal\n" +
                "1 1/4 ounces Dutch-process cocoa powder (about 1/3 cup plus 1 tablespoon; 35g), such as Cacao Barry Extra Brute, plus more for dusting",
        imageRes = R.drawable.oreo,
        price = 299
    ),
    Snack(
        id = Random.nextLong(),
        name = "Pie",
        tagline = "Recipe",
        detail = "2 cups all-purpose flour, plus more for dusting\n" +
                "1/2 teaspoon salt\n" +
                "2 sticks cold unsalted butter, cut into chunks\n" +
                "2 tablespoons milk\n" +
                "2 tablespoons coarse sugar",
        imageRes = R.drawable.pie,
        price = 299
    ),
    Snack(
        id = Random.nextLong(),
        name = "Chips",
        tagline = "Recipe",
        detail = "A detail place",
        imageRes = R.drawable.chips,
        price = 299
    ),
    Snack(
        id = Random.nextLong(),
        name = "Pretzels",
        tagline = "Recipe",
        detail = "Russet potatoes: This is my go to when I make homemade french fries and again for these homemade chips because they have a high starch content and low moisture content. And that means more crispy fries! You can use other potatoes though if you’d like, such as Yukon potatoes.\n" +
                "Spices: To season these chips, use paprika, garlic powder, salt and pepper. You can easily mix up your flavors with different spices though. And I like to add extra salt to taste when they come out of the oven.\n" +
                "Olive oil: Because we oven bake rather than fry, we only need a small amount of oil. You can use olive oil like I usually do, but another high heat oil like avocado oil will work well.",
        imageRes = R.drawable.pretzels,
        price = 299
    ),
    Snack(
        id = Random.nextLong(),
        name = "Smoothies",
        tagline = "Recipe",
        detail = "A detail place",
        imageRes = R.drawable.smoothies,
        price = 299
    ),
    Snack(
        id = Random.nextLong(),
        name = "Popcorn",
        tagline = "Recipe",
        detail = "Fresh local leafy greens\n" +
                "Fresh Mangoes\n" +
                "Organic Strawberries\n" +
                "Protein powder\n" +
                "Chia seeds\n" +
                "Almond milk\n" +
                "Quality chocolate, between 72- 90% cacoa\n" +
                "Puified water",
        imageRes = R.drawable.popcorn,
        price = 299
    ),
    Snack(
        id = Random.nextLong(),
        name = "Almonds",
        tagline = "Recipe",
        detail = "A detail place",
        imageRes = R.drawable.almonds,
        price = 299
    ),
    Snack(
        id = Random.nextLong(),
        name = "Cheese",
        tagline = "Recipe",
        detail = "2 cups whole almonds\n" +
                "1 tablespoon extra virgin olive oil\n" +
                "1 ½ tablespoon honey\n" +
                "¼ teaspoon kosher salt\n" +
                "2 tablespoons sugar\n" +
                "½-1 ¼ teaspoons cayenne pepper, Cayenne pepper can vary in intensity. Start with less and add more to taste.\n" +
                "1 teaspoon kosher salt",
        imageRes = R.drawable.cheese,
        price = 299
    ),
    Snack(
        id = Random.nextLong(),
        name = "Apples",
        tagline = "Recipe",
        detail = "Gala\n" +
                "Jonagold\n" +
                "Golden delicious\n" +
                "Honey Crisp\n" +
                "Pink Lady (pictured in this post)\n" +
                "Granny Smith\n" +
                "Jazz ",
        imageRes = R.drawable.apples,
        price = 299
    ),
    Snack(
        id = Random.nextLong(),
        name = "Apple sauce",
        tagline = "Recipe",
        detail = "4 apples - peeled, cored and chopped\n" +
                "¾ cup water\n" +
                "¼ cup white sugar\n" +
                "½ teaspoon ground cinnamon",
        imageRes = R.drawable.apple_sauce,
        price = 299
    ),
    Snack(
        id = Random.nextLong(),
        name = "Apple chips",
        tagline = "Recipe",
        detail = "3 large sweet crisp apples, such as Honeycrisp, Fuji, Jazz, or Pink Lady\n" +
                "¾ teaspoon ground cinnamon",
        imageRes = R.drawable.apple_chips,
        price = 299
    ),
    Snack(
        id = Random.nextLong(),
        name = "Apple juice",
        tagline = "Recipe",
        detail = "5 cups water\n" +
                "3 peels and cores from red apples - seeds removed\n" +
                "¼ cup white sugar",
        imageRes = R.drawable.apple_juice,
        price = 299
    ),
    Snack(
        id = Random.nextLong(),
        name = "Apple pie",
        tagline = "Recipe",
        detail = "2 Tbsp. butter\n" +
                "2 granny smith apples\n" +
                "¼ cup honey\n" +
                "1 tsp. cinnamon\n" +
                "½ tsp. vanilla\n" +
                "1 tsp. flour\n" +
                "1 sheet puff pastry, thawed\n" +
                "1 egg",
        imageRes = R.drawable.apple_pie,
        price = 299
    ),
    Snack(
        id = Random.nextLong(),
        name = "Grapes",
        tagline = "Recipe",
        detail = "Grapes – While I used green grapes here, you can certainly use red grapes as well. I prefer the seedless variety.\n" +
                "Eggs – You’ll need 4 eggs. This is what will give your clafoutis its signature dense flan-like consistency.\n" +
                "Sugar – Regular granulated sugar will give you the best results.\n" +
                "Vanilla Extract – You can experiment with other extracts like almond or rum. Keep in mind other flavors may be much stronger.\n" +
                "Flour – I always use all-purpose flour. You can use gluten-free flour if you need.\n" +
                "Melted Butter – You can use either salted or unsalted butter. If using unsalted butter, please add a pinch of salt.\n" +
                "Milk – I use 2% milk but you can use other fat percentage or even half and half.",
        imageRes = R.drawable.grapes,
        price = 299
    ),
    Snack(
        id = Random.nextLong(),
        name = "Kiwi",
        tagline = "Recipe",
        detail = "3 to 4 ripe kiwifruit, peeled, carefully chopped\n" +
                "1/4 cup pomegranate seeds (arils)\n" +
                "1/2 avocado, peeled and chopped (see how to cut and peel an avocado)\n" +
                "1 heaping tablespoon thinly sliced green onion\n" +
                "1 tablespoon (adjust to taste) chopped, deseeded, fresh or pickled jalapeño peppers\n" +
                "1 tablespoon chopped fresh cilantro\n" +
                "1 teaspoon extra virgin olive oil\n" +
                "Salt and pepper to taste",
        imageRes = R.drawable.kiwi,
        price = 299
    ),
    Snack(
        id = Random.nextLong(),
        name = "Mango",
        tagline = "Recipe",
        detail = "3 ripe mangos, diced (see photos)\n" +
                "1 medium red bell pepper, chopped\n" +
                "½ cup chopped red onion\n" +
                "¼ cup packed fresh cilantro leaves, chopped\n" +
                "1 jalapeño, seeded and minced\n" +
                "1 large lime, juiced (about ¼ cup lime juice)\n" +
                "⅛ to ¼ teaspoon salt, to taste",
        imageRes = R.drawable.mango,
        price = 299
    )
)
