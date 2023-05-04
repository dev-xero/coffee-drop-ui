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
import androidx.compose.foundation.layout.Row
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
import androidx.compose.ui.zIndex
import architex.labs.coffeedrop.R
import architex.labs.coffeedrop.presentation.theme.Neutrals400Transparent
import architex.labs.coffeedrop.presentation.theme.Primary

@Composable
fun RatingBadge(
	modifier: Modifier = Modifier,
	rating: Double
) {
	Box(
		modifier = modifier
			.clip(
				RoundedCornerShape(
					topEnd = 12.dp,
					bottomStart = 12.dp,
				)
			)
			.background(Neutrals400Transparent)
			.zIndex(99f)
	) {
		Row(
			horizontalArrangement = Arrangement.spacedBy(4.dp),
			verticalAlignment = Alignment.CenterVertically,
			modifier = Modifier
				.padding(horizontal = 8.dp, vertical = 4.dp)
		) {
			Icon(
				painter = painterResource(id = R.drawable.icon_star),
				contentDescription = stringResource(id = R.string.description_rating),
				tint = Primary,
				modifier = Modifier.size(14.dp)
			)
			Text(
				text = rating.toString(),
				style = MaterialTheme.typography.titleSmall
			)
		}
	}
}