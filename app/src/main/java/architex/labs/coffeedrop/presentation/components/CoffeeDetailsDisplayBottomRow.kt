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

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import architex.labs.coffeedrop.R
import architex.labs.coffeedrop.presentation.theme.Accent
import architex.labs.coffeedrop.presentation.theme.Neutrals100
import architex.labs.coffeedrop.presentation.theme.Neutrals200
import architex.labs.coffeedrop.presentation.theme.Neutrals400Transparent

@Composable
fun CoffeeDetailsDisplayBottomRow(
	modifier: Modifier = Modifier,
	titleResID: Int,
	variant: String,
	ratings: Double,
	reviews: Int,
	coffeeType: String
) {
	Row(
		verticalAlignment = Alignment.CenterVertically,
		horizontalArrangement = Arrangement.SpaceBetween,
		modifier = modifier
			.fillMaxWidth()
			.clip(RoundedCornerShape(12.dp))
			.background(Neutrals400Transparent)
			.padding(18.dp)
	) {
		Column(
			verticalArrangement = Arrangement.spacedBy(8.dp)
		) {
			Text(
				text = stringResource(id = titleResID),
				style = MaterialTheme.typography.bodyLarge,
				color = Neutrals100
			)
			Text(
				text = variant,
				style = MaterialTheme.typography.bodyMedium,
				color = Neutrals200
			)
			RatingDetails(
				ratings = ratings,
				reviews = reviews
			)
		}
		Column(
			verticalArrangement = Arrangement.spacedBy(8.dp),
			horizontalAlignment = Alignment.CenterHorizontally
		) {
			Row(
				horizontalArrangement = Arrangement.spacedBy(4.dp)
			) {
				Box(
					contentAlignment = Alignment.Center,
					modifier = modifier
						.clip(RoundedCornerShape(12.dp))
						.size(48.dp)
						.background(Neutrals100)
				) {
					Icon(
						painter = painterResource(id = R.drawable.icon_coffee_cup),
						contentDescription = null,
						tint = Accent,
						modifier = Modifier.size(24.dp)
					)
				}
				Box(
					contentAlignment = Alignment.Center,
					modifier = modifier
						.clip(RoundedCornerShape(12.dp))
						.size(48.dp)
						.background(Neutrals100)
				) {
					Icon(
						painter = painterResource(id = R.drawable.icon_milk_drop),
						contentDescription = null,
						tint = Accent,
						modifier = Modifier.size(24.dp)
					)
				}
			}

			Text(
				text = coffeeType,
				style = MaterialTheme.typography.titleMedium,
				color = Neutrals100
			)
		}
	}
}