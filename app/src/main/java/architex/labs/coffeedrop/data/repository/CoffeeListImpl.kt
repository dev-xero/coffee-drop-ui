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
				variant = "With Oak Milk",
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
				description = R.string.cappuccino_description,
				variant = "With Chocolate",
				coffeeType = CoffeeType.Espresso,
				price = 4.40,
				rating = 4.4,
				reviews = 16200,
				roastingLevel = RoastingLevel.HighRoasted,
				coffeeSize = listOf(CoffeeSize.Small, CoffeeSize.Medium, CoffeeSize.Large)
			)
		)
}