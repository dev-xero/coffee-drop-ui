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

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import architex.labs.coffeedrop.R
import architex.labs.coffeedrop.presentation.components.CoffeeDetailsDisplay
import architex.labs.coffeedrop.presentation.components.SizeDisplay
import architex.labs.coffeedrop.presentation.theme.Neutrals100
import architex.labs.coffeedrop.presentation.theme.Neutrals200
import architex.labs.coffeedrop.presentation.theme.Neutrals400
import architex.labs.coffeedrop.presentation.theme.Primary
import architex.labs.coffeedrop.presentation.utils.clickableNoRipple
import architex.labs.coffeedrop.presentation.viewmodels.CoffeeDetailsScreenViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CoffeeDetailsScreen(
	modifier: Modifier = Modifier,
	viewModel: CoffeeDetailsScreenViewModel,
	onBackButtonClicked: () -> Unit
) {
	val selectedCoffee = viewModel.selectedCoffee!!

	Scaffold(
		modifier = modifier.background(Neutrals400),
		content = {contentPadding ->
			LazyColumn(modifier = Modifier.padding(contentPadding)) {
				item {
					selectedCoffee.run {
						Column(
							verticalArrangement = Arrangement.spacedBy(16.dp)
						) {
							CoffeeDetailsDisplay(
								imageResID = imageResID,
								titleRedID = name,
								variant = variant,
								ratings = rating,
								reviews = reviews,
								coffeeType = roastingLevel.roastingLevel,
								onBackButtonClicked = onBackButtonClicked
							)

							Column(
								verticalArrangement = Arrangement.spacedBy(8.dp),
								modifier = Modifier.padding(horizontal = 12.dp)
							) {
								Text(
									text = stringResource(id = R.string.description),
									style = MaterialTheme.typography.displayMedium,
									color = Neutrals100
								)

								Column(
									modifier = Modifier.fillMaxWidth(),
									verticalArrangement = Arrangement.spacedBy(2.dp)
								) {
									Text(
										text = stringResource(id = description),
										style = MaterialTheme.typography.bodyMedium,
										color = Neutrals200,
										maxLines = if (viewModel.isDescriptionExpanded) 30 else 2,
										overflow = TextOverflow.Ellipsis
									)
									Text(
										text = if (viewModel.isDescriptionExpanded)
											stringResource(id = R.string.read_less)
										else
											stringResource(id = R.string.read_more),
										style = MaterialTheme.typography.bodyMedium,
										color = Primary,
										modifier = Modifier.clickableNoRipple { viewModel.toggleIsDescriptionExpanded() }
									)
								}
							}

							Column(
								verticalArrangement = Arrangement.spacedBy(12.dp),
								modifier = Modifier.padding(horizontal = 12.dp)
							) {
								Text(
									text = stringResource(id = R.string.size),
									style = MaterialTheme.typography.bodyLarge,
									color = Neutrals200
								)

								Row(
									modifier = Modifier.fillMaxWidth(),
									horizontalArrangement = Arrangement.spacedBy(8.dp)
								) {
									for ((count, size) in coffeeSize.withIndex()) {
										SizeDisplay(
											size = size,
											isSelected = if (viewModel.selectedCoffeeSize == null)
												count == 0
											else
												viewModel.selectedCoffeeSize!!.size == size.size,
											modifier = Modifier.weight(1f / 3f),
											count = count+1,
											setCoffeeSize = { Log.d("COFFEE_DEBUG", size.toString()) }
										)
									}
								}
							}
						}
					}
				}
			}
		}
	)
}