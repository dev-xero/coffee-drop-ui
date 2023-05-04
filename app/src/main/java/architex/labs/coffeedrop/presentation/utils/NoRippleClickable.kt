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