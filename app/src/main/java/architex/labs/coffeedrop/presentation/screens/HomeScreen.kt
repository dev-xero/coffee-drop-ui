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
package architex.labs.coffeedrop.presentation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import architex.labs.coffeedrop.presentation.components.AppBar
import architex.labs.coffeedrop.presentation.theme.Neutrals400

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
	modifier: Modifier = Modifier
) {
	Scaffold(
		modifier = modifier.background(Neutrals400),
		topBar = {
			AppBar(modifier = Modifier.padding(16.dp))
		},
		content = { contentPadding ->
			LazyColumn(modifier = Modifier.padding(contentPadding)) {
				item {
					Text(
						text = "String",
						modifier = Modifier.padding(horizontal = 16.dp)
					)
				}
			}
		}
	)
}