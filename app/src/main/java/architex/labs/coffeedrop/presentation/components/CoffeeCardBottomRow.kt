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
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
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
import architex.labs.coffeedrop.presentation.theme.Neutrals100
import architex.labs.coffeedrop.presentation.theme.Primary

@Composable
fun CoffeeCardBottomRow(
	modifier: Modifier = Modifier,
	price: Double
) {
	Row(
		modifier = modifier.fillMaxWidth(),
		horizontalArrangement = Arrangement.SpaceBetween,
		verticalAlignment = Alignment.CenterVertically
	) {
		Row (
			horizontalArrangement = Arrangement.spacedBy(2.dp)
		) {
			Text(
				text = stringResource(id = R.string.dollar_sign),
				style = MaterialTheme.typography.bodyLarge,
				color = Primary
			)
			Text(
				text = price.toString(),
				style = MaterialTheme.typography.bodyLarge,
				color = Neutrals100
			)
		}
		
		IconButton(
			onClick = { /*TODO*/ },
			colors = IconButtonDefaults.iconButtonColors(
				containerColor = Primary,
				contentColor = Neutrals100
			),
			modifier = Modifier
				.clip(RoundedCornerShape(8.dp))
				.size(32.dp)
		) {
			Icon(
				painter = painterResource(id = R.drawable.icon_plus),
				contentDescription = stringResource(id = R.string.description_add_button),
				tint = Neutrals100,
				modifier = Modifier.size(18.dp)
			)
		}
	}
}