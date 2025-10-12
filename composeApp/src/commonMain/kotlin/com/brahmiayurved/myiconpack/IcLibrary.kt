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
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.ui.tooling.preview.Preview

public val MyIconPack.IcLibrary: ImageVector
    get() {
        if (_icLibrary != null) {
            return _icLibrary!!
        }
        _icLibrary = Builder(name = "IcLibrary", defaultWidth = 800.0.dp, defaultHeight = 800.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.562f, 7.0f)
                curveTo(19.79f, 5.695f, 18.786f, 4.5f, 17.462f, 4.5f)
                horizontalLineTo(6.538f)
                curveTo(5.213f, 4.5f, 4.209f, 5.695f, 4.438f, 7.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.5f, 4.5f)
                curveTo(17.528f, 4.241f, 17.542f, 4.111f, 17.543f, 4.004f)
                curveTo(17.545f, 2.981f, 16.774f, 2.121f, 15.756f, 2.011f)
                curveTo(15.65f, 2.0f, 15.519f, 2.0f, 15.259f, 2.0f)
                horizontalLineTo(8.741f)
                curveTo(8.48f, 2.0f, 8.35f, 2.0f, 8.244f, 2.011f)
                curveTo(7.226f, 2.121f, 6.455f, 2.981f, 6.457f, 4.004f)
                curveTo(6.457f, 4.111f, 6.471f, 4.241f, 6.5f, 4.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 18.0f)
                horizontalLineTo(9.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.194f, 16.793f)
                curveTo(20.844f, 19.274f, 20.669f, 20.514f, 19.772f, 21.257f)
                curveTo(18.875f, 22.0f, 17.551f, 22.0f, 14.905f, 22.0f)
                horizontalLineTo(9.095f)
                curveTo(6.449f, 22.0f, 5.126f, 22.0f, 4.228f, 21.257f)
                curveTo(3.331f, 20.514f, 3.156f, 19.274f, 2.806f, 16.793f)
                lineTo(2.384f, 13.793f)
                curveTo(1.937f, 10.629f, 1.714f, 9.048f, 2.662f, 8.024f)
                curveTo(3.61f, 7.0f, 5.298f, 7.0f, 8.672f, 7.0f)
                horizontalLineTo(15.328f)
                curveTo(18.702f, 7.0f, 20.39f, 7.0f, 21.338f, 8.024f)
                curveTo(22.087f, 8.833f, 22.104f, 9.99f, 21.859f, 12.0f)
            }
        }
        .build()
        return _icLibrary!!
    }

private var _icLibrary: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MyIconPack.IcLibrary, contentDescription = "")
    }
}
