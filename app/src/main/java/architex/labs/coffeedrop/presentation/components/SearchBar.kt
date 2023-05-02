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

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import architex.labs.coffeedrop.R
import architex.labs.coffeedrop.presentation.theme.CircularStd
import architex.labs.coffeedrop.presentation.theme.Neutrals100
import architex.labs.coffeedrop.presentation.theme.Neutrals200
import architex.labs.coffeedrop.presentation.theme.Neutrals300
import architex.labs.coffeedrop.presentation.theme.Primary

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchBar(
	modifier: Modifier = Modifier,
	focusManager: FocusManager,
	searchValue: String,
	onSearchValueChange: (String) -> Unit
) {
	OutlinedTextField(
		value = searchValue, 
		onValueChange = onSearchValueChange,
		singleLine = true,
		maxLines = 1,
		shape = RoundedCornerShape(16.dp),
		modifier = modifier
			.fillMaxWidth()
			.padding(16.dp),
		placeholder = {
			Text(
				text = stringResource(id = R.string.search_bar_placeholder),
				style = MaterialTheme.typography.bodyLarge,
				fontFamily = CircularStd,
				color = Neutrals200
			)
		},
		leadingIcon = {
			Icon(
				painter = painterResource(id = R.drawable.icon_search),
				contentDescription = stringResource(id = R.string.description_search),
				modifier = Modifier.size(24.dp)
			)
		},
		colors = TextFieldDefaults.outlinedTextFieldColors(
			containerColor = Neutrals300,
			focusedLeadingIconColor = Primary,
			unfocusedLeadingIconColor = Neutrals100,
			focusedBorderColor = Neutrals300,
			unfocusedBorderColor = Neutrals300,
			textColor = Neutrals100
		),
		keyboardOptions = KeyboardOptions.Default.copy(
			keyboardType = KeyboardType.Text,
			imeAction = ImeAction.Go
		),
		keyboardActions = KeyboardActions(
			onGo = {
				focusManager.clearFocus()
			}
		)
	)
}