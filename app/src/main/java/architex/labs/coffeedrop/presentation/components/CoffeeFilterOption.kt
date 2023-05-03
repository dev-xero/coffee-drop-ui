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
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.clip
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp
import architex.labs.coffeedrop.domain.models.sub_models.CoffeeType
import architex.labs.coffeedrop.presentation.theme.CircularStd
import architex.labs.coffeedrop.presentation.theme.Neutrals200
import architex.labs.coffeedrop.presentation.theme.Primary

@Composable
fun CoffeeFilterOption(
	modifier: Modifier = Modifier,
	filterOption: CoffeeType,
	isActiveOption: Boolean,
	updateSelectedCoffeeType: () -> Unit
) {
	// Extending Modifier to disable ripple effect
	fun Modifier.clickableNoRipple(
		enabled: Boolean = true,
		onClickLabel: String? = null,
		role: Role? = null,
		onClick: () -> Unit,
	): Modifier = composed {
		this.clickable(
			interactionSource = remember { MutableInteractionSource() },
			indication = null,
			enabled = enabled,
			onClickLabel = onClickLabel,
			role = role,
			onClick = onClick
		)
	}

	Column(
		modifier = modifier
			.padding(horizontal = 12.dp)
			.clickableNoRipple(
				onClick = updateSelectedCoffeeType
			)
	) {
		Text(
			text = filterOption.type,
			color = if (isActiveOption) Primary else Neutrals200,
			modifier = Modifier.padding(bottom = 6.dp),
			style = MaterialTheme.typography.bodyLarge,
			fontFamily = CircularStd
		)

		Box(
			modifier = Modifier
				.size(width = if (isActiveOption) 40.dp else 0.dp, height = 4.dp)
				.clip(RoundedCornerShape(2.dp))
				.background(Primary)
		)
	}
}