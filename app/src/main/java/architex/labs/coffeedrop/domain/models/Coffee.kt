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
package architex.labs.coffeedrop.domain.models

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import architex.labs.coffeedrop.domain.models.sub_models.CoffeeSize
import architex.labs.coffeedrop.domain.models.sub_models.CoffeeType
import architex.labs.coffeedrop.domain.models.sub_models.RoastingLevel

data class Coffee (
	val imageResID: DrawableRes,
	val name: StringRes,
	val description: StringRes,
	val variant: String,
	val coffeeType: CoffeeType,
	val price: Int,
	val rating: Int,
	val reviews: Int,
	val roastingLevel: RoastingLevel,
	val coffeeSize: CoffeeSize
)
