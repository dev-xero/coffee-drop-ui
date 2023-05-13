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

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import architex.labs.coffeedrop.R
import architex.labs.coffeedrop.presentation.theme.Neutrals100
import architex.labs.coffeedrop.presentation.theme.Neutrals200
import architex.labs.coffeedrop.presentation.theme.Primary

@Composable
fun CoffeeDetailsBottomRow(
	modifier: Modifier = Modifier,
	price: Double
) {
	Row(
		modifier = modifier.fillMaxWidth(),
		horizontalArrangement = Arrangement.SpaceBetween
	) {
		Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
			Text(
				text = stringResource(id = R.string.price_literal).uppercase(),
				style = MaterialTheme.typography.titleSmall,
				color = Neutrals200
			)

			Row(horizontalArrangement = Arrangement.spacedBy(2.dp)) {
				Text(
					text = stringResource(id = R.string.dollar_sign),
					style = MaterialTheme.typography.displayMedium,
					color = Primary
				)
				Text(
					text = stringResource(id = R.string.price, price),
					style = MaterialTheme.typography.displayMedium,
					color = Neutrals100
				)
			}
		}

		Button(
			onClick = { /*TODO*/ },
			elevation = ButtonDefaults.buttonElevation(0.dp),
			colors = ButtonDefaults.buttonColors(
				containerColor = Primary
			),
			shape = RoundedCornerShape(12.dp),
			content = {
				Text(
					text = stringResource(id = R.string.order_now),
					style = MaterialTheme.typography.bodyLarge,
					color = Neutrals100,
					modifier = Modifier.padding(vertical = 8.dp)
				)
			},
			modifier = Modifier.width(220.dp)
		)
	}
}