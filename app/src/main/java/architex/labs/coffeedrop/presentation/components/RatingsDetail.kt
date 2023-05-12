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
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import architex.labs.coffeedrop.R
import architex.labs.coffeedrop.presentation.theme.Neutrals100
import architex.labs.coffeedrop.presentation.theme.Neutrals200
import architex.labs.coffeedrop.presentation.theme.Primary
import java.text.NumberFormat

@Composable
fun RatingDetails(
	modifier: Modifier = Modifier,
	ratings: Double,
	reviews: Int
) {
	Row(
		horizontalArrangement = Arrangement.spacedBy(8.dp),
		verticalAlignment = Alignment.CenterVertically
	) {
		Row(
			horizontalArrangement = Arrangement.spacedBy(4.dp),
			verticalAlignment = Alignment.CenterVertically
		) {
			Icon(
				painter = painterResource(id = R.drawable.icon_star),
				contentDescription = stringResource(id = R.string.description_rating),
				modifier = modifier.size(14.dp),
				tint = Primary
			)
			Text(
				text = ratings.toString(),
				style = MaterialTheme.typography.titleSmall,
				color = Neutrals100
			)
		}
		Text(
			text = stringResource(id = R.string.reviews, NumberFormat.getNumberInstance().format(reviews)),
			style = MaterialTheme.typography.titleSmall,
			color = Neutrals200
		)
	}
}