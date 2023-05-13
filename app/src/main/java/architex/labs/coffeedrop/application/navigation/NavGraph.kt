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
package architex.labs.coffeedrop.application.navigation

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import architex.labs.coffeedrop.application.navigation.routes.NavRoutes
import architex.labs.coffeedrop.presentation.screens.CoffeeDetailsScreen
import architex.labs.coffeedrop.presentation.screens.HomeScreen
import architex.labs.coffeedrop.presentation.viewmodels.CoffeeDetailsScreenViewModel
import architex.labs.coffeedrop.presentation.viewmodels.HomeScreenViewModel

@Composable
fun NavGraph(
	navController: NavHostController
) {
	NavHost(navController = navController, startDestination = NavRoutes.HomeScreen.route) {
		composable(route = NavRoutes.HomeScreen.route) {
			val viewModel = hiltViewModel<HomeScreenViewModel>()
			HomeScreen(
				viewModel = viewModel,
				onCoffeeDetailScreenClicked = {
					val id = viewModel.selectedCoffeeID.toString()
					navController.navigate( "${NavRoutes.CoffeeDetailScreen.route}/$id" )
				},

			)
		}
		composable(route = "${NavRoutes.CoffeeDetailScreen.route}/{id}") { navBackStack ->
			val viewModel = hiltViewModel<CoffeeDetailsScreenViewModel>()
			val id = navBackStack.arguments?.getString("id")!!.toInt()
			viewModel.setCoffeeID(id)

			CoffeeDetailsScreen(
				viewModel = viewModel,
				onBackButtonClicked = { navController.popBackStack() }
			)
		}
	}
}
