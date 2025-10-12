package com.brahmiayurved.myiconpack

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.ui.tooling.preview.Preview
import kotlin.Unit

public val MyIconPack.IcPhone: ImageVector
    get() {
        if (_icPhone != null) {
            return _icPhone!!
        }
        _icPhone = Builder(name = "IcPhone", defaultWidth = 800.0.dp, defaultHeight = 800.0.dp,
                viewportWidth = 1024.0f, viewportHeight = 1024.0f).apply {
            path(fill = SolidColor(Color(0xFF009688)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(834.1f, 149.3f)
                horizontalLineToRelative(-78.9f)
                curveTo(473.6f, 153.6f, 151.5f, 514.1f, 149.3f, 755.2f)
                verticalLineToRelative(78.9f)
                curveToRelative(0.0f, 21.3f, 17.1f, 40.5f, 40.5f, 40.5f)
                lineToRelative(160.0f, -2.1f)
                curveToRelative(21.3f, 0.0f, 40.5f, -19.2f, 40.5f, -40.5f)
                lineToRelative(4.3f, -174.9f)
                lineToRelative(-100.3f, -85.3f)
                curveToRelative(0.0f, -55.5f, 224.0f, -279.5f, 281.6f, -281.6f)
                lineToRelative(91.7f, 100.3f)
                lineToRelative(168.5f, -4.3f)
                curveToRelative(21.3f, 0.0f, 40.5f, -19.2f, 40.5f, -40.5f)
                lineTo(874.7f, 189.9f)
                curveToRelative(0.0f, -23.5f, -17.1f, -40.5f, -40.5f, -40.5f)
                close()
            }
        }
        .build()
        return _icPhone!!
    }

private var _icPhone: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MyIconPack.IcPhone, contentDescription = "")
    }
}
