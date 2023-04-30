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
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import architex.labs.coffeedrop.R
import architex.labs.coffeedrop.presentation.theme.CoffeeDropTheme
import architex.labs.coffeedrop.presentation.theme.Neutrals100
import architex.labs.coffeedrop.presentation.theme.Neutrals300

@Composable
fun AppBar(
	modifier: Modifier = Modifier
) {
	Row(
		modifier = modifier.fillMaxWidth(),
		verticalAlignment = Alignment.CenterVertically,
		horizontalArrangement = Arrangement.SpaceBetween
	) {
		Box(
			modifier = Modifier
				.size(48.dp)
				.clip(RoundedCornerShape(16.dp))
				.background(Neutrals300),
			contentAlignment = Alignment.Center
		) {
			Icon(
				painter = painterResource(id = R.drawable.icon_menu),
				contentDescription = stringResource(id = R.string.description_menu),
				tint = Neutrals100,
				modifier = Modifier.size(24.dp)
			)
		}

		Image(
			painter = painterResource(id = R.drawable.avatar),
			contentDescription = stringResource(id = R.string.description_avatar),
			contentScale = ContentScale.Crop,
			modifier = Modifier
				.size(48.dp)
				.clip(RoundedCornerShape(16.dp))
				.border(2.dp, Neutrals100, RoundedCornerShape(16.dp))
		)
	}
}

@Preview
@Composable
fun AppBarDefaultPreview() {
	CoffeeDropTheme {
		AppBar()
	}
}