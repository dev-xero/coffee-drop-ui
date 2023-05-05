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
package architex.labs.coffeedrop.presentation.utils

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.semantics.Role

// Extending Modifier to disable ripple effect
fun Modifier.clickableNoRipple(
	enabled: Boolean = true,
	onClickLabel: String? = null,
	role: Role? = null,
	onClick: () -> Unit,
): Modifier = composed {
	this.clickable(
		interactionSource = remember { MutableInteractionSource() },
		indication = null,
		enabled = enabled,
		onClickLabel = onClickLabel,
		role = role,
		onClick = onClick
	)
}