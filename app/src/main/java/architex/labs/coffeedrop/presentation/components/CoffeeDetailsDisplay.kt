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
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import architex.labs.coffeedrop.R

@Composable
fun CoffeeDetailsDisplay(
	modifier: Modifier = Modifier,
	imageResID: Int,
	titleRedID: Int,
	variant: String,
	ratings: Double,
	reviews: Int,
	coffeeType: String,
	onBackButtonClicked: () -> Unit
) {
	Column(
		modifier = modifier
			.fillMaxSize()
			.padding(12.dp)
	) {
		Box(
			modifier = Modifier.widthIn(max = 400.dp).height(440.dp)
		) {
			Column(
				verticalArrangement = Arrangement.SpaceBetween,
				modifier = Modifier
					.zIndex(99f)
					.height(452.dp)
			) {
				CoffeeDetailsTopRow(
					icons = Pair(R.drawable.icon_arrow_left, R.drawable.icon_heart_filled),
					onBackButtonClicked = onBackButtonClicked,
					modifier = Modifier
						.zIndex(99f)
						.padding(8.dp)
				)

				CoffeeDetailsDisplayBottomRow(
					titleResID = titleRedID,
					variant = variant,
					modifier = Modifier
						.padding(8.dp),
					ratings = ratings,
					reviews = reviews,
					coffeeType = coffeeType
				)
			}
			Image(
				painter = painterResource(id = imageResID),
				contentDescription = stringResource(id = R.string.description_coffee_image),
				contentScale = ContentScale.Crop,
				modifier = Modifier
					.clip(
						RoundedCornerShape(
							topStart = 24.dp,
							topEnd = 24.dp,
							bottomStart = 12.dp,
							bottomEnd = 12.dp
						)
					)
					.size(width = 400.dp, height = 460.dp)
			)
		}
	}
}