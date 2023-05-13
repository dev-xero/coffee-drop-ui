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
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import architex.labs.coffeedrop.domain.models.sub_models.CoffeeSize
import architex.labs.coffeedrop.presentation.theme.Accent
import architex.labs.coffeedrop.presentation.theme.Neutrals200
import architex.labs.coffeedrop.presentation.theme.Neutrals300
import architex.labs.coffeedrop.presentation.theme.Primary
import architex.labs.coffeedrop.presentation.utils.clickableNoRipple

@Composable
fun SizeDisplay(
	modifier: Modifier = Modifier,
	size: CoffeeSize,
	isSelected: Boolean,
	count: Int,
	setCoffeeSize: () -> Unit
) {
	Box(
		contentAlignment = Alignment.Center,
		modifier = modifier
			.border(
				width = 1.dp,
				color = if (isSelected) Primary else Neutrals300,
				shape = when (count) {
					1 -> RoundedCornerShape(
						topStart = 8.dp,
						topEnd = 4.dp,
						bottomStart = 8.dp,
						bottomEnd = 4.dp
					)
					2 -> RoundedCornerShape(4.dp)
					else -> RoundedCornerShape(
						topStart = 4.dp,
						topEnd = 8.dp,
						bottomStart = 4.dp,
						bottomEnd = 8.dp
					)
				}
			)
			.clip(
				shape = when (count) {
					1 -> RoundedCornerShape(
						topStart = 8.dp,
						topEnd = 4.dp,
						bottomStart = 8.dp,
						bottomEnd = 4.dp
					)
					2 -> RoundedCornerShape(4.dp)
					else -> RoundedCornerShape(
						topStart = 4.dp,
						topEnd = 8.dp,
						bottomStart = 4.dp,
						bottomEnd = 8.dp
					)
				}
			)
			.background(if (isSelected) Accent else Neutrals300)
			.clickableNoRipple(
				onClick = setCoffeeSize
			)
	) {
		Text(
			text = size.size,
			style = MaterialTheme.typography.titleMedium,
			color = if (isSelected) Primary else Neutrals200,
			modifier = modifier.padding(16.dp)
		)
	}
}