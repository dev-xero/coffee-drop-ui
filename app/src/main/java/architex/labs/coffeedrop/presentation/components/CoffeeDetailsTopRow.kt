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
import androidx.compose.material.ripple.LocalRippleTheme
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import architex.labs.coffeedrop.R
import architex.labs.coffeedrop.presentation.theme.Neutrals100
import architex.labs.coffeedrop.presentation.theme.Neutrals200
import architex.labs.coffeedrop.presentation.theme.Neutrals400Transparent
import architex.labs.coffeedrop.presentation.utils.CustomRippleTheme

@Composable
fun CoffeeDetailsTopRow(
	modifier: Modifier = Modifier,
	icons: Pair<Int, Int>
) {
	Row(
		modifier = modifier.fillMaxWidth(),
		verticalAlignment = Alignment.CenterVertically,
		horizontalArrangement = Arrangement.SpaceBetween
	) {
		CompositionLocalProvider(LocalRippleTheme provides CustomRippleTheme) {
			IconButton(
				onClick = { /*TODO*/ },
				colors = IconButtonDefaults.iconButtonColors(
					containerColor = Neutrals400Transparent,
					contentColor = Neutrals100
				),
				modifier = Modifier
					.clip(RoundedCornerShape(16.dp))
					.size(48.dp),
				content = {
					Icon(
						painter = painterResource(id = icons.first),
						contentDescription = stringResource(id = R.string.description_back_btn),
						modifier = Modifier.size(24.dp)
					)
				}
			)

			IconButton(
				onClick = { /*TODO*/ },
				colors = IconButtonDefaults.iconButtonColors(
					containerColor = Neutrals400Transparent,
					contentColor = Neutrals200
				),
				modifier = Modifier
					.clip(RoundedCornerShape(16.dp))
					.size(48.dp),
				content = {
					Icon(
						painter = painterResource(id = icons.second),
						contentDescription = stringResource(id = R.string.description_heart_btn),
						modifier = Modifier.size(24.dp)
					)
				}
			)
		}
	}
}