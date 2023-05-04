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
package architex.labs.coffeedrop.presentation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import architex.labs.coffeedrop.R
import architex.labs.coffeedrop.presentation.components.AppBar
import architex.labs.coffeedrop.presentation.components.CoffeeCard
import architex.labs.coffeedrop.presentation.components.CoffeeFilterBar
import architex.labs.coffeedrop.presentation.components.SearchBar
import architex.labs.coffeedrop.presentation.theme.Neutrals100
import architex.labs.coffeedrop.presentation.theme.Neutrals200
import architex.labs.coffeedrop.presentation.theme.Neutrals400
import architex.labs.coffeedrop.presentation.viewmodels.HomeScreenViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
	modifier: Modifier = Modifier,
	viewModel: HomeScreenViewModel
) {
	val focusManager = LocalFocusManager.current

	Scaffold(
		modifier = modifier.background(Neutrals400),
		topBar = {
			AppBar(modifier = Modifier.padding(16.dp))
		},
		content = { contentPadding ->
			LazyColumn(modifier = Modifier.padding(contentPadding)) {
				item {
					Column(
						modifier = Modifier.padding(16.dp)
					) {
						Text(
							text = stringResource(id = R.string.headline_1),
							style = MaterialTheme.typography.displayMedium,
							color = Neutrals200
						)
						Text(
							text = stringResource(id = R.string.headline_2),
							style = MaterialTheme.typography.displayLarge,
							color = Neutrals100
						)
					}

					SearchBar(
						focusManager = focusManager,
						searchValue = viewModel.searchString,
						onSearchValueChange = { viewModel.updateSearchString(it) }
					)
				}

				item {
					CoffeeFilterBar(
						modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp),
						activeOption = viewModel.selectedCoffeeType,
						filterOptions = viewModel.coffeeTypeList,
						updateSelectedCoffeeType = { viewModel.updateSelectedCoffeeType(it) }
					)
				}

				item {
					LazyRow(
						modifier = Modifier.padding(horizontal = 12.dp, vertical = 12.dp),
						horizontalArrangement = Arrangement.spacedBy(12.dp)
					) {
						for (coffee in viewModel.filteredCoffeeList) {
							item {
								CoffeeCard(coffee = coffee)
							}
						}
					}
				}
			}
		}
	)
}