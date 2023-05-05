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
package architex.labs.coffeedrop.application.navigation.bottom_nav

import architex.labs.coffeedrop.R
import architex.labs.coffeedrop.presentation.utils.BottomNavItem

val bottomNavItemList: MutableList<BottomNavItem> = mutableListOf(
	BottomNavItem(
		selectedIcon = R.drawable.icon_home_filled,
		unselectedIcon = R.drawable.icon_home_outline,
		route = "Home"
	),

	BottomNavItem(
		selectedIcon = R.drawable.icon_shopping_bag_filled,
		unselectedIcon = R.drawable.icon_shopping_bag_outline,
		route = "Cart"
	),

	BottomNavItem(
		selectedIcon = R.drawable.icon_heart_filled,
		unselectedIcon = R.drawable.icon_heart_outline,
		route = "Favorites"
	),

	BottomNavItem(
		selectedIcon = R.drawable.icon_notification_filled,
		unselectedIcon = R.drawable.icon_notification_outline,
		route = "Notification"
	)
)