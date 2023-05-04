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

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import architex.labs.coffeedrop.domain.models.Coffee
import architex.labs.coffeedrop.presentation.theme.Neutrals100
import architex.labs.coffeedrop.presentation.theme.Neutrals200
import architex.labs.coffeedrop.presentation.theme.Neutrals300

@Composable
fun CoffeeCard(
	modifier: Modifier = Modifier,
	coffee: Coffee
) {
	Column(
		modifier = modifier
			.size(width = 164.dp, height = 260.dp)
			.clip(RoundedCornerShape(16.dp))
			.background(Neutrals300)
			.padding(8.dp)
	) {
		Column(
			modifier = Modifier
				.fillMaxSize(),
			verticalArrangement = Arrangement.spacedBy(8.dp),
		) {
			Box(
				modifier = Modifier
					.size(156.dp)
					.clip(RoundedCornerShape(12.dp)),
				contentAlignment = Alignment.TopEnd
			) {
				RatingBadge(rating = coffee.rating)
				Image(
					painter = painterResource(id = coffee.imageResID),
					contentDescription = stringResource(id = coffee.name),
					contentScale = ContentScale.Crop
				)
			}

			Column(
				verticalArrangement = Arrangement.spacedBy(6.dp)
			) {
				Text(
					text = stringResource(id = coffee.name),
					style = MaterialTheme.typography.titleMedium,
					color = Neutrals100
				)
				Text(
					text = coffee.variant,
					style = MaterialTheme.typography.labelSmall,
					color = Neutrals200
				)
				CoffeeCardBottomRow(
					price = coffee.price,
				)
			}
		}
	}
}
