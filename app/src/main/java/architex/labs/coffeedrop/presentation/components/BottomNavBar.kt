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
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import architex.labs.coffeedrop.application.navigation.bottom_nav.bottomNavItemList
import architex.labs.coffeedrop.presentation.theme.Neutrals200
import architex.labs.coffeedrop.presentation.theme.Neutrals400Transparent
import architex.labs.coffeedrop.presentation.theme.Primary

@Composable
fun BottomNavBar(
	modifier: Modifier = Modifier,
	currentScreen: String,
	changeCurrentScreen: (String) -> Unit
) {
	NavigationBar(
		modifier = modifier.fillMaxWidth(),
		containerColor = Neutrals400Transparent
	) {
		bottomNavItemList.forEach { navItem ->
			val isSelected = navItem.route == currentScreen

			NavigationBarItem(
				selected = isSelected,
				onClick = { changeCurrentScreen(navItem.route) },
				icon = {
					Icon(
						painter = if (isSelected)
							painterResource(id = navItem.selectedIcon)
						else
							painterResource(id = navItem.unselectedIcon),
						contentDescription = navItem.route
					)
				},
				alwaysShowLabel = false,
				colors = NavigationBarItemDefaults.colors(
					selectedIconColor = Primary,
					unselectedIconColor = Neutrals200,
					indicatorColor = Neutrals400Transparent
				)
			)
		}
	}
}