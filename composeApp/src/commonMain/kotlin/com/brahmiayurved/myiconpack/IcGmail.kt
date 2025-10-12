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

public val MyIconPack.IcGmail: ImageVector
    get() {
        if (_icGmail != null) {
            return _icGmail!!
        }
        _icGmail = Builder(name = "IcGmail", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(76.8f, 0.0f)
                lineTo(435.2f, 0.0f)
                arcTo(76.8f, 76.8f, 0.0f, false, true, 512.0f, 76.8f)
                lineTo(512.0f, 435.2f)
                arcTo(76.8f, 76.8f, 0.0f, false, true, 435.2f, 512.0f)
                lineTo(76.8f, 512.0f)
                arcTo(76.8f, 76.8f, 0.0f, false, true, 0.0f, 435.2f)
                lineTo(0.0f, 76.8f)
                arcTo(76.8f, 76.8f, 0.0f, false, true, 76.8f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF4285f4)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(158.0f, 391.0f)
                verticalLineToRelative(-142.0f)
                lineToRelative(-82.0f, -63.0f)
                verticalLineTo(361.0f)
                quadToRelative(0.0f, 30.0f, 30.0f, 30.0f)
            }
            path(fill = SolidColor(Color(0xFFea4335)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(154.0f, 248.0f)
                lineToRelative(102.0f, 77.0f)
                lineToRelative(102.0f, -77.0f)
                verticalLineToRelative(-98.0f)
                lineToRelative(-102.0f, 77.0f)
                lineToRelative(-102.0f, -77.0f)
            }
            path(fill = SolidColor(Color(0xFF34a853)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(354.0f, 391.0f)
                verticalLineToRelative(-142.0f)
                lineToRelative(82.0f, -63.0f)
                verticalLineTo(361.0f)
                quadToRelative(0.0f, 30.0f, -30.0f, 30.0f)
            }
            path(fill = SolidColor(Color(0xFFc5221f)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(76.0f, 188.0f)
                lineToRelative(82.0f, 63.0f)
                verticalLineToRelative(-98.0f)
                lineToRelative(-30.0f, -23.0f)
                curveToRelative(-27.0f, -21.0f, -52.0f, 0.0f, -52.0f, 26.0f)
            }
            path(fill = SolidColor(Color(0xFFfbbc04)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(436.0f, 188.0f)
                lineToRelative(-82.0f, 63.0f)
                verticalLineToRelative(-98.0f)
                lineToRelative(30.0f, -23.0f)
                curveToRelative(27.0f, -21.0f, 52.0f, 0.0f, 52.0f, 26.0f)
            }
        }
        .build()
        return _icGmail!!
    }

private var _icGmail: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MyIconPack.IcGmail, contentDescription = "")
    }
}
