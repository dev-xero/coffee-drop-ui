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
package architex.labs.coffeedrop.presentation.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import architex.labs.coffeedrop.R

val CircularStd = FontFamily(
	Font(
		resId = R.font.circular_std_book,
		weight = FontWeight.Normal
	),

	Font(
		resId = R.font.circular_std_bold,
		weight = FontWeight.Bold
	)
)

val Typography = Typography(
	displayLarge = TextStyle(
		fontFamily = CircularStd,
		fontWeight = FontWeight.Bold,
		fontSize = 32.sp,
		lineHeight = 40.sp
	),

	displayMedium = TextStyle(
		fontFamily = CircularStd,
		fontWeight = FontWeight.Bold,
		fontSize = 24.sp,
		lineHeight = 30.sp
	),

	bodyLarge = TextStyle(
		fontFamily = CircularStd,
		fontWeight = FontWeight.Bold,
		fontSize = 18.sp,
		lineHeight = 23.sp
	),

	bodyMedium = TextStyle(
		fontFamily = CircularStd,
		fontWeight = FontWeight.Normal,
		fontSize = 16.sp,
		lineHeight = 20.sp
	),

	labelMedium = TextStyle(
		fontFamily = CircularStd,
		fontWeight = FontWeight.Normal,
		fontSize = 18.sp,
		lineHeight = 23.sp
	),

	titleMedium = TextStyle(
		fontFamily = CircularStd,
		fontWeight = FontWeight.Bold,
		fontSize = 16.sp,
		lineHeight = 20.sp
	),

	titleSmall = TextStyle(
		fontFamily = CircularStd,
		fontWeight = FontWeight.Bold,
		fontSize = 14.sp,
		lineHeight = 18.sp
	),

	labelSmall = TextStyle(
		fontFamily = CircularStd,
		fontWeight = FontWeight.Normal,
		fontSize = 14.sp,
		lineHeight = 18.sp
	),
)