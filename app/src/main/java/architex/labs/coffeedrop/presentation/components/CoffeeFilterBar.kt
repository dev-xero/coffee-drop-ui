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
package architex.labs.coffeedrop.presentation.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import architex.labs.coffeedrop.domain.models.sub_models.CoffeeType

@Composable
fun CoffeeFilterBar(
	modifier: Modifier = Modifier,
	activeOption: CoffeeType,
	filterOptions: List<CoffeeType>,
	updateSelectedCoffeeType: (CoffeeType) -> Unit
) {

	LazyRow(
		modifier = modifier.fillMaxWidth()
	) {
		item {
			for (filterOption in filterOptions) {
				CoffeeFilterOption(
					filterOption = filterOption,
					isActiveOption = filterOption == activeOption,
					updateSelectedCoffeeType = { updateSelectedCoffeeType(filterOption) }
				)
			}
		}
	}
}