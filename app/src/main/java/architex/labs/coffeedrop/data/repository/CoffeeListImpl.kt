/**
 * Copyright (C) [2023 - Present] - Xero
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
package architex.labs.coffeedrop.data.repository

import architex.labs.coffeedrop.R
import architex.labs.coffeedrop.domain.models.Coffee
import architex.labs.coffeedrop.domain.models.sub_models.CoffeeSize
import architex.labs.coffeedrop.domain.models.sub_models.CoffeeType
import architex.labs.coffeedrop.domain.models.sub_models.RoastingLevel
import architex.labs.coffeedrop.domain.repository.CoffeeList

class CoffeeListImpl : CoffeeList {

	override val coffeeList: List<Coffee>
		get() = listOf(
			Coffee(
				imageResID = R.drawable.image_1,
				name = R.string.cappuccino,
				description = R.string.cappuccino_description,
				variant = "With Oat Milk",
				coffeeType = CoffeeType.Cappuccino,
				price = 4.20,
				rating = 4.6,
				reviews = 18048,
				roastingLevel = RoastingLevel.MediumRoasted,
				coffeeSize = listOf(CoffeeSize.Small, CoffeeSize.Medium, CoffeeSize.Large)
			),

			Coffee(
				imageResID = R.drawable.image_2,
				name = R.string.espresso,
				description = R.string.espresso_description,
				variant = "With Chocolate",
				coffeeType = CoffeeType.Espresso,
				price = 4.40,
				rating = 4.4,
				reviews = 16204,
				roastingLevel = RoastingLevel.HighRoasted,
				coffeeSize = listOf(CoffeeSize.Small, CoffeeSize.Medium, CoffeeSize.Large)
			),

			Coffee(
				imageResID = R.drawable.image_3,
				name = R.string.cappuccino,
				description = R.string.cappuccino_description,
				variant = "With Creamy Milk",
				coffeeType = CoffeeType.Cappuccino,
				price = 4.80,
				rating = 4.9,
				reviews = 24912,
				roastingLevel = RoastingLevel.MediumRoasted,
				coffeeSize = listOf(CoffeeSize.Small, CoffeeSize.Medium, CoffeeSize.Large)
			),

			Coffee(
				imageResID = R.drawable.image_4,
				name = R.string.mocha,
				description = R.string.mocha_description,
				variant = "With Whole Milk",
				coffeeType = CoffeeType.Mocha,
				price = 4.00,
				rating = 4.2,
				reviews = 71684,
				roastingLevel = RoastingLevel.LowRoasted,
				coffeeSize = listOf(CoffeeSize.Small, CoffeeSize.Medium, CoffeeSize.Large)
			),

			Coffee(
				imageResID = R.drawable.image_5,
				name = R.string.cortado,
				description = R.string.cortado_description,
				variant = "With Coconut Milk",
				coffeeType = CoffeeType.Cortado,
				price = 5.00,
				rating = 4.8,
				reviews = 64122,
				roastingLevel = RoastingLevel.MediumRoasted,
				coffeeSize = listOf(CoffeeSize.Small, CoffeeSize.Medium, CoffeeSize.Large)
			),

			Coffee(
				imageResID = R.drawable.image_6,
				name = R.string.latte,
				description = R.string.latte_description,
				variant = "With Almond Milk",
				coffeeType = CoffeeType.Latte,
				price = 4.20,
				rating = 4.6,
				reviews = 24708,
				roastingLevel = RoastingLevel.HighRoasted,
				coffeeSize = listOf(CoffeeSize.Small, CoffeeSize.Medium, CoffeeSize.Large)
			),

			Coffee(
				imageResID = R.drawable.image_7,
				name = R.string.cappuccino,
				description = R.string.cappuccino_description,
				variant = "With Skim Milk",
				coffeeType = CoffeeType.Cappuccino,
				price = 4.45,
				rating = 4.5,
				reviews = 3270,
				roastingLevel = RoastingLevel.HighRoasted,
				coffeeSize = listOf(CoffeeSize.Small, CoffeeSize.Medium, CoffeeSize.Large)
			),

			Coffee(
				imageResID = R.drawable.image_8,
				name = R.string.double_espresso,
				description = R.string.double_espresso_description,
				variant = "With Whole Milk",
				coffeeType = CoffeeType.DoubleEspresso,
				price = 4.67,
				rating = 4.3,
				reviews = 11051,
				roastingLevel = RoastingLevel.LowRoasted,
				coffeeSize = listOf(CoffeeSize.Small, CoffeeSize.Medium, CoffeeSize.Large)
			),

			Coffee(
				imageResID = R.drawable.image_9,
				name = R.string.espresso,
				description = R.string.espresso_description,
				variant = "With Whole Milk",
				coffeeType = CoffeeType.Espresso,
				price = 4.90,
				rating = 4.7,
				reviews = 41002,
				roastingLevel = RoastingLevel.LowRoasted,
				coffeeSize = listOf(CoffeeSize.Small, CoffeeSize.Medium, CoffeeSize.Large)
			),

			Coffee(
				imageResID = R.drawable.image_10,
				name = R.string.cortado,
				description = R.string.cortado_description,
				variant = "With Soy Milk",
				coffeeType = CoffeeType.Cortado,
				price = 5.20,
				rating = 4.9,
				reviews = 84311,
				roastingLevel = RoastingLevel.MediumRoasted,
				coffeeSize = listOf(CoffeeSize.Small, CoffeeSize.Medium, CoffeeSize.Large)
			),

			Coffee(
				imageResID = R.drawable.image_11,
				name = R.string.cortado,
				description = R.string.cortado_description,
				variant = "With Oat Milk",
				coffeeType = CoffeeType.Cortado,
				price = 5.12,
				rating = 4.8,
				reviews = 33001,
				roastingLevel = RoastingLevel.HighRoasted,
				coffeeSize = listOf(CoffeeSize.Small, CoffeeSize.Medium, CoffeeSize.Large)
			),

			Coffee(
				imageResID = R.drawable.image_12,
				name = R.string.latte,
				description = R.string.latte_description,
				variant = "With Soy Milk",
				coffeeType = CoffeeType.Latte,
				price = 4.90,
				rating = 4.6,
				reviews = 7020,
				roastingLevel = RoastingLevel.LowRoasted,
				coffeeSize = listOf(CoffeeSize.Small, CoffeeSize.Medium, CoffeeSize.Large)
			),

			Coffee(
				imageResID = R.drawable.image_13,
				name = R.string.cappuccino,
				description = R.string.cappuccino_description,
				variant = "With Oat Milk",
				coffeeType = CoffeeType.Cappuccino,
				price = 4.90,
				rating = 4.7,
				reviews = 62010,
				roastingLevel = RoastingLevel.HighRoasted,
				coffeeSize = listOf(CoffeeSize.Small, CoffeeSize.Large)
			),

			Coffee(
				imageResID = R.drawable.image_14,
				name = R.string.espresso,
				description = R.string.espresso_description,
				variant = "With Skim Milk",
				coffeeType = CoffeeType.Espresso,
				price = 4.40,
				rating = 4.8,
				reviews = 18231,
				roastingLevel = RoastingLevel.MediumRoasted,
				coffeeSize = listOf(CoffeeSize.Small, CoffeeSize.Medium)
			),

			Coffee(
				imageResID = R.drawable.image_15,
				name = R.string.latte,
				description = R.string.latte_description,
				variant = "With Almond Milk",
				coffeeType = CoffeeType.Latte,
				price = 5.00,
				rating = 4.9,
				reviews = 77025,
				roastingLevel = RoastingLevel.HighRoasted,
				coffeeSize = listOf(CoffeeSize.Small, CoffeeSize.Medium, CoffeeSize.Large)
			),

			Coffee(
				imageResID = R.drawable.image_16,
				name = R.string.mocha,
				description = R.string.mocha_description,
				variant = "With Soy Milk",
				coffeeType = CoffeeType.Mocha,
				price = 4.75,
				rating = 4.8,
				reviews = 10030,
				roastingLevel = RoastingLevel.LowRoasted,
				coffeeSize = listOf(CoffeeSize.Small, CoffeeSize.Medium, CoffeeSize.Large)
			),

			Coffee(
				imageResID = R.drawable.image_17,
				name = R.string.cortado,
				description = R.string.cortado_description,
				variant = "With Skim Milk",
				coffeeType = CoffeeType.Cortado,
				price = 5.20,
				rating = 4.9,
				reviews = 98160,
				roastingLevel = RoastingLevel.HighRoasted,
				coffeeSize = listOf(CoffeeSize.Small, CoffeeSize.Medium, CoffeeSize.Large)
			),

			Coffee(
				imageResID = R.drawable.image_18,
				name = R.string.double_espresso,
				description = R.string.double_espresso_description,
				variant = "With Oat Milk",
				coffeeType = CoffeeType.DoubleEspresso,
				price = 4.10,
				rating = 4.4,
				reviews = 53990,
				roastingLevel = RoastingLevel.LowRoasted,
				coffeeSize = listOf(CoffeeSize.Small, CoffeeSize.Medium, CoffeeSize.Large)
			),

			Coffee(
				imageResID = R.drawable.image_19,
				name = R.string.double_espresso,
				description = R.string.double_espresso_description,
				variant = "With Coconut Milk",
				coffeeType = CoffeeType.DoubleEspresso,
				price = 4.20,
				rating = 4.7,
				reviews = 8100,
				roastingLevel = RoastingLevel.MediumRoasted,
				coffeeSize = listOf(CoffeeSize.Small, CoffeeSize.Medium, CoffeeSize.Large)
			),

			Coffee(
				imageResID = R.drawable.image_20,
				name = R.string.mocha,
				description = R.string.mocha_description,
				variant = "With Coconut Milk",
				coffeeType = CoffeeType.Mocha,
				price = 4.80,
				rating = 4.8,
				reviews = 32021,
				roastingLevel = RoastingLevel.MediumRoasted,
				coffeeSize = listOf(CoffeeSize.Small, CoffeeSize.Medium, CoffeeSize.Large)
			)
		)
}