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
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import architex.labs.coffeedrop.R
import architex.labs.coffeedrop.presentation.theme.Neutrals100
import architex.labs.coffeedrop.presentation.theme.Neutrals200
import architex.labs.coffeedrop.presentation.theme.Neutrals300

@Composable
fun SpecialForYouCard(
	modifier: Modifier = Modifier,
	imageResID: Int
) {
	Row(
		modifier = modifier
			.fillMaxWidth()
			.clip(RoundedCornerShape(16.dp))
			.background(Neutrals300)
	) {
		Row(
			modifier = Modifier
				.fillMaxWidth()
				.padding(12.dp),
			horizontalArrangement = Arrangement.spacedBy(12.dp)
		) {
			Image(
				painter = painterResource(id = imageResID),
				contentDescription = stringResource(id = R.string.description_for_you_image),
				contentScale = ContentScale.Crop,
				modifier = Modifier
					.size(96.dp)
					.clip(RoundedCornerShape(12.dp))
			)

			Column(
				verticalArrangement = Arrangement.spacedBy(6.dp)
			) {
				Text(
					text = stringResource(id = R.string.five_coffee_beans_to_try),
					style = MaterialTheme.typography.bodyLarge,
					color = Neutrals100
				)
				Text(
					text = stringResource(id = R.string.special_for_you_headline),
					style = MaterialTheme.typography.bodyMedium,
					color = Neutrals200
				)
			}
		}
	}
}