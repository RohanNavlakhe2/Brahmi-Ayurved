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

public val MyIconPack.IcLinkedin: ImageVector
    get() {
        if (_icLinkedin != null) {
            return _icLinkedin!!
        }
        _icLinkedin = Builder(name = "IcLinkedin", defaultWidth = 800.0.dp, defaultHeight =
                800.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF0A66C2)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.225f, 12.225f)
                horizontalLineToRelative(-1.778f)
                lineTo(10.447f, 9.44f)
                curveToRelative(0.0f, -0.664f, -0.012f, -1.519f, -0.925f, -1.519f)
                curveToRelative(-0.926f, 0.0f, -1.068f, 0.724f, -1.068f, 1.47f)
                verticalLineToRelative(2.834f)
                lineTo(6.676f, 12.225f)
                lineTo(6.676f, 6.498f)
                horizontalLineToRelative(1.707f)
                verticalLineToRelative(0.783f)
                horizontalLineToRelative(0.024f)
                curveToRelative(0.348f, -0.594f, 0.996f, -0.95f, 1.684f, -0.925f)
                curveToRelative(1.802f, 0.0f, 2.135f, 1.185f, 2.135f, 2.728f)
                lineToRelative(-0.001f, 3.14f)
                close()
                moveTo(4.67f, 5.715f)
                arcToRelative(1.037f, 1.037f, 0.0f, false, true, -1.032f, -1.031f)
                curveToRelative(0.0f, -0.566f, 0.466f, -1.032f, 1.032f, -1.032f)
                curveToRelative(0.566f, 0.0f, 1.031f, 0.466f, 1.032f, 1.032f)
                curveToRelative(0.0f, 0.566f, -0.466f, 1.032f, -1.032f, 1.032f)
                close()
                moveTo(5.559f, 12.225f)
                horizontalLineToRelative(-1.78f)
                lineTo(3.779f, 6.498f)
                horizontalLineToRelative(1.78f)
                verticalLineToRelative(5.727f)
                close()
                moveTo(13.11f, 2.0f)
                lineTo(2.885f, 2.0f)
                arcTo(0.88f, 0.88f, 0.0f, false, false, 2.0f, 2.866f)
                verticalLineToRelative(10.268f)
                arcToRelative(0.88f, 0.88f, 0.0f, false, false, 0.885f, 0.866f)
                horizontalLineToRelative(10.226f)
                arcToRelative(0.882f, 0.882f, 0.0f, false, false, 0.889f, -0.866f)
                lineTo(14.0f, 2.865f)
                arcToRelative(0.88f, 0.88f, 0.0f, false, false, -0.889f, -0.864f)
                close()
            }
        }
        .build()
        return _icLinkedin!!
    }

private var _icLinkedin: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MyIconPack.IcLinkedin, contentDescription = "")
    }
}
